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
import model.PhieuDangKy;

/**
 *
 * @author ACER
 */
public class PhieuDangKyDAO implements DAOInterface<PhieuDangKy> {

    public static PhieuDangKyDAO getInstance() {
        return new PhieuDangKyDAO();
    }

    @Override
    public int insert(PhieuDangKy p) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("insert into PhieuDangKy(maSV,hoTenSV,maPhong,maDay,ngay,ngayDangKy,thoiHan,ngayHetHan,xuLY\n)"
                    + "values (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, p.getMaSV());
            pst.setString(2, p.getHoTenSV());
            pst.setString(3, p.getMaPhong());
            pst.setString(4, p.getMaDay());
            pst.setString(5, p.getNgay());
            pst.setString(6, p.getNgayDangKy());
            pst.setInt(7, p.getThoiHan());
            pst.setString(8, p.getNgayHetHan());
            pst.setBoolean(9, p.getXuLy());
            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return kq;

    }

    @Override
    public int update(PhieuDangKy t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(PhieuDangKy t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<PhieuDangKy> selectAll() {
        ArrayList<PhieuDangKy> kq = new ArrayList<PhieuDangKy>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from PhieuDangKy ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                int maPhieu = rs.getInt("maPhieu");
                String maSV = rs.getString("maSV");
                String hoten = rs.getString("hoTenSV");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                String ngay = rs.getString("ngay");
                String ngayDangky = rs.getString("ngayDangKy");
                int thoiHan = rs.getInt("thoiHan");
                String nngayhetHan = rs.getString("ngayHetHan");
                String phanHoi = rs.getString("phanHoi");
                boolean xuLy = rs.getBoolean("xuLy");
                PhieuDangKy pdk = new PhieuDangKy(maPhieu, maSV, hoten, maPhong, maDay, ngay, ngayDangky, thoiHan, nngayhetHan, phanHoi,xuLy);
                kq.add(pdk);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    public ArrayList<PhieuDangKy> selectBy(String mmaSV) {
        ArrayList<PhieuDangKy> kq = new ArrayList<PhieuDangKy>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from PhieuDangKy where maSV =?");
            pst.setString(1, mmaSV);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int maPhieu = rs.getInt("maPhieu");
                String maSV = rs.getString("maSV");
                String hoten = rs.getString("hoTenSV");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                String ngay = rs.getString("ngay");
                String ngayDangky = rs.getString("ngayDangKy");
                int thoiHan = rs.getInt("thoiHan");
                String nngayhetHan = rs.getString("ngayHetHan");
                String phanHoi = rs.getString("phanHoi");
                boolean xuLy = rs.getBoolean("xuLy");
                PhieuDangKy pdk = new PhieuDangKy(maPhieu, maSV, hoten, maPhong, maDay, ngay, ngayDangky, thoiHan, nngayhetHan, phanHoi,xuLy);
                kq.add(pdk);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    public PhieuDangKy selectByMaPhieu(int mmaPhieu) {
        PhieuDangKy kq = new PhieuDangKy();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from PhieuDangKy where maPhieu =?");
            pst.setInt(1, mmaPhieu);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int maPhieu = rs.getInt("maPhieu");
                String maSV = rs.getString("maSV");
                String hoten = rs.getString("hoTenSV");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                String ngay = rs.getString("ngay");
                String ngayDangky = rs.getString("ngayDangKy");
                int thoiHan = rs.getInt("thoiHan");
                String nngayhetHan = rs.getString("ngayHetHan");
                String phanHoi = rs.getString("phanHoi");
                boolean xuLy = rs.getBoolean("xuLy");
                kq = new PhieuDangKy(maPhieu, maSV, hoten, maPhong, maDay, ngay, ngayDangky, thoiHan, nngayhetHan, phanHoi,xuLy);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public PhieuDangKy selectById(PhieuDangKy t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<PhieuDangKy> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
