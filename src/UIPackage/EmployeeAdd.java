/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIPackage;

import ClassPackage.EmployeeClass;
import ClassPackage.DepartmentClass;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author GD Hiruna
 */
public class EmployeeAdd extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeAdd
     */
    
    private String UserType = "";
    
    public EmployeeAdd() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Employee Management System - Colombo institute of Studies");
        
        DepartmentClass obj = new DepartmentClass();
        String[][] departmentData = obj.viewAllDeps();
        // Extract only department names from the two-dimensional array
        String[] departmentNames = new String[departmentData.length];
        for (int i = 0; i < departmentData.length; i++) {
            departmentNames[i] = departmentData[i][0] + " - " + departmentData[i][1];
        }
        // Set the model of the JComboBox
        role.setModel(new javax.swing.DefaultComboBoxModel<>(departmentNames));
        
    }
    
     public EmployeeAdd(String UserType) {
        this.UserType = UserType;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Employee Management System - Colombo institute of Studies");
        
        DepartmentClass obj = new DepartmentClass();
        String[][] departmentData = obj.viewAllDeps();
        // Extract only department names from the two-dimensional array
        String[] departmentNames = new String[departmentData.length];
        for (int i = 0; i < departmentData.length; i++) {
            departmentNames[i] = departmentData[i][0] + " - " + departmentData[i][1];
        }
        // Set the model of the JComboBox
        role.setModel(new javax.swing.DefaultComboBoxModel<>(departmentNames));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        epfno = new javax.swing.JTextField();
        txtEPF = new javax.swing.JLabel();
        txtRole = new javax.swing.JLabel();
        role = new javax.swing.JComboBox();
        age = new javax.swing.JTextField();
        txtmain2 = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        txtAge = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        exit3 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        epfno.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        epfno.setToolTipText("");
        epfno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epfnoActionPerformed(evt);
            }
        });
        getContentPane().add(epfno, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 370, 50));

        txtEPF.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtEPF.setForeground(new java.awt.Color(255, 255, 255));
        txtEPF.setText("EPF NUMBER");
        getContentPane().add(txtEPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        txtRole.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtRole.setForeground(new java.awt.Color(255, 255, 255));
        txtRole.setText("DEPARTMENT AND DESIGNATION");
        getContentPane().add(txtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, -1, -1));

        role.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        getContentPane().add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 370, 50));

        age.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        age.setToolTipText("");
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 370, 50));

        txtmain2.setFont(new java.awt.Font("Arial Black", 0, 37)); // NOI18N
        txtmain2.setForeground(new java.awt.Color(255, 255, 255));
        txtmain2.setText("ADD EMPLOYEE");
        txtmain2.setToolTipText("");
        getContentPane().add(txtmain2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        txtName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setText("NAME");
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        name.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        name.setToolTipText("");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 370, 50));

        txtAge.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(255, 255, 255));
        txtAge.setText("AGE");
        getContentPane().add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, -1));

        txtAddress.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setText("ADDRESS");
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, -1, -1));

        address.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        address.setToolTipText("");
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 370, 50));

        submit.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        submit.setText("SUBMIT");
        submit.setToolTipText("");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, 140, 40));

        back.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        back.setText("BACK");
        back.setToolTipText("");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, 110, 40));

        exit3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        exit3.setText("EXIT");
        exit3.setToolTipText("");
        exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit3ActionPerformed(evt);
            }
        });
        getContentPane().add(exit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 710, 110, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/main.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        
    }//GEN-LAST:event_nameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
       
    }//GEN-LAST:event_addressActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String Name = name.getText();
        String Age = age.getText();
        String Address = address.getText();
        String EPF = epfno.getText();
        String selectedRole = role.getSelectedItem().toString();
        
        String[] parts = selectedRole.split(" - ");
        String DepartmentName = parts[0];
        String Designation = parts[1];
        
        EmployeeClass employee = new EmployeeClass(Name, Integer.parseInt(Age), Address, EPF, DepartmentName, Designation);

        if (Name.equals("") || Age.equals("") || Address.equals("") || EPF.equals("") || selectedRole.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out. Please provide the required information.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(employee.checkEPFAvailability(EPF) == true) {
            JOptionPane.showMessageDialog(null, "Employee already exists. Duplicate found.", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            boolean addEmployee = employee.addEmployee();
            if (addEmployee) {
                JOptionPane.showMessageDialog(null, "Employee has been successfully added to the system.");;
                name.setText("");
                age.setText("");
                address.setText("");
                epfno.setText("");
                role.setSelectedIndex(0);
            } else {
                System.out.println("Something went wrong, Please try again");
            }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        EmployeeDashboard login = new EmployeeDashboard(UserType);
        login.show();
    }//GEN-LAST:event_backActionPerformed

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed

    }//GEN-LAST:event_roleActionPerformed

    private void epfnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epfnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epfnoActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField epfno;
    private javax.swing.JButton exit3;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox role;
    private javax.swing.JButton submit;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtAge;
    private javax.swing.JLabel txtEPF;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtRole;
    private javax.swing.JLabel txtmain2;
    // End of variables declaration//GEN-END:variables
}