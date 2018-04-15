/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package successfulbrothers;
import java.awt.*;
import java.awt.event.*;
import java.sql.Driver;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.*;
import successfulbrothers.PartsDBMaintain;
import java.io.*;
/**
 *
 * @author Spas
 */
public class LoginForm extends JFrame  implements ActionListener {
    boolean i = true;
    String type;
    
    
    public LoginForm(){        
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
       // setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("SuccessfulBrothers");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        LoginButton.addActionListener(this);
        WrongDetails.setVisible(false);
    }
    /**
     * Creates new form LoginForm
     */


    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Login")){
            //sSystem.out.println(UsernameField.getText()+" - "+String.valueOf(PasswordField.getPassword()));
            SuccessfulBrothers tryy = new SuccessfulBrothers();
            Connection conn = null;
            try{
                boolean found = false;
                conn = DriverManager.getConnection(tryy.tryy(),tryy.USER_NAME, tryy.PASSWORD);
                System.out.println("Connected!");
                Statement stmt = (Statement) conn.createStatement();
                String sql = "SELECT * FROM staff WHERE username ='" + UsernameField.getText() + "' AND password ='" + String.valueOf(PasswordField.getPassword()) + "'";
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    found = true;
                    type=rs.getString("type");
                }
                if(found){
                    
                    setUser(UsernameField.getText());
                    WrongDetails.setVisible(false);
                    if(type.equals("CustomerMaintainer")){
                        CustomerDBMaintain window = new CustomerDBMaintain();
                        window.setVisible(true);
                    }else
                    if(type.equals("BranchManager")){
                        BranchManager window = new BranchManager();
                        window.setVisible(true);                    
                    }else
                    if(type.equals("CarSeller")){
                        CarSeller window = new CarSeller();
                        window.setVisible(true);                    
                    }else
                    if(type.equals("CompanyDirector")){
                        CompanyDirector window = new CompanyDirector();
                        window.setVisible(true);                    
                    }else
                    if(type.equals("PartsMaintainer")){
                        PartsDBMaintain window = new PartsDBMaintain();
                        window.setVisible(true);                    
                    }else
                    if(type.equals("PartsReportManager")){
                        PartsReportManager window = new PartsReportManager();
                        window.setVisible(true);                    
                    }else
                    if(type.equals("SalesReportManager")){
                        SalesReportManager window = new SalesReportManager();
                        window.setVisible(true);                    
                    }else
                    if(type.equals("ServiceCoordinator")){
                        ServiceCoordinator window = new ServiceCoordinator();
                        window.setVisible(true);                    
                    }else
                    if(type.equals("ServiceTechnician")){
                        ServiceTechnician window = new ServiceTechnician();
                        window.setVisible(true);                    
                    }else
                    if(type.equals("StaffMaintainer")){
                        StaffDBMaintain window = new StaffDBMaintain();
                        window.setVisible(true);                    
                    }else
                    if(type.equals("WorkshopManager")){
                        WorkshopReportManager window = new WorkshopReportManager();
                        window.setVisible(true);                    
                    }
                    //PartsDBMaintain service_maintain = new PartsDBMaintain();
                   // Main main = new Main();
                    this.setVisible(false);
                    //customers_maintain.setVisible(true);
                }else{                    
                    WrongDetails.setVisible(true);
                    System.out.println("Not found!");
                }
            }catch (SQLException ee){
                System.err.println(ee);
            }
            System.out.println(tryy.tryy());
        }
    }
    
    private void setUser(String user){
        try{
            FileWriter f2 = new FileWriter("User.txt");
            PrintWriter pw = new PrintWriter(f2);
            
            pw.print(user);
            pw.close();
            
            System.out.println("ok!");
        } catch(IOException e) {
            System.out.println("Error!");
        }
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        WrongDetails = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setLabelFor(UsernameField);
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setLabelFor(PasswordField);
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Successful Brothers");

        UsernameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        PasswordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        WrongDetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        WrongDetails.setForeground(new java.awt.Color(204, 0, 0));
        WrongDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WrongDetails.setText("Invalid Username or Password");

        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LoginButton.setText("Login");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/successfulbrothers/Eye-Symbol_(1).png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/successfulbrothers/background.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WrongDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UsernameField)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(WrongDetails)
                .addGap(16, 16, 16)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );

        jButton1.getAccessibleContext().setAccessibleName("show_pass");
        jButton1.getAccessibleContext().setAccessibleDescription("show_pass");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(i){
            PasswordField.setEchoChar((char)0);
            i=false;
        }else{
            PasswordField.setEchoChar('*');
            i=true;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel WrongDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
