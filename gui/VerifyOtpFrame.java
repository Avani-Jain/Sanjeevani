/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevani.gui;



import Sanjeevani.dao.AppointmentDao;
import Sanjeevani.dao.PatientDao;
import Sanjeevani.pojo.AppointmentPojo;
import Sanjeevani.pojo.PatientPojo;
import Sanjeevani.utility.OtpSender;
import Sanjeevani.utility.SenderInterface;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class VerifyOtpFrame extends javax.swing.JFrame {

    
    PatientPojo patient;
    double mobNo;
    String docname;
    char aoru;
    JFrame fr;
    
    public VerifyOtpFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public VerifyOtpFrame(PatientPojo patient, String docname, char aoru, JFrame fr){
       this(); 
       this.fr =fr;
       txtPatientName.setText(patient.getFirstName()+" " + patient.getLastName());
       txtPhoneNo.setText(patient.getMno());
       this.patient = patient;
       this.docname = docname;
       this.aoru = aoru;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnSend = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtOtp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 243, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("ENTER OTP");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 100, 30));

        btnVerify.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnVerify.setText("VERIFY");
        btnVerify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVerify.setBorderPainted(false);
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 250, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SANJEEVANI APPLICATION");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 570, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevani/utility/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1050, 410));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 920, 2));

        btnSend.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSend.setText("SEND OTP");
        btnSend.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSend.setBorderPainted(false);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        jPanel1.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 270, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("PHONE NO.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 120, -1));

        txtPhoneNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPhoneNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPhoneNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 270, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("PATIENT NAME");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPatientName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPatientName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 270, 40));

        txtOtp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtOtp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtOtp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtOtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 270, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
//        JFrame op = new fr(patient);
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        if(!validateInputs()){
            JOptionPane.showMessageDialog(null, "Please input valid phone number");
            return;
        }
        if(isValidOTP() && aoru == 'a'){
            try {
                boolean result = PatientDao.addPatient(patient);
                AppointmentPojo appt = new AppointmentPojo();
                appt.setPatientId(patient.getPatientId());
                appt.setAppointmentDate(patient.getDate().toString());
                appt.setMobileNo(patient.getMno());
                appt.setOpd(patient.getOpd());
                appt.setPatientName(txtPatientName.getText().trim());
                appt.setStatus("REQUEST");
                appt.setDoctorName(docname);
               
                boolean result2 = AppointmentDao.addAppointment(appt);
                if(result && result2){
                   JOptionPane.showMessageDialog(null, "Record entered successsfully!");
                   JFrame op = new AddPatientFrame();
                   this.dispose();
                   op.setVisible(true); 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Record not entered!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database error!");
                ex.printStackTrace();
            }
        }
        else if(isValidOTP() && aoru=='u'){
            try{
                boolean result1 = PatientDao.updatePatient(patient);
            AppointmentPojo appt = new AppointmentPojo();
                appt.setPatientId(patient.getPatientId());
                appt.setAppointmentDate(patient.getDate().toString());
                appt.setMobileNo(patient.getMno());
                appt.setOpd(patient.getOpd());
                appt.setPatientName(txtPatientName.getText().trim());
                appt.setStatus("REQUEST");
                appt.setDoctorName(docname);
               
                boolean result2 = AppointmentDao.updateAppointment(appt);
            if(result1 && result2){
                   JOptionPane.showMessageDialog(null, "Record entered successsfully!");
                   JFrame op = new UpdatePatientFrame();
                   this.dispose();
                   op.setVisible(true); 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Record not entered!");
                }
            }
             catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Database error!");
                ex.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter valid otp!");
        }

            
        
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        boolean ans = checkNumber();
            if(!ans){
           JOptionPane.showMessageDialog(null,"Please enter a valid phone number");
            }
            else{
                try{
            SenderInterface sender = new OtpSender();
            String potp = String.valueOf(patient.getOtp());
            boolean result = sender.send(patient.getMno(), potp);
            if(result){
                JOptionPane.showMessageDialog(null,"OTP sent successfully");
            }
            else{
                JOptionPane.showMessageDialog(null, "Cannot send OTP. Please check the number!");
            }
            }
               catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Server issue");
           ex.printStackTrace();
        }
            
        } 
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtPhoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNoKeyTyped
        
        
    }//GEN-LAST:event_txtPhoneNoKeyTyped

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
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifyOtpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifyOtpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtOtp;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables

    private boolean isValidOTP(){
        boolean result = false;
        try{
            int otp = Integer.parseInt(txtOtp.getText().trim());
            if(otp == patient.getOtp())
                result = true;
           
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Please enter valid otp!");
        }
        finally{
            return result;
        }
    }
    
    private boolean validateInputs(){
       boolean ans = checkNumber();
       if(!ans){
           JOptionPane.showMessageDialog(null,"Please enter a valid phone number");
           return false;
       }else{
       
       if(txtOtp.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null,"Please input an OTP!");
           return false;
       }
      
       }
        return true;
    }
    private boolean checkNumber(){
        try{
           mobNo = Double.parseDouble(this.txtPhoneNo.getText().trim());
           int digits = (int)(Math.log10(mobNo)+1);
            System.out.println(digits);
            if(digits !=10){
                
                return false;
            }
           patient.setMno(txtPhoneNo.getText().trim());
           return true;
       }
       catch(NumberFormatException ex){
           ex.printStackTrace();
           return false;
       }
    }
    
     
}
