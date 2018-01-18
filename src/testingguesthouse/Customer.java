
package testingguesthouse;

import com.sun.javafx.tk.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public final class Customer extends javax.swing.JPanel {
    public Customer() {
        initComponents();
        setSize(788, 574);
        setLocation(350,120);
        try{
            con= ConnectionCon.ConnectMysql();
        }catch(Exception e){}
        EnabledFalse();
        showData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKH_ID = new javax.swing.JTextField();
        txtCustomer_Name = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        cboGender = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCustomer = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnDelet = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("KH_ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(14, 14, 167, 35);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Customer Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(14, 61, 167, 35);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 100, 167, 35);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 220, 167, 35);

        txtKH_ID.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtKH_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKH_IDKeyTyped(evt);
            }
        });
        jPanel1.add(txtKH_ID);
        txtKH_ID.setBounds(200, 10, 337, 35);

        txtCustomer_Name.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel1.add(txtCustomer_Name);
        txtCustomer_Name.setBounds(200, 60, 337, 35);

        txtContact.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel1.add(txtContact);
        txtContact.setBounds(200, 150, 337, 35);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(200, 200, 340, 112);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Contact");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 150, 167, 35);

        cboGender.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(cboGender);
        cboGender.setBounds(200, 110, 330, 29);

        add(jPanel1);
        jPanel1.setBounds(0, 10, 540, 290);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        tbCustomer.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        tbCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KH_ID", "Customer_Name", "Gender", "Contact", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCustomer.getTableHeader().setReorderingAllowed(false);
        tbCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCustomer);
        if (tbCustomer.getColumnModel().getColumnCount() > 0) {
            tbCustomer.getColumnModel().getColumn(0).setResizable(false);
            tbCustomer.getColumnModel().getColumn(1).setResizable(false);
            tbCustomer.getColumnModel().getColumn(2).setResizable(false);
            tbCustomer.getColumnModel().getColumn(3).setResizable(false);
            tbCustomer.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 750, 190);

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setText("Search");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 10, 167, 35);

        jTextField13.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel5.add(jTextField13);
        jTextField13.setBounds(190, 10, 337, 35);

        add(jPanel5);
        jPanel5.setBounds(10, 310, 770, 250);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jButton1.setText("Brows");
        jPanel4.add(jButton1);
        jButton1.setBounds(1160, 210, 57, 29);

        btnDelet.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnDelet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-30.png"))); // NOI18N
        btnDelet.setText("Delete");
        btnDelet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelet);
        btnDelet.setBounds(10, 60, 130, 40);

        btnNew.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-natural-user-interface-2-30.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel4.add(btnNew);
        btnNew.setBounds(10, 10, 130, 40);

        add(jPanel4);
        jPanel4.setBounds(570, 60, 190, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
       if(btnNew.getText().equals("New")){
            txtKH_ID.setEnabled(true);
            txtCustomer_Name.setEnabled(true);
            cboGender.setEnabled(true);
            txtContact.setEnabled(true);
            txtAddress.setEnabled(true);
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
       }
       else if(btnNew.getText().equals("Save")){
           try{
               stm=con.createStatement();
               stm.execute("insert into customer values ('"+txtKH_ID.getText().trim()
                                                            +"','"+txtCustomer_Name.getText().trim()
                                                            +"','"+cboGender.getSelectedItem().toString()
                                                            +"','"+txtContact.getText().trim()
                                                            +"','"+txtAddress.getText().trim()+"')");
               showData();
               clearData();
           }catch(Exception e){JOptionPane.showMessageDialog(this,e+"NOT SAVE");}
       }
       else{
           try{
               int index=tbCustomer.getSelectedRow();
               int id=Integer.parseInt(tbCustomer.getValueAt(index,0).toString());
               stm=con.createStatement();
               stm.execute("update customer set Name='"+txtCustomer_Name.getText().trim()
                                                       +"',Gender='"+cboGender.getSelectedItem().toString()
                                                       +"',Contact='"+txtContact.getText().trim()
                                                       +"',Address='"+txtAddress.getText().trim()
                                                       +"'where KH_ID="+id);
               btnNew.setText("Save");
               btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
               showData();
               clearData();
           }catch(Exception e){}
       }
    }//GEN-LAST:event_btnNewActionPerformed

    private void tbCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCustomerMouseClicked
        if(evt.getClickCount()==2){
            int index=tbCustomer.getSelectedRow();
            txtKH_ID.setText(tbCustomer.getValueAt(index, 0).toString());
            txtCustomer_Name.setText(tbCustomer.getValueAt(index,1).toString());
            cboGender.setSelectedItem(tbCustomer.getValueAt(index,2).toString());
            txtContact.setText(tbCustomer.getValueAt(index,3).toString());
            txtAddress.setText(tbCustomer.getValueAt(index,4).toString());
            EnabledTrue();
            btnNew.setText("Update");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-30.png")));
        }
    }//GEN-LAST:event_tbCustomerMouseClicked

    private void btnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletActionPerformed
        try{
            int index=tbCustomer.getSelectedRow();
            int id=Integer.parseInt(tbCustomer.getValueAt(index,0).toString());
            stm=con.createStatement();
            stm.execute("delete from customer where KH_ID="+id);
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
            showData();
            clearData();
        }catch(NumberFormatException | SQLException e){}
    }//GEN-LAST:event_btnDeletActionPerformed

    private void txtKH_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKH_IDKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||c==KeyEvent.VK_SPACE ||c==KeyEvent.VK_DELETE)){
            java.awt.Toolkit.getDefaultToolkit().beep();
            evt.consume();
           
        }
    }//GEN-LAST:event_txtKH_IDKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelet;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox cboGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTable tbCustomer;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCustomer_Name;
    private javax.swing.JTextField txtKH_ID;
    // End of variables declaration//GEN-END:variables
    Connection con;
    Statement stm;
    ResultSet rst;
    DefaultTableModel mode=new DefaultTableModel();
    
    public void showData(){
       try{
        while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel)tbCustomer.getModel();
            stm=con.createStatement();
            rst=stm.executeQuery("select * from customer");
            if(rst.first()){
                do{
                    mode.addRow(new String[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5)
                       });
                }while(rst.next());
            }
       }catch(Exception e){JOptionPane.showConfirmDialog(this,e+"NOT Show");}
    }
    public void clearData(){
        txtKH_ID.setText(null);
        txtCustomer_Name.setText(null);
        cboGender.setSelectedItem(null);
        txtContact.setText(null);
        txtAddress.setText(null);
    }

    private void EnabledFalse() {
        txtKH_ID.setEnabled(false);
        txtCustomer_Name.setEnabled(false);
        cboGender.setEnabled(false);
        txtContact.setEnabled(false);
        txtAddress.setEnabled(false);
        btnDelet.setEnabled(false);
    }

    private void EnabledTrue() {
        txtKH_ID.setEnabled(true);
            txtCustomer_Name.setEnabled(true);
            cboGender.setEnabled(true);
            txtContact.setEnabled(true);
            txtAddress.setEnabled(true);
            btnDelet.setEnabled(true);
    }
}
