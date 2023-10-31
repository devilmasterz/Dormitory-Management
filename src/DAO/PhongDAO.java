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
import model.Phong;

/**
 *
 * @author ACER
 */
public class PhongDAO implements DAOInterface<Phong> {

    public static PhongDAO getImstance() {
        return new PhongDAO();
    }

    @Override
    public int insert(Phong p) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("insert into Phong(maPhong,tenPhong,soSVToiDa,soSV,maDay,thanhVienPhong)\n"
                    + "values (?,?,?,?,?,?)");
            pst.setString(1, p.getMaPhong());
            pst.setNString(2, p.getTenPhong());
            pst.setInt(3, p.getSoSV_toiDa());
            pst.setInt(4, 0);
            pst.setString(5, p.getMaDay());
            pst.setNString(6, p.getThanhVienPhong());
            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public int update(Phong p) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE Phong "
                    + " SET "
                    + " tenPhong=?"
                    + ", soSVToiDa=?"
                    + ", soSV=?"
                    + ", thanhVienPhong=?"
                    + " WHERE maPhong=? and maDay=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setNString(1, p.getTenPhong());
            pst.setInt(2, p.getSoSV_toiDa());
            pst.setInt(3, p.getSoSV());
            pst.setNString(4, p.getThanhVienPhong());
            pst.setString(5, p.getMaPhong());
            pst.setString(6, p.getMaDay());
            
            kq = pst.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return kq;
    }

    @Override
    public int delete(Phong p) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE from Phong "
                    + " WHERE maPhong=? and maDay=?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, p.getMaPhong());
            pst.setString(2, p.getMaDay());

            kq = pst.executeUpdate();

            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return kq;
    }
    
    

    @Override
    public ArrayList<Phong> selectAll() {
        ArrayList<Phong> kq = new ArrayList<Phong>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from Phong");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhong = rs.getString("maPhong");
                String tenPhong = rs.getNString("tenPhong");
                int soSVTD = rs.getInt("soSVToiDa");
                int soSV = rs.getInt("soSV");
                String tvp = rs.getNString("thanhVienPhong");
                String maDay = rs.getString("maDay");

                Phong phong = new Phong(maPhong, tenPhong, soSV, soSVTD, tvp, maDay);
                kq.add(phong);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public Phong selectById(Phong p) {
        Phong kq = null;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM Phong where maPhong=? and maDay=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, p.getMaPhong());
            pst.setString(2, p.getMaDay());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String maPhong = rs.getString("maPhong");
                String tenPhong = rs.getNString("tenPhong");
                int soSVTD = rs.getInt("soSVToiDa");
                int soSV = rs.getInt("soSV");
                String tvp = rs.getNString("thanhVienPhong");
                String maDay = rs.getString("maDay");
                kq = new Phong(maPhong, tenPhong, soSV, soSVTD, tvp, maDay);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return kq;
    }
    
    public Phong selectBy(String Phong, String Day) {
        Phong kq = null;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM Phong where maPhong=? and maDay=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, Phong);
            pst.setString(2, Day);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String maPhong = rs.getString("maPhong");
                String tenPhong = rs.getNString("tenPhong");
                int soSVTD = rs.getInt("soSVToiDa");
                int soSV = rs.getInt("soSV");
                String tvp = rs.getNString("thanhVienPhong");
                String maDay = rs.getString("maDay");
                kq = new Phong(maPhong, tenPhong, soSV, soSVTD, tvp, maDay);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return kq;
    }
    @Override
    public ArrayList<Phong> selectByCondition(String condition) {
        ArrayList<Phong> kq = new ArrayList<Phong>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "Select *from Phong where " + condition;

            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String maPhong = rs.getString("maPhong");
                String tenPhong = rs.getNString("tenPhong");
                int soSVTD = rs.getInt("soSVToiDa");
                int soSV = rs.getInt("soSV");
                String tvp = rs.getNString("thanhVienPhong");
                String maDay = rs.getString("maDay");

                Phong phong = new Phong(maPhong, tenPhong, soSV, soSVTD, tvp, maDay);
                kq.add(phong);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    public ArrayList<Phong> search(String key) {

        ArrayList<Phong> kq = new ArrayList<Phong>();
        try {
            Connection con = JDBCUtil.getConnection();
//            String sql = "SELECT * FROM Phong where maPhong in ? or maDay=? or soSV =? or soSVToiDa=? or tenPhong =? or thanhVienPhong=?";
//            PreparedStatement pst = con.prepareStatement(sql);
//            pst.setString(1, key);
//            pst.setString(2, key);
//            pst.setInt(3, Integer.parseInt(key));
//            pst.setInt(4, Integer.parseInt(key));
//            pst.setString(5, key);
//            pst.setString(6, key);
//            
            String sql = "SELECT * FROM Phong where maPhong = ? or maDay =? or tenPhong =? or thanhVienPhong=?";
            PreparedStatement pst = con.prepareStatement(sql);
             pst.setString(1, key);
             pst.setNString(2, key);
             pst.setNString(3, key);
             pst.setNString(4, key);
//             
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhong = rs.getString("maPhong");
                String tenPhong = rs.getNString("tenPhong");
                int soSVTD = rs.getInt("soSVToiDa");
                int soSV = rs.getInt("soSV");
                String tvp = rs.getNString("thanhVienPhong");
                String maDay = rs.getString("maDay");

                Phong phong = new Phong(maPhong, tenPhong, soSV, soSVTD, tvp, maDay);
                kq.add(phong);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;

    }

}
