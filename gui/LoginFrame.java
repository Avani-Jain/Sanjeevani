package Sanjeevani.gui;

import Sanjeevani.dao.UserDao;
import Sanjeevani.dbutil.DBConnection;
import Sanjeevani.pojo.User;
import Sanjeevani.pojo.UserProfile;
import Sanjeevani.utility.PasswordEncryption;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LoginFrame extends javax.swing.JFrame {
    private String loginId;
    private String password;
   
    public LoginFrame() {
        initComponents();
//        this.setRootPane(null);
//        this.setRelative(null);
        this.setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtLoginId = new javax.swing.JTextField();
        jrbReceptionist = new javax.swing.JRadioButton();
        jrbDoctor = new javax.swing.JRadioButton();
        jrbAdmin = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(234, 243, 250));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 400, 1050, -1));

        jPanel1.setBackground(new java.awt.Color(234, 243, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("User Type");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 290, 30));

        txtLoginId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtLoginId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtLoginId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 290, 30));

        buttonGroup1.add(jrbReceptionist);
        jrbReceptionist.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jrbReceptionist.setText("RECEPTIONIST");
        jrbReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbReceptionistActionPerformed(evt);
            }
        });
        jPanel1.add(jrbReceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, -1, -1));

        buttonGroup1.add(jrbDoctor);
        jrbDoctor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jrbDoctor.setText("DOCTOR");
        jPanel1.add(jrbDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, -1, -1));

        buttonGroup1.add(jrbAdmin);
        jrbAdmin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jrbAdmin.setText("ADMIN");
        jPanel1.add(jrbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Login ID ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        btnQuit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnQuit.setText("QUIT");
        btnQuit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuit.setBorderPainted(false);
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 100, 30));

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 100, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SANJEEVANI APPLICATION");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 570, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevani/utility/icons/HomePageBG1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1050, 410));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 495, 920, 2));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 578, 920, 2));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        int ans = JOptionPane.showConfirmDialog(null, "Do you wan to quit?", "Quit?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(ans ==JOptionPane.YES_OPTION){
            DBConnection.closeConnection();
            System.exit(0);
        }
        return;
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        boolean isValid = validateInput();
        if(!isValid){
            JOptionPane.showMessageDialog(null,"Login id or password cannot be left empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String userType = getUserType();
        
        if(userType==null){
            JOptionPane.showMessageDialog(null, "Please select a User Type", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    try{
        User user = new User();
        user.setLoginId(loginId);
        //converting string of password into encrypted form for checking
        
        
        String pwd = PasswordEncryption.getEncryptedPassword(password);
        
        user.setPassword(pwd);
        user.setUserType(userType);
        
        
        
        String userName = UserDao.validateUser(user);
        if(userName!= null){
            JOptionPane.showMessageDialog(null,"Welcome "+userName,"Login success!",JOptionPane.INFORMATION_MESSAGE);
            UserProfile.setUserId(loginId);
            UserProfile.setUserName(userName);
//            System.out.println("From Login: " + UserProfile.getUserName());
            UserProfile.setUserType(userType);
            
            JFrame optionsFrame = null;
            if(userType.equalsIgnoreCase("admin")){
                optionsFrame = new AdminOptionsFrame();
            }
            else if(userType.equalsIgnoreCase("receptionist")){
                optionsFrame = new ReceptionistOptionsFrame();
            }
            else if(userType.equalsIgnoreCase("doctor")){
                optionsFrame = new DoctorOptionsFrame();
            }
            optionsFrame.setVisible(true);
            this.dispose();
            return;
        }
        JOptionPane.showMessageDialog(null,"Invalid credentials!","Login denied!",JOptionPane.ERROR_MESSAGE);
        
    }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jrbReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbReceptionistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbReceptionistActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton jrbAdmin;
    private javax.swing.JRadioButton jrbDoctor;
    private javax.swing.JRadioButton jrbReceptionist;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    private boolean validateInput() {
        loginId = txtLoginId.getText().trim();
        // we need to user char [] becuse getText doesnt work with password field.
        char [] pwd = txtPassword.getPassword();
        if(loginId.isEmpty() || pwd.length==0){
            return false;
        }
        password = new String(pwd);
        return true;
            
    }
    
    private String getUserType(){
// cant use this as it will give null pointer exception        
//buttonGroup1.getSelection().toString();
        if(jrbAdmin.isSelected())
            return jrbAdmin.getText();
        else if(jrbDoctor.isSelected())
            return jrbDoctor.getText();
        else if(jrbReceptionist.isSelected())
            return jrbReceptionist.getText();
        return null;
    }
    
}
