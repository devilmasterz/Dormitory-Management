/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.SinhVien;
import model.User;

/**
 *
 * @author ACER
 */
public class UserDAO implements DAOInterface<User> {

    public static UserDAO getInstance() {
        return new UserDAO();
    }
    @Override
    public int insert(User user) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("insert into Userr \n"
                    + "values (?,?,?)");
            pst.setString(1, user.getUserID());
            pst.setString(2, user.getPassWord());
            pst.setString(3, user.getUserName());

            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public int update(User user) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE Userr "
                    + " SET "
                    + " passWord=?"
                    + " WHERE userID=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, user.getPassWord());
            pst.setString(2, user.getUserID());
            kq = pst.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public int delete(User user) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE from Userr "
                    + " WHERE userID=?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, user.getUserID());
            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public ArrayList<User> selectAll() {
         ArrayList<User> kq = new ArrayList<User>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from Userr");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String userID = rs.getString("userID");
                String userName = rs.getNString("userName");
                String passwd = rs.getString("passWord");
                
                User user = new User(userID, passwd, userName);
                kq.add(user);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public User selectById(User t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<User> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
