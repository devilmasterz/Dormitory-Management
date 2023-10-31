/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.JDBCUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import view.View_MainPage;

/**
 *
 * @author ACER
 */
public class Control_admin_PDK implements ActionListener {

    View_MainPage vm;
    int select_index;

    public Control_admin_PDK(View_MainPage vm) {
        this.vm = vm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Xem")) {
            select_index = vm.jTable_phieuDangKy.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_phieuDangKy.getModel();

            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dữ liệu để xem", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                vm.setPhieuDK(select_index);
                vm.jPanel11.setVisible(true);
                vm.jScrollPane8.setVisible(false);
                vm.jScrollPane9.setVisible(false);
                vm.jButton_phanHoi_PDK1.setVisible(false);
            }
        }
        if (src.equals("Đóng")) {
            vm.jPanel11.setVisible(false);
            vm.jScrollPane8.setVisible(true);
            vm.jScrollPane9.setVisible(true);
            vm.jButton_phanHoi_PDK1.setVisible(true);

        }
        if (src.equals("Phản hồi")) {
            select_index = vm.jTable_phieuDangKy.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_phieuDangKy.getModel();

            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dữ liệu để phản hồi", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String string_phanHoi = vm.jTextPane1.getText();

                try {
                    Connection con = JDBCUtil.getConnection();
                    String sql = "UPDATE PhieuDangKy "
                            + " SET "
                            + " phanHoi=?"
                            + " WHERE maPhieu=?";
                    PreparedStatement pst = con.prepareStatement(sql);

                    pst.setString(1, string_phanHoi);
                    pst.setString(2, (tableModel.getValueAt(select_index, 1) + ""));
                    pst.executeUpdate();
                    JDBCUtil.closeConnection(con);
                } catch (SQLException e1) {
                }
                JOptionPane.showMessageDialog(vm, "Phản hồi đã cập nhật", "Success", JOptionPane.INFORMATION_MESSAGE);
                vm.jTextPane1.setText("");
                vm.bangPhieuDangKy();

            }

        }
        if (src.equals("Tìm  Kiếm")) {
            String key = vm.jTextField_timkiem_PDK.getText();
            TableModel tableModel = (TableModel) vm.jTable_phieuDangKy.getModel();

            TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>((tableModel));

            vm.jTable_phieuDangKy.setRowSorter(tableRowSorter);
            if (key.equals("")) {
                tableRowSorter.setRowFilter(null);
            } else {
                try {
                    tableRowSorter.setRowFilter(RowFilter.regexFilter(key));
                } catch (PatternSyntaxException pse) {
                }
            }
        }
        if (src.equals("Cập nhật")) {
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_phieuDangKy.getModel();
            Boolean check;

            for (int i = 0; i < tableModel.getRowCount(); i++) {

                check = Boolean.valueOf(tableModel.getValueAt(i, 6).toString());
                int maHD = (int) tableModel.getValueAt(i, 1);
                try {
                    Connection con = JDBCUtil.getConnection();
                    PreparedStatement pst;
                    pst = con.prepareStatement("update PhieuDangKy set  xuLy = ?  where maPhieu = ? ");
                    pst.setBoolean(1, check);
                    pst.setInt(2, maHD);
                    pst.executeUpdate();
                    JDBCUtil.closeConnection(con);
                } catch (SQLException ex) {
                    Logger.getLogger(Control_admin_DienNuoc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (src.equals("Xóa")) {
            select_index = vm.jTable_phieuDangKy.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_phieuDangKy.getModel();
            int maPhieu = (int) tableModel.getValueAt(select_index, 1);
            try {
                Connection con = JDBCUtil.getConnection();
                PreparedStatement pst;
                pst = con.prepareStatement("delete from PhieuDangKy where maPhieu = ? ");
                pst.setInt(1, maPhieu);
                pst.executeUpdate();
                JDBCUtil.closeConnection(con);
            } catch (SQLException ex) {
                Logger.getLogger(Control_admin_DienNuoc.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(vm, "Đã xóa", "Success", JOptionPane.INFORMATION_MESSAGE);
            vm.bangPhieuDangKy();
        }
    }

}
