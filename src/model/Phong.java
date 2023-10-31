/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Phong extends Day {

    private String maPhong;
    private String tenPhong;
 
    private int soSV;
    private int soSV_toiDa;
    private String thanhVienPhong;

    public Phong() {
    }

    public Phong(String maPhong, String tenPhong, int soSV, int soSV_toiDa, String thanhVienPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.soSV = soSV;
        this.soSV_toiDa = soSV_toiDa;
        this.thanhVienPhong = thanhVienPhong;
    }

    public Phong(String maPhong, String tenPhong, int soSV, int soSV_toiDa, String thanhVienPhong, String maDay) {
        super(maDay);
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.soSV = soSV;
        this.soSV_toiDa = soSV_toiDa;
        this.thanhVienPhong = thanhVienPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    public int getSoSV_toiDa() {
        return soSV_toiDa;
    }

    public void setSoSV_toiDa(int soSV_toiDa) {
        this.soSV_toiDa = soSV_toiDa;
    }

    public String getThanhVienPhong() {
        return thanhVienPhong;
    }

    public void setThanhVienPhong(String thanhVienPhong) {
        this.thanhVienPhong = thanhVienPhong;
    }

    

    

    @Override
    public void setMaDay(String maDay) {
        super.setMaDay(maDay);
    }

    @Override
    public String getMaDay() {
        return super.getMaDay();
    }

}
