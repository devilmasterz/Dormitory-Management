/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.PhieuDangKyDAO;
import com.sun.jdi.VMCannotBeModifiedException;
import database.JDBCUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PhieuDangKy;
import view.View_UserSV;

/**
 *
 * @author ACER
 */
public class Control_User implements ActionListener {

    int select_index;
    View_UserSV vu;

    public Control_User(View_UserSV vu) {
        this.vu = vu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Phiếu Đăng ký mới")) {
            try {
                Connection con = JDBCUtil.getConnection();
                PreparedStatement pst = con.prepareStatement("select distinct maDay from Phong");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String day = rs.getString("maDay");
                    vu.jComboBox_day_phieuDK.addItem(day);
                }
                JDBCUtil.closeConnection(con);
            } catch (SQLException ex) {
                Logger.getLogger(Control_admin_HopDong.class.getName()).log(Level.SEVERE, null, ex);
            }
            vu.jPanel4.setVisible(true);
        }
        if (src.equals("Hủy bỏ")) {
            vu.jPanel4.setVisible(false);
            vu.jTextField_ngayDangKy_phieuDK.setText("");
            vu.jTextField_thoiHan_phieuDK.setText("");
            vu.jTextField_ngayHetHan_phieuDK.setText("");
            vu.jTextField_ngay_phieuDK.setText("");
        }
        if (src.equals("Đăng ký")) {
            PhieuDangKy pdk = new PhieuDangKy();
            try {

                pdk.setHoTenSV(vu.jLabel_hoTen_DK.getText());
                pdk.setMaSV(vu.jLabel_maSV_DK.getText());
                pdk.setMaPhong((String) vu.jComboBox_phong_phieudk.getSelectedItem());
                pdk.setMaDay((String) vu.jComboBox_day_phieuDK.getSelectedItem());
                pdk.setNgay(vu.jTextField_ngay_phieuDK.getText());
                pdk.setNgayDangKy(vu.jTextField_ngayDangKy_phieuDK.getText());
                pdk.setNgayHetHan(vu.jTextField_ngayHetHan_phieuDK.getText());
                pdk.setThoiHan(Integer.parseInt(vu.jTextField_thoiHan_phieuDK.getText()));

                PhieuDangKyDAO.getInstance().insert(pdk);
                JOptionPane.showMessageDialog(vu, "Đã Đăng Ký", "Success", JOptionPane.INFORMATION_MESSAGE);
                vu.jTextField_ngayDangKy_phieuDK.setText("");
                vu.jTextField_thoiHan_phieuDK.setText("");
                vu.jTextField_ngayHetHan_phieuDK.setText("");
                vu.jTextField_ngay_phieuDK.setText("");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vu, "Nhập dữ liệu sai", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }
        if (src.equals("Hiện thị lịch sử Đăng ký")) {
            vu.jScrollPane3.setVisible(true);
            vu.bangPhieuDangKy();
        }
        if (src.equals("Xem")) {
            select_index = vu.jTable3.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vu.jTable3.getModel();

            if (select_index == -1) {
                JOptionPane.showMessageDialog(vu, "Chọn dữ liệu để xem", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                vu.setPhieuDK(select_index);
                vu.jPanel6.setVisible(true);
            }

        }
         if (src.equals("Đóng")) {
             vu.jPanel6.setVisible(false);
         }

    }
}
