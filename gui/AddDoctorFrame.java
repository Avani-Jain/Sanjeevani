//ismein hum add karenge woh doctors jo employee mein toh hain lekin users mein nahi hain.

package Sanjeevani.gui;

import Sanjeevani.dao.DoctorDao;
import Sanjeevani.dao.EmpDao;
import Sanjeevani.dao.UserDao;
import Sanjeevani.pojo.DoctorPojo;
import Sanjeevani.pojo.UserPojo;
import Sanjeevani.utility.PasswordEncryption;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class AddDoctorFrame extends javax.swing.JFrame {
    
    String msg;
    String selempid;
    private String docid, docname,mobNo, qualification, specialist, pwd1, pwd2, emailid, loginId, password, gender;
    double mNo;
    
    Map<String, String> unRegisteredDoctorsList;
    public AddDoctorFrame() {
        System.out.println("calling again");
        initComponents();
        setLocationRelativeTo(null);
        unRegisteredDoctorsList = new HashMap<>();
        loadDoctorDetails();
//        if(unRegisteredDoctorsList.size()==0){
//            JOptionPane.showMessageDialog(null,"All doctors registered!");
//          ManageDoctorFrame manageDoc=new ManageDoctorFrame(); 
//          manageDoc.setVisible(true);
//          this.dispose();
//            System.out.println("Disposed");
//        }
//        else{
//            System.out.println("calling generate new id");
            generateNewDoctorId();
//        }
        
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDocId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnLogout = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
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
        txtEmailId = new javax.swing.JTextField();
        txtDocName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        txtMobNo = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        txtSpecialist = new javax.swing.JTextField();
        jcEmpId = new javax.swing.JComboBox<>();
        jcbGender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 243, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDocId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDocId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDocId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDocId.setEnabled(false);
        txtDocId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtDocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 200, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Email ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 90, 30));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 100, 30));

        btnRegister.setBackground(new java.awt.Color(204, 204, 204));
        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegister.setBorderPainted(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 200, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SANJEEVANI APPLICATION");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 570, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevani/utility/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -110, 1050, 400));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 650, 1040, -1));

        btnLogout.setBackground(new java.awt.Color(204, 204, 204));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.setBorderPainted(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, 100, 30));

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 290, 2, 356));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 80, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText(" ADD DOCTOR");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Doctor Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 120, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Login ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 90, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 90, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Retype Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 140, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Doctor ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 90, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Contact No.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 110, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Qualification");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 110, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Specialist");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 90, 30));

        txtEmailId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 200, 30));

        txtDocName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDocName.setEnabled(false);
        jPanel1.add(txtDocName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 210, 30));

        txtLoginId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtLoginId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 210, 30));

        txtMobNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMobNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMobNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 200, 30));

        txtQualification.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualificationActionPerformed(evt);
            }
        });
        jPanel1.add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 200, 30));

        txtSpecialist.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSpecialist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialistActionPerformed(evt);
            }
        });
        jPanel1.add(txtSpecialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 200, 30));

        jcEmpId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 210, 30));

        jcbGender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jcbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jcbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGenderActionPerformed(evt);
            }
        });
        jPanel1.add(jcbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 210, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevani/utility/icons/register Doctor.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Employee ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 120, 30));
        jPanel1.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 210, 30));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 462, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        JFrame op = new ManageDoctorFrame();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(!validateInputs() || !matchPassword() || !checkContactNumber()){
            JOptionPane.showMessageDialog(null, msg);
            return;
        }
        
        try{
            DoctorPojo doc = new DoctorPojo();
            doc.setDocId(docid);
            doc.setDocName(docname);
            doc.setContactNo(mobNo);
            doc.setEmailId(emailid);
            doc.setGender(jcbGender.getSelectedItem().toString());
            doc.setQualification(qualification);
            doc.setSpecialist(specialist);
            
            boolean docAns = DoctorDao.addDoctor(doc);
            
            UserPojo user = new UserPojo();
            user.setLoginId(loginId);
            user.setUserName(docname);
            user.setUserType("Doctor");
            password = PasswordEncryption.getEncryptedPassword(pwd1);
            user.setPassword(password);
            boolean userAns = UserDao.addUser(user);
            
            if(!docAns || !userAns){
                JOptionPane.showMessageDialog(null, "Record could not be inserted");
                return;
            }
            JOptionPane.showMessageDialog(null, "Record inserted successfully!");
            clearAll();
            return;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in Database");
            ex.printStackTrace();
        }

        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        JFrame op = new LoginFrame();
        op.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void txtMobNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobNoActionPerformed

    private void txtQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualificationActionPerformed

    private void txtSpecialistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialistActionPerformed

    private void jcbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbGenderActionPerformed

    private void txtDocIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocIdActionPerformed

    private void txtLoginIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginIdActionPerformed

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
        if(jcEmpId.getSelectedIndex()==-1){
//            System.out.println("in jc emp");
//            ManageDoctorFrame op = new ManageDoctorFrame();
//            op.setVisible(true);
//            this.dispose();
            return;
        }
        selempid = jcEmpId.getSelectedItem().toString();
        docname = unRegisteredDoctorsList.get(selempid);
        txtDocName.setText(docname);
    }//GEN-LAST:event_jcEmpIdActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(AddDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcEmpId;
    private javax.swing.JComboBox<String> jcbGender;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JTextField txtMobNo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtSpecialist;
    // End of variables declaration//GEN-END:variables

    private void loadDoctorDetails() {
        try{
//            unRegisteredDoctorsList = EmpDao.getUnregisteredDoctors();
//            if(unRegisteredDoctorsList.isEmpty()){
//                disposeFrame();
//            }
//            Set<String> empId = unRegisteredDoctorsList.keySet();
//            for(String id: empId){
//                jcEmpId.addItem(id);
//            }
//            generateNewDoctorId();
//            }
//        catch(SQLException ex){
//            JOptionPane.showMessageDialog(null, "Error in Database!" + ex);
//            ex.printStackTrace();
//        }

            unRegisteredDoctorsList=EmpDao.getUnregisteredDoctors();
            
            
            Set <String> empIdSet=unRegisteredDoctorsList.keySet();
            for(String empId:empIdSet){
                jcEmpId.addItem(empId);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }
    }

    private void generateNewDoctorId() {
        try{
        docid = DoctorDao.getNewDocId();
        txtDocId.setText(docid);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in Database!" + ex);
            ex.printStackTrace();
        }
    }

    private boolean validateInputs() {
        emailid = this.txtEmailId.getText().trim();
        loginId = this.txtLoginId.getText().trim();
        mobNo = txtMobNo.getText().trim();
        char [] password = txtPassword.getPassword() ;
        char [] repassword = txtRePassword.getPassword();
        qualification = this.txtQualification.getText().trim();
        specialist = this.txtSpecialist.getText().trim();
        
        if(emailid == null || password.length == 0 || repassword.length == 0 || loginId==null || qualification ==null|| specialist.isEmpty()){
            msg = "Please input all values";
            return false;
        }
        pwd1= new String(password);
        pwd2 = new String(repassword);
        
        return true;
    }
//    private String validateInputs() {
//        emailid = this.txtEmailId.getText().trim();
//        loginId = this.txtLoginId.getText().trim();
//        mobNo = txtMobNo.getText().trim();
//        char [] password = txtPassword.getPassword() ;
//        char [] repassword = txtRePassword.getPassword();
//        qualification = this.txtQualification.getText().trim();
//        specialist = this.txtSpecialist.getText().trim();
//        
//        if(emailid == null || password.length == 0 || repassword.length == 0 || loginId==null || qualification ==null|| specialist.isEmpty()){
//            return "Please input all values";
//        }
//        pwd1= new String(password);
//        pwd2 = new String(password);
//        return "All values input!";
//    }
    
    private boolean matchPassword(){
       if(pwd1.length()<3 ||pwd2.length()<3){
           msg= "Length of password should be greater than 3 words";
           return false;
       }
       
       if(!pwd1.equals(pwd2)){
           msg = "Passwords do not match!";
           return false;
       }
       return true;
    }
    
    
    
    
    private boolean checkContactNumber(){
        
        try{
            mNo = Double.parseDouble(txtMobNo.getText().trim());
            int digits = (int)(Math.log10(mNo)+1);
            System.out.println(digits);
            if(digits !=10){
                msg = "Please enter a valid phone number";
                return false;
            }
            else{
                return true;
            }
        }
        catch(NumberFormatException ex){
            msg ="Please enter a valid phone number";
            ex.printStackTrace();
            return false;
            
        }
    }
    //to check the validity of contact number. the above method is for the same purpose. 
        private boolean isContactNumberValid(){
            char []mob = mobNo.toCharArray();
            for(char i: mob){
              if(Character.isDigit(i) ==false){
                  return false;
              }  
            }
            if(mobNo.length() != 10){
                return false;
            }
//            for(int i=0; i<mobNo.length(); i++){
//                char ch = mobNo.charAt(i);
//                if(Character.isDigit(ch) ==false){
//                    return false;
//                }
//            }
            return true;
        }

    private void clearAll() {
        txtDocName.setText("");
        txtDocId.setText("");
        txtMobNo.setText("");
        txtLoginId.setText("");
        txtPassword.setText("");
        txtRePassword.setText("");
        txtQualification.setText("");
        txtSpecialist.setText("");
        txtEmailId.setText("");
        unRegisteredDoctorsList.remove(selempid);
        jcEmpId.removeItem(selempid);
        if(unRegisteredDoctorsList.isEmpty()){
          JOptionPane.showMessageDialog(null,"All doctors registered!");
          ManageDoctorFrame manageDoc=new ManageDoctorFrame(); 
          manageDoc.setVisible(true);
          this.dispose();
            
        }
        
        generateNewDoctorId();
        
    }
}
