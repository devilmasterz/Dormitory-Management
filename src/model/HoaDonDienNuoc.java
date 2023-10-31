/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class HoaDonDienNuoc {

    private int maHoaDon;
    private String maPHong;
    private String maDay;
    private int soNuoc;
    private int soDien;
    private int thang;
    private int nam;
    private float tienNuoc;
    private float tienDien;
    private float tongTien;
    private boolean dongTien;

    public HoaDonDienNuoc() {
    }

    public HoaDonDienNuoc(int maHoaDon, String maPHong, String maDay,int thang, int nam,int soNuoc, int soDien,  float tienNuoc, float tìenDien, float tongTien, boolean dongTien) {
        this.maHoaDon = maHoaDon;
        this.maPHong = maPHong;
        this.maDay = maDay;
        this.soNuoc = soNuoc;
        this.soDien = soDien;
        this.thang = thang;
        this.nam = nam;
        this.tienNuoc = tienNuoc;
        this.tienDien = tìenDien;
        this.tongTien = tongTien;
        this.dongTien = dongTien;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaPHong() {
        return maPHong;
    }

    public void setMaPHong(String maPHong) {
        this.maPHong = maPHong;
    }

    public String getMaDay() {
        return maDay;
    }

    public void setMaDay(String maDay) {
        this.maDay = maDay;
    }

    public int getSoNuoc() {
        return soNuoc;
    }

    public void setSoNuoc(int soNuoc) {
        this.soNuoc = soNuoc;
    }

    public int getSoDien() {
        return soDien;
    }

    public void setSoDien(int soDien) {
        this.soDien = soDien;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public float getTienNuoc() {
        return tienNuoc;
    }

    public void setTienNuoc(int soNuoc) {
        this.tienNuoc =  soNuoc * 7.777f;
    }

    public float getTienDien() {
        return tienDien;
    }

    public void setTienDien(int soDien) {

        float bac1 = 1.678f, bac2 = 1.734f, bac3 = 2.014f, bac4 = 2.536f, bac5 = 2.834f, bac6 = 2.927f;
        if (soDien < 0) {
            this.tienDien = 0;
        } else if (soDien <= 50) {
            tienDien = soDien * bac1;

        } else if (soDien <= 100) {
            tienDien = 50 * bac1 + ((soDien - 50) * bac2);

        } else if (soDien <= 200) {
            tienDien = 50 * bac1 + (50 * bac2) + ((soDien - 100) * bac3);

        } else if (soDien <= 300) {
            tienDien = 50 * bac1 + (50 * bac2) + (100 * bac3) + ((soDien - 200) * bac4);

        } else if (soDien <= 400) {
            tienDien = 50 * bac1 + (50 * bac2) + (100 * bac3) + (100 * bac4) + ((soDien - 300) * bac5);

        } else if (soDien > 400) {
            tienDien = 50 * bac1 + (50 * bac2) + (100 * bac3) + (100 * bac4) + (100 * bac5) + ((soDien - 400) * bac6);

        }
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tienNuoc, float  tienDien) {
        this.tongTien = tienNuoc+ tienDien;
    }

    public boolean getDongTien() {
        return dongTien;
    }

    public void setDongTien(boolean dongTien) {
        this.dongTien = dongTien;
    }

}
