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
import model.HoaDonDienNuoc;

/**
 *
 * @author ACER
 */
public class DienNuocDAO implements DAOInterface<HoaDonDienNuoc> {

    public static DienNuocDAO getImstance() {
        return new DienNuocDAO();
    }

    @Override
    public int insert(HoaDonDienNuoc hd) {
        int kq = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("insert into HoaDonDienNuoc(maPhong,maDay,thang,nam,soNuoc,soDien,tienNuoc,tienDien,tongTien,dongTien)\n"
                    + "values (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, hd.getMaPHong());
            pst.setString(2, hd.getMaDay());
            pst.setInt(3, hd.getThang());
            pst.setInt(4, hd.getNam());
            pst.setInt(5, hd.getSoNuoc());
            pst.setInt(6, hd.getSoDien());
            pst.setFloat(7, hd.getTienNuoc());
            pst.setFloat(8, hd.getTienDien());
            pst.setFloat(9, hd.getTongTien());
            pst.setBoolean(10, hd.getDongTien());

            kq = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return kq;
    }

    @Override
    public int update(HoaDonDienNuoc hd) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();

            String sql = "UPDATE HoaDonDienNuoc "
                    + " SET "
                    + " soNuoc=?"
                    + ", soDien=?"
                    + ", tienNuoc=?"
                    + ", tienDien=?"
                    + ", tongTien=?"
                    + " WHERE maHoaDon=?";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, hd.getSoNuoc());
            pst.setInt(2, hd.getSoDien());
            pst.setFloat(3, hd.getTienNuoc());
            pst.setFloat(4, hd.getTienDien());
            pst.setFloat(5, hd.getTongTien());
              pst.setInt(6, hd.getMaHoaDon());
            
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

            String sql = "UPDATE HoaDonDienNuoc "
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
    public int delete(HoaDonDienNuoc hd) {
        int kq = 0;
        try {

            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE from HoaDonDienNuoc "
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
    public ArrayList<HoaDonDienNuoc> selectAll() {
        ArrayList<HoaDonDienNuoc> kq = new ArrayList<HoaDonDienNuoc>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from HoaDonDienNuoc");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                int mahd = rs.getInt("maHoaDon");
                String maphong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                int thang = rs.getInt("thang");
                int nam = rs.getInt("nam");
                int soNuoc = rs.getInt("soNuoc");
                int soDien = rs.getInt("soDien");
                float tienNuoc = rs.getFloat("tienNuoc");
                float tienDien = rs.getFloat("tienDien");
                float tongTien = rs.getFloat("tongTien");
                boolean dongTien = rs.getBoolean("dongTien");

                HoaDonDienNuoc hd = new HoaDonDienNuoc(mahd, maphong, maDay, thang, nam, soNuoc, soDien, tienNuoc, tienDien, tongTien, dongTien);

                kq.add(hd);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }
    
    public ArrayList<HoaDonDienNuoc> selectBy(String phong, String day) {
        ArrayList<HoaDonDienNuoc> kq = new ArrayList<HoaDonDienNuoc>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select * from HoaDonDienNuoc where maPhong =? and maDay=?");
             pst.setString(1, phong);
             pst.setString(2, day);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                int mahd = rs.getInt("maHoaDon");
                String maphong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                int thang = rs.getInt("thang");
                int nam = rs.getInt("nam");
                int soNuoc = rs.getInt("soNuoc");
                int soDien = rs.getInt("soDien");
                float tienNuoc = rs.getFloat("tienNuoc");
                float tienDien = rs.getFloat("tienDien");
                float tongTien = rs.getFloat("tongTien");
                boolean dongTien = rs.getBoolean("dongTien");

                HoaDonDienNuoc hd = new HoaDonDienNuoc(mahd, maphong, maDay, thang, nam, soNuoc, soDien, tienNuoc, tienDien, tongTien, dongTien);

                kq.add(hd);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }
    public ArrayList<HoaDonDienNuoc> selectByTN(int thangg , int namm) {
         ArrayList<HoaDonDienNuoc> kq = new ArrayList<HoaDonDienNuoc>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM HoaDonDienNuoc where thang = ? and nam = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, thangg);
            pst.setInt(2, namm);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int mahd = rs.getInt("maHoaDon");
                String maphong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                int thang = rs.getInt("thang");
                int nam = rs.getInt("nam");
                int soNuoc = rs.getInt("soNuoc");
                int soDien = rs.getInt("soDien");
                float tienNuoc = rs.getFloat("tienNuoc");
                float tienDien = rs.getFloat("tienDien");
                float tongTien = rs.getFloat("tongTien");
                boolean dongTien = rs.getBoolean("dongTien");

                HoaDonDienNuoc hd = new HoaDonDienNuoc(mahd, maphong, maDay, thang, nam, soNuoc, soDien, tienNuoc, tienDien, tongTien, dongTien);

                kq.add(hd);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return kq;
    }

    @Override
    public HoaDonDienNuoc selectById(HoaDonDienNuoc t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDonDienNuoc> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public ArrayList<HoaDonDienNuoc> search(String key) {

        ArrayList<HoaDonDienNuoc> kq = new ArrayList<HoaDonDienNuoc>();
        try {
            Connection con = JDBCUtil.getConnection();

            String sql = "SELECT * FROM HoaDonDienNuoc where maHoaDon = ? or maDay =? or maPhong =? or thang =?  or nam =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(key));
            pst.setString(2, key);
            pst.setString(3, key);
            pst.setInt(4, Integer.parseInt(key));
           
            pst.setInt(5, Integer.parseInt(key));
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int mahd = rs.getInt("maHoaDon");
                String maphong = rs.getString("maPhong");
                String maDay = rs.getString("maDay");
                int thang = rs.getInt("thang");
                int nam = rs.getInt("nam");
                int soNuoc = rs.getInt("soNuoc");
                int soDien = rs.getInt("soDien");
                float tienNuoc = rs.getFloat("tienNuoc");
                float tienDien = rs.getFloat("tienDien");
                float tongTien = rs.getFloat("tongTien");
                boolean dongTien = rs.getBoolean("dongTien");

                HoaDonDienNuoc hd = new HoaDonDienNuoc(mahd, maphong, maDay, thang, nam, soNuoc, soDien, tienNuoc, tienDien, tongTien, dongTien);

                kq.add(hd);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;

    }
    
     public ArrayList<Float>  select_TongTienThang(int thang, int nam) {
        ArrayList<Float> kq = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select sum(tienNuoc) as tongTN , sum(tienDien) as tongTD ,sum(soNuoc) as soNuoc"
                    + ", sum(soDien) as soDien,   sum(tongTien) as  tongTienThang from HoaDonDienNuoc where thang = ? and nam = ?");
             pst.setInt(1, thang);
             pst.setInt(2, nam);
             
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                float tienNuoc = rs.getFloat("tongTN");
                float tienDien = rs.getFloat("tongTD");
                float tongTien = rs.getFloat("tongTienThang");
                int soNuoc = rs.getInt("soNuoc");
                int soDien = rs.getInt("soDien");
               
                kq.add(tienNuoc);
                kq.add(tienDien);
                kq.add(tongTien);
                kq.add( (float)soNuoc);
                kq.add((float)soDien);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }
     
     public ArrayList<Float>  select_TongTien() {
        ArrayList<Float> kq = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select sum(tienNuoc) as tongTN , sum(tienDien) as tongTD ,sum(soNuoc) as soNuoc"
                    + ", sum(soDien) as soDien,   sum(tongTien) as  tongTienThang from HoaDonDienNuoc ");
             
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                float tienNuoc = rs.getFloat("tongTN");
                float tienDien = rs.getFloat("tongTD");
                float tongTien = rs.getFloat("tongTienThang");
                int soNuoc = rs.getInt("soNuoc");
                int soDien = rs.getInt("soDien");
               
                kq.add(tienNuoc);
                kq.add(tienDien);
                kq.add(tongTien);
                kq.add( (float)soNuoc);
                kq.add((float)soDien);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

}
