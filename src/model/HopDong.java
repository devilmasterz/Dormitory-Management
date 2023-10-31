/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class HopDong {
    private int maHopDong;
    private String maSV;
    private String maPhong;
    private String maDay;
    private String ngayDangKy;
    private int thoiHan;
    private String ngayHetHan;

    public HopDong() {
    }

    public HopDong(int maHopDong, String maSV, String maPhong, String maDay, String ngayDangKy, int thoiHan, String ngayHetHan) {
        this.maHopDong = maHopDong;
        this.maSV = maSV;
        this.maPhong = maPhong;
        this.maDay = maDay;
        this.ngayDangKy = ngayDangKy;
        this.thoiHan = thoiHan;
        this.ngayHetHan = ngayHetHan;
    }

    public int getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaDay() {
        return maDay;
    }

    public void setMaDay(String maDay) {
        this.maDay = maDay;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public int getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(int thoiHan) {
        this.thoiHan = thoiHan;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    
    
   
    @Override
    public String toString() {
        return "HopDong{" + "maHopDong=" + maHopDong + ", maSV=" + maSV + ", maPhong=" + maPhong + ", maDay=" + maDay + ", ngayDangKy=" + ngayDangKy + ", thoiHan=" + thoiHan + ", ngayHetHan=" + ngayHetHan + '}';
    }

    
   
}
