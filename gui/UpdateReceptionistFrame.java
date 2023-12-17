//to be done
package Sanjeevani.gui;

import Sanjeevani.dao.DoctorDao;
import Sanjeevani.dao.EmpDao;
import Sanjeevani.dao.ReceptionistDao;
import Sanjeevani.dao.UserDao;
import Sanjeevani.pojo.ReceptionistPojo;
import Sanjeevani.pojo.UserPojo;
import Sanjeevani.utility.PasswordEncryption;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class UpdateReceptionistFrame extends javax.swing.JFrame {


    String selrecid;
    private String recname, loginId;
    
    List<String> allRecId;
    public UpdateReceptionistFrame() {
        initComponents();
        setLocationRelativeTo(null);
        allRecId = new ArrayList<>();
        loadReceptionistDetails();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRecName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        jcRecId = new javax.swing.JComboBox<>();
        jcbGender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 243, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, 100, 30));

        btnRegister.setBackground(new java.awt.Color(204, 204, 204));
        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegister.setText("UPDATE");
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

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 290, 2, 356));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 120, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText(" UPDATE RECEPTIONIST");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 230, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Receptionist Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 150, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Login ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 120, 30));

        txtRecName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtRecName.setEnabled(false);
        jPanel1.add(txtRecName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 560, 30));

        txtLoginId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtLoginId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 560, 30));

        jcRecId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jcRecId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRecIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcRecId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 560, 30));

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
        jLabel17.setText("Receptioinist ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 150, 30));

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
        JFrame op = new ManageReceptionistFrame();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(!validateInputs()){
            JOptionPane.showMessageDialog(null, "Please enter all values");
            return;
        }
        
        try{
            ReceptionistPojo rec = new ReceptionistPojo();
            rec.setRecId(selrecid);
            rec.setRecName(recname);
            rec.setGender(jcbGender.getSelectedItem().toString());
            boolean recAns = ReceptionistDao.updateRec(rec, loginId);
            
            if(!recAns){
                JOptionPane.showMessageDialog(null, "Record could not be updated");
                return;
            }
            JOptionPane.showMessageDialog(null, "Record updated successfully!");
            clearAll();
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in Database");
            ex.printStackTrace();
        }

        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jcbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbGenderActionPerformed

    private void txtLoginIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginIdActionPerformed

    private void jcRecIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRecIdActionPerformed
        if(jcRecId.getSelectedIndex()==-1){
            return;
        }
        selrecid = jcRecId.getSelectedItem().toString();
        try{
            recname = ReceptionistDao.getRecName(selrecid);
        txtRecName.setText(recname);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in database " + ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jcRecIdActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new UpdateReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcRecId;
    private javax.swing.JComboBox<String> jcbGender;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JTextField txtRecName;
    // End of variables declaration//GEN-END:variables

    private void loadReceptionistDetails() {
        try{
            allRecId = ReceptionistDao.getAllRecId(); 
            
            for(String recId:allRecId){
                jcRecId.addItem(recId);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB:"+ex);
            ex.printStackTrace();
        }
    }

    

    private boolean validateInputs() {
       
        loginId = this.txtLoginId.getText().trim();      
        recname = txtRecName.getText().trim();
        if(loginId ==null || recname ==null){
           
            return false;
        }
        return true;
    }
    
          
    private void clearAll() {
        txtRecName.setText("");
        txtLoginId.setText("");
        this.jcbGender.setSelectedIndex(0);
        this.jcRecId.setSelectedIndex(0);
    }
}
