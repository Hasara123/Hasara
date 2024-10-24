/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIPackage;

import ClassPackage.EmployeeClass;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author GD Hiruna
 */
public class EmployeeDashboard extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeDashboard
     */
        
    private String UserType = "";
    
    public EmployeeDashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Employee Management System - Colombo institute of Studies");
    }
    
    public EmployeeDashboard(String UserType) {
        this.UserType = UserType;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Employee Management System - Colombo institute of Studies");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logout = new javax.swing.JButton();
        roleManage = new javax.swing.JButton();
        addEmp = new javax.swing.JButton();
        searchEmp = new javax.swing.JButton();
        exit3 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logout.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Logout.setText("LOGOUT");
        Logout.setToolTipText("");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, 110, 40));

        roleManage.setBackground(new java.awt.Color(255, 255, 255));
        roleManage.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        roleManage.setText("ADD DEPARTMENT / DESIGNATION");
        roleManage.setToolTipText("");
        roleManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleManageActionPerformed(evt);
            }
        });
        getContentPane().add(roleManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 380, 60));

        addEmp.setBackground(new java.awt.Color(255, 255, 255));
        addEmp.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        addEmp.setText("ADD EMPLOYEE");
        addEmp.setToolTipText("");
        addEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpActionPerformed(evt);
            }
        });
        getContentPane().add(addEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 380, 60));

        searchEmp.setBackground(new java.awt.Color(255, 255, 255));
        searchEmp.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        searchEmp.setText("SEARCH EMPLOYEE");
        searchEmp.setToolTipText("");
        searchEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmpActionPerformed(evt);
            }
        });
        getContentPane().add(searchEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 380, 60));

        exit3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        exit3.setText("EXIT");
        exit3.setToolTipText("");
        exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit3ActionPerformed(evt);
            }
        });
        getContentPane().add(exit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 710, 110, 40));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/main.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void addEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpActionPerformed
        if (UserType.equals("HR Manager")) {
            dispose();
            EmployeeAdd frame = new EmployeeAdd(UserType);
            frame.show();
        } else {
            // Display a message or take appropriate action for non-HR Manager users
            JOptionPane.showMessageDialog(this, "Access denied. Only HR Managers can add employees.");
        }
    }//GEN-LAST:event_addEmpActionPerformed

    private void roleManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleManageActionPerformed
        if (UserType.equals("HR Manager")) {
            dispose();
            EmployeeRole frame = new EmployeeRole(UserType);
            frame.show();
        } else {
            // Display a message or take appropriate action for non-HR Manager users
            JOptionPane.showMessageDialog(this, "Access denied. Only HR Managers can add department / designation.");
        }
    }//GEN-LAST:event_roleManageActionPerformed

    private void searchEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmpActionPerformed
        dispose();
        EmployeeSearch frame = new EmployeeSearch(UserType);
        frame.show();
    }//GEN-LAST:event_searchEmpActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Login login = new Login ();
        if(JOptionPane.showConfirmDialog(null, "Confirm if you want to logout",
                "Exit", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            login.show();
            this.dispose();
        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit3ActionPerformed
        JFrame objexit = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(null, "Confirm if you want to exit",
            "Exit", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_exit3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton addEmp;
    private javax.swing.JLabel bg;
    private javax.swing.JButton exit3;
    private javax.swing.JButton roleManage;
    private javax.swing.JButton searchEmp;
    // End of variables declaration//GEN-END:variables

}