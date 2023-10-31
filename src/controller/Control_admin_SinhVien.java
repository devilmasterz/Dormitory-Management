/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.SinhVienDAO;
import DAO.UserDAO;
import database.JDBCUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.SinhVien;
import model.User;
import view.View_MainPage;

/**
 *
 * @author ACER
 */
public class Control_admin_SinhVien implements ActionListener {

    View_MainPage vm;
    int select_index;

    public Control_admin_SinhVien(View_MainPage vm) {
        this.vm = vm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Sửa")) {
            select_index = vm.jTable_sinhVien.getSelectedRow();
            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dòng dữ liệu để sửa", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                vm.setSinhVien(select_index);
                vm.jPanel_suaSV.setVisible(true);
                vm.jPanel5.setVisible(false);
            }
        }

        if (src.equals("Hủy bỏ")) {
            vm.jPanel_suaSV.setVisible(false);
            vm.jPanel5.setVisible(true);
            vm.bangSinhVien();
        }
        if (src.equals("Cập nhật")) {

            SinhVien sv = new SinhVien();

            sv.setMaSV(vm.jLabel_maSV_suaSV.getText());
            sv.setHoTenSV(vm.jTextField_tenSV_suaSV.getText());
            sv.setGioiTinh(vm.jTextField_gioiTinh_suaSV.getText());
            sv.setNgaySinh(vm.jTextField_ngaySInh_suaSV.getText());
            sv.setMaPhong(vm.jLabel_phong_suaSV.getText());
            sv.setMaDay(vm.jLabel_day_suaSV.getText());
            sv.setLop(vm.jTextField_lop_suaSV.getText());
            sv.setKhoa(vm.jTextField_khoa_suaSV.getText());
            sv.setQueQuan(vm.jTextField_queQuan_suaSV.getText());
            sv.setSdt(vm.jTextField_sdt_suaSV.getText());

            if (sv.getMaPhong().equals("") || sv.getMaDay().equals("") || sv.getMaSV().equals("")
                    || sv.getHoTenSV().equals("") || sv.getGioiTinh().equals("") || sv.getNgaySinh().equals("")
                    || sv.getLop().equals("") || sv.getKhoa().equals("") || sv.getQueQuan().equals("")
                    || sv.getSdt().equals("")) {
                JOptionPane.showMessageDialog(vm, "Nhập thiếu thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                int z = JOptionPane.showConfirmDialog(vm, "Thay đổi thông tin sinh viên này?", "Comfirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (z == JOptionPane.YES_OPTION) {
                    //update sv
                    int kq = SinhVienDAO.getImstance().update_notHD(sv);

                    if (kq != 0) {
                        try {
                            //update ten tbl user
                            User user = new User();
                            user.setUserID(sv.getMaSV());
                            user.setUserName(sv.getHoTenSV());

                            try {
                                Connection con = JDBCUtil.getConnection();
                                String sql = "UPDATE Userr "
                                        + " SET "
                                        + " userName=?"
                                        + " WHERE userID=?";
                                PreparedStatement pst = con.prepareStatement(sql);
                                pst.setString(1, user.getUserName());
                                pst.setString(2, user.getUserID());
                                kq = pst.executeUpdate();
                                JDBCUtil.closeConnection(con);
                            } catch (SQLException ex) {
                            }

                            //update ten tblPhong
                            Connection con = JDBCUtil.getConnection();
                            String str = SinhVienDAO.getImstance().selectThanhVienPhong(sv.getMaDay(), sv.getMaPhong());
                            PreparedStatement pst = con.prepareStatement("update Phong set    thanhVienPhong = N'" + str + "' where maPhong = '"
                                    + sv.getMaPhong() + "' and maDay = '" + sv.getMaDay() + "'");
                            pst.executeUpdate();
                            JDBCUtil.closeConnection(con);
                        } catch (SQLException ex) {
                            Logger.getLogger(Control_admin_HopDong.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        JOptionPane.showMessageDialog(vm, "Dữ liệu đã được cập nhật!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        vm.jPanel_suaSV.setVisible(false);
                        vm.jPanel5.setVisible(true);
                        vm.bangSinhVien();
                    } else {
                        JOptionPane.showMessageDialog(vm, "Nhập không đúng kiểu dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);

                    }

                }

            }
        }
        if (src.equals("Tìm kiếm")) {
            String key = vm.jTextField_timkiem_SinhVien.getText();
            TableModel tableModel = (TableModel) vm.jTable_sinhVien.getModel();

            TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>((tableModel));

            vm.jTable_sinhVien.setRowSorter(tableRowSorter);
            if (key.equals("")) {
                tableRowSorter.setRowFilter(null);
            } else {
                try {
                    tableRowSorter.setRowFilter(RowFilter.regexFilter(key));
                } catch (PatternSyntaxException pse) {
                }
            }
        }

        if (src.equals("Cập Nhật Password")) {
            User user = new User(); 
            select_index = vm.jTable_userSV.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_userSV.getModel();

           
            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dòng dữ liệu để cập nhật", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                user.setUserID(tableModel.getValueAt(select_index, 1) + "");
                user.setPassWord(tableModel.getValueAt(select_index, 2) + "");
                UserDAO.getInstance().update(user);
                JOptionPane.showMessageDialog(vm, "Password đã được cập nhật!", "Success", JOptionPane.INFORMATION_MESSAGE);
                vm.bangUser();
            }

        }
        if (src.equals(" ")) {
            String key = vm.jTextField_timkiem_User.getText();
            TableModel tableModel = (TableModel) vm.jTable_userSV.getModel();

            TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>((tableModel));

            vm.jTable_userSV.setRowSorter(tableRowSorter);
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
