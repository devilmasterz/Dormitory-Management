/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DienNuocDAO;
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
import model.HoaDonDienNuoc;
import view.View_MainPage;

/**
 *
 * @author ACER
 */
public class Control_admin_DienNuoc implements ActionListener {

    View_MainPage vm;
    int select_index;

    public Control_admin_DienNuoc(View_MainPage vm) {
        this.vm = vm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Tạo Hoá Đơn mới")) {
            try {
                Connection con = JDBCUtil.getConnection();
                PreparedStatement pst = con.prepareStatement("select distinct maDay from Phong");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String day = rs.getString("maDay");
                    vm.jComboBox_day_newHD_dn.addItem(day);
                }
                JDBCUtil.closeConnection(con);
            } catch (SQLException ex) {
                Logger.getLogger(Control_admin_HopDong.class.getName()).log(Level.SEVERE, null, ex);
            }

            vm.jPanel_newHD_dn.setVisible(true);
            vm.jPanel_hoaDon_DienNuoc.setVisible(false);
        }
        if (src.equals("Trở lại")) {
            vm.jPanel_hoaDon_DienNuoc.setVisible(true);
            vm.jPanel_newHD_dn.setVisible(false);
            vm.jLabel_tienDien_newHD_dn.setText("");
            vm.jLabel_tienNuoc_newHD_dn.setText("");
            vm.jLabel_tongTien_newHD_dn.setText("");
            vm.jTextField_soNuoc_newHD_dn.setText("");
            vm.jTextField_soDIen_newHD_dn.setText("");
            vm.bangHoaDonDN();
        }
        if (src.equals("Tạo")) {
            HoaDonDienNuoc hddn = new HoaDonDienNuoc();

            if (vm.jTextField_soNuoc_newHD_dn.getText().equals("") || vm.jTextField_soDIen_newHD_dn.getText().equals("")) {
                JOptionPane.showMessageDialog(vm, "Nhập thiếu thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    hddn.setMaPHong((String) vm.jComboBox_phong_newHD_dn.getSelectedItem());
                    hddn.setMaDay((String) vm.jComboBox_day_newHD_dn.getSelectedItem());

                    hddn.setThang(Integer.parseInt((String) vm.jComboBox_thang_newHD_dn.getSelectedItem()));
                    hddn.setNam(Integer.parseInt((String) vm.jComboBox_nam_newHD_dn.getSelectedItem()));

                    hddn.setTienNuoc(Integer.parseInt(vm.jTextField_soNuoc_newHD_dn.getText()));
                    hddn.setTienDien(Integer.parseInt(vm.jTextField_soDIen_newHD_dn.getText()));
                    hddn.setTongTien(hddn.getTienDien(), hddn.getTienNuoc());
                    hddn.setDongTien(false);
                    hddn.setSoNuoc(Integer.parseInt(vm.jTextField_soNuoc_newHD_dn.getText()));
                    hddn.setSoDien(Integer.parseInt(vm.jTextField_soDIen_newHD_dn.getText()));

                    int a = 0;
                    try {
                        Connection con = JDBCUtil.getConnection();
                        PreparedStatement pst = con.prepareStatement("select maHoaDon  from HoaDonDienNuoc where maPhong = '" + hddn.getMaPHong() + "' and maDay = '"
                                + hddn.getMaDay() + "' and thang = '" + hddn.getThang() + "' and nam = '" + hddn.getNam() + "'");
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            a = rs.getInt("maHoaDon");
                        }
                        JDBCUtil.closeConnection(con);
                    } catch (SQLException ex) {
                    }
                    if (a != 0) {
                        JOptionPane.showMessageDialog(vm, "Thông tin Hóa đơn bị trùng", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        DienNuocDAO.getImstance().insert(hddn);

                        JOptionPane.showMessageDialog(vm, "Hóa đơn đã được tạo!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        vm.jLabel_tienDien_newHD_dn.setText("");
                        vm.jLabel_tienNuoc_newHD_dn.setText("");
                        vm.jLabel_tongTien_newHD_dn.setText("");
                        vm.jTextField_soNuoc_newHD_dn.setText("");
                        vm.jTextField_soDIen_newHD_dn.setText("");
                    }
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(vm, "Nhập dữ liệu sai", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        }

        if (src.equals("Tính tiền")) {
            HoaDonDienNuoc hddn = new HoaDonDienNuoc();
            hddn.setSoNuoc(Integer.parseInt(vm.jTextField_soNuoc_newHD_dn.getText()));
            hddn.setSoDien(Integer.parseInt(vm.jTextField_soDIen_newHD_dn.getText()));
            hddn.setTienNuoc(Integer.parseInt(vm.jTextField_soNuoc_newHD_dn.getText()));
            hddn.setTienDien(Integer.parseInt(vm.jTextField_soDIen_newHD_dn.getText()));
            hddn.setTongTien(hddn.getTienDien(), hddn.getTienNuoc());
            vm.jLabel_tienNuoc_newHD_dn.setText(Float.toString(hddn.getTienNuoc()));
            vm.jLabel_tienDien_newHD_dn.setText(Float.toString(hddn.getTienDien()));
            vm.jLabel_tongTien_newHD_dn.setText(Float.toString(hddn.getTongTien()));
        }
        if (src.equals("Tính Tiền")) {
            HoaDonDienNuoc hddn = new HoaDonDienNuoc();
            hddn.setSoNuoc(Integer.parseInt(vm.jTextField_soNuoc_suaHD_DN.getText()));
            hddn.setSoDien(Integer.parseInt(vm.jTextField_soDIen_suaHD_DN.getText()));
            hddn.setTienNuoc(Integer.parseInt(vm.jTextField_soNuoc_suaHD_DN.getText()));
            hddn.setTienDien(Integer.parseInt(vm.jTextField_soDIen_suaHD_DN.getText()));
            hddn.setTongTien(hddn.getTienDien(), hddn.getTienNuoc());
            vm.jLabel_tienNuoc_suaHD_DN.setText(Float.toString(hddn.getTienNuoc()));
            vm.jLabel_tienDien_suaHD_DN.setText(Float.toString(hddn.getTienDien()));
            vm.jLabel_tongTien_suaHD_DN.setText(Float.toString(hddn.getTongTien()));
        }
        if (src.equals("Hiện Thị")) {

            vm.bangHoaDonDN_timKiem_tn();

        }
        if (src.equals("Hiện Thị toàn bộ")) {
            vm.bangHoaDonDN();
        }
        if (src.equals("Xóa Hoá Đơn")) {

            select_index = vm.jTable_HoaDonDN.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_HoaDonDN.getModel();

            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dòng dữ liệu để xoá", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int z = JOptionPane.showConfirmDialog(vm, "Xóa Hóa đơn này?", "Comfirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (z == JOptionPane.YES_OPTION) {// xoa sv, xoa hd , xoa ten pHong
                    HoaDonDienNuoc hd = new HoaDonDienNuoc();

                    hd.setMaHoaDon(Integer.parseInt(tableModel.getValueAt(select_index, 1) + ""));

                    DienNuocDAO.getImstance().delete(hd);
                    vm.bangHoaDonDN();

                }
            }

        }
        if (src.equals("Sửa  Hoá Đơn")) {
            select_index = vm.jTable_HoaDonDN.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_HoaDonDN.getModel();

            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dòng dữ liệu để sửa", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                vm.setHoaDonDienNuoc(select_index);
                vm.jPanel_suaHD_DN.setVisible(true);
                vm.jPanel_hoaDon_DienNuoc.setVisible(false);
            }
        }
        if (src.equals("Hủy bỏ")) {
            vm.jPanel_hoaDon_DienNuoc.setVisible(true);
            vm.jPanel_suaHD_DN.setVisible(false);
            vm.jLabel_tienDien_suaHD_DN.setText("");
            vm.jLabel_tienNuoc_suaHD_DN.setText("");
            vm.jLabel_tongTien_suaHD_DN.setText("");
            vm.jTextField_soNuoc_suaHD_DN.setText("");
            vm.jTextField_soDIen_suaHD_DN.setText("");
            vm.bangHoaDonDN();
        }
        if (src.equals("Xác nhận")) {

            HoaDonDienNuoc hddn = new HoaDonDienNuoc();

            if (vm.jTextField_soNuoc_suaHD_DN.getText().equals("") || vm.jTextField_soDIen_suaHD_DN.getText().equals("")) {
                JOptionPane.showMessageDialog(vm, "Nhập thiếu thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    hddn.setSoNuoc(Integer.parseInt(vm.jTextField_soNuoc_suaHD_DN.getText()));
                    hddn.setSoDien(Integer.parseInt(vm.jTextField_soDIen_suaHD_DN.getText()));
                    hddn.setTienNuoc(Integer.parseInt(vm.jTextField_soNuoc_suaHD_DN.getText()));
                    hddn.setTienDien(Integer.parseInt(vm.jTextField_soDIen_suaHD_DN.getText()));
                    hddn.setTongTien(hddn.getTienDien(), hddn.getTienNuoc());
                    hddn.setMaHoaDon(Integer.parseInt(vm.jLabel_maHoaDon_suaHD_DN.getText()));

                    int z = JOptionPane.showConfirmDialog(vm, "Cập nhật Hóa đơn này?", "Comfirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (z == JOptionPane.YES_OPTION) {
                        DienNuocDAO.getImstance().update(hddn);
                        JOptionPane.showMessageDialog(vm, "Hóa đơn đã được cập nhật !", "Success", JOptionPane.INFORMATION_MESSAGE);
                        vm.jPanel_hoaDon_DienNuoc.setVisible(true);
                        vm.jPanel_suaHD_DN.setVisible(false);
                        vm.jLabel_tienDien_suaHD_DN.setText("");
                        vm.jLabel_tienNuoc_suaHD_DN.setText("");
                        vm.jLabel_tongTien_suaHD_DN.setText("");
                        vm.jTextField_soNuoc_suaHD_DN.setText("");
                        vm.jTextField_soDIen_suaHD_DN.setText("");
                        vm.bangHoaDonDN();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(vm, "Nhập dữ liệu sai", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }

        if (src.equals("Tìm kiếm")) {
            String key = vm.jTextField_timkiem_DN.getText();
            TableModel tableModel = (TableModel) vm.jTable_HoaDonDN.getModel();

            TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>((tableModel));

            vm.jTable_HoaDonDN.setRowSorter(tableRowSorter);
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
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_HoaDonDN.getModel();
            Boolean check;

            for (int i = 0; i < tableModel.getRowCount(); i++) {
                if (Boolean.parseBoolean(tableModel.getValueAt(tableModel.getRowCount() - 1, 11).toString()) == true) {
                    check = true;
                } else {
                     check = Boolean.valueOf(tableModel.getValueAt(i, 11).toString());
                }
                int maHD = (int) tableModel.getValueAt(i, 1);
                try {
                    Connection con = JDBCUtil.getConnection();
                    PreparedStatement pst;
                    pst = con.prepareStatement("update HoaDonDienNuoc set  dongTien = ?  where maHoaDon = ? ");
                    pst.setBoolean(1, check);
                    pst.setInt(2, maHD);
                    pst.executeUpdate();
                    JDBCUtil.closeConnection(con);
                } catch (SQLException ex) {
                    Logger.getLogger(Control_admin_DienNuoc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            vm.bangHoaDonDN_timKiem_tn();
            

        }

    }
}


