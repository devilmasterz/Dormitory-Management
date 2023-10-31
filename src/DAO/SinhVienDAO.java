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

/**
 *
 * @author ACER
 */
public class SinhVienDAO implements DAOInterface<SinhVien> {

    public static SinhVienDAO getImstance() {
        return new SinhVienDAO();
    }

    @Override
    public int insert(SinhVien sv) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("insert into SinhVien(maSV,hoTenSV,gioiTinh,ngaySinh,queQuan,lop,khoa,sdt,maPhong,maDay,maHopDong)\n"
                    + "values (?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, sv.getMaSV());
            pst.setNString(2, sv.getHoTenSV());
            pst.setNString(3, sv.getGioiTinh());
            pst.setString(4, sv.getNgaySinh());
            pst.setNString(5, sv.getQueQuan());
            pst.setNString(6, sv.getLop());
            pst.setNString(7, sv.getKhoa());
            pst.setString(8, sv.getSdt());
            pst.setString(9, sv.getMaPhong());
            pst.setString(10, sv.getMaDay());
            pst.setInt(11, sv.getMaHopDong());

            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return kq;
    }

    @Override
    public int update(SinhVien sv) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE SinhVien "
                    + " SET "
                    + " hoTenSV=?"
                    + ", gioiTinha=?"
                    + ", ngaySinh=?"
                    + ", queQuan=?"
                    + ", lop=?"
                    + ", khoa=?"
                    + ", sdt=?"
                    + ", maPhong=?"
                    + ", maDay=?"
                    + ", maHopDong=?"
                    + " WHERE maSV=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setNString(1, sv.getHoTenSV());
            pst.setNString(2, sv.getGioiTinh());
            pst.setString(3, sv.getNgaySinh());
            pst.setNString(4, sv.getQueQuan());
            pst.setNString(5, sv.getLop());
            pst.setNString(6, sv.getKhoa());
            pst.setString(7, sv.getSdt());
            pst.setString(8, sv.getMaPhong());
            pst.setString(9, sv.getMaDay());
            pst.setInt(10, sv.getMaHopDong());
            pst.setString(11, sv.getMaSV());

            kq = pst.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return kq;
    }

    public int update_notHD(SinhVien sv) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE SinhVien "
                    + " SET "
                    + " hoTenSV=?"
                    + ", gioiTinh=?"
                    + ", ngaySinh=?"
                    + ", queQuan=?"
                    + ", lop=?"
                    + ", khoa=?"
                    + ", sdt=?"
                    + ", maPhong=?"
                    + ", maDay=?"
                    + " WHERE maSV=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setNString(1, sv.getHoTenSV());
            pst.setNString(2, sv.getGioiTinh());
            pst.setString(3, sv.getNgaySinh());
            pst.setNString(4, sv.getQueQuan());
            pst.setNString(5, sv.getLop());
            pst.setNString(6, sv.getKhoa());
            pst.setString(7, sv.getSdt());
            pst.setString(8, sv.getMaPhong());
            pst.setString(9, sv.getMaDay());
            pst.setString(10, sv.getMaSV());

            kq = pst.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return kq;
    }
    
    public int update_SuaPhong(String p_moi, String day_moi, String p_cu, String day_cu) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE SinhVien "
                    + " SET "
                    + "maPhong=?"
                    + ", maDay=?"
                    + " WHERE maDay =? and maPhong = ?";

            PreparedStatement pst = con.prepareStatement(sql);

          
            pst.setString(1, p_moi);
            pst.setString(2, day_moi);
            pst.setString(3, day_cu);
            pst.setString(4, p_cu);

            kq = pst.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public int delete(SinhVien sv) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE from SinhVien "
                    + " WHERE maSV=?";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, sv.getMaSV());

            kq = pst.executeUpdate();

            JDBCUtil.closeConnection(con);

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public ArrayList<SinhVien> selectAll() {
        ArrayList<SinhVien> kq = new ArrayList<SinhVien>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from SinhVien");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                String maSV = rs.getString("maSV");
                String hoTenSV = rs.getNString("hoTenSV");
                String gioiTinh = rs.getNString("gioiTinh");
                String ngaySinh = rs.getString("ngaySinh");
                String queQuan = rs.getNString("queQuan");
                String lop = rs.getNString("lop");
                String khoa = rs.getNString("khoa");
                String sdt = rs.getString("sdt");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                int maHopDong = rs.getInt("maHopDong");

                SinhVien sv = new SinhVien(maSV, hoTenSV, gioiTinh, ngaySinh, queQuan, lop, khoa, sdt, maPhong, maDay, maHopDong);
                kq.add(sv);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    public String selectThanhVienPhong(String maDay, String maPhong) {
        String str = "";
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select hoTenSV from SinhVien where maDay =? and maPhong=?");
            pst.setString(1, maDay);
            pst.setString(2, maPhong);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                str = str + rs.getString("hoTenSV") + ",";
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return str;
    }

    public SinhVien selectBy(String masv) {
        SinhVien sv = null;
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM SinhVien where maSV=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, masv);

            ResultSet rs = pst.executeQuery();

            // Bước 4:
            while (rs.next()) {

                String maSV = rs.getString("maSV");
                String hoTenSV = rs.getNString("hoTenSV");
                String gioiTinh = rs.getNString("gioiTinh");
                String ngaySinh = rs.getString("ngaySinh");
                String queQuan = rs.getNString("queQuan");
                String lop = rs.getNString("lop");
                String khoa = rs.getNString("khoa");
                String sdt = rs.getString("sdt");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                int maHopDong = rs.getInt("maHopDong");

                sv = new SinhVien(maSV, hoTenSV, gioiTinh, ngaySinh, queQuan, lop, khoa, sdt, maPhong, maDay, maHopDong);
            }
            // Bước 5:
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sv;
    }

    @Override
    public ArrayList<SinhVien> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<SinhVien> search(String key) {

        ArrayList<SinhVien> kq = new ArrayList<SinhVien>();
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM SinhVien where maSV = ? or hoTenSV = ? or gioiTinh = ? or queQuan = ? or khoa = ? or sdt = ? or lop =? or maPhong = ? or maDay =  ? ";


//                   + "or khoa = ?  or maPhong = ? + maDay =  ? ";
//                    or maHopDong =? ";+ "lop =? "
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setNString(1, key);
            pst.setString(2, key);
            pst.setString(3, key);
            pst.setString(4, key);
            pst.setString(5, key);
            pst.setString(6, key);
            pst.setString(7, key);
            pst.setString(8, key);
            pst.setString(9, key);
//            pst.setDate(10, (Date) sql);
//            pst.setInt(10, Integer.parseInt(key));
//           

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("maSV");
                String hoTenSV = rs.getString("hoTenSV");
                String gioiTinh = rs.getString("gioiTinh");
                String ngaySinh = rs.getString("ngaySinh");
                String queQuan = rs.getNString("queQuan");
                String lop = rs.getString("lop");
                String khoa = rs.getString("khoa");
                String sdt = rs.getString("sdt");
                String maPhong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                int maHopDong = rs.getInt("maHopDong");

                SinhVien sv = new SinhVien(maSV, hoTenSV, gioiTinh, ngaySinh, queQuan, lop, khoa, sdt, maPhong, maDay, maHopDong);
                kq.add(sv);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;

    }

    @Override
    public SinhVien selectById(SinhVien t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
