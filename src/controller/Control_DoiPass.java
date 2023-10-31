/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.UserDAO;
import database.JDBCUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.User;
import view.View_doiPasswd;

/**
 *
 * @author ACER
 */
public class Control_DoiPass implements ActionListener {

    View_doiPasswd vd;

    public Control_DoiPass(View_doiPasswd vd) {
        this.vd = vd;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Hủy bỏ")) {
            vd.setVisible(false);
        }
        if (src.equals("Thay đổi")) {
            String pass1 = String.valueOf(vd.jPasswordField_1.getPassword());
            String pass2 = String.valueOf(vd.jPasswordField_2.getPassword());

            if (pass1.equals("") || pass2.equals("")) {
                JOptionPane.showMessageDialog(vd, "Nhập thiếu dữ liệu!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!pass1.equals(pass2)) {
                    JOptionPane.showMessageDialog(vd, "Nhập mật khẩu không trùng khớp!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int z = JOptionPane.showConfirmDialog(vd, "Bạn chắc chắn muốn thay đổi password ??", "Comfirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (z == JOptionPane.YES_OPTION) {
                        User user = new User();
                        user.setUserID(vd.jLabel_userID.getText());
                        user.setPassWord(pass2);
                        UserDAO.getInstance().update(user);
                        JOptionPane.showMessageDialog(vd, "Thay đổi password thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
                        
                    }
                }
            }
        }
    }

}
