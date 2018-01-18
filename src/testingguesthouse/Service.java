
package testingguesthouse;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Service extends javax.swing.JPanel {
        public Service() {
        initComponents();
         setSize(1257, 638);
        setLocation(400,120);
        tbService.setAutoResizeMode(tbService.AUTO_RESIZE_OFF);
        tbService.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbService.getColumnModel().getColumn(1).setPreferredWidth(363);
        tbService.getColumnModel().getColumn(2).setPreferredWidth(260);
        tbService.getColumnModel().getColumn(3).setPreferredWidth(260);
        //panelB.setBounds(580, 20, 320, 220);
        //panelB.setLayout(new FlowLayout(0,0,3));
        try{
            con=ConnectionCon.ConnectMysql();
            stm=con.createStatement();
            rst=stm.executeQuery("select * from Room");
            while(rst.next()){
                String no=rst.getString("No_Room");
                cboNo_Room.addItem(no);
            }
           
        }catch(Exception e){ JOptionPane.showMessageDialog(this,e);}
        setControlCoboBox();
         //setPriceCambo();
        EnabledFalse();
        showData();
       //loopButton();
 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPayment = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboNo_Room = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        rdioMorning = new javax.swing.JRadioButton();
        rdioAfterNon = new javax.swing.JRadioButton();
        rdioAtnigth = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcboBu = new javax.swing.JComboBox();
        lblShow = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        btnCal = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblShow2 = new javax.swing.JLabel();
        lblShow3 = new javax.swing.JLabel();
        btnPayment = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbService = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("No Room");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 167, 35);

        lblPayment.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblPayment.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(19, 228, 234)));
        jPanel1.add(lblPayment);
        lblPayment.setBounds(160, 230, 330, 35);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("Payment");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 230, 167, 35);

        cboNo_Room.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboNo_RoomKeyReleased(evt);
            }
        });
        jPanel1.add(cboNo_Room);
        cboNo_Room.setBounds(190, 10, 330, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        rdioMorning.setText("Morning");
        rdioMorning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdioMorningActionPerformed(evt);
            }
        });
        rdioMorning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rdioMorningKeyReleased(evt);
            }
        });
        jPanel3.add(rdioMorning);
        rdioMorning.setBounds(10, 20, 75, 24);

        rdioAfterNon.setText("Afternon");
        rdioAfterNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdioAfterNonActionPerformed(evt);
            }
        });
        rdioAfterNon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rdioAfterNonKeyReleased(evt);
            }
        });
        jPanel3.add(rdioAfterNon);
        rdioAfterNon.setBounds(10, 60, 81, 24);

        rdioAtnigth.setText("At night");
        rdioAtnigth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rdioAtnigthKeyReleased(evt);
            }
        });
        jPanel3.add(rdioAtnigth);
        rdioAtnigth.setBounds(10, 100, 76, 24);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(160, 50, 160, 150);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Food");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 110, 80, 35);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Drink");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 15, 70, 20);

        jcboBu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcboBuItemStateChanged(evt);
            }
        });
        jcboBu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcboBuFocusLost(evt);
            }
        });
        jcboBu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcboBuMouseClicked(evt);
            }
        });
        jcboBu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcboBuKeyReleased(evt);
            }
        });
        jPanel2.add(jcboBu);
        jcboBu.setBounds(70, 10, 220, 30);

        lblShow.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblShow.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 75, 255), null));
        jPanel2.add(lblShow);
        lblShow.setBounds(10, 60, 80, 30);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel2.setText("Qty");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(100, 60, 60, 30);

        txtQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtyFocusLost(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtyKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });
        jPanel2.add(txtQty);
        txtQty.setBounds(170, 60, 120, 26);

        btnCal.setText("Cal");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });
        btnCal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnCalKeyReleased(evt);
            }
        });
        jPanel2.add(btnCal);
        btnCal.setBounds(220, 100, 70, 28);

        lblTotal.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(237, 34, 34), null));
        jPanel2.add(lblTotal);
        lblTotal.setBounds(100, 100, 110, 30);

        lblShow2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jPanel2.add(lblShow2);
        lblShow2.setBounds(10, 60, 80, 30);

        lblShow3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblShow3.setText("Total Pay");
        jPanel2.add(lblShow3);
        lblShow3.setBounds(10, 100, 80, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(330, 50, 300, 150);

        btnPayment.setText("Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        btnPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnPaymentKeyReleased(evt);
            }
        });
        jPanel1.add(btnPayment);
        btnPayment.setBounds(510, 230, 90, 28);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 710, 280);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        tbService.setFont(new java.awt.Font("Khmer OS System", 1, 15)); // NOI18N
        tbService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No_Room", "Food", "Total_PayDrink", "Payment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbService.setColumnSelectionAllowed(true);
        tbService.getTableHeader().setReorderingAllowed(false);
        tbService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbServiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbService);
        tbService.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tbService.getColumnModel().getColumnCount() > 0) {
            tbService.getColumnModel().getColumn(0).setResizable(false);
            tbService.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbService.getColumnModel().getColumn(1).setResizable(false);
            tbService.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbService.getColumnModel().getColumn(2).setResizable(false);
            tbService.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 1040, 220);

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setText("Search");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 10, 167, 35);

        txtSearch.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel5.add(txtSearch);
        txtSearch.setBounds(190, 10, 337, 35);

        add(jPanel5);
        jPanel5.setBounds(10, 310, 1060, 280);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        btnNew.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-natural-user-interface-2-30.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel4.add(btnNew);
        btnNew.setBounds(10, 10, 140, 30);

        btnDelete.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-30.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete);
        btnDelete.setBounds(10, 50, 140, 30);

        add(jPanel4);
        jPanel4.setBounds(740, 170, 160, 90);
        add(jLabel8);
        jLabel8.setBounds(940, 260, 0, 40);
    }// </editor-fold>//GEN-END:initComponents

        
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            int index=tbService.getSelectedRow();
            int id=Integer.parseInt(tbService.getValueAt(index,0).toString());
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

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if(btnNew.getText().equals("New")){
            EnabledTrue();
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
            cboNo_Room.requestFocus();
        }
        else if(btnNew.getText().equals("Save")){
            //saveData("inertAcount");
            try{
                String nor="";
                String after="";
                String night="";
                String at="";
                /*
                if(rdioMorning.isSelected()){
                    at = rdioMorning.getText().toString();
                }
                else if(rdioMorning.isSelected() && rdioAfterNon.isSelected()||){
                    at = rdioMorning.getText()+"-"+rdioAfterNon.getText();
                }
                else if(rdioMorning.isSelected() && rdioAfterNon.isSelected()&&rdioAtnigth.isSelected()){
                    at = rdioMorning.getText()+"-"+rdioAfterNon.getText()+"-"+rdioAtnigth.getText();
                }
                else{
                    
                    at="";
                }*/
                if(rdioMorning.isSelected()){
                   // nor="Noring";
                    nor=rdioMorning.getText();
                }
                if(rdioAfterNon.isSelected()){
                    after=rdioAfterNon.getText();
                }
                if(rdioAtnigth.isSelected()){
                    night=rdioAtnigth.getText();
                }
                at=nor+"_"+after+"_"+night;
                stm=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                stm.execute("insert into service values('"+cboNo_Room.getSelectedItem().toString()
                    +"','"+at
                    +"','"+Double.parseDouble(lblPayment.getText())
                        
                    +"')");

                showData();
                //clearData();
            }catch(SQLException | NumberFormatException e){JOptionPane.showMessageDialog(this,e);}
            //JOptionPane.showMessageDialog(this,"Was Saved");
        }
        else{
            try{
                int index=tbService.getSelectedRow();
                int id = Integer.parseInt(tbService.getValueAt(index,0).toString());
                stm=con.createStatement();
                stm.execute("update account set Nam='"//+lFood.getToolTipText()
                    
                    //+"',Position='"+lDrink.getToolTipText()
                    +"',Password='"+lblPayment.getText().trim()
                    +"'where ID="+id);
                showData();
                btnNew.setText("Update");
                btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
                clearData();
            }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void tbServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbServiceMouseClicked
        /*if(evt.getClickCount()==2){
            int index=tbAccount.getSelectedRow();
            //while(mode.getRowCount()>0)
            txtID.setText(tbAccount.getValueAt(index, 0).toString());
            txtName.setText(tbAccount.getValueAt(index,1).toString());
            cboGender.setSelectedItem(tbAccount.getValueAt(index,2).toString());
            txtPosition.setText(tbAccount.getValueAt(index,3).toString());
            txtEmail.setText(tbAccount.getValueAt(index,4).toString());
            txtPassword.setText(tbAccount.getValueAt(index,5).toString());
            btnDelete.setEnabled(true);
            btnNew.setText("Update");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-30.png")));

        }
                */

    }//GEN-LAST:event_tbServiceMouseClicked

    private void rdioMorningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdioMorningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdioMorningActionPerformed

    private void rdioAfterNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdioAfterNonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdioAfterNonActionPerformed

    private void jcboBuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcboBuItemStateChanged
         
      //  lblShow.setText(jcboBu.getSelectedItem().toString())
    }//GEN-LAST:event_jcboBuItemStateChanged

    private void jcboBuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcboBuMouseClicked
       /// lblShow.setText(jcboBu.getSelectedItem().toString());
    }//GEN-LAST:event_jcboBuMouseClicked

    private void jcboBuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcboBuFocusLost
            try{
            stm=con.createStatement();
            rst=stm.executeQuery("select * from product where Product_Name ='"+jcboBu.getSelectedItem().toString()+"'");
                while(rst.next()){
                double price=Double.parseDouble( rst.getString(5));
                lblShow.setText(price+"");
            }
        }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
        
    }//GEN-LAST:event_jcboBuFocusLost

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        int qty=Integer.parseInt(txtQty.getText());
        float price=Float.parseFloat(lblShow.getText());
        //lblTotal.setText(total_Service(price,qty)+"");
        pay=Float.parseFloat(total_Service(price, qty)+"");
        //pay =Float.parseFloat(lblTotal.getText());
        cal_Total+=pay;
        lblTotal.setText(cal_Total+"");
        txtQty.setText(0+"");
    }//GEN-LAST:event_btnCalActionPerformed

    private void cboNo_RoomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboNo_RoomKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            rdioMorning.requestFocus();
        }
    }//GEN-LAST:event_cboNo_RoomKeyReleased

    private void rdioAfterNonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdioAfterNonKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            rdioAtnigth.requestFocus();
        }
    }//GEN-LAST:event_rdioAfterNonKeyReleased

    private void rdioAtnigthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdioAtnigthKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           jcboBu.requestFocus();
       }
    }//GEN-LAST:event_rdioAtnigthKeyReleased

    private void rdioMorningKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdioMorningKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            rdioAfterNon.requestFocus();
        }
    }//GEN-LAST:event_rdioMorningKeyReleased

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        if(rdioMorning.isSelected()){
            r1=2;
        }
        else {
            r1=0;
        }
        if(rdioAfterNon.isSelected()){
            r2=2;
        }
        else {
            r2=0;
        }
        if(rdioAtnigth.isSelected()){
            r3=2;
        }
        else{
            r3=0; 
        }
        
        float d=Float.parseFloat(lblTotal.getText());
        double rT=r1+r2+r3+d;
        lblPayment.setText(rT+"");
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void jcboBuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcboBuKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtQty.requestFocus();
        }
    }//GEN-LAST:event_jcboBuKeyReleased

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnCal.requestFocus();
        }
    }//GEN-LAST:event_txtQtyKeyReleased

    private void btnCalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCalKeyReleased
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          btnPayment.requestFocus();
      }
    }//GEN-LAST:event_btnCalKeyReleased

    private void btnPaymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPaymentKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnNew.requestFocus();
        }
    }//GEN-LAST:event_btnPaymentKeyReleased

    private void txtQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusLost
        if(txtQty.getText().equals("")){
        int aske=JOptionPane.showConfirmDialog(this,"Do you want buys product ?","Product",JOptionPane.YES_NO_OPTION);
        if(aske==JOptionPane.YES_OPTION){
            txtQty.setText(1+"");
            txtQty.requestFocus();
        }
        else{
            txtQty.setText(0+"");
            btnCal.requestFocus();
        }
        }
    }//GEN-LAST:event_txtQtyFocusLost

    private void txtQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyTyped
        char ch=evt.getKeyChar();
        if(!(Character.isDigit(ch))|ch==32){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtQtyKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPayment;
    private javax.swing.JComboBox cboNo_Room;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcboBu;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblShow2;
    private javax.swing.JLabel lblShow3;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rdioAfterNon;
    private javax.swing.JRadioButton rdioAtnigth;
    private javax.swing.JRadioButton rdioMorning;
    private javax.swing.JTable tbService;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    ResultSet rst;
    Statement stm;
    Connection con;
    int row;
    float r1,r2,r3;
    String no;
    float pay;
    String sale_Price;
    double total_price,cal_Total=0,cal;
    
    //java.util.Vector<String> vProName =  new java.util.Vector<> ();
    DefaultTableModel mode=new DefaultTableModel();
    Font font=new Font("Serif",Font.BOLD,12);
    //JScrollPane j=new JScrollPane(panelB);
    public void EnabledTrue(){
            cboNo_Room.setEnabled(true);
           rdioMorning.setEnabled(true);
            rdioAfterNon.setEnabled(true);
            rdioAtnigth.setEnabled(true);
            jcboBu.setEnabled(true);
            txtQty.setEnabled(true);
            lblPayment.setEnabled(true);
            btnCal.setEnabled(true);
            btnPayment.setEnabled(true);
    }
        public void EnabledFalse(){
            cboNo_Room.setEnabled(false);
           rdioMorning.setEnabled(false);
            rdioAfterNon.setEnabled(false);
            rdioAtnigth.setEnabled(false);
            jcboBu.setEnabled(false);
            txtQty.setEnabled(false);
            btnCal.setEnabled(false);
            btnPayment.setEnabled(false);
            //lblPayment.setEnabled(false);
    }
    public void showData(){
        try{
        
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel)tbService.getModel();
                stm=con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_SENSITIVE);
                rst=stm.executeQuery("select * from service ");
                //while(true){
                    if(rst.next()){
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
                  //  }
                    //break;
                }
            
        }catch(Exception e){
            
        }
    }
    public void clearData(){
            cboNo_Room.setSelectedItem(null);
            //lFood.setToolTipText(null);
            //lDrink.setToolTipText(null);
            //txtAmount.setText(null);
            //txtPrice.setText(null);
            lblPayment.setText(null);
    }
    public double Pay(double m,double p){
        return m*p;
    }
    /*
    public static final int coun=50;
        
    JButton[] button=new JButton[200];
        
    public void loopButton(){
       try{
           con=ConnectionCon.ConnectMysql();
           stm=con.createStatement();
           rst=stm.executeQuery("select count(*) from product");
           while(rst.next()){
              row=rst.getInt(1);
                 lblCount.setText(row+"");
           }
        //      vProName.clear();
                for(i=1;i<=row;i++){
                    
                    stm=con.createStatement();
                    rst=stm.executeQuery("select Product_Name from product where Product_ID="+i);
                    while (rst.next()){
                        no=rst.getString("Product_Name");
                    }      
            ///       vProName.add(no);
                    button[i]=new JButton(no);
                    //button[i].setBounds(10,10,100,40);
                    panelB.add(button[i]);
                    button[i].setFont(font);
                    button[i].addActionListener((ActionEvent e) -> {
                        /*try {
                            con=ConnectionCon.ConnectMysql();
                            stm=con.createStatement();
                            rst=stm.executeQuery("select * from product where Product_ID="+button[i].getText());
                            while (rst.next()) {
                                String name1 = rst.getString(5);
                                lblPrice.setText(name1);
                            }
                        }catch (Exception ex) {
                            JOptionPane.showMessageDialog(null,ex);
                        }*/
                       // JOptionPane.showMessageDialog(null, vProName.get(i));
    //                });
       //    }
             
           /*
        for(int i=0;i<coun;i++){
           
           button[i]=new JButton("Button");
           button[i].setBounds(100,50, 10,50);
           panelB.add(button[i]);
        }
      
       }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
          
    }
*/
/*
    public void countProduct(){
        try{
            con=ConnectionCon.ConnectMysql();
            stm=con.createStatement();
            con=ConnectionCon.ConnectMysql();
           stm=con.createStatement();
           rst=stm.executeQuery("select count(*) from product");
           while(rst.next()){
              row=rst.getInt(1);
                 lblCount.setText(row+"");
           }
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,e);
        }
    }
    int i;
*/
    public void setControlCoboBox(){
       try{
           // jcboBu.addItem("");
            stm=con.createStatement();
            rst=stm.executeQuery("select * from product");
            while(rst.next()){
                String no=rst.getString("Product_Name");
                jcboBu.addItem(no);
            }
        }catch(Exception e){ JOptionPane.showMessageDialog(this,e);} 
      //  lblShow.setText(jcboBu.getSelectedItem().toString());
    }
    public void setPriceCambo(){
        try{
            con=ConnectionCon.ConnectMysql();
            stm=con.createStatement();
            rst=stm.executeQuery("select * from product ");
            while(rst.next()){               
                String no=rst.getString("Product_Name");
                jcboBu.addItem(no);
                sale_Price=rst.getString("Sale_Price");
                lblShow.setText(sale_Price);
            }  
        }catch(Exception e){ JOptionPane.showMessageDialog(this,e);}
       //lblShow.setText(jcboBu.getSelectedItem().toString());
    }
    private float total_Service(float price,int qty){
        return (price*qty);
    }
}
