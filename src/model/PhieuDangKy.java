/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class PhieuDangKy {
    private int maPhieu;
    private String maSV;
    private String hoTenSV;
    private String maPhong;
    private String maDay;
    private String ngay;
    private String ngayDangKy;
    private int thoiHan;
    private String ngayHetHan;
    private String phanHoi;
    boolean xuLy;

    public PhieuDangKy() {
    }

    public PhieuDangKy(int maPhieu, String maSV, String hoTenSV, String maPhong, String maDay, String ngay, String ngayDangKy, int thoiHan, String ngayHetHan, String phanHoi, boolean xuLy) {
        this.maPhieu = maPhieu;
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.maPhong = maPhong;
        this.maDay = maDay;
        this.ngay = ngay;
        this.ngayDangKy = ngayDangKy;
        this.thoiHan = thoiHan;
        this.ngayHetHan = ngayHetHan;
        this.phanHoi = phanHoi;
        this.xuLy = xuLy;
    }

    public boolean getXuLy() {
        return xuLy;
    }

    public void setXuLy(boolean xuLy) {
        this.xuLy = xuLy;
    }

    

    public String getPhanHoi() {
        return phanHoi;
    }

    public void setPhanHoi(String phanHoi) {
        this.phanHoi = phanHoi;
    }

   
    
    public int getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
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

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
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
    
    
    
}
