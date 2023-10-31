package view;

import DAO.DienNuocDAO;
import DAO.HoaDonPhongDAO;
import DAO.HopDongDAO;
import DAO.PhieuDangKyDAO;
import DAO.PhongDAO;
import DAO.SinhVienDAO;
import DAO.UserDAO;
import controller.Control_MainPage;
import controller.Control_admin_DienNuoc;
import controller.Control_admin_HoaDonPhong;
import controller.Control_admin_HopDong;
import controller.Control_admin_PDK;
import controller.Control_admin_Phong;
import controller.Control_admin_SinhVien;
import database.JDBCUtil;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import model.HopDong;
import model.Phong;
import model.User;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admin;
import model.HoaDonDienNuoc;
import model.HoaDonPhong;
import model.PhieuDangKy;
import model.SinhVien;

public class View_MainPage extends javax.swing.JFrame {

    PreparedStatement pst;
    ActionListener ac = new Control_MainPage(this);
    ActionListener ac_Phong = new Control_admin_Phong(this);
    ActionListener ac_HopDong = new Control_admin_HopDong(this);
    ActionListener ac_sinhvien = new Control_admin_SinhVien(this);
    ActionListener ac_dienNuoc = new Control_admin_DienNuoc(this);
    ActionListener ac_hdPhong = new Control_admin_HoaDonPhong(this);
    ActionListener ac_pdk = new Control_admin_PDK(this);

    Admin ad = new Admin();
    boolean flag_MK_Dx = true;

    public View_MainPage(Admin admin) {

        this.ad = admin;
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_account = new javax.swing.JButton();
        jLabel_tenUser = new javax.swing.JLabel();
        jPanel_MK_DX = new javax.swing.JPanel();
        jButton_dangXuat = new javax.swing.JButton();
        jButton_taiKhoan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton_trangChu = new javax.swing.JButton();
        jButton_hopDong = new javax.swing.JButton();
        jButton_Sinhvien = new javax.swing.JButton();
        jButton_hoaDon = new javax.swing.JButton();
        jButton_phong = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel_sinhVien = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton_sua_SinhVien = new javax.swing.JButton();
        jTextField_timkiem_SinhVien = new javax.swing.JTextField();
        jButton_timkiem_SinhVien = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_sinhVien = new javax.swing.JTable();
        jLabel_soPhong1 = new javax.swing.JLabel();
        jLabel_soPhong_trong1 = new javax.swing.JLabel();
        jLabel_soGiuongTrong1 = new javax.swing.JLabel();
        jPanel_suaSV = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jTextField_tenSV_suaSV = new javax.swing.JTextField();
        jTextField_gioiTinh_suaSV = new javax.swing.JTextField();
        jTextField_khoa_suaSV = new javax.swing.JTextField();
        jTextField_lop_suaSV = new javax.swing.JTextField();
        jTextField_sdt_suaSV = new javax.swing.JTextField();
        jLabel_phong_suaSV = new javax.swing.JLabel();
        jLabel_day_suaSV = new javax.swing.JLabel();
        jTextField_ngaySInh_suaSV = new javax.swing.JTextField();
        jButton_huyBo_suaSV = new javax.swing.JButton();
        jButton_capNhat_suaSV = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jTextField_queQuan_suaSV = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel_maSV_suaSV = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_userSV = new javax.swing.JTable();
        jButton_capNhatiPass_SV = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jTextField_timkiem_User = new javax.swing.JTextField();
        jButton_timkiem_User = new javax.swing.JButton();
        jPanel_phong = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton_newPhong = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_phong = new javax.swing.JTable();
        jButton_timkiem_phong = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_timkiem_Phong = new javax.swing.JTextField();
        jButton_sua_Phong = new javax.swing.JButton();
        jButton_xoa_Phong = new javax.swing.JButton();
        jLabel_soPhong = new javax.swing.JLabel();
        jLabel_soPhong_trong = new javax.swing.JLabel();
        jLabel_soGiuongTrong = new javax.swing.JLabel();
        jPanel_suaPhong = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jButton_capNhat_suaPhong = new javax.swing.JButton();
        jButton_huyBo_suaPhong = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField_tenPhong_suaPhong = new javax.swing.JTextField();
        jTextField_maPhong_suaPhong = new javax.swing.JTextField();
        jTextField_day_suaPhong = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField_soSVToiDa_suaPhong = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_thanhVienPhong_suaPhong = new javax.swing.JTextArea();
        jLabel_soSV_suaPhong = new javax.swing.JLabel();
        jPanel_newPhong = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jButton_xacNhan_newPhong = new javax.swing.JButton();
        jButton_huyBo_newPhong = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField_tenPhong_newPhong = new javax.swing.JTextField();
        jTextField_maPhong_newPhong = new javax.swing.JTextField();
        jTextField_day_newPhong = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField_soSVToiDa_newPhong = new javax.swing.JTextField();
        jPanel_trangChu = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel_hopDong = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel_suaHD = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel_maSV_cu = new javax.swing.JLabel();
        jLabel_maHD_cu = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel_tenSV_cu = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel_day_cu = new javax.swing.JLabel();
        jLabel_ngayDangky_cu = new javax.swing.JLabel();
        jLabel_phong_cu = new javax.swing.JLabel();
        jLabel_ngayHetHan_cu = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel_thoiHan_cu = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel_maSV_cu2 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel_maHD_cu2 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel_tenSV_cu2 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jComboBox_phong_suaHD = new javax.swing.JComboBox<>();
        jComboBox_day_suaHD = new javax.swing.JComboBox<>();
        jTextField_ngayDangKy_suaHD = new javax.swing.JTextField();
        jTextField_ngayHetHan_suaHD = new javax.swing.JTextField();
        jTextField_thoiHan_suaHD = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton_QuayLai_suahd = new javax.swing.JButton();
        jButton_thayDoi_suahd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton_timkiem_HD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_tiemkiem_HD = new javax.swing.JTextField();
        jButton_newHopDong = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_hopDong = new javax.swing.JTable();
        jButton_xoa_HD = new javax.swing.JButton();
        jButton_sua_HD = new javax.swing.JButton();
        jPanel_newHopDong = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField_maSV_newHD = new javax.swing.JTextField();
        jTextField_tenSV_newHD = new javax.swing.JTextField();
        jRadioButton_nam_newHD = new javax.swing.JRadioButton();
        jRadioButton_nu_newHD = new javax.swing.JRadioButton();
        jTextField_ngaySinh_newHD = new javax.swing.JTextField();
        jTextField_lop_newHD = new javax.swing.JTextField();
        jTextField_khoa_newHD = new javax.swing.JTextField();
        jTextField_sdt_newHD = new javax.swing.JTextField();
        jTextField_ngayDangKy_newHD = new javax.swing.JTextField();
        jTextField_thoiHan_newHD = new javax.swing.JTextField();
        jTextField_ngayHetHan_newHD = new javax.swing.JTextField();
        jButton_xacNhan_newHD = new javax.swing.JButton();
        jButton_huyBo_newHD = new javax.swing.JButton();
        jComboBox_day_newHD = new javax.swing.JComboBox<>();
        jComboBox_phong_newHD = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jTextField_queQuan_newHD = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel_hoTen_xemPhieu = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel_maSV_xemPhieu = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel_lop_xemPhieu = new javax.swing.JLabel();
        jLabel_khoa_xemPhieu = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel115 = new javax.swing.JLabel();
        jLabel_ngay_xemPhieu = new javax.swing.JLabel();
        jLabel_phong_xemPhieu = new javax.swing.JLabel();
        jLabel_day_xemPhieu = new javax.swing.JLabel();
        jLabel_ngayDangKy_xemPhieu = new javax.swing.JLabel();
        jLabel_thoiHan_xemPhieu = new javax.swing.JLabel();
        jLabel_ngayHetHan_xemPhieu = new javax.swing.JLabel();
        jButton_phanHoi_PDK = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable_phieuDangKy = new javax.swing.JTable();
        jButton_phanHoi_PDK1 = new javax.swing.JButton();
        jButton_xoa_PDK = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        jButton_xem_PDK = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton_xem_PDK1 = new javax.swing.JButton();
        jTextField_timkiem_PDK = new javax.swing.JTextField();
        jButton_timkiem_HD_Phong1 = new javax.swing.JButton();
        jPanel_hoaDon = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_1 = new javax.swing.JPanel();
        jPanel_newHD_Phong = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jComboBox_thang_newHD_Phong = new javax.swing.JComboBox<>();
        jComboBox_nam_newHD_Phong = new javax.swing.JComboBox<>();
        jLabel102 = new javax.swing.JLabel();
        jButton_tao_newHD_Phong = new javax.swing.JButton();
        jButton_troLai_newHD_Phong = new javax.swing.JButton();
        jPanel_hoaDon_Phong = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_HoaDon_Phong = new javax.swing.JTable();
        jButton_newHD_Phong = new javax.swing.JButton();
        jButton_xoa_HD_Phong = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jTextField_timkiem_HD_Phong = new javax.swing.JTextField();
        jButton_hienThi_HD_Phong = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jComboBox_thang_HD_Phong = new javax.swing.JComboBox<>();
        jLabel94 = new javax.swing.JLabel();
        jComboBox_nam_HD_Phong = new javax.swing.JComboBox<>();
        jButton_hienThiToanBo_HD_Phong = new javax.swing.JButton();
        jLabel_setngayThang_HD_Phong = new javax.swing.JLabel();
        jButton_timkiem_HD_Phong = new javax.swing.JButton();
        jButton_capNhat_HD_Phong = new javax.swing.JButton();
        jButton_xoa_HD_Phong1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jComboBox_thang_xoaHDThang = new javax.swing.JComboBox<>();
        jLabel101 = new javax.swing.JLabel();
        jComboBox_nam_xoaHDThang = new javax.swing.JComboBox<>();
        jButton_hienThi_HD_Phong1 = new javax.swing.JButton();
        jButton_hienThi_HD_Phong2 = new javax.swing.JButton();
        jPanel_xoaHD_Phong = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jComboBox_thang_xoaHD_Phong = new javax.swing.JComboBox<>();
        jComboBox_nam_xoaHD_Phong = new javax.swing.JComboBox<>();
        jLabel103 = new javax.swing.JLabel();
        jButton_tao_newHD_Phong1 = new javax.swing.JButton();
        jButton_troLai_newHD_Phong1 = new javax.swing.JButton();
        jPanel_ = new javax.swing.JPanel();
        jPanel_suaHD_DN = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel_phong_suaHD_DN = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel_tienNuoc_suaHD_DN = new javax.swing.JLabel();
        jLabel_tienDien_suaHD_DN = new javax.swing.JLabel();
        jLabel_tongTien_suaHD_DN = new javax.swing.JLabel();
        jTextField_soNuoc_suaHD_DN = new javax.swing.JTextField();
        jTextField_soDIen_suaHD_DN = new javax.swing.JTextField();
        jButton_tinhTien_newHD_dn1 = new javax.swing.JButton();
        jButton_tao_newHD_dn1 = new javax.swing.JButton();
        jButton_troLai_newHD_dn1 = new javax.swing.JButton();
        jLabel_m = new javax.swing.JLabel();
        jLabel_day_suaHD_DN = new javax.swing.JLabel();
        jLabel_nam_suaHD_DN = new javax.swing.JLabel();
        jLabel_thang_suaHD_DN = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel_maHoaDon_suaHD_DN = new javax.swing.JLabel();
        jPanel_hoaDon_DienNuoc = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_HoaDonDN = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jTextField_timkiem_DN = new javax.swing.JTextField();
        jButton_hienThi_DN = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jComboBox_thang_DN = new javax.swing.JComboBox<>();
        jLabel83 = new javax.swing.JLabel();
        jButton_newHD_DN = new javax.swing.JButton();
        jComboBox_nam_DN = new javax.swing.JComboBox<>();
        jButton_hienThi_DN1 = new javax.swing.JButton();
        jLabel_setngayThang = new javax.swing.JLabel();
        jButton_xoa_HD_DN = new javax.swing.JButton();
        jButton_sua_HD_DN = new javax.swing.JButton();
        jButton_timkiem_HD_DN = new javax.swing.JButton();
        jButton_capNhat_DN = new javax.swing.JButton();
        jPanel_newHD_dn = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jComboBox_phong_newHD_dn = new javax.swing.JComboBox<>();
        jComboBox_day_newHD_dn = new javax.swing.JComboBox<>();
        jComboBox_thang_newHD_dn = new javax.swing.JComboBox<>();
        jComboBox_nam_newHD_dn = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel_tienNuoc_newHD_dn = new javax.swing.JLabel();
        jLabel_tienDien_newHD_dn = new javax.swing.JLabel();
        jLabel_tongTien_newHD_dn = new javax.swing.JLabel();
        jTextField_soNuoc_newHD_dn = new javax.swing.JTextField();
        jTextField_soDIen_newHD_dn = new javax.swing.JTextField();
        jButton_tinhTien_newHD_dn = new javax.swing.JButton();
        jButton_tao_newHD_dn = new javax.swing.JButton();
        jButton_troLai_newHD_dn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Ký Túc Xá");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1650, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_account.setBackground(new java.awt.Color(255, 232, 172));
        jButton_account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user.png"))); // NOI18N
        jButton_account.setAlignmentY(10.0F);
        jButton_account.setBorder(null);
        jButton_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_accountActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 10, 58, -1));

        jLabel_tenUser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_tenUser.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_tenUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_tenUser.setText("ten user");
        jLabel_tenUser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel_tenUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel_tenUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 256, 44));
        jLabel_tenUser.setText(ad.getUserName());

        jPanel_MK_DX.setBackground(new java.awt.Color(255, 232, 172));

        jButton_dangXuat.setBackground(new java.awt.Color(255, 232, 172));
        jButton_dangXuat.setForeground(new java.awt.Color(0, 0, 0));
        jButton_dangXuat.setText("Đăng xuất");
        jButton_dangXuat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dangXuatActionPerformed(evt);
            }
        });

        jButton_taiKhoan.setBackground(new java.awt.Color(255, 232, 172));
        jButton_taiKhoan.setForeground(new java.awt.Color(0, 0, 0));
        jButton_taiKhoan.setText("Tài khoản");
        jButton_taiKhoan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_taiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_taiKhoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MK_DXLayout = new javax.swing.GroupLayout(jPanel_MK_DX);
        jPanel_MK_DX.setLayout(jPanel_MK_DXLayout);
        jPanel_MK_DXLayout.setHorizontalGroup(
            jPanel_MK_DXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_dangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
            .addComponent(jButton_taiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_MK_DXLayout.setVerticalGroup(
            jPanel_MK_DXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MK_DXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_taiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_dangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel_MK_DX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 80, -1, 130));
        jPanel_MK_DX.setVisible(false);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HỌC VIỆN KỸ THUẬT MẬT MÃ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 300, 52));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 1650, 2));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton_trangChu.setBackground(new java.awt.Color(255, 232, 172));
        jButton_trangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/homepage-120-48.png"))); // NOI18N
        jButton_trangChu.setBorder(null);
        jButton_trangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_trangChuActionPerformed(evt);
            }
        });

        jButton_hopDong.setBackground(new java.awt.Color(255, 232, 172));
        jButton_hopDong.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_hopDong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_hopDong.setText("Hợp Đồng");
        jButton_hopDong.setBorder(null);
        jButton_hopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hopDongActionPerformed(evt);
            }
        });

        jButton_Sinhvien.setBackground(new java.awt.Color(255, 232, 172));
        jButton_Sinhvien.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_Sinhvien.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Sinhvien.setText("Sinh Viên");
        jButton_Sinhvien.setBorder(null);
        jButton_Sinhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SinhvienActionPerformed(evt);
            }
        });

        jButton_hoaDon.setBackground(new java.awt.Color(255, 232, 172));
        jButton_hoaDon.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_hoaDon.setForeground(new java.awt.Color(0, 0, 0));
        jButton_hoaDon.setText("Hóa Đơn");
        jButton_hoaDon.setBorder(null);
        jButton_hoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hoaDonActionPerformed(evt);
            }
        });

        jButton_phong.setBackground(new java.awt.Color(255, 232, 172));
        jButton_phong.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton_phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_phong.setText("Phòng");
        jButton_phong.setBorder(null);
        jButton_phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_phongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_hoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_hopDong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jButton_phong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Sinhvien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_trangChu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton_trangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton_Sinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton_phong, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton_hopDong, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jButton_hoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton_hopDong.setFocusPainted(false);
        jButton_Sinhvien.setFocusPainted(false);
        jButton_hoaDon.setFocusPainted(false);
        jButton_phong.setFocusPainted(false);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 78, 190, 750));

        jPanel3.setBackground(new java.awt.Color(255, 232, 172));

        jPanel_sinhVien.setBackground(new java.awt.Color(255, 102, 102));
        jPanel_sinhVien.setOpaque(false);
        jPanel_sinhVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 102, 102));

        jPanel5.setBackground(new java.awt.Color(255, 232, 172));
        jPanel5.setOpaque(false);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("DANH SÁCH  SINH VIÊN THUÊ PHÒNG");

        jButton_sua_SinhVien.setBackground(new java.awt.Color(255, 153, 153));
        jButton_sua_SinhVien.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_sua_SinhVien.setForeground(new java.awt.Color(0, 0, 0));
        jButton_sua_SinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/file.png"))); // NOI18N
        jButton_sua_SinhVien.setText("Sửa");
        jButton_sua_SinhVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_timkiem_SinhVien.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_timkiem_SinhVien.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField_timkiem_SinhVien.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_timkiem_SinhVien.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton_timkiem_SinhVien.setBackground(new java.awt.Color(255, 153, 153));
        jButton_timkiem_SinhVien.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_timkiem_SinhVien.setForeground(new java.awt.Color(0, 0, 0));
        jButton_timkiem_SinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Zoom-icon.png"))); // NOI18N
        jButton_timkiem_SinhVien.setText("Tìm kiếm");
        jButton_timkiem_SinhVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable_sinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sinh viên", "Họ Tên", "Giới tính", "Ngày sinh", "Phòng", "Dãy", "Lớp", "Khoa", "Quê Quán", "SĐT"
            }
        ));
        jScrollPane3.setViewportView(jTable_sinhVien);
        jTable_sinhVien.setAutoCreateRowSorter(true);

        jLabel_soPhong1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel_soPhong1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_soPhong1.setText("Số Phòng : ");

        jLabel_soPhong_trong1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel_soPhong_trong1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_soPhong_trong1.setText("Số Phòng trống : ");

        jLabel_soGiuongTrong1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel_soGiuongTrong1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_soGiuongTrong1.setText("Số Giường trống : ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)
                                .addComponent(jTextField_timkiem_SinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_timkiem_SinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_sua_SinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_soPhong1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_soPhong_trong1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addComponent(jLabel_soGiuongTrong1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_sua_SinhVien)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_timkiem_SinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_timkiem_SinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_soPhong1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_soPhong_trong1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_soGiuongTrong1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        jButton_sua_SinhVien.addActionListener(ac_sinhvien);
        jButton_timkiem_SinhVien.addActionListener(ac_sinhvien);

        jPanel_suaSV.setBackground(new java.awt.Color(204, 204, 255));
        jPanel_suaSV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sửa Thông tin Sinh Viên", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Mã Sinh Viên :");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Họ tên Sinh Viên :");

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Giới tính : ");

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Ngày sinh :");

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Phòng :");

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("Dãy :");

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Lớp :");

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Khoa :");

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("SĐT :");

        jTextField_tenSV_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tenSV_suaSV.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_gioiTinh_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_gioiTinh_suaSV.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_khoa_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_khoa_suaSV.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_lop_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_lop_suaSV.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_sdt_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sdt_suaSV.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_phong_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_phong_suaSV.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_phong_suaSV.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_phong_suaSV.setText("Phòng :");

        jLabel_day_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_day_suaSV.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_day_suaSV.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_day_suaSV.setText("Phòng :");

        jTextField_ngaySInh_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ngaySInh_suaSV.setForeground(new java.awt.Color(0, 0, 0));

        jButton_huyBo_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jButton_huyBo_suaSV.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_huyBo_suaSV.setForeground(new java.awt.Color(0, 0, 0));
        jButton_huyBo_suaSV.setText("Hủy bỏ");

        jButton_capNhat_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jButton_capNhat_suaSV.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_capNhat_suaSV.setForeground(new java.awt.Color(0, 0, 0));
        jButton_capNhat_suaSV.setText("Cập nhật");

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Quê Quán");

        jTextField_queQuan_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_queQuan_suaSV.setForeground(new java.awt.Color(0, 0, 0));

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("(Nam/Nữ)");

        jLabel_maSV_suaSV.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_maSV_suaSV.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_maSV_suaSV.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel_suaSVLayout = new javax.swing.GroupLayout(jPanel_suaSV);
        jPanel_suaSV.setLayout(jPanel_suaSVLayout);
        jPanel_suaSVLayout.setHorizontalGroup(
            jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_suaSVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_huyBo_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addComponent(jButton_capNhat_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(jPanel_suaSVLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_suaSVLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_suaSVLayout.createSequentialGroup()
                                .addComponent(jTextField_queQuan_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel_suaSVLayout.createSequentialGroup()
                                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_tenSV_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_lop_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_khoa_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_sdt_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel_suaSVLayout.createSequentialGroup()
                                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel_phong_suaSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(jTextField_gioiTinh_suaSV, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_day_suaSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ngaySInh_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))))
                    .addGroup(jPanel_suaSVLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel_maSV_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel_suaSVLayout.setVerticalGroup(
            jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_suaSVLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_maSV_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jTextField_tenSV_suaSV))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_gioiTinh_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ngaySInh_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_queQuan_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_phong_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_day_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_lop_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_khoa_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_sdt_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_huyBo_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_capNhat_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jButton_huyBo_suaSV.addActionListener(ac_sinhvien);
        jButton_capNhat_suaSV.addActionListener(ac_sinhvien);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_suaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel_suaSV.setVisible(false);

        jTabbedPane2.addTab("Thông tin Sinh Viên", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));

        jTable_userSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "User ID", "Password", "User Name"
            }
        ));
        jScrollPane7.setViewportView(jTable_userSV);
        if (jTable_userSV.getColumnModel().getColumnCount() > 0) {
            jTable_userSV.getColumnModel().getColumn(0).setMaxWidth(200);
        }
        jTable_userSV.setAutoCreateRowSorter(true);

        jButton_capNhatiPass_SV.setBackground(new java.awt.Color(255, 153, 153));
        jButton_capNhatiPass_SV.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_capNhatiPass_SV.setForeground(new java.awt.Color(0, 0, 0));
        jButton_capNhatiPass_SV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/file.png"))); // NOI18N
        jButton_capNhatiPass_SV.setText("Cập Nhật Password");
        jButton_capNhatiPass_SV.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("DANH SÁCH TÀI KHOẢN  SINH VIÊN");

        jTextField_timkiem_User.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_timkiem_User.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField_timkiem_User.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_timkiem_User.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton_timkiem_User.setBackground(new java.awt.Color(255, 153, 153));
        jButton_timkiem_User.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_timkiem_User.setForeground(new java.awt.Color(0, 0, 0));
        jButton_timkiem_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Zoom-icon.png"))); // NOI18N
        jButton_timkiem_User.setText(" ");
        jButton_timkiem_User.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane7))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(65, 353, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(572, 572, 572))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton_capNhatiPass_SV, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jTextField_timkiem_User, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_timkiem_User, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_timkiem_User, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_timkiem_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_capNhatiPass_SV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jButton_capNhatiPass_SV.addActionListener(ac_sinhvien);
        jButton_timkiem_User.addActionListener(ac_sinhvien);

        jTabbedPane2.addTab("Thông tin Tài khoản", jPanel7);

        jPanel_sinhVien.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 780));

        jPanel_phong.setBackground(new java.awt.Color(153, 255, 153));
        jPanel_phong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);

        jButton_newPhong.setBackground(new java.awt.Color(255, 153, 153));
        jButton_newPhong.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_newPhong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_newPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/house.png"))); // NOI18N
        jButton_newPhong.setText("Thêm Phòng");
        jButton_newPhong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable_phong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable_phong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Phòng", "Tên Phòng", "Dãy", "Số Sinh viên", "Số Sinh viên tối đa", "Thành viên phòng"
            }
        ));
        jScrollPane2.setViewportView(jTable_phong);
        if (jTable_phong.getColumnModel().getColumnCount() > 0) {
            jTable_phong.getColumnModel().getColumn(0).setMaxWidth(200);
            jTable_phong.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable_phong.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable_phong.getColumnModel().getColumn(4).setPreferredWidth(3);
            jTable_phong.getColumnModel().getColumn(5).setPreferredWidth(3);
            jTable_phong.getColumnModel().getColumn(6).setMinWidth(200);
        }
        jTable_phong.setAutoCreateRowSorter(true);

        jButton_timkiem_phong.setBackground(new java.awt.Color(255, 153, 153));
        jButton_timkiem_phong.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_timkiem_phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_timkiem_phong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Zoom-icon.png"))); // NOI18N
        jButton_timkiem_phong.setText("Tìm kiếm");
        jButton_timkiem_phong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DANH SÁCH  PHÒNG");

        jTextField_timkiem_Phong.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_timkiem_Phong.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField_timkiem_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_timkiem_Phong.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton_sua_Phong.setBackground(new java.awt.Color(255, 153, 153));
        jButton_sua_Phong.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_sua_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_sua_Phong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/file.png"))); // NOI18N
        jButton_sua_Phong.setText("Sửa");
        jButton_sua_Phong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_xoa_Phong.setBackground(new java.awt.Color(255, 153, 153));
        jButton_xoa_Phong.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_xoa_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_xoa_Phong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete-file-icon.png"))); // NOI18N
        jButton_xoa_Phong.setText("Xoá");
        jButton_xoa_Phong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_soPhong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel_soPhong.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_soPhong.setText("Số Phòng : ");

        jLabel_soPhong_trong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel_soPhong_trong.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_soPhong_trong.setText("Số Phòng trống : ");

        jLabel_soGiuongTrong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel_soGiuongTrong.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_soGiuongTrong.setText("Số Giường trống : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_timkiem_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_timkiem_phong, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton_newPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_sua_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_xoa_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel_soPhong_trong, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_soGiuongTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel_soPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_newPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_sua_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_xoa_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_timkiem_Phong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_timkiem_phong, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel_soPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_soGiuongTrong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_soPhong_trong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jButton_newPhong.addActionListener(ac_Phong);
        jButton_timkiem_phong.addActionListener(ac_Phong);
        jButton_sua_Phong.addActionListener(ac_Phong);
        jButton_xoa_Phong.addActionListener(ac_Phong);

        jPanel_phong.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 770));

        jPanel_suaPhong.setBackground(new java.awt.Color(153, 255, 255));
        jPanel_suaPhong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sửa Thông tin Phòng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Mã Phòng :");

        jButton_capNhat_suaPhong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_capNhat_suaPhong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_capNhat_suaPhong.setText("Cập Nhật");
        jButton_capNhat_suaPhong.setOpaque(false);

        jButton_huyBo_suaPhong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_huyBo_suaPhong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_huyBo_suaPhong.setText("Trở lại");
        jButton_huyBo_suaPhong.setOpaque(false);

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Tên Phòng :");

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("Dãy :");

        jTextField_tenPhong_suaPhong.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tenPhong_suaPhong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_tenPhong_suaPhong.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_maPhong_suaPhong.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_maPhong_suaPhong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_maPhong_suaPhong.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_day_suaPhong.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_day_suaPhong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_day_suaPhong.setForeground(new java.awt.Color(0, 0, 0));

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("Số SV :");

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Số SV tối đa :");

        jTextField_soSVToiDa_suaPhong.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_soSVToiDa_suaPhong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_soSVToiDa_suaPhong.setForeground(new java.awt.Color(0, 0, 0));

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("Thành viên Phòng :");

        jTextArea_thanhVienPhong_suaPhong.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea_thanhVienPhong_suaPhong.setColumns(20);
        jTextArea_thanhVienPhong_suaPhong.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea_thanhVienPhong_suaPhong.setRows(5);
        jScrollPane4.setViewportView(jTextArea_thanhVienPhong_suaPhong);

        jLabel_soSV_suaPhong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_soSV_suaPhong.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_soSV_suaPhong.setText("sosv");

        javax.swing.GroupLayout jPanel_suaPhongLayout = new javax.swing.GroupLayout(jPanel_suaPhong);
        jPanel_suaPhong.setLayout(jPanel_suaPhongLayout);
        jPanel_suaPhongLayout.setHorizontalGroup(
            jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_suaPhongLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_suaPhongLayout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_suaPhongLayout.createSequentialGroup()
                                .addComponent(jButton_huyBo_suaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(jButton_capNhat_suaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel_suaPhongLayout.createSequentialGroup()
                        .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_tenPhong_suaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(jTextField_maPhong_suaPhong)
                                .addComponent(jTextField_day_suaPhong, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel_suaPhongLayout.createSequentialGroup()
                                .addComponent(jLabel_soSV_suaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_soSVToiDa_suaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel_suaPhongLayout.setVerticalGroup(
            jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_suaPhongLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_maPhong_suaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_tenPhong_suaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_day_suaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_soSV_suaPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_soSVToiDa_suaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_suaPhongLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_suaPhongLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel_suaPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_huyBo_suaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_capNhat_suaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        jButton_capNhat_suaPhong.addActionListener(ac_Phong);
        jButton_huyBo_suaPhong.addActionListener(ac_Phong);

        jPanel_phong.add(jPanel_suaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 720, 630));
        jPanel_suaPhong.setVisible(false);

        jPanel_newPhong.setBackground(new java.awt.Color(153, 255, 255));
        jPanel_newPhong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thêm Phòng mới", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Mã Phòng :");

        jButton_xacNhan_newPhong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_xacNhan_newPhong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_xacNhan_newPhong.setText("Xác nhận");
        jButton_xacNhan_newPhong.setOpaque(false);

        jButton_huyBo_newPhong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_huyBo_newPhong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_huyBo_newPhong.setText("Hủy bỏ");
        jButton_huyBo_newPhong.setOpaque(false);

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Tên Phòng :");

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Dãy :");

        jTextField_tenPhong_newPhong.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tenPhong_newPhong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_tenPhong_newPhong.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_maPhong_newPhong.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_maPhong_newPhong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_maPhong_newPhong.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_day_newPhong.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_day_newPhong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_day_newPhong.setForeground(new java.awt.Color(0, 0, 0));

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Số SV tối đa :");

        jTextField_soSVToiDa_newPhong.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_soSVToiDa_newPhong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_soSVToiDa_newPhong.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel_newPhongLayout = new javax.swing.GroupLayout(jPanel_newPhong);
        jPanel_newPhong.setLayout(jPanel_newPhongLayout);
        jPanel_newPhongLayout.setHorizontalGroup(
            jPanel_newPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_newPhongLayout.createSequentialGroup()
                .addGroup(jPanel_newPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_newPhongLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel_newPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_newPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_tenPhong_newPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextField_maPhong_newPhong)
                            .addComponent(jTextField_day_newPhong, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_soSVToiDa_newPhong)))
                    .addGroup(jPanel_newPhongLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton_huyBo_newPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jButton_xacNhan_newPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel_newPhongLayout.setVerticalGroup(
            jPanel_newPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_newPhongLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel_newPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_maPhong_newPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_tenPhong_newPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_day_newPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_soSVToiDa_newPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel_newPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_huyBo_newPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_xacNhan_newPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        jButton_xacNhan_newPhong.addActionListener(ac_Phong);
        jButton_huyBo_newPhong.addActionListener(ac_Phong);

        jPanel_phong.add(jPanel_newPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 640, 430));
        jPanel_newPhong.setVisible(false);

        jPanel_trangChu.setOpaque(false);
        jPanel_trangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setBackground(new java.awt.Color(255, 51, 51));
        jLabel70.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 51, 51));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("KÝ TÚC XÁ KMA");
        jLabel70.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        jPanel_trangChu.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 366, 40));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ktxx.jpg"))); // NOI18N
        jPanel_trangChu.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        jPanel_hopDong.setBackground(new java.awt.Color(204, 204, 0));
        jPanel_hopDong.setOpaque(false);
        jPanel_hopDong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_suaHD.setBackground(new java.awt.Color(153, 255, 255));
        jPanel_suaHD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thay đổi Hợp Đồng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel_suaHD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Đăng ký vào phòng: ");
        jPanel_suaHD.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 172, 29));

        jLabel43.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("tháng");
        jPanel_suaHD.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 49, 29));

        jLabel45.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setText("Ngày hết hạn");
        jPanel_suaHD.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 99, 29));

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Mã Sinh Viên : ");
        jPanel_suaHD.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 120, 29));

        jLabel_maSV_cu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_maSV_cu.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_maSV_cu.setText("tensv");
        jPanel_suaHD.add(jLabel_maSV_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 233, 29));

        jLabel_maHD_cu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_maHD_cu.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_maHD_cu.setText("msv");
        jPanel_suaHD.add(jLabel_maHD_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 233, 29));

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Tên Sinh Viên");
        jPanel_suaHD.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 120, 29));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Mã Hợp Đồng");
        jPanel_suaHD.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 120, 29));

        jLabel_tenSV_cu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_tenSV_cu.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_tenSV_cu.setText("tensv");
        jPanel_suaHD.add(jLabel_tenSV_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 233, 29));

        jLabel49.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setText("Phòng");
        jPanel_suaHD.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 120, 29));

        jLabel50.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setText("Dãy");
        jPanel_suaHD.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 120, 29));

        jLabel51.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Ngày đăng ký");
        jPanel_suaHD.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 120, 29));

        jLabel52.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("Thời hạn :");
        jPanel_suaHD.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 90, 29));

        jLabel_day_cu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_day_cu.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_day_cu.setText("tensv");
        jPanel_suaHD.add(jLabel_day_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 233, 29));

        jLabel_ngayDangky_cu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_ngayDangky_cu.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_ngayDangky_cu.setText("tensv");
        jPanel_suaHD.add(jLabel_ngayDangky_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 233, 29));

        jLabel_phong_cu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_phong_cu.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_phong_cu.setText("msv");
        jPanel_suaHD.add(jLabel_phong_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 233, 29));

        jLabel_ngayHetHan_cu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_ngayHetHan_cu.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_ngayHetHan_cu.setText("tensv");
        jPanel_suaHD.add(jLabel_ngayHetHan_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 233, 29));

        jLabel57.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Giá Phòng : 500.000 đ/tháng");
        jPanel_suaHD.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 233, 29));

        jLabel_thoiHan_cu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_thoiHan_cu.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_thoiHan_cu.setText("msv");
        jPanel_suaHD.add(jLabel_thoiHan_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 50, 29));

        jLabel59.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(153, 0, 51));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Hợp đồng cũ");
        jPanel_suaHD.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 232, 40));

        jLabel60.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(153, 0, 51));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Hợp đồng mới");
        jPanel_suaHD.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 232, 40));

        jLabel_maSV_cu2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_maSV_cu2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_maSV_cu2.setText("tensv");
        jPanel_suaHD.add(jLabel_maSV_cu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 233, 29));

        jLabel46.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Ngày hết hạn");
        jPanel_suaHD.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 99, 29));

        jLabel_maHD_cu2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_maHD_cu2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_maHD_cu2.setText("msv");
        jPanel_suaHD.add(jLabel_maHD_cu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 233, 29));

        jLabel42.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Tên Sinh Viên");
        jPanel_suaHD.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 120, 29));

        jLabel44.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setText("Mã Hợp Đồng");
        jPanel_suaHD.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 120, 29));

        jLabel_tenSV_cu2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_tenSV_cu2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_tenSV_cu2.setText("tensv");
        jPanel_suaHD.add(jLabel_tenSV_cu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 233, 29));

        jLabel54.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("Phòng");
        jPanel_suaHD.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 110, 29));

        jLabel55.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("Dãy");
        jPanel_suaHD.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 120, 29));

        jLabel56.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Ngày đăng ký");
        jPanel_suaHD.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 120, 29));

        jLabel58.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setText("Thời hạn :");
        jPanel_suaHD.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 90, 29));

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Mã Sinh Viên : ");
        jPanel_suaHD.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 120, 29));

        jLabel61.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setText("Giá Phòng : 500.000 đ/tháng");
        jPanel_suaHD.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 233, 29));

        jLabel47.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("Đăng ký vào phòng: ");
        jPanel_suaHD.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 172, 29));

        jComboBox_phong_suaHD.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_phong_suaHD.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jComboBox_phong_suaHD.setForeground(new java.awt.Color(0, 0, 0));
        jPanel_suaHD.add(jComboBox_phong_suaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 90, 30));

        jComboBox_day_suaHD.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_day_suaHD.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jComboBox_day_suaHD.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_day_suaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_day_suaHDActionPerformed(evt);
            }
        });
        jPanel_suaHD.add(jComboBox_day_suaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 90, -1));

        jTextField_ngayDangKy_suaHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ngayDangKy_suaHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_ngayDangKy_suaHD.setForeground(new java.awt.Color(0, 0, 0));
        jPanel_suaHD.add(jTextField_ngayDangKy_suaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 210, 30));

        jTextField_ngayHetHan_suaHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ngayHetHan_suaHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_ngayHetHan_suaHD.setForeground(new java.awt.Color(0, 0, 0));
        jPanel_suaHD.add(jTextField_ngayHetHan_suaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 210, 30));

        jTextField_thoiHan_suaHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_thoiHan_suaHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_thoiHan_suaHD.setForeground(new java.awt.Color(0, 0, 0));
        jPanel_suaHD.add(jTextField_thoiHan_suaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 60, 30));

        jLabel22.setBackground(new java.awt.Color(204, 204, 255));
        jLabel22.setOpaque(true);
        jPanel_suaHD.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 40, 10, 560));

        jButton_QuayLai_suahd.setBackground(new java.awt.Color(255, 255, 255));
        jButton_QuayLai_suahd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_QuayLai_suahd.setForeground(new java.awt.Color(0, 0, 0));
        jButton_QuayLai_suahd.setText("Trở về");
        jPanel_suaHD.add(jButton_QuayLai_suahd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 170, 50));
        jButton_QuayLai_suahd.addActionListener(ac_HopDong);

        jButton_thayDoi_suahd.setBackground(new java.awt.Color(255, 255, 255));
        jButton_thayDoi_suahd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_thayDoi_suahd.setForeground(new java.awt.Color(0, 0, 0));
        jButton_thayDoi_suahd.setText("Thay Đổi");
        jPanel_suaHD.add(jButton_thayDoi_suahd, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 190, 50));
        jButton_thayDoi_suahd.addActionListener(ac_HopDong);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jButton_timkiem_HD.setBackground(new java.awt.Color(255, 153, 153));
        jButton_timkiem_HD.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_timkiem_HD.setForeground(new java.awt.Color(0, 0, 0));
        jButton_timkiem_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Zoom-icon.png"))); // NOI18N
        jButton_timkiem_HD.setText("Tìm kiếm");
        jButton_timkiem_HD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DANH SÁCH  HỢP ĐỒNG");

        jTextField_tiemkiem_HD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tiemkiem_HD.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField_tiemkiem_HD.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_tiemkiem_HD.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton_newHopDong.setBackground(new java.awt.Color(255, 153, 153));
        jButton_newHopDong.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_newHopDong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_newHopDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/File-new-icon.png"))); // NOI18N
        jButton_newHopDong.setText("Hợp Đồng mới");
        jButton_newHopDong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable_hopDong.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTable_hopDong.setForeground(new java.awt.Color(0, 0, 0));
        jTable_hopDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Hợp Đồng", "Mã SInh viên", "Họ tên Sinh Viên", "Mã Phòng", "Dãy", "Ngày đăng ký", "Thời hạn", "Ngày hết hạn"
            }
        ));
        jTable_hopDong.setOpaque(false);
        jScrollPane1.setViewportView(jTable_hopDong);
        if (jTable_hopDong.getColumnModel().getColumnCount() > 0) {
            jTable_hopDong.getColumnModel().getColumn(0).setMaxWidth(200);
            jTable_hopDong.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable_hopDong.getColumnModel().getColumn(5).setPreferredWidth(10);
        }
        jTable_hopDong.setAutoCreateRowSorter(true);

        jButton_xoa_HD.setBackground(new java.awt.Color(255, 153, 153));
        jButton_xoa_HD.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_xoa_HD.setForeground(new java.awt.Color(0, 0, 0));
        jButton_xoa_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete-file-icon.png"))); // NOI18N
        jButton_xoa_HD.setText("Xoá / Hủy Hợp Đồng");
        jButton_xoa_HD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_sua_HD.setBackground(new java.awt.Color(255, 153, 153));
        jButton_sua_HD.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_sua_HD.setForeground(new java.awt.Color(0, 0, 0));
        jButton_sua_HD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/file.png"))); // NOI18N
        jButton_sua_HD.setText("Sửa Hợp Đồng");
        jButton_sua_HD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(jTextField_tiemkiem_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_timkiem_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_newHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_sua_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_xoa_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_newHopDong)
                    .addComponent(jButton_sua_HD)
                    .addComponent(jButton_xoa_HD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_timkiem_HD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_tiemkiem_HD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        jButton_timkiem_HD.addActionListener(ac_HopDong);
        jButton_newHopDong.addActionListener(ac_HopDong);
        jButton_xoa_HD.addActionListener(ac_HopDong);
        jButton_sua_HD.addActionListener(ac_HopDong);

        jPanel_newHopDong.setBackground(new java.awt.Color(153, 255, 255));
        jPanel_newHopDong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hợp Đồng Mới", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Mã Sinh Viên : ");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Tên Sinh Viên : ");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Giới tính :");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Ngày sinh :");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Quê Quán :");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Lớp :");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Khoa :");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("SĐT :");

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Đăng ký vào phòng: ");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Dãy :");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Phòng :");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("tháng");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Ngày đăng ký :");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Ngày hết hạn");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Thời hạn :");

        jTextField_maSV_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_maSV_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_maSV_newHD.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_tenSV_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tenSV_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_tenSV_newHD.setForeground(new java.awt.Color(0, 0, 0));

        jRadioButton_nam_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButton_nam_newHD.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton_nam_newHD.setText("Nam ");
        jRadioButton_nam_newHD.setOpaque(false);

        jRadioButton_nu_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRadioButton_nu_newHD.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton_nu_newHD.setText("Nữ");
        jRadioButton_nu_newHD.setOpaque(false);

        jTextField_ngaySinh_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ngaySinh_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_ngaySinh_newHD.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_lop_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_lop_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_lop_newHD.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_khoa_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_khoa_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_khoa_newHD.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_sdt_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_sdt_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_sdt_newHD.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_ngayDangKy_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ngayDangKy_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_ngayDangKy_newHD.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_thoiHan_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_thoiHan_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_thoiHan_newHD.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_ngayHetHan_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ngayHetHan_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_ngayHetHan_newHD.setForeground(new java.awt.Color(0, 0, 0));

        jButton_xacNhan_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_xacNhan_newHD.setForeground(new java.awt.Color(0, 0, 0));
        jButton_xacNhan_newHD.setText("Xác nhận");
        jButton_xacNhan_newHD.setOpaque(false);

        jButton_huyBo_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_huyBo_newHD.setForeground(new java.awt.Color(0, 0, 0));
        jButton_huyBo_newHD.setText("Hủy bỏ");
        jButton_huyBo_newHD.setOpaque(false);

        jComboBox_day_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_day_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_day_newHD.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_day_newHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_day_newHDActionPerformed(evt);
            }
        });

        jComboBox_phong_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_phong_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_phong_newHD.setForeground(new java.awt.Color(0, 0, 0));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Giá Phòng : 500.000 đ/tháng");

        jTextField_queQuan_newHD.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_queQuan_newHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_queQuan_newHD.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel_newHopDongLayout = new javax.swing.GroupLayout(jPanel_newHopDong);
        jPanel_newHopDong.setLayout(jPanel_newHopDongLayout);
        jPanel_newHopDongLayout.setHorizontalGroup(
            jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                        .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_newHopDongLayout.createSequentialGroup()
                                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                                        .addComponent(jRadioButton_nam_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton_nu_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_ngaySinh_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField_queQuan_newHD))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_newHopDongLayout.createSequentialGroup()
                                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_newHopDongLayout.createSequentialGroup()
                                        .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                                                .addComponent(jTextField_lop_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_khoa_newHD))
                                            .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                                                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField_sdt_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                                                        .addGap(178, 178, 178)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(3, 3, 3)
                                                        .addComponent(jComboBox_day_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(123, 123, 123)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 135, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_newHopDongLayout.createSequentialGroup()
                                        .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_newHopDongLayout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_maSV_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_newHopDongLayout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField_tenSV_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(70, 70, 70)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                        .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_phong_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                                        .addComponent(jTextField_thoiHan_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField_ngayHetHan_newHD, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(jTextField_ngayDangKy_newHD))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jButton_huyBo_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addComponent(jButton_xacNhan_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_newHopDongLayout.setVerticalGroup(
            jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_newHopDongLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_maSV_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_tenSV_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_nam_newHD)
                    .addComponent(jRadioButton_nu_newHD)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ngaySinh_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_queQuan_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_lop_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_khoa_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_sdt_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_day_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_phong_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ngayDangKy_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_thoiHan_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ngayHetHan_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel_newHopDongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_huyBo_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_xacNhan_newHD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonGroup buttonGroup_gioiTinh_HD = new ButtonGroup();
        buttonGroup_gioiTinh_HD.add(jRadioButton_nam_newHD);
        buttonGroup_gioiTinh_HD.add(jRadioButton_nu_newHD);
        jButton_xacNhan_newHD.addActionListener(ac_HopDong);
        jButton_huyBo_newHD.addActionListener(ac_HopDong);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel_suaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(150, Short.MAX_VALUE)
                    .addComponent(jPanel_newHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(152, Short.MAX_VALUE)))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel_suaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .addComponent(jPanel_newHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel_suaHD.setVisible(false);
        jPanel_newHopDong.setVisible(false);

        jTabbedPane3.addTab("Hợp Đồng", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "PHIẾU ĐĂNG KÝ GIAN HẠN HỢP ĐỒNG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Dialog", 0, 24), new java.awt.Color(0, 0, 0)))); // NOI18N

        jLabel_hoTen_xemPhieu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_hoTen_xemPhieu.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_hoTen_xemPhieu.setText("Họ Tên :");

        jLabel72.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setText("Họ Tên :");

        jLabel73.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 0));
        jLabel73.setText("Mã SV :");

        jLabel_maSV_xemPhieu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_maSV_xemPhieu.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_maSV_xemPhieu.setText("msv");

        jLabel104.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 0));
        jLabel104.setText("Lớp :");

        jLabel105.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 0));
        jLabel105.setText("Khoa :");

        jLabel_lop_xemPhieu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_lop_xemPhieu.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_lop_xemPhieu.setText("Lớp :");

        jLabel_khoa_xemPhieu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_khoa_xemPhieu.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_khoa_xemPhieu.setText("Khoa");

        jLabel108.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 0));
        jLabel108.setText("Đăng ký gian hạn :");

        jLabel109.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(51, 51, 51));
        jLabel109.setText("Phòng :");

        jLabel110.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(51, 51, 51));
        jLabel110.setText("Dãy :");

        jLabel111.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(51, 51, 51));
        jLabel111.setText("Ngày đăng ký :");

        jLabel112.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(51, 51, 51));
        jLabel112.setText("Thời hạn :");

        jLabel113.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(51, 51, 51));
        jLabel113.setText("Ngày hết hạn");

        jLabel114.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(51, 51, 51));
        jLabel114.setText("tháng");

        jButton9.setBackground(new java.awt.Color(204, 204, 255));
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Đóng");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel115.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(0, 0, 0));
        jLabel115.setText("Ngày :");

        jLabel_ngay_xemPhieu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_ngay_xemPhieu.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_ngay_xemPhieu.setText("msv");

        jLabel_phong_xemPhieu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_phong_xemPhieu.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_phong_xemPhieu.setText("msv");

        jLabel_day_xemPhieu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_day_xemPhieu.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_day_xemPhieu.setText("msv");

        jLabel_ngayDangKy_xemPhieu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_ngayDangKy_xemPhieu.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_ngayDangKy_xemPhieu.setText("msv");

        jLabel_thoiHan_xemPhieu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_thoiHan_xemPhieu.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_thoiHan_xemPhieu.setText("msv");

        jLabel_ngayHetHan_xemPhieu.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel_ngayHetHan_xemPhieu.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_ngayHetHan_xemPhieu.setText("msv");

        jButton_phanHoi_PDK.setBackground(new java.awt.Color(204, 204, 255));
        jButton_phanHoi_PDK.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_phanHoi_PDK.setForeground(new java.awt.Color(0, 0, 0));
        jButton_phanHoi_PDK.setText("Phản hồi");
        jButton_phanHoi_PDK.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_phanHoi_PDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_phanHoi_PDKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(jLabel_khoa_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_lop_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addGap(203, 203, 203)
                                                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel_hoTen_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_maSV_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel_ngay_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_phong_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_day_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_ngayDangKy_xemPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel_thoiHan_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                            .addComponent(jLabel_ngayHetHan_xemPhieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(jLabel_ngay_xemPhieu))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_hoTen_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_maSV_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_lop_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_khoa_xemPhieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_phong_xemPhieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_day_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ngayDangKy_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_thoiHan_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ngayHetHan_xemPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jButton9.addActionListener(ac_pdk);

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 690, 580));
        jPanel11.setVisible(false);

        jTable_phieuDangKy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Phiếu", "Mã SV", "Họ Tên SV", "Thời gian", "Phản hồi", "Xử lý"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable_phieuDangKy);
        if (jTable_phieuDangKy.getColumnModel().getColumnCount() > 0) {
            jTable_phieuDangKy.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable_phieuDangKy.getColumnModel().getColumn(6).setPreferredWidth(5);
        }

        jPanel10.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 1250, 380));

        jButton_phanHoi_PDK1.setBackground(new java.awt.Color(204, 204, 255));
        jButton_phanHoi_PDK1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_phanHoi_PDK1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_phanHoi_PDK1.setText("Phản hồi");
        jButton_phanHoi_PDK1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_phanHoi_PDK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_phanHoi_PDKActionPerformed(evt);
            }
        });
        jPanel10.add(jButton_phanHoi_PDK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, 120, 40));
        jButton_phanHoi_PDK1.addActionListener(ac_pdk);

        jButton_xoa_PDK.setBackground(new java.awt.Color(255, 153, 153));
        jButton_xoa_PDK.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_xoa_PDK.setForeground(new java.awt.Color(0, 0, 0));
        jButton_xoa_PDK.setText("Xóa");
        jButton_xoa_PDK.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_xoa_PDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xoa_PDKActionPerformed(evt);
            }
        });
        jPanel10.add(jButton_xoa_PDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 120, 40));
        jButton_xoa_PDK.addActionListener(ac_pdk);

        jLabel116.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 0));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("DANH SÁCH  PHIẾU ĐĂNG KÍ GIA HẠN HỢP ĐỒNG");
        jPanel10.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 500, 60));

        jButton_xem_PDK.setBackground(new java.awt.Color(255, 153, 153));
        jButton_xem_PDK.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_xem_PDK.setForeground(new java.awt.Color(0, 0, 0));
        jButton_xem_PDK.setText("Xem");
        jButton_xem_PDK.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_xem_PDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xem_PDKActionPerformed(evt);
            }
        });
        jPanel10.add(jButton_xem_PDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, 40));
        jButton_xem_PDK.addActionListener(ac_pdk);

        jScrollPane9.setViewportView(jTextPane1);

        jPanel10.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 710, 120));

        jButton_xem_PDK1.setBackground(new java.awt.Color(255, 153, 153));
        jButton_xem_PDK1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_xem_PDK1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_xem_PDK1.setText("Cập nhật");
        jButton_xem_PDK1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_xem_PDK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xem_PDK1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton_xem_PDK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 60, 110, 30));
        jButton_xem_PDK1.addActionListener(ac_pdk);

        jTextField_timkiem_PDK.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField_timkiem_PDK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_timkiem_PDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_timkiem_PDKActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField_timkiem_PDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, 251, 40));

        jButton_timkiem_HD_Phong1.setBackground(new java.awt.Color(255, 153, 153));
        jButton_timkiem_HD_Phong1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_timkiem_HD_Phong1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_timkiem_HD_Phong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Zoom-icon.png"))); // NOI18N
        jButton_timkiem_HD_Phong1.setText("Tìm  Kiếm");
        jButton_timkiem_HD_Phong1.setBorder(null);
        jPanel10.add(jButton_timkiem_HD_Phong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 120, 110, 40));
        jButton_timkiem_HD_Phong1.addActionListener(ac_pdk);

        jTabbedPane3.addTab("Phiếu Đăng Ký Gia Hạn Hợp Đồng", jPanel10);

        jPanel_hopDong.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 770));

        jPanel_hoaDon.setBackground(new java.awt.Color(102, 0, 102));

        jPanel_1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel_1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel_newHD_Phong.setBackground(new java.awt.Color(255, 255, 204));
        jPanel_newHD_Phong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tạo Hóa Đơn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel96.setBackground(new java.awt.Color(255, 255, 255));
        jLabel96.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 0, 0));
        jLabel96.setText("Tháng :");

        jLabel98.setBackground(new java.awt.Color(255, 255, 255));
        jLabel98.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 0, 0));
        jLabel98.setText("Năm :");

        jComboBox_thang_newHD_Phong.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_thang_newHD_Phong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_thang_newHD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_thang_newHD_Phong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox_nam_newHD_Phong.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_nam_newHD_Phong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_nam_newHD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_nam_newHD_Phong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        jLabel102.setBackground(new java.awt.Color(255, 255, 255));
        jLabel102.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 0, 0));
        jLabel102.setText("Tiền Phòng :   500,000 VND /Sinh viên");

        jButton_tao_newHD_Phong.setBackground(new java.awt.Color(255, 255, 255));
        jButton_tao_newHD_Phong.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_tao_newHD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_tao_newHD_Phong.setText("Tạo");

        jButton_troLai_newHD_Phong.setBackground(new java.awt.Color(255, 255, 255));
        jButton_troLai_newHD_Phong.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_troLai_newHD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_troLai_newHD_Phong.setText("Trở lại");

        javax.swing.GroupLayout jPanel_newHD_PhongLayout = new javax.swing.GroupLayout(jPanel_newHD_Phong);
        jPanel_newHD_Phong.setLayout(jPanel_newHD_PhongLayout);
        jPanel_newHD_PhongLayout.setHorizontalGroup(
            jPanel_newHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_newHD_PhongLayout.createSequentialGroup()
                .addGroup(jPanel_newHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_newHD_PhongLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton_troLai_newHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jButton_tao_newHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_newHD_PhongLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel_newHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel_newHD_PhongLayout.createSequentialGroup()
                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jComboBox_thang_newHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jComboBox_nam_newHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel_newHD_PhongLayout.setVerticalGroup(
            jPanel_newHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_newHD_PhongLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel_newHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_thang_newHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_nam_newHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel_newHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_tao_newHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_troLai_newHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jComboBox_thang_newHD_Phong.addActionListener(ac_hdPhong);
        jButton_tao_newHD_Phong.addActionListener(ac_hdPhong);
        jButton_troLai_newHD_Phong.addActionListener(ac_hdPhong);

        jPanel_hoaDon_Phong.setBackground(new java.awt.Color(204, 204, 255));
        jPanel_hoaDon_Phong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_HoaDon_Phong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Hóa Đơn", "Mã Sinh Viên", "Tháng", "Năm", "Tiền Phòng", "Đóng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable_HoaDon_Phong);
        if (jTable_HoaDon_Phong.getColumnModel().getColumnCount() > 0) {
            jTable_HoaDon_Phong.getColumnModel().getColumn(0).setMaxWidth(200);
        }
        jTable_HoaDon_Phong.setAutoCreateRowSorter(true);

        jPanel_hoaDon_Phong.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 173, 1300, 470));

        jButton_newHD_Phong.setBackground(new java.awt.Color(255, 153, 153));
        jButton_newHD_Phong.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_newHD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_newHD_Phong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/File-new-icon.png"))); // NOI18N
        jButton_newHD_Phong.setText("Tạo Hoá Đơn mới");
        jButton_newHD_Phong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_hoaDon_Phong.add(jButton_newHD_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));
        jButton_newHD_Phong.addActionListener(ac_hdPhong);

        jButton_xoa_HD_Phong.setBackground(new java.awt.Color(255, 153, 153));
        jButton_xoa_HD_Phong.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_xoa_HD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_xoa_HD_Phong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete-file-icon.png"))); // NOI18N
        jButton_xoa_HD_Phong.setText("Xóa Hoá Đơn");
        jButton_xoa_HD_Phong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_hoaDon_Phong.add(jButton_xoa_HD_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 50));
        jButton_xoa_HD_Phong.addActionListener(ac_hdPhong);

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("DANH SÁCH HÓA ĐƠN TIỀN PHÒNG");
        jPanel_hoaDon_Phong.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 30));

        jTextField_timkiem_HD_Phong.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField_timkiem_HD_Phong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_hoaDon_Phong.add(jTextField_timkiem_HD_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 251, 40));

        jButton_hienThi_HD_Phong.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_hienThi_HD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_hienThi_HD_Phong.setText("Hiện Thị");
        jButton_hienThi_HD_Phong.setOpaque(false);
        jPanel_hoaDon_Phong.add(jButton_hienThi_HD_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 102, 30));
        jButton_hienThi_HD_Phong.addActionListener(ac_hdPhong);

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 0, 0));
        jLabel86.setText("Tháng :");
        jPanel_hoaDon_Phong.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 60, -1));

        jComboBox_thang_HD_Phong.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_thang_HD_Phong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_thang_HD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_thang_HD_Phong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel_hoaDon_Phong.add(jComboBox_thang_HD_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, 30));

        jLabel94.setBackground(new java.awt.Color(255, 255, 255));
        jLabel94.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 0, 0));
        jLabel94.setText("Năm :");
        jPanel_hoaDon_Phong.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 50, -1));

        jComboBox_nam_HD_Phong.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_nam_HD_Phong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_nam_HD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_nam_HD_Phong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        jPanel_hoaDon_Phong.add(jComboBox_nam_HD_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 30));

        jButton_hienThiToanBo_HD_Phong.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_hienThiToanBo_HD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_hienThiToanBo_HD_Phong.setText("Hiện Thị toàn bộ");
        jButton_hienThiToanBo_HD_Phong.setOpaque(false);
        jPanel_hoaDon_Phong.add(jButton_hienThiToanBo_HD_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, 33));
        jButton_hienThiToanBo_HD_Phong.addActionListener(ac_hdPhong);

        jLabel_setngayThang_HD_Phong.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel_setngayThang_HD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_setngayThang_HD_Phong.setText("Tháng xx năm xxxx");
        jPanel_hoaDon_Phong.add(jLabel_setngayThang_HD_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 160, 34));

        jButton_timkiem_HD_Phong.setBackground(new java.awt.Color(255, 232, 172));
        jButton_timkiem_HD_Phong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_timkiem_HD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_timkiem_HD_Phong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Zoom-icon.png"))); // NOI18N
        jButton_timkiem_HD_Phong.setText("Tìm kiếm");
        jButton_timkiem_HD_Phong.setBorder(null);
        jPanel_hoaDon_Phong.add(jButton_timkiem_HD_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 120, 110, 40));
        jButton_timkiem_HD_Phong.addActionListener(ac_hdPhong);

        jButton_capNhat_HD_Phong.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_capNhat_HD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jButton_capNhat_HD_Phong.setText("Cập nhật");
        jButton_capNhat_HD_Phong.setOpaque(false);
        jPanel_hoaDon_Phong.add(jButton_capNhat_HD_Phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 80, -1, 33));
        jButton_capNhat_HD_Phong.addActionListener(ac_hdPhong);

        jButton_xoa_HD_Phong1.setBackground(new java.awt.Color(255, 153, 153));
        jButton_xoa_HD_Phong1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_xoa_HD_Phong1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_xoa_HD_Phong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete-file-icon.png"))); // NOI18N
        jButton_xoa_HD_Phong1.setText("Xóa Hoá Đơn Theo Tháng");
        jButton_xoa_HD_Phong1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_hoaDon_Phong.add(jButton_xoa_HD_Phong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 190, 50));
        jButton_xoa_HD_Phong1.addActionListener(ac_hdPhong);

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));

        jLabel100.setBackground(new java.awt.Color(255, 255, 255));
        jLabel100.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setText("Tháng :");

        jComboBox_thang_xoaHDThang.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_thang_xoaHDThang.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_thang_xoaHDThang.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_thang_xoaHDThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel101.setBackground(new java.awt.Color(255, 255, 255));
        jLabel101.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 0, 0));
        jLabel101.setText("Năm :");

        jComboBox_nam_xoaHDThang.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_nam_xoaHDThang.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_nam_xoaHDThang.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_nam_xoaHDThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        jButton_hienThi_HD_Phong1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_hienThi_HD_Phong1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_hienThi_HD_Phong1.setText("Đóng");
        jButton_hienThi_HD_Phong1.setOpaque(false);

        jButton_hienThi_HD_Phong2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_hienThi_HD_Phong2.setForeground(new java.awt.Color(0, 0, 0));
        jButton_hienThi_HD_Phong2.setText("Xóa");
        jButton_hienThi_HD_Phong2.setOpaque(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_thang_xoaHDThang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_nam_xoaHDThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 108, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButton_hienThi_HD_Phong1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton_hienThi_HD_Phong2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(jComboBox_thang_xoaHDThang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101)
                    .addComponent(jComboBox_nam_xoaHDThang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_hienThi_HD_Phong1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_hienThi_HD_Phong2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_hienThi_HD_Phong1.addActionListener(ac_hdPhong);
        jButton_hienThi_HD_Phong2.addActionListener(ac_hdPhong);

        jPanel_hoaDon_Phong.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 390, 90));
        jPanel8.setVisible(false);

        jPanel_xoaHD_Phong.setBackground(new java.awt.Color(255, 255, 204));
        jPanel_xoaHD_Phong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Xóa Hóa Đơn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel97.setBackground(new java.awt.Color(255, 255, 255));
        jLabel97.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(0, 0, 0));
        jLabel97.setText("Tháng :");

        jLabel99.setBackground(new java.awt.Color(255, 255, 255));
        jLabel99.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 0, 0));
        jLabel99.setText("Năm :");

        jComboBox_thang_xoaHD_Phong.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_thang_xoaHD_Phong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_thang_xoaHD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_thang_xoaHD_Phong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox_nam_xoaHD_Phong.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_nam_xoaHD_Phong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_nam_xoaHD_Phong.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_nam_xoaHD_Phong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        jLabel103.setBackground(new java.awt.Color(255, 255, 255));
        jLabel103.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 0));
        jLabel103.setText("Tiền Phòng :   500,000 VND /Sinh viên");

        jButton_tao_newHD_Phong1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_tao_newHD_Phong1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_tao_newHD_Phong1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_tao_newHD_Phong1.setText("Xóa");

        jButton_troLai_newHD_Phong1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_troLai_newHD_Phong1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_troLai_newHD_Phong1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_troLai_newHD_Phong1.setText("Hủy bỏ");

        javax.swing.GroupLayout jPanel_xoaHD_PhongLayout = new javax.swing.GroupLayout(jPanel_xoaHD_Phong);
        jPanel_xoaHD_Phong.setLayout(jPanel_xoaHD_PhongLayout);
        jPanel_xoaHD_PhongLayout.setHorizontalGroup(
            jPanel_xoaHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_xoaHD_PhongLayout.createSequentialGroup()
                .addGroup(jPanel_xoaHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_xoaHD_PhongLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton_troLai_newHD_Phong1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jButton_tao_newHD_Phong1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_xoaHD_PhongLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel_xoaHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel_xoaHD_PhongLayout.createSequentialGroup()
                                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jComboBox_thang_xoaHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jComboBox_nam_xoaHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel_xoaHD_PhongLayout.setVerticalGroup(
            jPanel_xoaHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_xoaHD_PhongLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel_xoaHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_thang_xoaHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_nam_xoaHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel_xoaHD_PhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_tao_newHD_Phong1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_troLai_newHD_Phong1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jComboBox_nam_newHD_dn.addActionListener(ac_dienNuoc);
        jButton_tao_newHD_Phong.addActionListener(ac_hdPhong);
        jButton_troLai_newHD_Phong.addActionListener(ac_hdPhong);

        javax.swing.GroupLayout jPanel_1Layout = new javax.swing.GroupLayout(jPanel_1);
        jPanel_1.setLayout(jPanel_1Layout);
        jPanel_1Layout.setHorizontalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_hoaDon_Phong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
            .addGroup(jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_1Layout.createSequentialGroup()
                    .addContainerGap(402, Short.MAX_VALUE)
                    .addComponent(jPanel_newHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(402, Short.MAX_VALUE)))
            .addGroup(jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_1Layout.createSequentialGroup()
                    .addContainerGap(412, Short.MAX_VALUE)
                    .addComponent(jPanel_xoaHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(392, 392, 392)))
        );
        jPanel_1Layout.setVerticalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_hoaDon_Phong, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
            .addGroup(jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_1Layout.createSequentialGroup()
                    .addContainerGap(156, Short.MAX_VALUE)
                    .addComponent(jPanel_newHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(161, Short.MAX_VALUE)))
            .addGroup(jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_1Layout.createSequentialGroup()
                    .addContainerGap(166, Short.MAX_VALUE)
                    .addComponent(jPanel_xoaHD_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(151, 151, 151)))
        );

        jPanel_newHD_Phong.setVisible(false);
        jPanel_xoaHD_Phong.setVisible(false);

        jTabbedPane1.addTab("Phòng", jPanel_1);

        jPanel_.setBackground(new java.awt.Color(255, 204, 255));
        jPanel_.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_suaHD_DN.setBackground(new java.awt.Color(255, 255, 204));
        jPanel_suaHD_DN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sửa Hóa Đơn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 0, 0));
        jLabel85.setText("Tháng :");

        jLabel_phong_suaHD_DN.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_phong_suaHD_DN.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_phong_suaHD_DN.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_phong_suaHD_DN.setText("Phòng : ");

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(0, 0, 0));
        jLabel87.setText("Năm");

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 0, 0));
        jLabel88.setText("Dãy");

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(0, 0, 0));
        jLabel89.setText("Số nước :");

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 0, 0));
        jLabel90.setText("Số điện :");

        jLabel91.setBackground(new java.awt.Color(255, 255, 255));
        jLabel91.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 0, 0));
        jLabel91.setText("Tiền điện :");

        jLabel92.setBackground(new java.awt.Color(255, 255, 255));
        jLabel92.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 0, 0));
        jLabel92.setText("Tiền nước :");

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(0, 0, 0));
        jLabel93.setText("Tổng tiền");

        jLabel_tienNuoc_suaHD_DN.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_tienNuoc_suaHD_DN.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_tienNuoc_suaHD_DN.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_tienDien_suaHD_DN.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_tienDien_suaHD_DN.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_tienDien_suaHD_DN.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_tongTien_suaHD_DN.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_tongTien_suaHD_DN.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_tongTien_suaHD_DN.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_soNuoc_suaHD_DN.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_soNuoc_suaHD_DN.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTextField_soNuoc_suaHD_DN.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_soDIen_suaHD_DN.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_soDIen_suaHD_DN.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTextField_soDIen_suaHD_DN.setForeground(new java.awt.Color(0, 0, 0));

        jButton_tinhTien_newHD_dn1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_tinhTien_newHD_dn1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_tinhTien_newHD_dn1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_tinhTien_newHD_dn1.setText("Tính Tiền");

        jButton_tao_newHD_dn1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_tao_newHD_dn1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_tao_newHD_dn1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_tao_newHD_dn1.setText("Xác nhận");

        jButton_troLai_newHD_dn1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_troLai_newHD_dn1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_troLai_newHD_dn1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_troLai_newHD_dn1.setText("Hủy bỏ");

        jLabel_m.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_m.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_m.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_m.setText("Mã Hóa Đơn:");

        jLabel_day_suaHD_DN.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_day_suaHD_DN.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_day_suaHD_DN.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_day_suaHD_DN.setText("Phòng : ");

        jLabel_nam_suaHD_DN.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_nam_suaHD_DN.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_nam_suaHD_DN.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_nam_suaHD_DN.setText("Phòng : ");

        jLabel_thang_suaHD_DN.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_thang_suaHD_DN.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_thang_suaHD_DN.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_thang_suaHD_DN.setText("Phòng : ");

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 0));
        jLabel95.setText("Phòng : ");

        jLabel_maHoaDon_suaHD_DN.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_maHoaDon_suaHD_DN.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_maHoaDon_suaHD_DN.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel_suaHD_DNLayout = new javax.swing.GroupLayout(jPanel_suaHD_DN);
        jPanel_suaHD_DN.setLayout(jPanel_suaHD_DNLayout);
        jPanel_suaHD_DNLayout.setHorizontalGroup(
            jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_suaHD_DNLayout.createSequentialGroup()
                                        .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_phong_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField_soDIen_suaHD_DN, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                .addComponent(jTextField_soNuoc_suaHD_DN))))
                                    .addComponent(jButton_tinhTien_newHD_dn1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel_thang_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                                        .addComponent(jLabel_m, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_maHoaDon_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_tongTien_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_tienDien_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_tienNuoc_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_day_suaHD_DN, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(jLabel_nam_suaHD_DN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton_troLai_newHD_dn1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jButton_tao_newHD_dn1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_suaHD_DNLayout.setVerticalGroup(
            jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_m, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_maHoaDon_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_suaHD_DNLayout.createSequentialGroup()
                        .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_day_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_phong_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addComponent(jLabel_nam_suaHD_DN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel_thang_suaHD_DN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_soNuoc_suaHD_DN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_tienNuoc_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_tienDien_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_soDIen_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_tongTien_suaHD_DN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_tinhTien_newHD_dn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel_suaHD_DNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_troLai_newHD_dn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_tao_newHD_dn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jButton_tinhTien_newHD_dn1.addActionListener(ac_dienNuoc);
        jButton_tao_newHD_dn1.addActionListener(ac_dienNuoc);
        jButton_troLai_newHD_dn1.addActionListener(ac_dienNuoc);

        jPanel_.add(jPanel_suaHD_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 650, 560));
        jPanel_suaHD_DN.setVisible(false);

        jPanel_hoaDon_DienNuoc.setBackground(new java.awt.Color(255, 204, 204));
        jPanel_hoaDon_DienNuoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_HoaDonDN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Hóa Đơn", "Phòng", "Dãy", "Tháng", "Năm", "Số nước", "Tiền nước", "Số điiện", "Tiền điện", "Tổng tiền", "Đóng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable_HoaDonDN);
        if (jTable_HoaDonDN.getColumnModel().getColumnCount() > 0) {
            jTable_HoaDonDN.getColumnModel().getColumn(0).setMaxWidth(200);
        }
        jTable_HoaDonDN.getAccessibleContext().setAccessibleName("");
        jTable_HoaDonDN.setAutoCreateRowSorter(true);

        jPanel_hoaDon_DienNuoc.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1300, 470));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("DANH SÁCH HÓA ĐƠN ĐIỆN NƯỚC");
        jPanel_hoaDon_DienNuoc.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, 30));

        jTextField_timkiem_DN.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextField_timkiem_DN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_hoaDon_DienNuoc.add(jTextField_timkiem_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 251, 40));

        jButton_hienThi_DN.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_hienThi_DN.setForeground(new java.awt.Color(0, 0, 0));
        jButton_hienThi_DN.setText("Hiện Thị");
        jButton_hienThi_DN.setOpaque(false);
        jPanel_hoaDon_DienNuoc.add(jButton_hienThi_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 102, 30));
        jButton_hienThi_DN.addActionListener(ac_dienNuoc);

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 0, 0));
        jLabel84.setText("Tháng :");
        jPanel_hoaDon_DienNuoc.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 60, -1));

        jComboBox_thang_DN.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_thang_DN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_thang_DN.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_thang_DN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel_hoaDon_DienNuoc.add(jComboBox_thang_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, 30));

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 0, 0));
        jLabel83.setText("Năm :");
        jPanel_hoaDon_DienNuoc.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 50, -1));

        jButton_newHD_DN.setBackground(new java.awt.Color(255, 153, 153));
        jButton_newHD_DN.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_newHD_DN.setForeground(new java.awt.Color(0, 0, 0));
        jButton_newHD_DN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/File-new-icon.png"))); // NOI18N
        jButton_newHD_DN.setText("Tạo Hoá Đơn mới");
        jButton_newHD_DN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_hoaDon_DienNuoc.add(jButton_newHD_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));
        jButton_newHD_DN.addActionListener(ac_dienNuoc);

        jComboBox_nam_DN.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_nam_DN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_nam_DN.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_nam_DN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        jPanel_hoaDon_DienNuoc.add(jComboBox_nam_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 30));

        jButton_hienThi_DN1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_hienThi_DN1.setForeground(new java.awt.Color(0, 0, 0));
        jButton_hienThi_DN1.setText("Hiện Thị toàn bộ");
        jButton_hienThi_DN1.setOpaque(false);
        jPanel_hoaDon_DienNuoc.add(jButton_hienThi_DN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, 33));
        jButton_hienThi_DN1.addActionListener(ac_dienNuoc);

        jLabel_setngayThang.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel_setngayThang.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_setngayThang.setText("Tháng xx năm xxxx");
        jPanel_hoaDon_DienNuoc.add(jLabel_setngayThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 160, 34));

        jButton_xoa_HD_DN.setBackground(new java.awt.Color(255, 153, 153));
        jButton_xoa_HD_DN.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_xoa_HD_DN.setForeground(new java.awt.Color(0, 0, 0));
        jButton_xoa_HD_DN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete-file-icon.png"))); // NOI18N
        jButton_xoa_HD_DN.setText("Xóa Hoá Đơn");
        jButton_xoa_HD_DN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_hoaDon_DienNuoc.add(jButton_xoa_HD_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 170, 50));
        jButton_xoa_HD_DN.addActionListener(ac_dienNuoc);

        jButton_sua_HD_DN.setBackground(new java.awt.Color(255, 153, 153));
        jButton_sua_HD_DN.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton_sua_HD_DN.setForeground(new java.awt.Color(0, 0, 0));
        jButton_sua_HD_DN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/file.png"))); // NOI18N
        jButton_sua_HD_DN.setText("Sửa  Hoá Đơn");
        jButton_sua_HD_DN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_hoaDon_DienNuoc.add(jButton_sua_HD_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 190, 50));
        jButton_sua_HD_DN.addActionListener(ac_dienNuoc);

        jButton_timkiem_HD_DN.setBackground(new java.awt.Color(255, 232, 172));
        jButton_timkiem_HD_DN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton_timkiem_HD_DN.setForeground(new java.awt.Color(0, 0, 0));
        jButton_timkiem_HD_DN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Zoom-icon.png"))); // NOI18N
        jButton_timkiem_HD_DN.setText("Tìm kiếm");
        jButton_timkiem_HD_DN.setBorder(null);
        jPanel_hoaDon_DienNuoc.add(jButton_timkiem_HD_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 120, 110, 40));
        jButton_timkiem_HD_DN.addActionListener(ac_dienNuoc);

        jButton_capNhat_DN.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_capNhat_DN.setForeground(new java.awt.Color(0, 0, 0));
        jButton_capNhat_DN.setText("Cập nhật");
        jButton_capNhat_DN.setOpaque(false);
        jPanel_hoaDon_DienNuoc.add(jButton_capNhat_DN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 80, -1, 33));
        jButton_capNhat_DN.addActionListener(ac_dienNuoc);

        jPanel_.add(jPanel_hoaDon_DienNuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 740));

        jPanel_newHD_dn.setBackground(new java.awt.Color(255, 255, 204));
        jPanel_newHD_dn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tạo Hóa Đơn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("Tháng :");

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("Phòng : ");

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setText("Năm");

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setText("Dãy");

        jComboBox_phong_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_phong_newHD_dn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_phong_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));

        jComboBox_day_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_day_newHD_dn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_day_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_day_newHD_dn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_day_newHD_dnActionPerformed(evt);
            }
        });

        jComboBox_thang_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_thang_newHD_dn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_thang_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_thang_newHD_dn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox_nam_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_nam_newHD_dn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox_nam_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_nam_newHD_dn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setText("Số nước :");

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("Số điện :");

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 0, 0));
        jLabel80.setText("Tiền điện :");

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
        jLabel81.setText("Tiền nước :");

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 0, 0));
        jLabel82.setText("Tổng tiền");

        jLabel_tienNuoc_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_tienNuoc_newHD_dn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_tienNuoc_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_tienDien_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_tienDien_newHD_dn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_tienDien_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_tongTien_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_tongTien_newHD_dn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel_tongTien_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_soNuoc_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_soNuoc_newHD_dn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTextField_soNuoc_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_soDIen_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_soDIen_newHD_dn.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTextField_soDIen_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));

        jButton_tinhTien_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jButton_tinhTien_newHD_dn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_tinhTien_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));
        jButton_tinhTien_newHD_dn.setText("Tính tiền");

        jButton_tao_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jButton_tao_newHD_dn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_tao_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));
        jButton_tao_newHD_dn.setText("Tạo");

        jButton_troLai_newHD_dn.setBackground(new java.awt.Color(255, 255, 255));
        jButton_troLai_newHD_dn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_troLai_newHD_dn.setForeground(new java.awt.Color(0, 0, 0));
        jButton_troLai_newHD_dn.setText("Trở lại");

        javax.swing.GroupLayout jPanel_newHD_dnLayout = new javax.swing.GroupLayout(jPanel_newHD_dn);
        jPanel_newHD_dn.setLayout(jPanel_newHD_dnLayout);
        jPanel_newHD_dnLayout.setHorizontalGroup(
            jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox_thang_newHD_dn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox_phong_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                                    .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_soDIen_newHD_dn)
                                        .addComponent(jTextField_soNuoc_newHD_dn))))
                            .addComponent(jButton_tinhTien_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_tongTien_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_tienDien_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_tienNuoc_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                                .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox_nam_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox_day_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton_troLai_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jButton_tao_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_newHD_dnLayout.setVerticalGroup(
            jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_thang_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_newHD_dnLayout.createSequentialGroup()
                        .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_phong_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_day_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_nam_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_soNuoc_newHD_dn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_tienNuoc_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_tienDien_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_soDIen_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_tongTien_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_tinhTien_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel_newHD_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_troLai_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_tao_newHD_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jComboBox_nam_newHD_dn.addActionListener(ac_dienNuoc);
        jButton_tinhTien_newHD_dn.addActionListener(ac_dienNuoc);
        jButton_tao_newHD_dn.addActionListener(ac_dienNuoc);
        jButton_troLai_newHD_dn.addActionListener(ac_dienNuoc);

        jPanel_.add(jPanel_newHD_dn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 650, 560));
        jPanel_newHD_dn.setVisible(false);

        jTabbedPane1.addTab("Điện Nước", jPanel_);
        jPanel_.setVisible(false);

        javax.swing.GroupLayout jPanel_hoaDonLayout = new javax.swing.GroupLayout(jPanel_hoaDon);
        jPanel_hoaDon.setLayout(jPanel_hoaDonLayout);
        jPanel_hoaDonLayout.setHorizontalGroup(
            jPanel_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel_hoaDonLayout.setVerticalGroup(
            jPanel_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jPanel_trangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(188, 188, 188)
                    .addComponent(jPanel_sinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(jPanel_phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(110, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(191, 191, 191)
                    .addComponent(jPanel_hopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(109, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(191, 191, 191)
                    .addComponent(jPanel_hoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addComponent(jPanel_trangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(0, 79, Short.MAX_VALUE)
                    .addComponent(jPanel_sinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(jPanel_phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(jPanel_hopDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(0, 83, Short.MAX_VALUE)
                    .addComponent(jPanel_hoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel_sinhVien.setVisible(false);
        jPanel_phong.setVisible(false);
        jPanel_hopDong.setVisible(false);
        jPanel_hoaDon.setVisible(false);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_accountActionPerformed
        jPanel_MK_DX.setVisible(flag_MK_Dx);
        flag_MK_Dx = !flag_MK_Dx;
    }//GEN-LAST:event_jButton_accountActionPerformed

    private void jButton_trangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_trangChuActionPerformed
        jPanel_trangChu.setVisible(true);
        jPanel_sinhVien.setVisible(false);
        jPanel_phong.setVisible(false);
        jPanel_hopDong.setVisible(false);
        jPanel_hoaDon.setVisible(false);


    }//GEN-LAST:event_jButton_trangChuActionPerformed

    private void jButton_dangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dangXuatActionPerformed
        this.setVisible(false);
        View_Login view_Login = new View_Login();
    }//GEN-LAST:event_jButton_dangXuatActionPerformed

    private void jButton_SinhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SinhvienActionPerformed
        jPanel_sinhVien.setVisible(true);
        jPanel_trangChu.setVisible(false);
        jPanel_phong.setVisible(false);
        jPanel_hopDong.setVisible(false);
        jPanel_hoaDon.setVisible(false);

        bangSinhVien();
        bangUser();
    }//GEN-LAST:event_jButton_SinhvienActionPerformed

    private void jButton_hopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hopDongActionPerformed
        jPanel_trangChu.setVisible(false);
        jPanel_sinhVien.setVisible(false);
        jPanel_phong.setVisible(false);
        jPanel_hopDong.setVisible(true);
        jPanel_hoaDon.setVisible(false);
        bangPhieuDangKy();
        bangHopDong();
    }//GEN-LAST:event_jButton_hopDongActionPerformed

    private void jButton_hoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hoaDonActionPerformed
        jPanel_trangChu.setVisible(false);
        jPanel_sinhVien.setVisible(false);
        jPanel_phong.setVisible(false);
        jPanel_hopDong.setVisible(false);
        jPanel_hoaDon.setVisible(true);

        bangHoaDonDN();
        bangHoaDon_Phong();
    }//GEN-LAST:event_jButton_hoaDonActionPerformed

    private void jButton_phongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_phongActionPerformed
        jPanel_trangChu.setVisible(false);
        jPanel_sinhVien.setVisible(false);
        jPanel_phong.setVisible(true);
        jPanel_hopDong.setVisible(false);
        jPanel_hoaDon.setVisible(false);

        bangPhong();
    }//GEN-LAST:event_jButton_phongActionPerformed

    private void jComboBox_day_newHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_day_newHDActionPerformed

        jComboBox_phong_newHD.removeAllItems();
        String day = (String) jComboBox_day_newHD.getSelectedItem();
        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst;
            pst = con.prepareStatement("select * from Phong where soSV < soSVToiDa and maDay = '" + day + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String phong = rs.getString("maPhong");
                this.jComboBox_phong_newHD.addItem(phong);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(View_MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBox_day_newHDActionPerformed

    private void jComboBox_day_suaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_day_suaHDActionPerformed
        String day = (String) jComboBox_day_suaHD.getSelectedItem();
        jComboBox_phong_suaHD.removeAllItems();

        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst;
            pst = con.prepareStatement("select * from Phong where soSV < soSVToiDa and maDay = '" + day + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String phong = rs.getString("maPhong");
                this.jComboBox_phong_suaHD.addItem(phong);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(View_MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox_day_suaHDActionPerformed

    private void jComboBox_day_newHD_dnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_day_newHD_dnActionPerformed
        String day = (String) jComboBox_day_newHD_dn.getSelectedItem();
        jComboBox_phong_newHD_dn.removeAllItems();

        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst;
            pst = con.prepareStatement("select * from Phong where  maDay = '" + day + "'");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String phong = rs.getString("maPhong");
                this.jComboBox_phong_newHD_dn.addItem(phong);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(View_MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox_day_newHD_dnActionPerformed

    private void jButton_xoa_PDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xoa_PDKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_xoa_PDKActionPerformed

    private void jButton_xem_PDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xem_PDKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_xem_PDKActionPerformed

    private void jButton_phanHoi_PDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_phanHoi_PDKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_phanHoi_PDKActionPerformed

    private void jButton_xem_PDK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xem_PDK1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_xem_PDK1ActionPerformed

    private void jTextField_timkiem_PDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_timkiem_PDKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_timkiem_PDKActionPerformed

    private void jButton_taiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_taiKhoanActionPerformed

        View_TaiKhoan_Admin vad = new View_TaiKhoan_Admin(ad);
    }//GEN-LAST:event_jButton_taiKhoanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_QuayLai_suahd;
    private javax.swing.JButton jButton_Sinhvien;
    private javax.swing.JButton jButton_account;
    private javax.swing.JButton jButton_capNhat_DN;
    private javax.swing.JButton jButton_capNhat_HD_Phong;
    private javax.swing.JButton jButton_capNhat_suaPhong;
    public javax.swing.JButton jButton_capNhat_suaSV;
    private javax.swing.JButton jButton_capNhatiPass_SV;
    private javax.swing.JButton jButton_dangXuat;
    private javax.swing.JButton jButton_hienThiToanBo_HD_Phong;
    private javax.swing.JButton jButton_hienThi_DN;
    private javax.swing.JButton jButton_hienThi_DN1;
    private javax.swing.JButton jButton_hienThi_HD_Phong;
    private javax.swing.JButton jButton_hienThi_HD_Phong1;
    private javax.swing.JButton jButton_hienThi_HD_Phong2;
    private javax.swing.JButton jButton_hoaDon;
    private javax.swing.JButton jButton_hopDong;
    private javax.swing.JButton jButton_huyBo_newHD;
    private javax.swing.JButton jButton_huyBo_newPhong;
    private javax.swing.JButton jButton_huyBo_suaPhong;
    public javax.swing.JButton jButton_huyBo_suaSV;
    private javax.swing.JButton jButton_newHD_DN;
    private javax.swing.JButton jButton_newHD_Phong;
    private javax.swing.JButton jButton_newHopDong;
    private javax.swing.JButton jButton_newPhong;
    public javax.swing.JButton jButton_phanHoi_PDK;
    public javax.swing.JButton jButton_phanHoi_PDK1;
    private javax.swing.JButton jButton_phong;
    private javax.swing.JButton jButton_sua_HD;
    private javax.swing.JButton jButton_sua_HD_DN;
    private javax.swing.JButton jButton_sua_Phong;
    private javax.swing.JButton jButton_sua_SinhVien;
    private javax.swing.JButton jButton_taiKhoan;
    private javax.swing.JButton jButton_tao_newHD_Phong;
    private javax.swing.JButton jButton_tao_newHD_Phong1;
    public javax.swing.JButton jButton_tao_newHD_dn;
    public javax.swing.JButton jButton_tao_newHD_dn1;
    private javax.swing.JButton jButton_thayDoi_suahd;
    private javax.swing.JButton jButton_timkiem_HD;
    private javax.swing.JButton jButton_timkiem_HD_DN;
    private javax.swing.JButton jButton_timkiem_HD_Phong;
    private javax.swing.JButton jButton_timkiem_HD_Phong1;
    private javax.swing.JButton jButton_timkiem_SinhVien;
    private javax.swing.JButton jButton_timkiem_User;
    private javax.swing.JButton jButton_timkiem_phong;
    public javax.swing.JButton jButton_tinhTien_newHD_dn;
    public javax.swing.JButton jButton_tinhTien_newHD_dn1;
    private javax.swing.JButton jButton_trangChu;
    private javax.swing.JButton jButton_troLai_newHD_Phong;
    private javax.swing.JButton jButton_troLai_newHD_Phong1;
    public javax.swing.JButton jButton_troLai_newHD_dn;
    public javax.swing.JButton jButton_troLai_newHD_dn1;
    private javax.swing.JButton jButton_xacNhan_newHD;
    private javax.swing.JButton jButton_xacNhan_newPhong;
    private javax.swing.JButton jButton_xem_PDK;
    private javax.swing.JButton jButton_xem_PDK1;
    private javax.swing.JButton jButton_xoa_HD;
    private javax.swing.JButton jButton_xoa_HD_DN;
    private javax.swing.JButton jButton_xoa_HD_Phong;
    private javax.swing.JButton jButton_xoa_HD_Phong1;
    private javax.swing.JButton jButton_xoa_PDK;
    private javax.swing.JButton jButton_xoa_Phong;
    public javax.swing.JComboBox<String> jComboBox_day_newHD;
    public javax.swing.JComboBox<String> jComboBox_day_newHD_dn;
    public javax.swing.JComboBox<String> jComboBox_day_suaHD;
    public javax.swing.JComboBox<String> jComboBox_nam_DN;
    public javax.swing.JComboBox<String> jComboBox_nam_HD_Phong;
    public javax.swing.JComboBox<String> jComboBox_nam_newHD_Phong;
    public javax.swing.JComboBox<String> jComboBox_nam_newHD_dn;
    public javax.swing.JComboBox<String> jComboBox_nam_xoaHDThang;
    public javax.swing.JComboBox<String> jComboBox_nam_xoaHD_Phong;
    public javax.swing.JComboBox<String> jComboBox_phong_newHD;
    public javax.swing.JComboBox<String> jComboBox_phong_newHD_dn;
    public javax.swing.JComboBox<String> jComboBox_phong_suaHD;
    public javax.swing.JComboBox<String> jComboBox_thang_DN;
    public javax.swing.JComboBox<String> jComboBox_thang_HD_Phong;
    public javax.swing.JComboBox<String> jComboBox_thang_newHD_Phong;
    public javax.swing.JComboBox<String> jComboBox_thang_newHD_dn;
    public javax.swing.JComboBox<String> jComboBox_thang_xoaHDThang;
    public javax.swing.JComboBox<String> jComboBox_thang_xoaHD_Phong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    public javax.swing.JLabel jLabel_day_cu;
    private javax.swing.JLabel jLabel_day_suaHD_DN;
    public javax.swing.JLabel jLabel_day_suaSV;
    public javax.swing.JLabel jLabel_day_xemPhieu;
    public javax.swing.JLabel jLabel_hoTen_xemPhieu;
    public javax.swing.JLabel jLabel_khoa_xemPhieu;
    public javax.swing.JLabel jLabel_lop_xemPhieu;
    private javax.swing.JLabel jLabel_m;
    public javax.swing.JLabel jLabel_maHD_cu;
    private javax.swing.JLabel jLabel_maHD_cu2;
    public javax.swing.JLabel jLabel_maHoaDon_suaHD_DN;
    public javax.swing.JLabel jLabel_maSV_cu;
    private javax.swing.JLabel jLabel_maSV_cu2;
    public javax.swing.JLabel jLabel_maSV_suaSV;
    public javax.swing.JLabel jLabel_maSV_xemPhieu;
    private javax.swing.JLabel jLabel_nam_suaHD_DN;
    public javax.swing.JLabel jLabel_ngayDangKy_xemPhieu;
    private javax.swing.JLabel jLabel_ngayDangky_cu;
    private javax.swing.JLabel jLabel_ngayHetHan_cu;
    public javax.swing.JLabel jLabel_ngayHetHan_xemPhieu;
    public javax.swing.JLabel jLabel_ngay_xemPhieu;
    public javax.swing.JLabel jLabel_phong_cu;
    private javax.swing.JLabel jLabel_phong_suaHD_DN;
    public javax.swing.JLabel jLabel_phong_suaSV;
    public javax.swing.JLabel jLabel_phong_xemPhieu;
    private javax.swing.JLabel jLabel_setngayThang;
    private javax.swing.JLabel jLabel_setngayThang_HD_Phong;
    public javax.swing.JLabel jLabel_soGiuongTrong;
    public javax.swing.JLabel jLabel_soGiuongTrong1;
    public javax.swing.JLabel jLabel_soPhong;
    public javax.swing.JLabel jLabel_soPhong1;
    public javax.swing.JLabel jLabel_soPhong_trong;
    public javax.swing.JLabel jLabel_soPhong_trong1;
    public javax.swing.JLabel jLabel_soSV_suaPhong;
    public javax.swing.JLabel jLabel_tenSV_cu;
    private javax.swing.JLabel jLabel_tenSV_cu2;
    private javax.swing.JLabel jLabel_tenUser;
    private javax.swing.JLabel jLabel_thang_suaHD_DN;
    private javax.swing.JLabel jLabel_thoiHan_cu;
    public javax.swing.JLabel jLabel_thoiHan_xemPhieu;
    public javax.swing.JLabel jLabel_tienDien_newHD_dn;
    public javax.swing.JLabel jLabel_tienDien_suaHD_DN;
    public javax.swing.JLabel jLabel_tienNuoc_newHD_dn;
    public javax.swing.JLabel jLabel_tienNuoc_suaHD_DN;
    public javax.swing.JLabel jLabel_tongTien_newHD_dn;
    public javax.swing.JLabel jLabel_tongTien_suaHD_DN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel11;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanel_;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_MK_DX;
    private javax.swing.JPanel jPanel_hoaDon;
    public javax.swing.JPanel jPanel_hoaDon_DienNuoc;
    public javax.swing.JPanel jPanel_hoaDon_Phong;
    private javax.swing.JPanel jPanel_hopDong;
    public javax.swing.JPanel jPanel_newHD_Phong;
    public javax.swing.JPanel jPanel_newHD_dn;
    public javax.swing.JPanel jPanel_newHopDong;
    public javax.swing.JPanel jPanel_newPhong;
    private javax.swing.JPanel jPanel_phong;
    private javax.swing.JPanel jPanel_sinhVien;
    public javax.swing.JPanel jPanel_suaHD;
    public javax.swing.JPanel jPanel_suaHD_DN;
    public javax.swing.JPanel jPanel_suaPhong;
    public javax.swing.JPanel jPanel_suaSV;
    private javax.swing.JPanel jPanel_trangChu;
    public javax.swing.JPanel jPanel_xoaHD_Phong;
    public javax.swing.JRadioButton jRadioButton_nam_newHD;
    public javax.swing.JRadioButton jRadioButton_nu_newHD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JScrollPane jScrollPane8;
    public javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    public javax.swing.JTable jTable_HoaDonDN;
    public javax.swing.JTable jTable_HoaDon_Phong;
    public javax.swing.JTable jTable_hopDong;
    public javax.swing.JTable jTable_phieuDangKy;
    public javax.swing.JTable jTable_phong;
    public javax.swing.JTable jTable_sinhVien;
    public javax.swing.JTable jTable_userSV;
    public javax.swing.JTextArea jTextArea_thanhVienPhong_suaPhong;
    public javax.swing.JTextField jTextField_day_newPhong;
    public javax.swing.JTextField jTextField_day_suaPhong;
    public javax.swing.JTextField jTextField_gioiTinh_suaSV;
    public javax.swing.JTextField jTextField_khoa_newHD;
    public javax.swing.JTextField jTextField_khoa_suaSV;
    public javax.swing.JTextField jTextField_lop_newHD;
    public javax.swing.JTextField jTextField_lop_suaSV;
    public javax.swing.JTextField jTextField_maPhong_newPhong;
    public javax.swing.JTextField jTextField_maPhong_suaPhong;
    public javax.swing.JTextField jTextField_maSV_newHD;
    public javax.swing.JTextField jTextField_ngayDangKy_newHD;
    public javax.swing.JTextField jTextField_ngayDangKy_suaHD;
    public javax.swing.JTextField jTextField_ngayHetHan_newHD;
    public javax.swing.JTextField jTextField_ngayHetHan_suaHD;
    public javax.swing.JTextField jTextField_ngaySInh_suaSV;
    public javax.swing.JTextField jTextField_ngaySinh_newHD;
    public javax.swing.JTextField jTextField_queQuan_newHD;
    public javax.swing.JTextField jTextField_queQuan_suaSV;
    public javax.swing.JTextField jTextField_sdt_newHD;
    public javax.swing.JTextField jTextField_sdt_suaSV;
    public javax.swing.JTextField jTextField_soDIen_newHD_dn;
    public javax.swing.JTextField jTextField_soDIen_suaHD_DN;
    public javax.swing.JTextField jTextField_soNuoc_newHD_dn;
    public javax.swing.JTextField jTextField_soNuoc_suaHD_DN;
    public javax.swing.JTextField jTextField_soSVToiDa_newPhong;
    public javax.swing.JTextField jTextField_soSVToiDa_suaPhong;
    public javax.swing.JTextField jTextField_tenPhong_newPhong;
    public javax.swing.JTextField jTextField_tenPhong_suaPhong;
    public javax.swing.JTextField jTextField_tenSV_newHD;
    public javax.swing.JTextField jTextField_tenSV_suaSV;
    public javax.swing.JTextField jTextField_thoiHan_newHD;
    public javax.swing.JTextField jTextField_thoiHan_suaHD;
    public javax.swing.JTextField jTextField_tiemkiem_HD;
    public javax.swing.JTextField jTextField_timkiem_DN;
    public javax.swing.JTextField jTextField_timkiem_HD_Phong;
    public javax.swing.JTextField jTextField_timkiem_PDK;
    public javax.swing.JTextField jTextField_timkiem_Phong;
    public javax.swing.JTextField jTextField_timkiem_SinhVien;
    public javax.swing.JTextField jTextField_timkiem_User;
    public javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    public void bangPhong() {

        DefaultTableModel tableModel = (DefaultTableModel) jTable_phong.getModel();
        tableModel.setRowCount(0);
        ArrayList<Phong> listPhong = PhongDAO.getImstance().selectAll();
        int i = 1;
        for (Phong p : listPhong) {
            tableModel.addRow(new Object[]{i++, p.getMaPhong(), p.getTenPhong(), p.getMaDay(), p.getSoSV(), p.getSoSV_toiDa(), p.getThanhVienPhong()});
        }

        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select count(maPhong) as soPhong from Phong");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int soPhong = rs.getInt("soPhong");
                jLabel_soPhong.setText("Số Phòng : " + String.valueOf(soPhong));
            }

            pst = con.prepareStatement("select count(maPhong) as soPhongTrong from Phong where soSV < soSVToiDa");
            rs = pst.executeQuery();
            while (rs.next()) {
                int soPhongTrong = rs.getInt("soPhongTrong");
                jLabel_soPhong_trong.setText("Số Phòng trồng : " + String.valueOf(soPhongTrong));
            }
            int a = 0;
            pst = con.prepareStatement("select (soSVToiDa - soSV) as so from Phong ");
            rs = pst.executeQuery();
            while (rs.next()) {

                a = a + rs.getInt("so");
            }
            jLabel_soGiuongTrong.setText("Số Giường trống : " + String.valueOf(a));
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void bangHoaDonDN_timKiem_tn() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_HoaDonDN.getModel();
        tableModel.setRowCount(0);

        int thang = Integer.parseInt((String) jComboBox_thang_DN.getSelectedItem());
        int nam = Integer.parseInt((String) jComboBox_nam_DN.getSelectedItem());
        int i = 1, y = 1;
        boolean a = false;

        jLabel_setngayThang.setText("Tháng " + thang + " Năm " + nam);
        ArrayList<HoaDonDienNuoc> listhd = DienNuocDAO.getImstance().selectByTN(thang, nam);

        for (HoaDonDienNuoc hd : listhd) {
            if (hd.getDongTien() == true) {
                y++;
            }
            tableModel.addRow(new Object[]{i++, hd.getMaHoaDon(), hd.getMaPHong(), hd.getMaDay(), hd.getThang(), hd.getNam(), hd.getSoNuoc(),
                hd.getTienNuoc(), hd.getSoDien(), hd.getTienDien(), hd.getTongTien(), hd.getDongTien()});
        }

        ArrayList<Float> tt = DienNuocDAO.getImstance().select_TongTienThang(thang, nam);
        if (i == y) {
            a = true;
        }
        tableModel.addRow(new Object[]{"", "", "", "", "", "Tổng", tt.get(3), tt.get(0), tt.get(4), tt.get(1), tt.get(2), a});

    }

    public void bangHoaDonPhong_timKiem_tn() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_HoaDon_Phong.getModel();
        tableModel.setRowCount(0);

        int thang = Integer.parseInt((String) jComboBox_thang_HD_Phong.getSelectedItem());
        int nam = Integer.parseInt((String) jComboBox_nam_HD_Phong.getSelectedItem());

        jLabel_setngayThang_HD_Phong.setText("Tháng " + thang + " Năm " + nam);
        ArrayList<HoaDonPhong> listhd = HoaDonPhongDAO.getInstance().selectByTN(thang, nam);
        int i = 1, y = 1;
        boolean a = false;
        for (HoaDonPhong hd : listhd) {
            if (hd.getDongTien() == true) {
                y++;
            }
            tableModel.addRow(new Object[]{i++, hd.getMaHoaDon(), hd.getMaSV(), hd.getThang(), hd.getNam(), "500000", hd.getDongTien()});
        }

        if (i == y) {
            a = true;
        }
        tableModel.addRow(new Object[]{i++, "", "", "", "Tổng tiền", 500000 * (i - 2), a});

    }

    public void setPhong(int i) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_phong.getModel();
        jTextField_maPhong_suaPhong.setText(tableModel.getValueAt(i, 1) + "");
        jTextField_tenPhong_suaPhong.setText(tableModel.getValueAt(i, 2) + "");
        jTextField_day_suaPhong.setText(tableModel.getValueAt(i, 3) + "");
        jLabel_soSV_suaPhong.setText((tableModel.getValueAt(i, 4) + ""));
        jTextField_soSVToiDa_suaPhong.setText(tableModel.getValueAt(i, 5) + "");
        jTextArea_thanhVienPhong_suaPhong.setText(tableModel.getValueAt(i, 6) + "");

    }

    public void setHopDong(int i) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_hopDong.getModel();
        jLabel_maHD_cu.setText(tableModel.getValueAt(i, 1) + "");
        jLabel_maHD_cu2.setText(tableModel.getValueAt(i, 1) + "");
        jLabel_maSV_cu.setText(tableModel.getValueAt(i, 2) + "");
        jLabel_maSV_cu2.setText(tableModel.getValueAt(i, 2) + "");
        jLabel_tenSV_cu.setText(tableModel.getValueAt(i, 3) + "");
        jLabel_tenSV_cu2.setText(tableModel.getValueAt(i, 3) + "");
        jLabel_phong_cu.setText(tableModel.getValueAt(i, 4) + "");
        jLabel_day_cu.setText(tableModel.getValueAt(i, 5) + "");

        jLabel_ngayDangky_cu.setText(tableModel.getValueAt(i, 6) + "");
        jTextField_ngayDangKy_suaHD.setText(tableModel.getValueAt(i, 6) + "");
        jLabel_thoiHan_cu.setText(tableModel.getValueAt(i, 7) + "");
        jLabel_ngayHetHan_cu.setText(tableModel.getValueAt(i, 8) + "");
        jTextField_ngayHetHan_suaHD.setText(tableModel.getValueAt(i, 8) + "");

    }

    public void setSinhVien(int i) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_sinhVien.getModel();

        jLabel_maSV_suaSV.setText(tableModel.getValueAt(i, 1) + "");
        jTextField_tenSV_suaSV.setText(tableModel.getValueAt(i, 2) + "");
        jTextField_gioiTinh_suaSV.setText(tableModel.getValueAt(i, 3) + "");
        jTextField_ngaySInh_suaSV.setText(tableModel.getValueAt(i, 4) + "");
        jLabel_phong_suaSV.setText(tableModel.getValueAt(i, 5) + "");
        jLabel_day_suaSV.setText(tableModel.getValueAt(i, 6) + "");
        jTextField_lop_suaSV.setText(tableModel.getValueAt(i, 7) + "");
        jTextField_khoa_suaSV.setText(tableModel.getValueAt(i, 8) + "");
        jTextField_queQuan_suaSV.setText(tableModel.getValueAt(i, 9) + "");
        jTextField_sdt_suaSV.setText(tableModel.getValueAt(i, 10) + "");

    }

    public void setHoaDonDienNuoc(int i) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_HoaDonDN.getModel();

        jLabel_maHoaDon_suaHD_DN.setText(tableModel.getValueAt(i, 1) + "");

        jLabel_phong_suaHD_DN.setText(tableModel.getValueAt(i, 2) + "");
        jLabel_day_suaHD_DN.setText(tableModel.getValueAt(i, 3) + "");
        jLabel_thang_suaHD_DN.setText(tableModel.getValueAt(i, 4) + "");
        jLabel_nam_suaHD_DN.setText(tableModel.getValueAt(i, 5) + "");

        jTextField_soNuoc_suaHD_DN.setText(tableModel.getValueAt(i, 6) + "");
        jLabel_tienNuoc_suaHD_DN.setText(tableModel.getValueAt(i, 7) + "");

        jTextField_soDIen_suaHD_DN.setText(tableModel.getValueAt(i, 8) + "");
        jLabel_tienDien_suaHD_DN.setText(tableModel.getValueAt(i, 9) + "");
        jLabel_tongTien_suaHD_DN.setText(tableModel.getValueAt(i, 10) + "");

    }

    public void setPhieuDK(int i) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_phieuDangKy.getModel();

        PhieuDangKy pdk = PhieuDangKyDAO.getInstance().selectByMaPhieu(Integer.parseInt(tableModel.getValueAt(i, 1) + ""));

        jLabel_ngay_xemPhieu.setText(pdk.getNgay());
        jLabel_phong_xemPhieu.setText(pdk.getMaPhong());
        jLabel_day_xemPhieu.setText(pdk.getMaDay());
        jLabel_ngayDangKy_xemPhieu.setText(pdk.getNgayDangKy());
        jLabel_ngayHetHan_xemPhieu.setText(pdk.getNgayHetHan());
        jLabel_thoiHan_xemPhieu.setText(String.valueOf(pdk.getThoiHan()));
        jLabel_maSV_xemPhieu.setText(pdk.getMaSV());
        jLabel_hoTen_xemPhieu.setText(pdk.getHoTenSV());

        SinhVien sv = SinhVienDAO.getImstance().selectBy(pdk.getMaSV());
        jLabel_lop_xemPhieu.setText(sv.getLop());
        jLabel_khoa_xemPhieu.setText(sv.getKhoa());
    }

    public void bangHopDong() {

        DefaultTableModel tableModel = (DefaultTableModel) jTable_hopDong.getModel();

        tableModel.setRowCount(0);
        ArrayList<HopDong> listhd = HopDongDAO.getImstance().selectAll();
        int i = 1;
        for (HopDong p : listhd) {

            try {
                Connection con = JDBCUtil.getConnection();
                PreparedStatement pst = con.prepareStatement("select hoTenSV  from SinhVien where maSV = '" + p.getMaSV() + "'");
                ResultSet rs = pst.executeQuery();
                String hotenSV = null;
                while (rs.next()) {
                    hotenSV = (rs.getString("hoTenSV"));
                }
                tableModel.addRow(new Object[]{i++, p.getMaHopDong(), p.getMaSV(), hotenSV, p.getMaPhong(), p.getMaDay(),
                    p.getNgayDangKy(), p.getThoiHan() + " tháng", p.getNgayHetHan()});

                JDBCUtil.closeConnection(con);
            } catch (SQLException ex) {

            }
        }
    }

    public void bangSinhVien() {

        DefaultTableModel tableModel = (DefaultTableModel) jTable_sinhVien.getModel();

        tableModel.setRowCount(0);
        ArrayList<SinhVien> listsv = SinhVienDAO.getImstance().selectAll();
        int i = 1;
        for (SinhVien sv : listsv) {
            tableModel.addRow(new Object[]{i++, sv.getMaSV(), sv.getHoTenSV(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaPhong(), sv.getMaDay(),
                sv.getLop(), sv.getKhoa(), sv.getQueQuan(), sv.getSdt()});
        }

        try {
            Connection con = JDBCUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("select count(maSV) as soSV from SinhVien");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int soPhong = rs.getInt("soSV");
                jLabel_soPhong1.setText("Số Sinh Viên : " + String.valueOf(soPhong));
            }

            pst = con.prepareStatement("select count(maSV) as soSV from SinhVien where gioiTinh ='Nam'");
            rs = pst.executeQuery();
            while (rs.next()) {
                int soPhongTrong = rs.getInt("soSV");
                jLabel_soPhong_trong1.setText("Số Sinh Viên Nam : " + String.valueOf(soPhongTrong));
            }
            int a = 0;
            pst = con.prepareStatement("select count(maSV) as soSV from SinhVien where gioiTinh = N'Nữ'");
            rs = pst.executeQuery();
            while (rs.next()) {
                    int soPhongTrong = rs.getInt("soSV");
                jLabel_soGiuongTrong1.setText("Số Sinh Viên Nữ : " + String.valueOf(soPhongTrong));
     
            }        
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void bangUser() {

        DefaultTableModel tableModel = (DefaultTableModel) jTable_userSV.getModel();

        tableModel.setRowCount(0);
        ArrayList<User> list = UserDAO.getInstance().selectAll();
        int i = 1;
        for (User user : list) {
            tableModel.addRow(new Object[]{i++, user.getUserID(), user.getPassWord(), user.getUserName()});
        }
    }

    public void bangHoaDonDN() {

        DefaultTableModel tableModel = (DefaultTableModel) jTable_HoaDonDN.getModel();
        jLabel_setngayThang.setText("");
        tableModel.setRowCount(0);
        ArrayList<HoaDonDienNuoc> listhd = DienNuocDAO.getImstance().selectAll();
        int i = 1, y = 1;
        boolean a = false;
        for (HoaDonDienNuoc hd : listhd) {
            if (hd.getDongTien() == true) {
                y++;
            }
            tableModel.addRow(new Object[]{i++, hd.getMaHoaDon(), hd.getMaPHong(), hd.getMaDay(), hd.getThang(), hd.getNam(), hd.getSoNuoc(),
                hd.getTienNuoc(), hd.getSoDien(), hd.getTienDien(), hd.getTongTien(), hd.getDongTien()});
        }
        ArrayList<Float> tt = DienNuocDAO.getImstance().select_TongTien();
        if (i == y) {
            a = true;
        }
        tableModel.addRow(new Object[]{"", "", "", "", "", "Tổng", tt.get(3), tt.get(0), tt.get(4), tt.get(1), tt.get(2), a});

    }

    public void bangHoaDon_Phong() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_HoaDon_Phong.getModel();
        jLabel_setngayThang_HD_Phong.setText("");
        tableModel.setRowCount(0);
        ArrayList<HoaDonPhong> listhd = HoaDonPhongDAO.getInstance().selectAll();
        int i = 1, y = 1;
        boolean a = false;
        for (HoaDonPhong hd : listhd) {
            if (hd.getDongTien() == true) {
                y++;
            }
            tableModel.addRow(new Object[]{i++, hd.getMaHoaDon(), hd.getMaSV(), hd.getThang(), hd.getNam(), "500000", hd.getDongTien()});
        }
        if (i == y) {
            a = true;
        }
        tableModel.addRow(new Object[]{i++, "", "", "", "Tổng tiền", 500000 * (i - 2), a});

    }

    public void bangPhieuDangKy() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable_phieuDangKy.getModel();
        tableModel.setRowCount(0);
        ArrayList<PhieuDangKy> listpdk = PhieuDangKyDAO.getInstance().selectAll();
        int i = 1;
        for (PhieuDangKy pdk : listpdk) {
            tableModel.addRow(new Object[]{i++, pdk.getMaPhieu(), pdk.getMaSV(), pdk.getHoTenSV(), pdk.getNgay(), pdk.getPhanHoi(), pdk.getXuLy()});
        }
    }

    public static void main(String[] args) {
        Admin admin = new Admin("124", "421", "ofja madao qweq");
        new view.View_MainPage(admin);

    }
}
