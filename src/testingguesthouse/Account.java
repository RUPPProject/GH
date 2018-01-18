
package testingguesthouse;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Account extends javax.swing.JPanel {
    public Account() {
        initComponents();
        try{
         con=ConnectionCon.ConnectMysql();
         //JOptionPane.showMessageDialog(this, "Connection");
        }catch(Exception e){JOptionPane.showMessageDialog(this,e+"NOT");}
        setSize(924, 632);
        setLocation(400,120);
        enableFalse();
        showData();
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select * from staff");
            while(rst.next()){
                String add=rst.getString("ID");
                cboID.addItem(add);
            }
        }catch(Exception e){}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cboGender = new javax.swing.JComboBox();
        cboID = new javax.swing.JComboBox();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtRepassword = new javax.swing.JPasswordField();
        lblRepassword = new javax.swing.JLabel();
        cboPosition = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccount = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(14, 14, 167, 35);

        txtName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(193, 61, 337, 35);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(14, 61, 167, 35);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(14, 108, 167, 35);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Position");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(14, 155, 167, 35);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 240, 167, 35);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 200, 167, 35);

        txtEmail.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(190, 200, 337, 35);

        cboGender.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        cboGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboGenderKeyReleased(evt);
            }
        });
        jPanel1.add(cboGender);
        cboGender.setBounds(190, 110, 340, 30);

        cboID.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboIDKeyReleased(evt);
            }
        });
        jPanel1.add(cboID);
        cboID.setBounds(190, 10, 340, 30);

        txtPassword.setEchoChar('@');
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtPassword);
        txtPassword.setBounds(190, 247, 340, 30);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("Repassword");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 290, 167, 35);

        txtRepassword.setEchoChar('@');
        txtRepassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepasswordFocusLost(evt);
            }
        });
        txtRepassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepasswordKeyTyped(evt);
            }
        });
        jPanel1.add(txtRepassword);
        txtRepassword.setBounds(190, 290, 340, 30);
        jPanel1.add(lblRepassword);
        lblRepassword.setBounds(200, 327, 200, 20);

        cboPosition.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Cashi" }));
        cboPosition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboPositionKeyReleased(evt);
            }
        });
        jPanel1.add(cboPosition);
        cboPosition.setBounds(190, 160, 340, 30);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 540, 360);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        btnDelete.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-30.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(10, 50, 140, 30);

        btnNew.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-natural-user-interface-2-30.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel3.add(btnNew);
        btnNew.setBounds(10, 10, 140, 30);

        add(jPanel3);
        jPanel3.setBounds(570, 110, 160, 90);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        tbAccount.setFont(new java.awt.Font("Khmer OS System", 1, 15)); // NOI18N
        tbAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Position", "Email", "Password", "Repassword"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAccount.getTableHeader().setReorderingAllowed(false);
        tbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAccountMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAccount);
        if (tbAccount.getColumnModel().getColumnCount() > 0) {
            tbAccount.getColumnModel().getColumn(0).setResizable(false);
            tbAccount.getColumnModel().getColumn(1).setResizable(false);
            tbAccount.getColumnModel().getColumn(2).setResizable(false);
            tbAccount.getColumnModel().getColumn(3).setResizable(false);
            tbAccount.getColumnModel().getColumn(4).setResizable(false);
            tbAccount.getColumnModel().getColumn(5).setResizable(false);
            tbAccount.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 880, 220);

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setText("Search");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 10, 167, 35);

        txtSearch.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel5.add(txtSearch);
        txtSearch.setBounds(190, 10, 337, 35);

        add(jPanel5);
        jPanel5.setBounds(10, 380, 900, 280);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if(btnNew.getText().equals("New")){
        EnableTrue();
        btnNew.setText("Save");
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
        cboID.requestFocus();
        }
        else if(btnNew.getText().equals("Save")){
            char[] password=txtPassword.getPassword();
            char[] repassword=txtRepassword.getPassword();
            if(Arrays.equals(password,repassword)){
            try{
               String pas=new String (txtPassword.getPassword());
               String repass=new String(txtRepassword.getPassword());
            stm=con.createStatement();
            stm.execute("insert into account values('"+cboID.getSelectedItem().toString()
                                                      +"','"+txtName.getText().trim()
                                                       +"','"+cboGender.getSelectedItem()
                                                        +"','"+cboPosition.getSelectedItem()
                                                        +"','"+txtEmail.getText().trim()
                                                        +"','"+pas
                                                        +"','"+repassword+"')");
            
            showData();
            clearData();
            }catch(SQLException | NumberFormatException e){JOptionPane.showMessageDialog(this,e.getMessage());}
            //JOptionPane.showMessageDialog(this,"Was Saved");
            }
            else{
                JOptionPane.showMessageDialog(null,"Your Repassword is Incorrect");
                txtRepassword.requestFocus();
            }
            
            }
        else{
            try{
             int index=tbAccount.getSelectedRow();
            int id = Integer.parseInt(tbAccount.getValueAt(index,0).toString());
            stm=con.createStatement();
            stm.execute("update account set Nam='"+txtName.getText().trim()
                                                  +"',Gender='"+cboGender.getSelectedItem()
                                                  +"',Position='"+cboPosition.getSelectedItem()
                                                  +"',Email='"+txtEmail.getText().trim()
                                                  +"',Password='"+txtPassword.getText().trim()
                                                  +"'where ID="+id);
            showData();
            btnNew.setText("Update");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
            clearData();
            }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void tbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountMouseClicked
        if(evt.getClickCount()==2){
        int index=tbAccount.getSelectedRow();
       //while(mode.getRowCount()>0)
        cboID.setSelectedItem(tbAccount.getValueAt(index, 0).toString());
        txtName.setText(tbAccount.getValueAt(index,1).toString());
        cboGender.setSelectedItem(tbAccount.getValueAt(index,2).toString());
        cboPosition.setSelectedItem(tbAccount.getValueAt(index,3).toString());
        txtEmail.setText(tbAccount.getValueAt(index,4).toString());
        txtPassword.setText(tbAccount.getValueAt(index,5).toString());
        txtRepassword.setText(tbAccount.getValueAt(index,6).toString());
        EnableTrue();
        btnNew.setText("Update");
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-30.png")));
        
        }
        
    }//GEN-LAST:event_tbAccountMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            int index=tbAccount.getSelectedRow();
            int id=Integer.parseInt(tbAccount.getValueAt(index,0).toString());
            stm=con.createStatement();
             stm.execute("delete from account where ID="+id);
             showData();
             btnDelete.setEnabled(false);
             btnNew.setText("Save");
             btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
             clearData();
             
        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)||c==33||c==64||c==35||c==37||c==36||c==94||c==38||c==42||c==40||c==41
                ||c==95||c==43||c==61||c==91||c==93){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        /*
        else if(!(Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!=8)){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            
        }*/
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtRepasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepasswordKeyTyped
        lblRepassword.setText("");
    }//GEN-LAST:event_txtRepasswordKeyTyped

    private void txtRepasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepasswordFocusLost
        comparePassword();
    }//GEN-LAST:event_txtRepasswordFocusLost

    private void cboIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboIDKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtName.requestFocus();
       }
    }//GEN-LAST:event_cboIDKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cboGender.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void cboGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboGenderKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cboPosition.requestFocus();
        }
    }//GEN-LAST:event_cboGenderKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtRepassword.requestFocus();
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void cboPositionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboPositionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPositionKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox cboGender;
    private javax.swing.JComboBox cboID;
    private javax.swing.JComboBox cboPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRepassword;
    private javax.swing.JTable tbAccount;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepassword;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    Connection con;
    CallableStatement callstm;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    /*
    public void saveData(String data){
       try{
            callstm=con.prepareCall("{call'"+data+"'(?,?,?,?,?,?)}");
            callstm.setInt(1,Integer.parseInt(txtID.getText().trim()));
            callstm.setString(2,txtName.getText().trim());
            callstm.setString(3,cboGender.getSelectedItem().toString());
            callstm.setString(4,txtPosition.getText().trim());
            callstm.setString(5,txtEmail.getText().trim());
            callstm.setString(6,txtPassword.getText().trim());
            callstm.execute();
            callstm.close();
            con.close();
       }catch(Exception e){}
    }
    */
    public void showData(){
       while(mode.getRowCount()>0)
           mode.removeRow(0);
           mode=(DefaultTableModel)tbAccount.getModel();
        try{
            stm=con.createStatement();
            rst=stm.executeQuery("select * from account");
            if(rst.first()){
                do{
                mode.addRow(new String[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                     rst.getString(7)
                });
                }while(rst.next());
            }
        }catch(Exception e){JOptionPane.showMessageDialog(this,"Not Show Data");}
    }
    public void clearData(){
        cboID.setSelectedItem(null);
        txtName.setText(null);
        cboGender.setSelectedItem(null);
        cboPosition.setSelectedItem(null);
        txtEmail.setText(null);;
        txtPassword.setText(null);
    }
    public void controlKeyBord(KeyEvent evt){
         char c=evt.getKeyChar();
        if(Character.isDigit(c)||c==KeyEvent.VK_EQUALS||c==KeyEvent.VK_COMMA||c==KeyEvent.VK_SEMICOLON
                ||c==KeyEvent.VK_SEPARATOR||c==KeyEvent.VK_COPY||c==KeyEvent.VK_CUT||c==KeyEvent.VK_EURO_SIGN
                ||c==KeyEvent.VK_SLASH||c==KeyEvent.VK_BACK_QUOTE){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }
    public void enableFalse(){
        cboID.setEnabled(false);
        txtName.setEnabled(false);
        cboGender.setEnabled(false);
        cboPosition.setEnabled(false);
        txtEmail.setEnabled(false);
        txtPassword.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    private void EnableTrue() {
     cboID.setEnabled(true);
        txtName.setEnabled(true);
        cboGender.setEnabled(true);
        cboPosition.setEnabled(true);
        txtEmail.setEnabled(true);
        txtPassword.setEnabled(true);
        btnDelete.setEnabled(true);   
    }

    private void comparePassword() {
        char [] c=txtPassword.getPassword();
        char [] repas=txtRepassword.getPassword();
        if(!Arrays.equals(c, repas)){
            
            lblRepassword.setText("Incorrect repassword");
            lblRepassword.setForeground(Color.red);
            
        }
        else{
            lblRepassword.setText("");
            
        }
    }
}
