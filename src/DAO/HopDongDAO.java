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
import model.HopDong;

/**
 *
 * @author ACER
 */
public class HopDongDAO implements DAOInterface<HopDong> {

    public static HopDongDAO getImstance() {
        return new HopDongDAO();
    }

    @Override
    public int insert(HopDong p) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("insert into HopDong(maSV,maPhong,maDay,ngayDangKy,thoiHan,ngayHetHan\n)"
                    + "values (?,?,?,?,?,?)");
            pst.setString(1, p.getMaSV());
            pst.setString(2, p.getMaPhong());
            pst.setString(3, p.getMaDay());
            pst.setString(4, p.getNgayDangKy());
            pst.setInt(5, p.getThoiHan());
            pst.setString(6, p.getNgayHetHan());

            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return kq;
    }
    public HopDong selectBy(String masv) {
        HopDong hd = null;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM HopDong where maSV=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, masv);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                int maHD = rs.getInt("maHopDong");
                String maSV = rs.getString("maSV");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                String ngayDangky = rs.getString("ngayDangKy");
                int thoiHan = rs.getInt("thoiHan");

                String nngayhetHan = rs.getString("ngayHetHan");

                hd = new HopDong(maHD, maSV, maPhong, maDay, ngayDangky, thoiHan, nngayhetHan);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return hd;
    }

    @Override
    public int update(HopDong p) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE HopDong "
                    + " SET "
                    + " maSV=?"
                    + ", maPhong=?"
                    + ", maDay=?"
                    + ", ngayDangKy=?"
                    + ", thoiHan=?"
                    + ", ngayHetHan=?"
                    + " WHERE maHopDong=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, p.getMaSV());
            pst.setString(2, p.getMaPhong());
            pst.setString(3, p.getMaDay());
            pst.setString(4, p.getNgayDangKy());
            pst.setInt(5, p.getThoiHan());
            pst.setString(6, p.getNgayHetHan());
            pst.setInt(7, p.getMaHopDong());

            kq = pst.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return kq;
    }
    
    public int update_suaPhong(String p_moi, String day_moi, String p_cu, String day_cu) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE HopDong "
                    + " SET "              
                    + " maPhong=?"
                    + " , maDay=?"        
                    + " WHERE maPhong=? and maDay=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, p_moi);
            pst.setString(2, day_moi);
            pst.setString(3, p_cu);
            pst.setString(4, day_cu);
            
            kq = pst.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public int delete(HopDong p) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE from HopDong "
                    + " WHERE maHopDong =?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, p.getMaHopDong());

            kq = pst.executeUpdate();

            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public ArrayList<HopDong> selectAll() {
        ArrayList<HopDong> kq = new ArrayList<HopDong>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from HopDong");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int maHD = rs.getInt("maHopDong");
                String maSV = rs.getString("maSV");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                String ngayDangky = rs.getString("ngayDangKy");
                int thoiHan = rs.getInt("thoiHan");

                String nngayhetHan = rs.getString("ngayHetHan");

                HopDong hd = new HopDong(maHD, maSV, maPhong, maDay, ngayDangky, thoiHan, nngayhetHan);
                kq.add(hd);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public HopDong selectById(HopDong p) {
        HopDong kq = null;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM HopDong where maHopDong=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, p.getMaHopDong());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int maHD = rs.getInt("maHopDong");
                String maSV = rs.getString("maSV");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                String ngayDangky = rs.getString("ngayDangKy");
                int thoiHan = rs.getInt("thoiHan");

                String nngayhetHan = rs.getString("ngayHetHan");

                kq = new HopDong(maHD, maSV, maPhong, maDay, ngayDangky, thoiHan, nngayhetHan);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public ArrayList<HopDong> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public HopDong selectByMaSV(HopDong p) {
        HopDong kq = null;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM HopDong where maSV=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, p.getMaSV());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int maHD = rs.getInt("maHopDong");
                String maSV = rs.getString("maSV");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                String ngayDangky = rs.getString("ngayDangKy");
                int thoiHan = rs.getInt("thoiHan");

                String nngayhetHan = rs.getString("ngayHetHan");

                kq = new HopDong(maHD, maSV, maPhong, maDay, ngayDangky, thoiHan, nngayhetHan);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return kq;
    }

    public ArrayList<HopDong> search(String key) {

        ArrayList<HopDong> kq = new ArrayList<HopDong>();
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM HopDong where  maDay =? or maPhong =? or maSV= ? ";
            PreparedStatement pst = con.prepareStatement(sql);
        
            pst.setString(1, key);
            pst.setString(2, key);
            pst.setString(3, key);
//           pst.setInt(4, Integer.parseInt(key));
//            pst.setInt(5, Integer.parseInt(key)); or thoiHan =?
            


            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int maHD = rs.getInt("maHopDong");
                String maSV = rs.getString("maSV");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                String ngayDangky = rs.getString("ngayDangKy");
                int thoiHan = rs.getInt("thoiHan");
                String nngayhetHan = rs.getString("ngayHetHan");

                HopDong hd = new HopDong(maHD, maSV, maPhong, maDay, ngayDangky, thoiHan, nngayhetHan);
                kq.add(hd);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;

    }
}
