
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class HoaDonPhong {
    
    private int maHoaDon;
    private String maSV;
    private int thang;
    private int nam;
    private boolean dongTien;

    public HoaDonPhong() {
    }

    public HoaDonPhong(int maHoaDon, String maSV, int thang, int nam, boolean dongTien) {
        this.maHoaDon = maHoaDon;
        this.maSV = maSV;
        this.thang = thang;
        this.nam = nam;
        this.dongTien = dongTien;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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

     public boolean getDongTien() {
        return dongTien;
    }

    public void setDongTien(boolean dongTien) {
        this.dongTien = dongTien;
    }
    
    
    
    
}
