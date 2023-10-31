/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.UserDAO;
import database.JDBCUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Admin;
import model.User;
import view.View_TaiKhoan_Admin;

/**
 *
 * @author ACER
 */
public class Control_TaiKhoanAdmin implements ActionListener {

    View_TaiKhoan_Admin vad;

    public Control_TaiKhoanAdmin(View_TaiKhoan_Admin va) {
        this.vad = va;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Đổi Password")) {
            vad.jPanel_doipass.setVisible(true);
        }
        if (src.equals("Hủy bỏ")) {
            vad.jPanel_doipass.setVisible(false);
            vad.jPasswordField_1.setText("");
            vad.jPasswordField_2.setText("");
        }
        if (src.equals("Thay đổi")) {
            String pass1 = String.valueOf(vad.jPasswordField_1.getPassword());
            String pass2 = String.valueOf(vad.jPasswordField_2.getPassword());

            if (pass1.equals("") || pass2.equals("")) {
                JOptionPane.showMessageDialog(vad, "Nhập thiếu dữ liệu!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!pass1.equals(pass2)) {
                    JOptionPane.showMessageDialog(vad, "Nhập mật khẩu không trùng khớp!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int z = JOptionPane.showConfirmDialog(vad, "Bạn chắc chắn muốn thay đổi password ??", "Comfirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (z == JOptionPane.YES_OPTION) {
                        User user = new User();
                        user.setUserID(vad.jLabel_UserID.getText());
                        user.setPassWord(pass2);
                        try {

                            Connection con = JDBCUtil.getConnection();

                            String sql = "UPDATE Admin "
                                    + " SET "
                                    + " passWord=?"
                                    + " WHERE userID=?";

                            PreparedStatement pst = con.prepareStatement(sql);

                            pst.setString(1, user.getPassWord());
                            pst.setString(2, user.getUserID());
                            pst.executeUpdate();

                            JDBCUtil.closeConnection(con);
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        JOptionPane.showMessageDialog(vad, "Thay đổi password thành công", "Success", JOptionPane.INFORMATION_MESSAGE);

                    }
                }
            }

        }
        if (src.equals("Tạo")) {
            Admin admin = new Admin();
            admin.setUserID(vad.jTextField_userID_new.getText());
            admin.setUserName(vad.jTextField_userName_mew.getText());
            String pass1 = String.valueOf(vad.jPasswordField_moi1_new.getPassword());
            String pass2 = String.valueOf(vad.jPasswordField_moi2_new.getPassword());

            if (pass1.equals("") || pass2.equals("") || vad.jTextField_userName_mew.getText().equals("") || vad.jTextField_userID_new.getText().equals("")) {
                JOptionPane.showMessageDialog(vad, "Nhập thiếu dữ liệu!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!pass1.equals(pass2)) {
                    JOptionPane.showMessageDialog(vad, "Nhập mật khẩu không trùng khớp!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        Connection con = JDBCUtil.getConnection();
                        PreparedStatement pst = con.prepareStatement("insert into Admin \n"
                                + "values (?,?,?)");
                        pst.setString(1, admin.getUserID());
                        pst.setString(2, pass1);
                        pst.setString(3, admin.getUserName());

                        pst.executeUpdate();
                        JDBCUtil.closeConnection(con);
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(vad, "Tạo tài khoản thành công", "Success", JOptionPane.INFORMATION_MESSAGE);

                }

            }

        }

    }
}
