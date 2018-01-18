
package testingguesthouse;

import java.sql.*;
import java.util.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Product extends javax.swing.JPanel {

    public Product() {
        initComponents();
        setSize(926, 633);
        setLocation(400, 120);
        try{
            con=ConnectionCon.ConnectMysql();
        }catch(Exception e){}
        EnabledFalse();
        showData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        txtProduct_Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        cboCategory = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtSalePrice = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccount = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText(" Product ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(14, 14, 167, 35);

        txtProductID.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtProductID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductIDKeyReleased(evt);
            }
        });
        jPanel1.add(txtProductID);
        txtProductID.setBounds(193, 14, 337, 35);

        txtProduct_Name.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtProduct_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProduct_NameKeyReleased(evt);
            }
        });
        jPanel1.add(txtProduct_Name);
        txtProduct_Name.setBounds(193, 61, 337, 35);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Product Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(14, 61, 167, 35);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Categery");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(14, 108, 167, 35);

        txtPrice.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        jPanel1.add(txtPrice);
        txtPrice.setBounds(193, 155, 337, 35);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Price In Stock");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(14, 155, 167, 35);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Amount");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 250, 167, 35);

        txtAmount.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(txtAmount);
        txtAmount.setBounds(190, 250, 337, 35);

        cboCategory.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Botle", "Can" }));
        cboCategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboCategoryKeyReleased(evt);
            }
        });
        jPanel1.add(cboCategory);
        cboCategory.setBounds(200, 110, 330, 30);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Sale Price");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 210, 167, 35);

        txtSalePrice.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtSalePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalePriceKeyReleased(evt);
            }
        });
        jPanel1.add(txtSalePrice);
        txtSalePrice.setBounds(190, 210, 337, 35);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 540, 320);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        tbAccount.setFont(new java.awt.Font("Khmer OS System", 1, 15)); // NOI18N
        tbAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_ID", "Product_Name", "Categery", "Price In Stock", "Amount", "Sale_Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 880, 220);

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setText("Search");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 10, 167, 35);

        txtSearch.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel5.add(txtSearch);
        txtSearch.setBounds(190, 10, 337, 35);

        add(jPanel5);
        jPanel5.setBounds(10, 350, 900, 280);

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
    }// </editor-fold>//GEN-END:initComponents

    private void tbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountMouseClicked
        
        if(evt.getClickCount()==2){
            int index=tbAccount.getSelectedRow();
            //while(mode.getRowCount()>0)
            txtProductID.setText(tbAccount.getValueAt(index, 0).toString());
            txtProduct_Name.setText(tbAccount.getValueAt(index,1).toString());
            cboCategory.setSelectedItem(tbAccount.getValueAt(index,2).toString());
            txtPrice.setText(tbAccount.getValueAt(index,3).toString());
            txtSalePrice.setText(tbAccount.getValueAt(index, 4).toString());
            txtAmount.setText(tbAccount.getValueAt(index,5).toString());
            EnabledTrue();
            txtProductID.setEnabled(false);
            btnDelete.setEnabled(true);
            btnNew.setText("Update");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-30.png")));

        }

    }//GEN-LAST:event_tbAccountMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        try{
            int index=tbAccount.getSelectedRow();
            int id=Integer.parseInt(tbAccount.getValueAt(index,0).toString());
            stm=con.createStatement();
            stm.execute("delete from product where Product_ID="+id);
            showData();
            btnDelete.setEnabled(false);
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
            clearData();
            txtProductID.setEnabled(true);
        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if(btnNew.getText().equals("New")){
            EnabledTrue();
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
            txtProductID.requestFocus();
        }
        else if(btnNew.getText().equals("Save")){
            //saveData("inertAcount");
            try{
                stm=con.createStatement();
                stm.execute("insert into product values('"+Integer.parseInt(txtProductID.getText().trim())
                    
                    +"','"+txtProduct_Name.getText().trim()
                    +"','"+cboCategory.getSelectedItem()
                    +"','"+txtPrice.getText().trim()
                    +"','"+txtSalePrice.getText().trim()
                    +"','"+txtAmount.getText().trim()+"')");

                showData();
                clearData();
            }catch(SQLException | NumberFormatException e){JOptionPane.showMessageDialog(this,e);}
            
        }
        else{
            try{
                int index=tbAccount.getSelectedRow();
                int id = Integer.parseInt(tbAccount.getValueAt(index,0).toString());
                stm=con.createStatement();
                stm.execute("update product set Product_Name='"+txtProduct_Name.getText().trim()
                    +"',Categery='"+cboCategory.getSelectedItem()
                    +"',Price_InStock='"+Double.parseDouble(txtPrice.getText().trim())
                    +"',Sale_Price='"+Integer.parseInt(txtSalePrice.getText().trim())
                    +"',Amount='"+Integer.parseInt(txtAmount.getText().trim())
                    
                    +"'where Product_ID="+id);
                showData();
                btnNew.setText("Save");
                btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
                clearData();
                txtProductID.setEnabled(true);
            }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
        }
                
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel)tbAccount.getModel();
            try{
                stm=con.createStatement();
                rst=stm.executeQuery("select * from  product where Product_ID='"+txtSearch.getText()+"'or Product_Name='"+txtSearch.getText()+"'");
                if(rst.first()){
                do{
                    mode.addRow(new String[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),   
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
                });
                }while(rst.next());
                }
                else{
                    showData();
                }
                rst.close();
                
            }catch(Exception e){
          
            }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtProductIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductIDKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtProduct_Name.requestFocus();
        }
    }//GEN-LAST:event_txtProductIDKeyReleased

    private void txtProduct_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProduct_NameKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cboCategory.requestFocus();
        }
    }//GEN-LAST:event_txtProduct_NameKeyReleased

    private void cboCategoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboCategoryKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtPrice.requestFocus();
       }
    }//GEN-LAST:event_cboCategoryKeyReleased

    private void txtSalePriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalePriceKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtAmount.requestFocus();
        }
    }//GEN-LAST:event_txtSalePriceKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtSalePrice.requestFocus();
       }
    }//GEN-LAST:event_txtPriceKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox cboCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAccount;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProduct_Name;
    private javax.swing.JTextField txtSalePrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    Connection con;
    Statement stm;
    ResultSet rst;
    DefaultTableModel mode=new DefaultTableModel();
    public void showData(){
        while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel)tbAccount.getModel();
            try{
                stm=con.createStatement();
                rst=stm.executeQuery("select * from product");
                if(rst.first()){
                   do{
                    mode.addRow(new String[]{
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),   
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
                });
                   }while(rst.next());
                   }
            
            }catch(Exception e){}
    }
    public void EnabledTrue(){
        txtProductID.setEnabled(true);
        txtProduct_Name.setEnabled(true);
        cboCategory.setEnabled(true);
        txtPrice.setEnabled(true);
        txtAmount.setEnabled(true);
        txtSalePrice.setEnabled(true);
    }
    public void EnabledFalse(){
        txtProductID.setEnabled(false);
        txtProduct_Name.setEnabled(false);
        cboCategory.setEnabled(false);
        txtPrice.setEnabled(false);
        txtAmount.setEnabled(false);
        txtSalePrice.setEnabled(false);
    }
    public void clearData(){
        txtProductID.setText(null);
        txtProduct_Name.setText(null);
        cboCategory.setSelectedItem(null);
        txtPrice.setText(null);
        txtAmount.setText(null); 
        txtSalePrice.setText(null);
    }
}
