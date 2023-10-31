/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author ACER
 */
public class SinhVien  {
    private String maSV;
    private String hoTenSV;
    private String gioiTinh;
    private String ngaySinh;
    private String queQuan;
    private String lop;
    private String khoa;
    private String sdt;
    private String maPhong;
    private String maDay;
    private int maHopDong;
    
    
    public SinhVien(){    
    }

    public SinhVien(String maSV, String hoTenSV, String gioiTinh, String ngaySinh, String queQuan, String lop, String khoa, String sdt, String maPhong, String maDay, int maHopDong) {
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.lop = lop;
        this.khoa = khoa;
        this.sdt = sdt;
        this.maPhong = maPhong;
        this.maDay = maDay;
        this.maHopDong = maHopDong;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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

    public int getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }
    

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTenSV=" + hoTenSV + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", queQuan=" + queQuan + ", lop=" + lop + ", khoa=" + khoa + ", sdt=" + sdt + ", maPhong=" + maPhong + ", maDay=" + maDay + ", maHopDong=" + maHopDong + '}';
    }

    
    
    
    
     
}
