/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import DAO.HopDongDAO;

import DAO.SinhVienDAO;
import DAO.UserDAO;
import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import model.HopDong;
import model.Phong;
import model.SinhVien;
import model.User;
import view.View_MainPage;

/**
 *
 * @author ACER
 */
public class Control_admin_HopDong implements ActionListener {

    View_MainPage vm;
    int select_index;

    public Control_admin_HopDong(View_MainPage vm) {
        this.vm = vm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        if (src.equals("Hợp Đồng mới")) {
            try {
                Connection con = JDBCUtil.getConnection();
                PreparedStatement pst = con.prepareStatement("select distinct maDay from Phong");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String day = rs.getString("maDay");
                    vm.jComboBox_day_newHD.addItem(day);
                }
                JDBCUtil.closeConnection(con);
            } catch (SQLException ex) {
                Logger.getLogger(Control_admin_HopDong.class.getName()).log(Level.SEVERE, null, ex);
            }

            vm.jPanel_newHopDong.setVisible(true);
            vm.jPanel2.setVisible(false);
        }
        if (src.equals("Hủy bỏ")) {
            vm.bangHopDong();
            vm.jPanel2.setVisible(true);
            vm.jPanel_newHopDong.setVisible(false);
            vm.jTextField_khoa_newHD.setText("");
            vm.jTextField_lop_newHD.setText("");
            vm.jTextField_maSV_newHD.setText("");
            vm.jTextField_ngayDangKy_newHD.setText("");
            vm.jTextField_ngayHetHan_newHD.setText("");
            vm.jTextField_queQuan_newHD.setText("");
            vm.jTextField_thoiHan_newHD.setText("");
            vm.jTextField_tenSV_newHD.setText("");
            vm.jTextField_sdt_newHD.setText("");
            vm.jTextField_ngaySinh_newHD.setText("");
            vm.jComboBox_day_newHD.removeAllItems();

        }
        if (src.equals("Xác nhận")) {
            HopDong hd = new HopDong();
            SinhVien sv = new SinhVien();
            Phong phong = new Phong();
            User user = new User();

            sv.setMaSV(vm.jTextField_maSV_newHD.getText());
            hd.setMaSV(vm.jTextField_maSV_newHD.getText());
            user.setUserID(vm.jTextField_maSV_newHD.getText());

            sv.setHoTenSV(vm.jTextField_tenSV_newHD.getText());
            user.setUserName(vm.jTextField_tenSV_newHD.getText());
            if (vm.jRadioButton_nam_newHD.isSelected()) {
                sv.setGioiTinh("Nam");
            }
            if (vm.jRadioButton_nu_newHD.isSelected()) {
                sv.setGioiTinh("Nữ");
            }
            sv.setNgaySinh(vm.jTextField_ngaySinh_newHD.getText());

            sv.setQueQuan(vm.jTextField_queQuan_newHD.getText());
            sv.setLop(vm.jTextField_lop_newHD.getText());
            sv.setKhoa(vm.jTextField_khoa_newHD.getText());
            sv.setSdt(vm.jTextField_sdt_newHD.getText());

            sv.setMaPhong((String) vm.jComboBox_phong_newHD.getSelectedItem());
            phong.setMaPhong((String) vm.jComboBox_phong_newHD.getSelectedItem());
            hd.setMaPhong((String) vm.jComboBox_phong_newHD.getSelectedItem());

            sv.setMaDay((String) vm.jComboBox_day_newHD.getSelectedItem());
            phong.setMaDay((String) vm.jComboBox_day_newHD.getSelectedItem());
            hd.setMaDay((String) vm.jComboBox_day_newHD.getSelectedItem());

            hd.setNgayDangKy(vm.jTextField_ngayDangKy_newHD.getText());
            hd.setNgayHetHan(vm.jTextField_ngayHetHan_newHD.getText());
            hd.setThoiHan(Integer.parseInt(vm.jTextField_thoiHan_newHD.getText()));

            if (sv.getMaSV().equals("") || sv.getHoTenSV().equals("") || sv.getNgaySinh().equals("")
                    || sv.getQueQuan().equals("") || sv.getLop().equals("") || sv.getKhoa().equals("")
                    || sv.getMaPhong().equals("") || sv.getMaDay().equals("") || hd.getNgayDangKy().equals("")
                    || hd.getNgayHetHan().equals("")) {
                JOptionPane.showMessageDialog(vm, "Nhập thiếu thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                int kq = HopDongDAO.getImstance().insert(hd);//inssert hd
                if (kq != 0) {
                    try {// kiem tra trung
                        Connection con = JDBCUtil.getConnection();
                        PreparedStatement pst = con.prepareStatement("select maHopDong  from HopDong where maSV = '" + sv.getMaSV() + "' and maPhong = '"
                                + sv.getMaPhong() + "' and maDay = '" + sv.getMaDay() + "'");
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            sv.setMaHopDong(rs.getInt("maHopDong"));
                            hd.setMaHopDong(rs.getInt("maHopDong"));
                        }
                        JDBCUtil.closeConnection(con);
                    } catch (SQLException ex) {
                    }
                    int kq2 = SinhVienDAO.getImstance().insert(sv);// them sv
                    if (kq2 == 0) {//trung sinh vien
                        JOptionPane.showMessageDialog(vm, "Thông tin sinh viên bị trùng", "Success", JOptionPane.INFORMATION_MESSAGE);
                        HopDongDAO.getImstance().delete(hd);
                    } else {
                        JOptionPane.showMessageDialog(vm, "Đã thêm Hợp đồng mới", "Success", JOptionPane.INFORMATION_MESSAGE);
                        //them tai khoan user
                        user.setPassWord("12345678");

                        UserDAO.getInstance().insert(user);

                        try {// them thanh  vien phong vao Phong
                            Connection con = JDBCUtil.getConnection();
                            PreparedStatement pst = con.prepareStatement("select thanhVienPhong  from Phong where  maPhong = '"
                                    + sv.getMaPhong() + "' and maDay = '" + sv.getMaDay() + "'");
                            ResultSet rs = pst.executeQuery();
                            while (rs.next()) {
                                phong.setThanhVienPhong(rs.getString("thanhVienPhong"));
                            }

                            String str = phong.getThanhVienPhong() + " " + sv.getHoTenSV();
                            pst = con.prepareStatement("update Phong set   soSV = soSV+1 , thanhVienPhong = N'" + str + "' where maPhong = '"
                                    + phong.getMaPhong() + "' and maDay = '" + phong.getMaDay() + "'");
                            pst.executeUpdate();

                            JDBCUtil.closeConnection(con);
                        } catch (SQLException ex) {
                            Logger.getLogger(Control_admin_HopDong.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        vm.jTextField_khoa_newHD.setText("");
                        vm.jTextField_lop_newHD.setText("");
                        vm.jTextField_maSV_newHD.setText("");
                        vm.jTextField_ngayDangKy_newHD.setText("");
                        vm.jTextField_ngayHetHan_newHD.setText("");
                        vm.jTextField_queQuan_newHD.setText("");
                        vm.jTextField_thoiHan_newHD.setText("");
                        vm.jTextField_tenSV_newHD.setText("");
                        vm.jTextField_sdt_newHD.setText("");
                        vm.jTextField_ngaySinh_newHD.setText("");
                        vm.jComboBox_phong_newHD.removeAllItems();
                        try {
                            Connection con = JDBCUtil.getConnection();
                            PreparedStatement pst = con.prepareStatement("select distinct maDay from Phong");
                            ResultSet rs = pst.executeQuery();
                            while (rs.next()) {
                                String day = rs.getString("maDay");
                                vm.jComboBox_day_newHD.addItem(day);
                            }
                            JDBCUtil.closeConnection(con);
                        } catch (SQLException ex) {
                            Logger.getLogger(Control_admin_HopDong.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(vm, "Nhập sai kiểu dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        }
        if (src.equals("Xoá / Hủy Hợp Đồng")) {
            select_index = vm.jTable_hopDong.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_hopDong.getModel();

            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dòng dữ liệu để xoá", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int z = JOptionPane.showConfirmDialog(vm, "Xóa / Hủy Hợp đồng này?", "Comfirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (z == JOptionPane.YES_OPTION) {// xoa sv, xoa hd , xoa ten pHong
                    HopDong hd = new HopDong();
                    SinhVien sv = new SinhVien();
                    Phong p = new Phong();

                    hd.setMaHopDong(Integer.parseInt(tableModel.getValueAt(select_index, 1) + ""));
                    sv.setMaSV(tableModel.getValueAt(select_index, 2) + "");

                    p.setMaPhong((tableModel.getValueAt(select_index, 4) + ""));
                    p.setMaDay((tableModel.getValueAt(select_index, 5) + ""));

                    
                    //xoa hoa don Phong                   
                    try {

                        Connection con = JDBCUtil.getConnection();
                        String sql = "DELETE from HoaDonPhong "
                                + " WHERE maSV = ?";

                        PreparedStatement pst = con.prepareStatement(sql);
                        pst.setString(1, sv.getMaSV());

                         pst.executeUpdate();
                        JDBCUtil.closeConnection(con);
                    } catch (SQLException ex) {
                    }
                    //Xoa sv
                    SinhVienDAO.getImstance().delete(sv);
                    
                    //Xoa tk user
                    User user = new User();
                    user.setUserID(sv.getMaSV());
                    UserDAO.getInstance().delete(user);
                    //Xoa ten SV khoi Phong
                    try {
                        Connection con = JDBCUtil.getConnection();
                        String str = SinhVienDAO.getImstance().selectThanhVienPhong(p.getMaDay(), p.getMaPhong());
                        PreparedStatement pst = con.prepareStatement("update Phong set   soSV = soSV-1 , thanhVienPhong = N'" + str + "' where maPhong = '"
                                + p.getMaPhong() + "' and maDay = '" + p.getMaDay() + "'");
                        pst.executeUpdate();
                        JDBCUtil.closeConnection(con);
                    } catch (SQLException ex) {
                        Logger.getLogger(Control_admin_HopDong.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //Xoa hop Dong
                    int a = HopDongDAO.getImstance().delete(hd);
                    vm.bangHopDong();
                    if (a != 0) {
                        JOptionPane.showMessageDialog(vm, "Đã Xoá / Hủy Hợp đồng", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
            }
        }
        if (src.equals("Sửa Hợp Đồng")) {
            select_index = vm.jTable_hopDong.getSelectedRow();

            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dòng dữ liệu để sửa", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    Connection con = JDBCUtil.getConnection();
                    PreparedStatement pst = con.prepareStatement("select distinct maDay from Phong");
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        String day = rs.getString("maDay");
                        vm.jComboBox_day_suaHD.addItem(day);
                    }
                    JDBCUtil.closeConnection(con);
                } catch (SQLException ex) {
                    Logger.getLogger(Control_admin_HopDong.class.getName()).log(Level.SEVERE, null, ex);
                }
                vm.setHopDong(select_index);
                vm.jPanel_suaHD.setVisible(true);
                vm.jPanel2.setVisible(false);
            }
        }
        if (src.equals("Thay Đổi")) {
            HopDong hd = new HopDong();
            SinhVien sv = new SinhVien();
            Phong p_cu = new Phong();
            Phong p_moi = new Phong();

            p_cu.setMaPhong(vm.jLabel_phong_cu.getText());
            p_cu.setMaDay(vm.jLabel_day_cu.getText());

            hd.setMaPhong((String) vm.jComboBox_phong_suaHD.getSelectedItem());
            sv.setMaPhong((String) vm.jComboBox_phong_suaHD.getSelectedItem());
            p_moi.setMaPhong((String) vm.jComboBox_phong_suaHD.getSelectedItem());

            hd.setMaDay((String) vm.jComboBox_day_suaHD.getSelectedItem());
            sv.setMaDay((String) vm.jComboBox_day_suaHD.getSelectedItem());
            p_moi.setMaDay((String) vm.jComboBox_day_suaHD.getSelectedItem());

            sv.setMaSV(vm.jLabel_maSV_cu.getText());
            hd.setMaSV(vm.jLabel_maSV_cu.getText());

            hd.setNgayDangKy(vm.jTextField_ngayDangKy_suaHD.getText());
            hd.setNgayHetHan(vm.jTextField_ngayHetHan_suaHD.getText());
            hd.setMaHopDong(Integer.parseInt(vm.jLabel_maHD_cu.getText()));
            sv.setMaHopDong(Integer.parseInt(vm.jLabel_maHD_cu.getText()));

            if (hd.getMaPhong().equals("") || hd.getMaDay().equals("") || hd.getNgayDangKy().equals("")
                    || hd.getNgayHetHan().equals("")) {
                JOptionPane.showMessageDialog(vm, "Nhập thiếu thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                hd.setThoiHan(Integer.parseInt(vm.jTextField_thoiHan_suaHD.getText()));
                int z = JOptionPane.showConfirmDialog(vm, "Thay đổi dữ liệu này?", "Comfirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (z == JOptionPane.YES_OPTION) {

                    int kq = HopDongDAO.getImstance().update(hd);

                    if (kq != 0) {

                        try {
                            Connection con = JDBCUtil.getConnection();
                            PreparedStatement pst = con.prepareStatement("update SinhVien set maDay = '" + sv.getMaDay() + "' , maPhong = '"
                                    + sv.getMaPhong() + "' , maHopDong = '" + sv.getMaHopDong() + "' where maSV = '" + sv.getMaSV() + "'");
                            pst.executeUpdate();
                            JDBCUtil.closeConnection(con);
                        } catch (SQLException ex) {

                        }

                        try {
                            Connection con = JDBCUtil.getConnection();

                            String str = SinhVienDAO.getImstance().selectThanhVienPhong(p_cu.getMaDay(), p_cu.getMaPhong());
                            PreparedStatement pst = con.prepareStatement("update Phong set   soSV = soSV-1 , thanhVienPhong = N'" + str + "' where maPhong = '"
                                    + p_cu.getMaPhong() + "' and maDay = '" + p_cu.getMaDay() + "'");
                            pst.executeUpdate();

                            String str_moi = SinhVienDAO.getImstance().selectThanhVienPhong(p_moi.getMaDay(), p_moi.getMaPhong());
                            pst = con.prepareStatement("update Phong set   soSV = soSV+1 , thanhVienPhong = N'" + str_moi + "' where maPhong = '"
                                    + p_moi.getMaPhong() + "' and maDay = '" + p_moi.getMaDay() + "'");
                            pst.executeUpdate();

                            JDBCUtil.closeConnection(con);
                        } catch (SQLException ex) {
                            Logger.getLogger(Control_admin_HopDong.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        JOptionPane.showMessageDialog(vm, "Hợp đồng đã được thay đổi !", "Success", JOptionPane.INFORMATION_MESSAGE);
                        vm.jPanel_suaHD.setVisible(false);
                        vm.jPanel2.setVisible(true);
                        vm.jTextField_ngayDangKy_suaHD.setText("");
                        vm.jTextField_ngayHetHan_suaHD.setText("");
                        vm.jTextField_thoiHan_suaHD.setText("");
                        vm.jComboBox_day_suaHD.removeAllItems();
                        vm.bangHopDong();
                    }

                }
            }

        }
        if (src.equals("Trở về")) {
            vm.jPanel_suaHD.setVisible(false);
            vm.jPanel2.setVisible(true);
            vm.jTextField_ngayDangKy_suaHD.setText("");
            vm.jTextField_ngayHetHan_suaHD.setText("");
            vm.jTextField_thoiHan_suaHD.setText("");
            vm.jComboBox_day_suaHD.removeAllItems();
            vm.bangHopDong();
        }
        if (src.equals("Tìm kiếm")) {
            String key = vm.jTextField_tiemkiem_HD.getText();
            TableModel tableModel = (TableModel) vm.jTable_hopDong.getModel();

            TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>((tableModel));

            vm.jTable_hopDong.setRowSorter(tableRowSorter);
            if (key.equals("")) {
                tableRowSorter.setRowFilter(null);
            } else {
                try {
                    tableRowSorter.setRowFilter(RowFilter.regexFilter(key));
                } catch (PatternSyntaxException pse) {
                }
            }
        }

    }
}
