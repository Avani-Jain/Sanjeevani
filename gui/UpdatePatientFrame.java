//ismein hum add karenge woh doctors jo employee mein toh hain lekin users mein nahi hain.

package Sanjeevani.gui;

import Sanjeevani.dao.DoctorDao;
import Sanjeevani.dao.PatientDao;
import Sanjeevani.pojo.PatientPojo;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class UpdatePatientFrame extends javax.swing.JFrame {

    String msg;
    int age;
    PatientPojo patient;
    PatientPojo pat;
    private static int OTP = 1000+ (int)(Math.random()*999);
    private String patid, docid, fname, lname, docname, opd, city, mobno, address, gender, mstatus;
//    java.sql.Date dt;
    public UpdatePatientFrame() {
        
        initComponents();
        setLocationRelativeTo(null);
        loadPatientId();
        loadDoctorDetails();      
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMobNo = new javax.swing.JTextField();
        txtOpd = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jcbPatId = new javax.swing.JComboBox<>();
        jcbMStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        txtDocName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jcbGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jcbDocId = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 243, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFirstName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFirstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 200, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Marital Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 120, 30));

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

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUpdate.setText("UPDATE PATIENT");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setBorderPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 200, 30));

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

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 290, 2, 356));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 80, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("UPDATE PATIENT");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Doctor Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 120, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Patient ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 90, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Age");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 90, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("City");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 140, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("First Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 90, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Gender");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 110, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Date");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 90, 30));

        txtMobNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMobNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMobNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 200, 30));

        txtOpd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtOpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 210, 30));

        txtCity.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        jPanel1.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 210, 30));

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 200, 30));

        jcbPatId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jcbPatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPatIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcbPatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 210, 30));

        jcbMStatus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jcbMStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MARRIED", "UNMARRIED" }));
        jcbMStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMStatusActionPerformed(evt);
            }
        });
        jPanel1.add(jcbMStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 200, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevani/utility/icons/register Doctor.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("OPD");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 120, 30));

        txtage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        jPanel1.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 210, 30));

        txtDocName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDocName.setEnabled(false);
        txtDocName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtDocName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 210, 30));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 200, 60));

        jcbGender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jcbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jcbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGenderActionPerformed(evt);
            }
        });
        jPanel1.add(jcbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 200, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Phone No.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 90, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Doctor Id");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 120, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Doctor Id");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 120, 30));

        jcbDocId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jcbDocId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDocIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcbDocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 210, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Last Name");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 90, 30));

        txtLastName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        JFrame op = new ReceptionistOptionsFrame();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(!validateInputs() || !checkContactNumber()){
            JOptionPane.showMessageDialog(null, msg);
            return;
        }
        
        patient = new PatientPojo();
        patient.setAddress(address);
        patient.setAge(age);
        patient.setCity(city);
        patient.setDate(pat.getDate());
        patient.setFirstName(fname);
        patient.setLastName(lname);
        patient.setGender(gender);
        patient.setMarriedStatus(mstatus);
        patient.setDoctorId(docid);
        patient.setMno(mobno);
        patient.setPatientId(patid);
        
        patient.setOtp(OTP);
        patient.setAptStatus("REQUEST");
        patient.setOpd(opd);
        System.out.println(patient.toString());
        
        JFrame op = new VerifyOtpFrame(patient, docname, 'u', this);
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtMobNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobNoActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void jcbMStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMStatusActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void jcbPatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPatIdActionPerformed
        patid = this.jcbPatId.getSelectedItem().toString();
        try {
            pat = PatientDao.getAllPatientDetailsByPatientId(patid);
        
        this.jcbDocId.setSelectedItem(pat.getDoctorId());
        this.txtFirstName.setText(pat.getFirstName());
        this.txtLastName.setText(pat.getLastName());
        this.jcbGender.setSelectedItem(pat.getMarriedStatus());
        this.txtCity.setText(pat.getCity());
        this.txtOpd.setText(pat.getOpd());
        this.txtMobNo.setText(pat.getMno());
        
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
             String date = sdf.format(pat.getDate());

        this.txtDate.setText(date);
        this.txtage.setText(pat.getAge() + "");
        this.txtAddress.setText(pat.getAddress());
        this.jcbMStatus.setSelectedItem(pat.getMarriedStatus());
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in Database!" + ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jcbPatIdActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtDocNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocNameActionPerformed

    private void jcbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbGenderActionPerformed

    private void jcbDocIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDocIdActionPerformed
        docid = this.jcbDocId.getSelectedItem().toString();
        try{
            docname = DoctorDao.getDocName(docid);
        this.txtDocName.setText(docname);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in Database!" + ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jcbDocIdActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcbDocId;
    private javax.swing.JComboBox<String> jcbGender;
    private javax.swing.JComboBox<String> jcbMStatus;
    private javax.swing.JComboBox<String> jcbPatId;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobNo;
    private javax.swing.JTextField txtOpd;
    private javax.swing.JTextField txtage;
    // End of variables declaration//GEN-END:variables


    private boolean validateInputs() {
        gender = jcbGender.getSelectedItem().toString();
        address = txtAddress.getText().trim();
        mstatus = this.jcbMStatus.getSelectedItem().toString().trim();
        mobno = this.txtMobNo.getText().trim();
        city = this.txtCity.getText().trim();
       
        fname = this.txtFirstName.getText().trim();
        lname = this.txtLastName.getText().trim();
        opd = this.txtOpd.getText().trim();
        
        try{
            age = Integer.parseInt(this.txtage.getText().trim());
        }
        catch(NumberFormatException ex){
            msg = "Please enter valid age!";
            return false;
        }
        
        if(city == null || lname==null || fname==null|| opd==null|| address.isEmpty() ){
            msg = "Please input all values";
            return false;
        }
        return true;
    }
    
   
    private boolean checkContactNumber(){
        
        try{
            double mNo = Double.parseDouble(mobno);
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

    private void loadDoctorDetails(){
        try{
        List<String> allDocId = DoctorDao.getAllDocId();
        for(String id: allDocId){
            this.jcbDocId.addItem(id);
        }
        
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in Database!" + ex);
            ex.printStackTrace();
        }
        
    }

   

//    private void getAllPatientId() {

    private void loadPatientId() {
        try{
            List<String> allPatId = PatientDao.getAllPatientId();
            for(String id: allPatId){
            this.jcbPatId.addItem(id);
        }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in Database!" + ex);
            ex.printStackTrace();
        }
        
    }
        
    
}
