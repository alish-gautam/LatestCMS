/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CMS;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Acer
 */
public class Tutors extends javax.swing.JFrame {

    /**
     * Creates new form Tutors
     */
    private static String userMode;
    public Tutors(String userMode) {
        initComponents();
        this.userMode=userMode;
        this.setTitle("Tutors");
        this.setLocationRelativeTo(null);
        tutors.doClick();
        populateTable();
        createReport();
    }
    private void createReport(){
        createReport.setVisible(false);
        if(userMode.equals("Teacher")){
            createReport.setVisible(true);
        }
    }
    private void populateTable(){
        Conn c=new Conn();
        try{
            String query="Select * from tutors";
            ResultSet rs=c.s.executeQuery(query);
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while(rs.next()){
                Object[] row={
                    rs.getInt("id"),
                    rs.getString("tutorName"),
                    rs.getString("email"),
                    rs.getLong("phone")
                };
                model.addRow(row);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    ImageIcon img1=new ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\LatestCMS\\src\\icons\\teaching.png");
    @Override
    public void setIconImage(Image image) {
        super.setIconImage(img1.getImage()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        titleImage = new javax.swing.JLabel();
        appName = new javax.swing.JLabel();
        courses = new javax.swing.JButton();
        tutors = new javax.swing.JButton();
        students = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        module = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tutorsSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        editTutor = new javax.swing.JButton();
        deleteTutor = new javax.swing.JButton();
        createReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1069, 702));

        sidebar.setBackground(new java.awt.Color(153, 153, 153));

        home.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        home.setText(" Home");
        home.setFocusable(false);
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        home.setIconTextGap(3);
        home.setName("home"); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnhomeClick(evt);
            }
        });

        titleImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/teachingResized.png"))); // NOI18N

        appName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        appName.setForeground(new java.awt.Color(255, 255, 255));
        appName.setText("Course Management System");

        courses.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/courses.png"))); // NOI18N
        courses.setText("Courses");
        courses.setFocusable(false);
        courses.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        courses.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        courses.setIconTextGap(5);
        courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesActionPerformed(evt);
            }
        });

        tutors.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tutors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/teacher.png"))); // NOI18N
        tutors.setText("Tutors");
        tutors.setFocusable(false);
        tutors.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tutors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorsActionPerformed(evt);
            }
        });

        students.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        students.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/student.png"))); // NOI18N
        students.setText("Students");
        students.setFocusable(false);
        students.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.setFocusable(false);
        logout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        module.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        module.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purpose.png"))); // NOI18N
        module.setText("Modules");
        module.setFocusable(false);
        module.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        module.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleImage, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appName)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(students, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tutors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(module, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(titleImage, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(module, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tutors, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(students, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Email", "Course"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(false);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 26)); // NOI18N
        jLabel1.setText("Tutors");

        tutorsSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorsSearchActionPerformed(evt);
            }
        });
        tutorsSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tutorsSearchKeyReleased(evt);
            }
        });

        jLabel2.setText("Search:");

        editTutor.setBackground(new java.awt.Color(73, 79, 85));
        editTutor.setForeground(new java.awt.Color(255, 255, 255));
        editTutor.setText("Edit Tutor");
        editTutor.setFocusable(false);
        editTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTutorActionPerformed(evt);
            }
        });

        deleteTutor.setBackground(new java.awt.Color(73, 79, 85));
        deleteTutor.setForeground(new java.awt.Color(255, 255, 255));
        deleteTutor.setText("Delete Tutor");
        deleteTutor.setFocusable(false);
        deleteTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTutorActionPerformed(evt);
            }
        });

        createReport.setBackground(new java.awt.Color(102, 255, 102));
        createReport.setForeground(new java.awt.Color(102, 102, 102));
        createReport.setText("Create a Student Report");
        createReport.setFocusable(false);
        createReport.setVerifyInputWhenFocusTarget(false);
        createReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(tutorsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(editTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(deleteTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(createReport)))
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tutorsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(editTutor)
                    .addComponent(createReport)
                    .addComponent(deleteTutor))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnhomeClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnhomeClick
        // TODO add your handling code here:
        this.dispose();
        new Home(userMode).setVisible(true);
        home.setBackground(new Color(255, 104, 104));
        home.setForeground(Color.white);
    }//GEN-LAST:event_OnhomeClick

    private void coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Courses(userMode).setVisible(true);
        courses.setBackground(new Color(255, 104, 104));
        courses.setForeground(Color.white);
    }//GEN-LAST:event_coursesActionPerformed

    private void tutorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorsActionPerformed
        // TODO add your handling code here:
        tutors.setBackground(new Color(255, 104, 104));
        tutors.setForeground(Color.white);
    }//GEN-LAST:event_tutorsActionPerformed

    private void studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Students(userMode).setVisible(true);
        students.setBackground(new Color(255, 104, 104));
        students.setForeground(Color.white);
    }//GEN-LAST:event_studentsActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        tutors.setBackground(new Color(255,255,255));
        tutors.setForeground(new Color(0,0,0));
        logout.setBackground(new Color(255, 104, 104));
        logout.setForeground(Color.white);
        Logout log = new Logout(this,userMode);
        log.setVisible(true);
        log.setBackground(new Color(255, 104, 104));
        log.setForeground(Color.white);
    }//GEN-LAST:event_logoutActionPerformed

    private void tutorsSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorsSearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tutorsSearchActionPerformed

    private void editTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTutorActionPerformed
        // TODO add your handling code here:
       
        if(userMode.equals("Admin")){
            int selectedRow=jTable1.getSelectedRow();
            if(selectedRow==-1)
            {
                JOptionPane.showMessageDialog(this, "Please choose a tutor to edit");
            }
            else{
                EditTutor editTutor=new EditTutor(jTable1);
                editTutor.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                editTutor.setVisible(true);
            
                editTutor.addWindowListener(new java.awt.event.WindowAdapter(){
                public void windowClosed(java.awt.event.WindowEvent evt) {
                // After the AddCourse frame is closed, update the table
                populateTable();
            }
            });
            }

        }
        else{
            JOptionPane.showMessageDialog(this, "404 ACCESS DENIED!!", "ACCESS FAILED", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_editTutorActionPerformed

    private void deleteTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTutorActionPerformed
        // TODO add your handling code here:
        if(userMode.equals("Admin")){
            int selectedRow=jTable1.getSelectedRow();
            if(selectedRow==-1){
                JOptionPane.showMessageDialog(this, "Select a tutor to delete");
            }
            else{
                int tutorId=(int)jTable1.getValueAt(selectedRow,0);
                String tutorName=(String)jTable1.getValueAt(selectedRow, 1);
                int confirmDialogResult=JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this tutor?"
                        ,"Confirm Deletion!",JOptionPane.YES_NO_OPTION);
                if(confirmDialogResult==JOptionPane.YES_OPTION){
                    try{
                        Conn c=new Conn();
                        String signupQuery="delete from signup where username='"+tutorName+"'";
                        c.s.executeUpdate(signupQuery);
                        String query="delete from tutors where id='"+tutorId+"'";
                        c.s.executeUpdate(query);
                        populateTable();
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
            
        }
        else{
             JOptionPane.showMessageDialog(this, "404 ACCESS DENIED!!", "ACCESS FAILED", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteTutorActionPerformed

    private void tutorsSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tutorsSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(model);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(tutorsSearch.getText()));
    }//GEN-LAST:event_tutorsSearchKeyReleased

    private void createReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createReportActionPerformed
        // TODO add your handling code here:
        if(userMode.equals("Teacher")){
            CreateReport report=new CreateReport();
            report.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            report.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "404 ACCESS DENIED!!", "ACCESS FAILED", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createReportActionPerformed

    private void moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Modules(userMode).setVisible(true);
        module.setBackground(new Color(255, 104, 104));
        module.setForeground(Color.white);
    }//GEN-LAST:event_moduleActionPerformed

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
            java.util.logging.Logger.getLogger(Tutors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tutors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tutors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tutors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tutors(userMode).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.JButton courses;
    private javax.swing.JButton createReport;
    private javax.swing.JButton deleteTutor;
    private javax.swing.JButton editTutor;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JButton module;
    private javax.swing.JPanel sidebar;
    private javax.swing.JButton students;
    private javax.swing.JLabel titleImage;
    private javax.swing.JButton tutors;
    private javax.swing.JTextField tutorsSearch;
    // End of variables declaration//GEN-END:variables
}
