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
import model.User;
import view.View_MainPage;
import view.View_doiPasswd;

/**
 *
 * @author ACER
 */
public class Control_MainPage implements ActionListener{
    private View_MainPage vm;

    public Control_MainPage(View_MainPage vm) {
        this.vm = vm;
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
       String src = e.getActionCommand();
       
      
       
    }
    
    
    
    
}
