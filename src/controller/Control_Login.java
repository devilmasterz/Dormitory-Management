/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DienNuocDAO;
import DAO.HoaDonPhongDAO;
import DAO.HopDongDAO;
import DAO.PhongDAO;
import DAO.SinhVienDAO;
import database.JDBCUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admin;
import model.HoaDonDienNuoc;
import model.HoaDonPhong;
import model.HopDong;
import model.Phong;
import model.SinhVien;
import model.User;
import view.View_Login;


import view.View_MainPage;
import view.View_UserSV;

/**
 *
 * @author ACER
 */
public class Control_Login implements ActionListener, KeyListener {

    private View_Login view_Login;
    

    public Control_Login(View_Login view_Login) {
        this.view_Login = view_Login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        if (src.equals("Login")) {
            dangnhap();
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            dangnhap();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void dangnhap() {
        User user = new  User();
        Admin admin = new Admin();
        user.setUserID(view_Login.jTextField_userID.getText());
        user.setPassWord(String.valueOf(view_Login.jPasswordField.getPassword()));
        admin.setUserID(view_Login.jTextField_userID.getText());
        admin.setPassWord(String.valueOf(view_Login.jPasswordField.getPassword()));

        if (user.getUserID().equals("") || user.getPassWord().equals("")) {
            view_Login.thieuTT();
        } else {

            try {
                Connection con = JDBCUtil.getConnection();
                PreparedStatement pst = con.prepareStatement("select userID, passWord, userName from Admin where userID = ? and passWord = ?");
                pst.setString(1, admin.getUserID());
                pst.setString(2, admin.getPassWord());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    admin.setUserName(rs.getString("userName"));
                    view_Login.setVisible(false);
                    View_MainPage view_MainPage = new View_MainPage(admin);

                } else {
                    pst = con.prepareStatement("select userID, passWord ,userName from Userr where userID = ? and passWord = ?");
                    pst.setString(1, user.getUserID());
                    pst.setString(2, user.getPassWord());
                    rs = pst.executeQuery();
                    if (rs.next()) {
                   
                        SinhVien sv=SinhVienDAO.getImstance().selectBy(user.getUserID());
                        
                        HopDong hd  =HopDongDAO.getImstance().selectBy(user.getUserID());
                        
                        Phong p = PhongDAO.getImstance().selectBy(hd.getMaPhong(), hd.getMaDay());
                        
                         ArrayList<HoaDonPhong> listHD_Phong = HoaDonPhongDAO.getInstance().selectBy(user.getUserID());
                         
                         ArrayList<HoaDonDienNuoc> listHD_DN = DienNuocDAO.getImstance().selectBy(hd.getMaPhong(),hd.getMaDay());   
                        
                        user.setUserName(rs.getString("userName"));
                        System.out.println(user.getUserName());
                        view_Login.setVisible(false);
                        View_UserSV view_UserSV = new View_UserSV(user,sv,hd,p);
                        view_UserSV.bangHoaDon_Phong();
                        view_UserSV.bangHoaDonDN();

                    } else {
                        view_Login.login_fail();
                        
                    }
                }
                
                JDBCUtil.closeConnection(con);
            } catch (SQLException ex) {
                Logger.getLogger(Control_Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
