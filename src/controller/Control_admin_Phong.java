/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DienNuocDAO;
import DAO.HopDongDAO;
import DAO.PhongDAO;
import DAO.SinhVienDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Phong;
import view.View_MainPage;

public class Control_admin_Phong implements ActionListener {

    private View_MainPage vm;
    int select_index;
    String day_cu;
    String phong_cu;

    public Control_admin_Phong(View_MainPage view_MainPage) {
        this.vm = view_MainPage;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        if (src.equals("Thêm Phòng")) {
            vm.jPanel_newPhong.setVisible(true);
            vm.jPanel4.setVisible(false);
        }
        if (src.equals("Hủy bỏ")) {
            vm.jPanel_newPhong.setVisible(false);
            vm.jPanel4.setVisible(true);
            vm.jTextField_day_newPhong.setText("");
            vm.jTextField_soSVToiDa_newPhong.setText("");
            vm.jTextField_maPhong_newPhong.setText("");
            vm.jTextField_tenPhong_newPhong.setText("");
            vm.bangPhong();
        }
        if (src.equals("Xác nhận")) {
            Phong phong = new Phong();
            phong.setMaPhong(vm.jTextField_maPhong_newPhong.getText());
            phong.setTenPhong(vm.jTextField_tenPhong_newPhong.getText());
            phong.setMaDay(vm.jTextField_day_newPhong.getText());
            if (phong.getMaDay().equals("") || phong.getMaPhong().equals("") || phong.getTenPhong().equals("")) {
                JOptionPane.showMessageDialog(vm, "Nhập thiếu thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    phong.setSoSV_toiDa(Integer.parseInt(vm.jTextField_soSVToiDa_newPhong.getText()));

                    phong.setSoSV(0);
                    phong.setThanhVienPhong(" ");
                    int kq = PhongDAO.getImstance().insert(phong);

                    if (kq != 0) {
                        JOptionPane.showMessageDialog(vm, "Đã thêm phòng", "Success", JOptionPane.INFORMATION_MESSAGE);
                        vm.jTextField_day_newPhong.setText("");
                        vm.jTextField_soSVToiDa_newPhong.setText("");
                        vm.jTextField_maPhong_newPhong.setText("");
                        vm.jTextField_tenPhong_newPhong.setText("");
                    } else {
                        JOptionPane.showMessageDialog(vm, "Phòng đã tồn tại", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(vm, "Nhập số người tối đa sai!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        if (src.equals("Trở lại")) {
            vm.bangPhong();
            vm.jPanel_suaPhong.setVisible(false);
            vm.jPanel4.setVisible(true);
        }
        if (src.equals("Cập Nhật")) {
            Phong phong = new Phong();

            phong.setMaPhong(vm.jTextField_maPhong_suaPhong.getText());
            phong.setTenPhong(vm.jTextField_tenPhong_suaPhong.getText());
            phong.setMaDay(vm.jTextField_day_suaPhong.getText());

            phong.setThanhVienPhong(vm.jTextArea_thanhVienPhong_suaPhong.getText());
            if (phong.getMaDay().equals("") || phong.getMaPhong().equals("") || phong.getTenPhong().equals("")) {
                JOptionPane.showMessageDialog(vm, "Nhập thiếu thông tin", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    phong.setSoSV_toiDa(Integer.parseInt(vm.jTextField_soSVToiDa_suaPhong.getText()));
                    phong.setSoSV(Integer.parseInt(vm.jLabel_soSV_suaPhong.getText()));

                    Phong p = new Phong();
                    p.setMaDay(day_cu);
                    p.setMaPhong(phong_cu);

                    //kiem tra trung 
                    Phong p_check = PhongDAO.getImstance().selectBy(phong.getMaPhong(), phong.getMaDay());

                    if (p_check == null) {// ko trung
                        PhongDAO.getImstance().insert(phong);// them phong moi
                        //update Sinh vien
                        SinhVienDAO.getImstance().update_SuaPhong(phong.getMaPhong(), phong.getMaDay(), phong_cu, day_cu);
                        //update HopDong
                        HopDongDAO.getImstance().update_suaPhong(phong.getMaPhong(), phong.getMaDay(), phong_cu, day_cu);
                        //update HoaDon Dien Nuoc
                        DienNuocDAO.getImstance().update_suaPhong(phong.getMaPhong(), phong.getMaDay(), phong_cu, day_cu);
                        //xoa Phong cu
                        PhongDAO.getImstance().delete(p);//xoa Phong cu

                        JOptionPane.showMessageDialog(vm, "Đã sửa thông tin Phòng", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(vm, "Thông tin  Phòng bị trùng", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(vm, "Nhập sai kiểu dữ liệu", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (src.equals("Sửa")) {
            select_index = vm.jTable_phong.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_phong.getModel();

            day_cu = tableModel.getValueAt(select_index, 3) + "";
            phong_cu = tableModel.getValueAt(select_index, 1) + "";
            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dòng dữ liệu để sửa", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                vm.setPhong(select_index);
                vm.jPanel_suaPhong.setVisible(true);
                vm.jPanel4.setVisible(false);
            }

        }
        if (src.equals("Tìm kiếm")) {
            String key = vm.jTextField_timkiem_Phong.getText();
            TableModel tableModel = (TableModel) vm.jTable_phong.getModel();

            TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>((tableModel));

            vm.jTable_phong.setRowSorter(tableRowSorter);
            if (key.equals("")) {
                tableRowSorter.setRowFilter(null);
            } else {
                try {
                    tableRowSorter.setRowFilter(RowFilter.regexFilter(key));
                } catch (PatternSyntaxException pse) {
                }
            }

        }
        if (src.equals("Xoá")) {
            select_index = vm.jTable_phong.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) vm.jTable_phong.getModel();
            if (select_index == -1) {
                JOptionPane.showMessageDialog(vm, "Chọn dòng dữ liệu để xoá", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int z = JOptionPane.showConfirmDialog(vm, "Bạn muốn xóa dữ liệu này?", "Comfirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (z == JOptionPane.YES_OPTION) {
                    Phong phong = new Phong();
                    phong.setMaPhong((tableModel.getValueAt(select_index, 1) + ""));
                    phong.setMaDay(tableModel.getValueAt(select_index, 3) + "");

                    phong.setTenPhong("");
                    phong.setSoSV(0);
                    phong.setSoSV_toiDa(0);
                    phong.setThanhVienPhong("");

                    int kq = PhongDAO.getImstance().delete(phong);
                    vm.bangPhong();
                    if (kq != 0) {
                        JOptionPane.showMessageDialog(vm, "Đã xóa thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(vm, "Phòng đang được sử dụng", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }
        }
    }
}
