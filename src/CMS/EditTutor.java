/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CMS;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.*;
import java.util.regex.Pattern;

/**
 *
 * @author Acer
 */
public class EditTutor extends javax.swing.JFrame {

    /**
     * Creates new form EditTutor
     */
    private static JTable jTable1;
    public EditTutor(JTable jTable1) {
        initComponents();
        this.jTable1=jTable1;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tutorField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        editTutor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Tutor Name:");

        tutorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorFieldActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Email:");

        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Phone:");

        editTutor.setBackground(new java.awt.Color(102, 102, 102));
        editTutor.setForeground(new java.awt.Color(255, 255, 255));
        editTutor.setText("Edit Tutor");
        editTutor.setFocusable(false);
        editTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tutorField, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(phoneField)
                    .addComponent(emailField))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tutorField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(51, 51, 51)
                .addComponent(editTutor)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tutorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tutorFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void editTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTutorActionPerformed
        // TODO add your handling code here:
        String tutorName=tutorField.getText();
        String email=emailField.getText();
        String phoneNum=phoneField.getText();
        String emailRegex="[a-zA-z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}";
        Pattern emailPattern=Pattern.compile(emailRegex);
            if(tutorName.equals("")||emailField.equals("")||phoneField.equals("")){
                JOptionPane.showMessageDialog(this, "Invalid Input");
                return;
            }
            else if(!emailPattern.matcher(email).matches()){
                JOptionPane.showMessageDialog(this, "Invalid Email");
                return;
            }
            else{
                Conn c=new Conn();
                int selectedRow=jTable1.getSelectedRow();
                if(selectedRow==-1){
                    JOptionPane.showMessageDialog(this, "Please select a tutor");
                    return;
                }
                else{
                    try{
                    int teacherId=(int)jTable1.getValueAt(selectedRow, 0);
                    String teacherName=(String)jTable1.getValueAt(selectedRow, 1);
                    int confirmDialogResult=JOptionPane.showConfirmDialog(this,"Are you sure you want to edit this tutor?"
                        + "","Confirm tutor Edit!",JOptionPane.YES_NO_OPTION);
                    if(confirmDialogResult==JOptionPane.YES_OPTION){
                        String signupQuery="update signup set userName=?,email=?,phonenumber=? where username=?";
                        String query="Update tutors set tutorName=?,email=?,phone=? where id=?";
                        //for signup table
                        PreparedStatement signupstmt=c.getPreparedStatement(signupQuery);
                        signupstmt.setString(1,tutorName);
                        signupstmt.setString(2,email);
                        signupstmt.setString(3,phoneNum);
                        signupstmt.setString(4, teacherName);
                        signupstmt.executeUpdate();
//                        for tutors table
                        PreparedStatement statement=c.getPreparedStatement(query);
                        statement.setString(1, tutorName);
                        statement.setString(2,email);
                        statement.setString(3,phoneNum);
                        statement.setInt(4,teacherId);
                        int rowsAffected=statement.executeUpdate();
                        
                        if(rowsAffected>0){
                                JOptionPane.showMessageDialog(this,"Update Successful."
                                        + "Rows affected:'"+rowsAffected+"'","Update Successful",JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "No rows Updated");
                            }
                        }
                }
                    catch(Exception e){
                        e.printStackTrace();
        }
               this.dispose();
            }
        }
        
        
    }//GEN-LAST:event_editTutorActionPerformed

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
            java.util.logging.Logger.getLogger(EditTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTutor(jTable1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editTutor;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField tutorField;
    // End of variables declaration//GEN-END:variables
}
