
package testingguesthouse;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class LogIn extends javax.swing.JDialog {
      MainForm f; ///mina ddkjkle
    public LogIn(MainForm parent, boolean modal) {
        
        super(parent, modal);
        f= parent;
        initComponents();
        setSize(601, 435);
        setLocationRelativeTo(null);
       
        try{
            con=ConnectionCon.ConnectMysql();
        }catch(Exception e){}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        lblPosition = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(249, 183, 10));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Login Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 10, 200, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 60);

        jPanel2.setBackground(new java.awt.Color(88, 85, 78));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        txtUserName.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtUserName);
        txtUserName.setBounds(200, 40, 230, 30);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Password");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 140, 140, 34);

        btnLogin.setBackground(new java.awt.Color(32, 163, 212));
        btnLogin.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin);
        btnLogin.setBounds(320, 190, 90, 40);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("ID");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 40, 140, 34);

        btnCancel.setBackground(new java.awt.Color(255, 65, 0));
        btnCancel.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel);
        btnCancel.setBounds(190, 190, 90, 40);

        lblPosition.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(238, 30, 30));
        jPanel2.add(lblPosition);
        lblPosition.setBounds(200, 90, 230, 34);

        jpass.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jpass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jpass);
        jpass.setBounds(200, 140, 230, 30);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Position");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 90, 140, 34);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 600, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        try{
            int uske=JOptionPane.showConfirmDialog(this, "Do you want to cancel","Close",JOptionPane.YES_NO_OPTION);
            if(uske==JOptionPane.YES_OPTION){
            System.exit(0);
            }
            else {}
        }catch(Exception e){}
    }//GEN-LAST:event_btnCancelActionPerformed
    Connection con;
    ResultSet rst;
    Statement stm;
    String user;
    String pass;
    PreparedStatement ps;
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        /*try{
               ps=con.prepareCall("select * from account where ID=? and Password=?");
                ps.setString(1, txtUserName.getText());
                ps.setString(2, jpass.getText());
                rst=ps.executeQuery();
               
                if(rst.first()){
                     position = rst.getString("Position");
                    this.dispose();
                }
        }catch(Exception e){JOptionPane.showMessageDialog(this,e);}*/
        /*
        if(txtUserName.getText().equalsIgnoreCase(f.id)&&jpass.getText().equalsIgnoreCase(f.pass)){
            f.setID(f.id);
            f.setPass(f.pass);
            
            this.dispose();
        }*
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select * from account where ID="+txtUserName.getText());
            if(rst.first()){
                f.Id=rst.getString("ID");
                f.Name=rst.getString("Nam");
                f.positIon=rst.getString("Position");
                this.dispose();
                
            }
        }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
        */
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed
public String position;
    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
                jpass.requestFocus();
        }
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select * from account where ID="+txtUserName.getText().trim());            
                while(rst.next()){
                    f.Id=rst.getString("ID");
                    f.Name=rst.getString("Nam");
                    f.positIon=rst.getString("Position");
                    lblPosition.setText(f.positIon);
                }
        }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
       
    }//GEN-LAST:event_txtUserNameKeyTyped

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LogIn dialog = new LogIn(new  MainForm(), true);//jKe mdkjakl
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
