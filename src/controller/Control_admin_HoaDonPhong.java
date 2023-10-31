/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.HoaDonPhongDAO;
import database.JDBCUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.HoaDonPhong;
import view.View_MainPage;

/**
 *
 * @author ACER
 */
public class Control_admin_HoaDonPhong implements ActionListener {

    View_MainPage vm;
    int select_index;

    public Control_admin_HoaDonPhong(View_MainPage vm) {
        this.vm = vm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Tạo Hoá Đơn mới")) {

            vm.jPanel_newHD_Phong.setVisible(true);
            vm.jPanel_hoaDon_Phong.setVisible(false);
        }
        if (src.equals("Trở lại")) {

            vm.jPanel_newHD_Phong.setVisible(false);
            vm.jPanel_hoaDon_Phong.setVisible(true);
            vm.bangHoaDon_Phong();
        }
        if (src.equals("Tạo")) {
            HoaDonPhong hdp = new HoaDonPhong();

            hdp.setThang(Integer.parseInt((String) vm.jComboBox_thang_newHD_Phong.getSelectedItem()));
            hdp.setNam(Integer.parseInt((String) vm.jComboBox_nam_newHD_Phong.getSelectedItem()));
            hdp.setDongTien(false);

            int a = 0;
            try { // kiem tra trung
                Connection con = JDBCUtil.getConnection();
                PreparedStatement pst = con.prepareStatement("select maHoaDon  from HoaDonPhong where  thang = '" + hdp.getThang() + "' and nam = '" + hdp.getNam() + "'");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    rs.getInt("maHoaDon");
                    a++;
                }
                JDBCUtil.closeConnection(con);
            } catch (SQLException ex) {
            }
            if (a != 0) {
                JOptionPane.showMessageDialog(vm, "Hóa đơn tiền Phòng tháng " + hdp.getThang() + " năm " + hdp.getNam() + " đã tồn tại!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                try {
                    Connection con = JDBCUtil.getConnection();
                    PreparedStatement pst = con.prepareStatement("select maSV  from SinhVien ");
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        String str = rs.getString("maSV");
                        hdp.setMaSV(str);
                        HoaDonPhongDAO.getInstance().insert(hdp);
                    }
                    JDBCUtil.closeConnection(con);
                } catch (SQLException ex) {
                }
                JOptionPane.showMessageDialog(vm, "Hóa đơn đã được tạo !", "Success", JOptionPane.INFORMATION_MESSAGE);

            }

        }
        if (src.equals("Hiện Thị")) {//hien thi theo thang nam
            vm.bangHoaDonPhong_timKiem_tn();
        }
        if (src.equals("Hiện Thị toàn bộ")) {
            vm.bangHoaDon_Phong();
        }
        if (src.equals("Xóa Hoá Đơn")) {

            select_index = vm.jTable_HoaDon_Phong.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_HoaDon_Phong.getModel();

            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dòng dữ liệu để xoá", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int z = JOptionPane.showConfirmDialog(vm, "Xóa Hóa đơn này?", "Comfirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (z == JOptionPane.YES_OPTION) {
                    HoaDonPhong hd = new HoaDonPhong();
                    hd.setMaHoaDon(Integer.parseInt(tableModel.getValueAt(select_index, 1) + ""));
                    HoaDonPhongDAO.getInstance().delete(hd);

                    vm.bangHoaDon_Phong();
                }
            }

        }
        if (src.equals("Tìm kiếm")) {
            String key = vm.jTextField_timkiem_HD_Phong.getText();
            TableModel tableModel = (TableModel) vm.jTable_HoaDon_Phong.getModel();

            TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>((tableModel));

            vm.jTable_HoaDon_Phong.setRowSorter(tableRowSorter);
            if (key.equals("")) {
                tableRowSorter.setRowFilter(null);
            } else {
                try {
                    tableRowSorter.setRowFilter(RowFilter.regexFilter(key));
                } catch (PatternSyntaxException pse) {
                }
            }
        }
        if (src.equals("Cập nhật")) {
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_HoaDon_Phong.getModel();
            Boolean check;

            for (int i = 0; i < tableModel.getRowCount(); i++) {
                if (Boolean.parseBoolean(tableModel.getValueAt(tableModel.getRowCount() - 1, 6).toString()) == true) {
                    check = true;
                } else {
                    check = Boolean.valueOf(tableModel.getValueAt(i, 6).toString());
                }
                int maHD = (int) tableModel.getValueAt(i, 1);
                try {
                    Connection con = JDBCUtil.getConnection();
                    PreparedStatement pst;
                    pst = con.prepareStatement("update HoaDonPhong set  dongTien = ?  where maHoaDon = ? ");
                    pst.setBoolean(1, check);
                    pst.setInt(2, maHD);
                    pst.executeUpdate();
                    JDBCUtil.closeConnection(con);
                } catch (SQLException ex) {
                    Logger.getLogger(Control_admin_DienNuoc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           

        }
        if (src.equals("Xóa Hoá Đơn Theo Tháng")) {
            vm.jPanel8.setVisible(true);
        }
        if (src.equals("Xóa")) {
            int thang = Integer.parseInt((String) vm.jComboBox_thang_xoaHDThang.getSelectedItem());
            int nam = Integer.parseInt((String) vm.jComboBox_nam_xoaHDThang.getSelectedItem());
            int z = JOptionPane.showConfirmDialog(vm, "Xóa Hóa đơn này?", "Comfirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (z == JOptionPane.YES_OPTION) {
                int kq = 0;
                try {
                    Connection con = JDBCUtil.getConnection();
                    String sql = "DELETE from HoaDonPhong "
                            + " WHERE thang =? and nam =?";

                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, thang);
                    pst.setInt(2, nam);

                    kq = pst.executeUpdate();
                    JDBCUtil.closeConnection(con);
                } catch (SQLException ex) {
                }
                if (kq != 0) {
                    JOptionPane.showMessageDialog(vm, "Đã xóa!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    vm.bangHoaDon_Phong();
                } else {
                    JOptionPane.showMessageDialog(vm, "Hóa đơn không tồn tại", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
         if (src.equals("Đóng")) {
             vm.jPanel8.setVisible(false);
         }

    }

}
