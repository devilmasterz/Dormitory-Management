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
import model.HoaDonPhong;

/**
 *
 * @author ACER
 */
public class HoaDonPhongDAO implements DAOInterface<HoaDonPhong> {

    public static HoaDonPhongDAO getInstance() {
        return new HoaDonPhongDAO();
    }

    @Override
    public int insert(HoaDonPhong hd) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("insert into HoaDonPhong(maSV,thang,nam,dongTien)\n"
                    + "values (?,?,?,?)");
            pst.setString(1, hd.getMaSV());
            pst.setInt(2, hd.getThang());
            pst.setInt(3, hd.getNam());
            pst.setBoolean(4, hd.getDongTien());

            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return kq;
    }

    public ArrayList<HoaDonPhong> selectBy(String masv) {
        ArrayList<HoaDonPhong> kq = new ArrayList<HoaDonPhong>();
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM HoaDonPhong where maSV=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, masv);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                int mahd = rs.getInt("maHoaDon");
                String maSV = rs.getString("maSV");
                int thang = rs.getInt("thang");
                int nam = rs.getInt("nam");
                        boolean dongTien = rs.getBoolean("dongTien");

                HoaDonPhong hd = new HoaDonPhong(mahd, maSV, thang, nam, dongTien);
                kq.add(hd);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public int update(HoaDonPhong t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(HoaDonPhong hd) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE from HoaDonPhong "
                    + " WHERE maHoaDon =?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, hd.getMaHoaDon());

            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public ArrayList<HoaDonPhong> selectAll() {
        ArrayList<HoaDonPhong> kq = new ArrayList<HoaDonPhong>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from HoaDonPhong ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                int mahd = rs.getInt("maHoaDon");
                String maSV = rs.getString("maSV");
                int thang = rs.getInt("thang");
                int nam = rs.getInt("nam");
                boolean dongTien = rs.getBoolean("dongTien");

                HoaDonPhong hd = new HoaDonPhong(mahd, maSV, thang, nam, dongTien);
                kq.add(hd);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    public ArrayList<HoaDonPhong> selectByTN(int thangg, int namm) {
        ArrayList<HoaDonPhong> kq = new ArrayList<HoaDonPhong>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM HoaDonPhong where thang = ? and nam = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, thangg);
            pst.setInt(2, namm);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int mahd = rs.getInt("maHoaDon");
                String maSV = rs.getString("maSV");
                int thang = rs.getInt("thang");
                int nam = rs.getInt("nam");
                boolean dongTien = rs.getBoolean("dongTien");

                HoaDonPhong hd = new HoaDonPhong(mahd, maSV, thang, nam, dongTien);
                kq.add(hd);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return kq;
    }

    public ArrayList<HoaDonPhong> search(String key) {

        ArrayList<HoaDonPhong> kq = new ArrayList<HoaDonPhong>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM HoaDonPhong where  maSV =?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, key);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int mahd = rs.getInt("maHoaDon");
                String maSV = rs.getString("maSV");
                int thang = rs.getInt("thang");
                int nam = rs.getInt("nam");
                boolean dongTien = rs.getBoolean("dongTien");

                HoaDonPhong hd = new HoaDonPhong(mahd, maSV, thang, nam, dongTien);
                kq.add(hd);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;

    }

    @Override
    public HoaDonPhong selectById(HoaDonPhong t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDonPhong> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
