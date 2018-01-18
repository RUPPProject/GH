
package testingguesthouse;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javafx.scene.input.KeyCode;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Book extends javax.swing.JPanel {

    
    public Book() {
        initComponents();
        setSize(1238, 610);
        setLocation(350,120);
        try{
            con=ConnectionCon.ConnectMysql();
            
            stm=con.createStatement();
            rst=stm.executeQuery("select * from Room");
            while(rst.next()){
                String no=rst.getString("No_Room");
                cboNo_Room.addItem(no);
            }
            
           stm=con.createStatement();
           rst=stm.executeQuery("select * from customer");
           while(rst.next()){
               String customer=rst.getString("KH_ID");
               cboKH_ID.addItem(customer);
           }
        }catch(Exception e){}
        EnableFalse();
        showData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtStartDate = new com.toedter.calendar.JDateChooser();
        txtBook = new javax.swing.JTextField();
        txtDayStayIN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBookDate = new com.toedter.calendar.JDateChooser();
        txtPriceRoom = new javax.swing.JLabel();
        txtPay = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBook = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboNo_Room = new javax.swing.JComboBox();
        cboGender = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtRoomType = new javax.swing.JLabel();
        cboKH_ID = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Start Date");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 150, 167, 35);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Price Room");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 167, 35);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Book");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 250, 120, 35);

        txtStartDate.setDateFormatString("dd/MM/yyyy");
        txtStartDate.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        txtStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStartDateKeyReleased(evt);
            }
        });
        jPanel1.add(txtStartDate);
        txtStartDate.setBounds(150, 150, 330, 27);

        txtBook.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBookKeyReleased(evt);
            }
        });
        jPanel1.add(txtBook);
        txtBook.setBounds(150, 250, 337, 35);

        txtDayStayIN.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtDayStayIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDayStayINFocusLost(evt);
            }
        });
        txtDayStayIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDayStayINKeyReleased(evt);
            }
        });
        jPanel1.add(txtDayStayIN);
        txtDayStayIN.setBounds(150, 50, 337, 35);

        jLabel11.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel11.setText("Day Stay In");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 50, 120, 35);

        jLabel12.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel12.setText("Pay");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 200, 130, 35);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Book Date");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 100, 167, 35);

        txtBookDate.setDateFormatString("dd/MM/yyyy");
        txtBookDate.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        txtBookDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBookDateKeyReleased(evt);
            }
        });
        jPanel1.add(txtBookDate);
        txtBookDate.setBounds(150, 100, 330, 27);

        txtPriceRoom.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel1.add(txtPriceRoom);
        txtPriceRoom.setBounds(150, 10, 330, 30);

        txtPay.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel1.add(txtPay);
        txtPay.setBounds(150, 200, 330, 40);

        add(jPanel1);
        jPanel1.setBounds(500, 0, 500, 310);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        tbBook.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        tbBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Phone", "No Room", "Room Type", "Book Date", "Day Stay In", "Start Date", "Price Room", "Pay", "Book"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBook.getTableHeader().setReorderingAllowed(false);
        tbBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBook);
        if (tbBook.getColumnModel().getColumnCount() > 0) {
            tbBook.getColumnModel().getColumn(0).setResizable(false);
            tbBook.getColumnModel().getColumn(1).setResizable(false);
            tbBook.getColumnModel().getColumn(2).setResizable(false);
            tbBook.getColumnModel().getColumn(3).setResizable(false);
            tbBook.getColumnModel().getColumn(4).setResizable(false);
            tbBook.getColumnModel().getColumn(5).setResizable(false);
            tbBook.getColumnModel().getColumn(6).setResizable(false);
            tbBook.getColumnModel().getColumn(7).setResizable(false);
            tbBook.getColumnModel().getColumn(8).setResizable(false);
            tbBook.getColumnModel().getColumn(9).setResizable(false);
            tbBook.getColumnModel().getColumn(10).setResizable(false);
            tbBook.getColumnModel().getColumn(11).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 1200, 220);

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setText("Search");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 10, 167, 35);

        jTextField13.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel5.add(jTextField13);
        jTextField13.setBounds(190, 10, 337, 35);

        add(jPanel5);
        jPanel5.setBounds(10, 330, 1220, 280);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("ID");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(14, 14, 167, 35);

        txtName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(130, 60, 337, 35);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("Name");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(14, 61, 167, 35);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setText("Gender");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(14, 108, 167, 35);

        txtPhone.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneKeyReleased(evt);
            }
        });
        jPanel2.add(txtPhone);
        txtPhone.setBounds(140, 160, 337, 35);

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setText("Phone");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(14, 155, 167, 35);

        jLabel10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel10.setText("No Room");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 210, 110, 35);

        cboNo_Room.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboNo_Room.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboNo_RoomFocusLost(evt);
            }
        });
        cboNo_Room.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboNo_RoomKeyReleased(evt);
            }
        });
        jPanel2.add(cboNo_Room);
        cboNo_Room.setBounds(140, 210, 330, 30);

        cboGender.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        cboGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboGenderKeyReleased(evt);
            }
        });
        jPanel2.add(cboGender);
        cboGender.setBounds(140, 110, 330, 30);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("Room Type");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 260, 120, 35);

        txtRoomType.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel2.add(txtRoomType);
        txtRoomType.setBounds(140, 260, 330, 30);

        cboKH_ID.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboKH_ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboKH_IDFocusLost(evt);
            }
        });
        cboKH_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboKH_IDKeyReleased(evt);
            }
        });
        jPanel2.add(cboKH_ID);
        cboKH_ID.setBounds(130, 10, 340, 30);

        add(jPanel2);
        jPanel2.setBounds(10, 0, 480, 320);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jButton1.setText("Brows");
        jPanel4.add(jButton1);
        jButton1.setBounds(1160, 210, 57, 29);

        txtDelete.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-30.png"))); // NOI18N
        txtDelete.setText("Delete");
        txtDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(txtDelete);
        txtDelete.setBounds(10, 60, 150, 40);

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
        btnNew.setBounds(10, 10, 150, 40);

        add(jPanel4);
        jPanel4.setBounds(1010, 70, 190, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void cboNo_RoomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboNo_RoomFocusLost
         try{
            stm=con.createStatement();
            rst=stm.executeQuery("select * from Room where No_Room="+cboNo_Room.getSelectedItem().toString());
            while(rst.next()){
                txtPriceRoom.setText(rst.getString(6));
                txtRoomType.setText(rst.getString(2));
            }
            rst.close();
            stm.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,e);}
    }//GEN-LAST:event_cboNo_RoomFocusLost

    private void cboNo_RoomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboNo_RoomKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtDayStayIN.requestFocus();
        }
    }//GEN-LAST:event_cboNo_RoomKeyReleased

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        switch (btnNew.getText()) {
            case "New":
                EnabledTrue();
                btnNew.setText("Save");
                btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
                break;
            case "Save":
                 book=Integer.parseInt(txtBook.getText().trim());
                priceR=Integer.parseInt(txtPriceRoom.getText().trim());
                int stayIn=Integer.parseInt(txtDayStayIN.getText().trim());
                 pay1=Double.parseDouble(txtPay.getText().trim());
                if(book<=pay1){
                try{
                    stm=con.createStatement();
                    stm.execute("insert into book values ('"+Integer.parseInt(cboKH_ID.getSelectedItem().toString())
                            +"','"+txtName.getText().toUpperCase()
                            +"','"+cboGender.getSelectedItem().toString()
                            +"','"+txtPhone.getText().trim()
                            +"','"+Integer.parseInt(cboNo_Room.getSelectedItem().toString())
                            +"','"+txtRoomType.getText().trim()
                            +"','"+priceR
                            +"','"+txtDayStayIN.getText().trim()
                            +"','"+((JTextField)txtBookDate.getDateEditor().getUiComponent()).getText()  
                            +"','"+((JTextField)txtStartDate.getDateEditor().getUiComponent()).getText()
                            +"','"+txtPay.getText().trim()
                            +"','"+book
                            +"') ");
                    
                    clearData();
                    showData();
                    
                }catch(SQLException | NumberFormatException e){JOptionPane.showMessageDialog(this,e);}
                
                }
                else {
                    JOptionPane.showMessageDialog(null,"កក់លើស");
                    txtBook.requestFocus();
                    txtBook.setText(null);
                }
            break;
           case"Update":
               try{ 
                   
                   if(book<=pay1){
                   int index=tbBook.getSelectedRow();
                   int id=Integer.parseInt(tbBook.getValueAt(index,0).toString());
                   stm=con.createStatement();
                   stm.execute("update book set Name='"+txtName.getText().trim()
                           +"',Gender='"+cboGender.getSelectedItem().toString()
                           +"',Phone='"+txtPhone.getText().trim()
                           +"',No_Room='"+cboNo_Room.getSelectedItem()
                           +"',Room_Type='"+txtRoomType.getText()
                           +"',PriceRoom='"+txtPriceRoom.getText().trim()
                           +"',DayStayIn='"+txtDayStayIN.getText().trim()
                           +"',BookDate='"+((JTextField)txtBookDate.getDateEditor().getUiComponent()).getText()
                           +"',StartDate='"+((JTextField)txtStartDate.getDateEditor().getUiComponent()).getText()
                           +"',Pay='"+txtPay.getText().trim()
                           +"',Book='"+txtBook.getText().trim()
                           +"'where ID="+id);
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"អតិថិជនកក់លុយលើស!");
                       txtBook.setText(null);
                       txtBook.requestFocus();
                   }
                   btnNew.setText("Save");
                   btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
                   showData();
                   clearData();
                   cboKH_ID.setEnabled(true);
                    stm.close();
                   stm.close();
                   
                   
               }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
                break;
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
       try{
           int index=tbBook.getSelectedRow();
           int id=Integer.parseInt(tbBook.getValueAt(index,0).toString());
           stm=con.createStatement();
           stm.execute("delete from book where ID="+id);
           btnNew.setText("Save");
           btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
           showData();
           clearData();
       }catch(NumberFormatException | SQLException e){}
    }//GEN-LAST:event_txtDeleteActionPerformed

    private void tbBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBookMouseClicked
        if(evt.getClickCount()==2){
        int index=tbBook.getSelectedRow();
        cboKH_ID.setSelectedItem(tbBook.getValueAt(index,0).toString());
        txtName.setText(tbBook.getValueAt(index,1).toString());
        cboGender.setSelectedItem(tbBook.getValueAt(index,2).toString());
        txtPhone.setText(tbBook.getValueAt(index,3).toString());
        cboNo_Room.setSelectedItem(tbBook.getValueAt(index,4).toString());
        txtRoomType.setText(tbBook.getValueAt(index,5).toString());
        txtPriceRoom.setText(tbBook.getValueAt(index,6).toString());
        txtDayStayIN.setText(tbBook.getValueAt(index,7).toString());
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            String bd=tbBook.getValueAt(index,8).toString();
            java.util.Date d=sdf.parse(bd);
            txtBookDate.setDate(d);
            String sd=tbBook.getValueAt(index,9).toString();
            java.util.Date d1=sdf.parse(sd);
            txtStartDate.setDate(d1);
        
        }catch(Exception e){}
        txtPay.setText(tbBook.getValueAt(index,10).toString());
        txtBook.setText(tbBook.getValueAt(index,11).toString());
        EnabledTrue();
        cboKH_ID.setEnabled(false);
        btnNew.setText("Update");
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-30.png")));
        }
    }//GEN-LAST:event_tbBookMouseClicked

    private void txtDayStayINFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayStayINFocusLost
        
        
    }//GEN-LAST:event_txtDayStayINFocusLost

    private void txtBookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookKeyReleased
        double pay=Double.parseDouble(txtPay.getText());
        double book=Double.parseDouble(txtBook.getText().trim());
        if(pay<book){
            JOptionPane.showMessageDialog(this,"Book not coorect");
            txtBook.requestFocus();
            txtBook.setText(null);
        }
        
    }//GEN-LAST:event_txtBookKeyReleased

    private void txtDayStayINKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayStayINKeyReleased
           double stayin=Double.parseDouble(txtDayStayIN.getText());
            double price=Double.parseDouble(txtPriceRoom.getText());
            if(stayin>0){
          txtPay.setText(Pay(stayin,price)+"");  
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Number");
            }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtBookDate.requestFocus();
            
       }
       
    }//GEN-LAST:event_txtDayStayINKeyReleased

    private void cboKH_IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboKH_IDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cboKH_IDFocusLost

    private void cboKH_IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboKH_IDKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtName.requestFocus();
        }
    }//GEN-LAST:event_cboKH_IDKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cboGender.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void cboGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboGenderKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtPhone.requestFocus();
        }
    }//GEN-LAST:event_cboGenderKeyReleased

    private void txtPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cboNo_Room.requestFocus();
        }
    }//GEN-LAST:event_txtPhoneKeyReleased

    private void txtBookDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookDateKeyReleased
        try{
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtStartDate.requestFocus();
        }
        }catch(Exception e){}
    }//GEN-LAST:event_txtBookDateKeyReleased

    private void txtStartDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartDateKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtBook.requestFocus();
        }
    }//GEN-LAST:event_txtStartDateKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox cboGender;
    private javax.swing.JComboBox cboKH_ID;
    private javax.swing.JComboBox cboNo_Room;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTable tbBook;
    private javax.swing.JTextField txtBook;
    private com.toedter.calendar.JDateChooser txtBookDate;
    private javax.swing.JTextField txtDayStayIN;
    private javax.swing.JButton txtDelete;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtPay;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JLabel txtPriceRoom;
    private javax.swing.JLabel txtRoomType;
    private com.toedter.calendar.JDateChooser txtStartDate;
    // End of variables declaration//GEN-END:variables
    Statement stm;
    Connection con;
    ResultSet rst;
    DefaultTableModel mode=new DefaultTableModel();
    
    public void EnableFalse(){
        cboKH_ID.setEnabled(false);
        txtName.setEnabled(false);
        cboGender.setEnabled(false);
        cboNo_Room.setEnabled(false);
        txtPhone.setEnabled(false);
        cboNo_Room.setEnabled(false);
        //txtRoomType.setEnabled(false);
        txtBookDate.setEnabled(false);
        txtStartDate.setEnabled(false);
        //txtPriceRoom.setEnabled(false);
        txtBook.setEnabled(false);
        txtDayStayIN.setEnabled(false);
        //txtPay.setEnabled(false);
        
        
    }
    public void EnabledTrue(){
        cboKH_ID.setEnabled(true);
        txtName.setEnabled(true);
        cboGender.setEnabled(true);
        cboNo_Room.setEnabled(true);
        txtPhone.setEnabled(true);
        //cboNo_Room.setEnabled(true);
        //txtRoomType.setText(false);
        txtBookDate.setEnabled(true);
        txtStartDate.setEnabled(true);
        //txtPriceRoom.setEditable(true);
        txtBook.setEnabled(true);
        txtDayStayIN.setEnabled(true);
        //txtPay.setEditable(false);
    }
    public void clearData(){
        cboKH_ID.setSelectedItem(null);
        txtName.setText(null);
        cboGender.setSelectedItem(null);
        cboNo_Room.setSelectedItem(null);
        txtPhone.setText(null);
        txtRoomType.setText(null);
        txtBookDate.setDate(null);
        txtStartDate.setDate(null);
        txtPriceRoom.setText(null);
        txtBook.setText(null);
        txtDayStayIN.setText(null);
        txtPay.setText(null);
    }
    public void showData(){
       try{
        while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel)tbBook.getModel();
            stm=con.createStatement();
            rst=stm.executeQuery("select * from book ");
            if(rst.first()){
                do{
                    mode.addRow(new String[]{
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        rst.getString(6),
                        rst.getString(7),
                        rst.getString(8),
                        rst.getString(9),
                        rst.getString(10),
                        rst.getString(11),
                        rst.getString(12)
                        
                    });
                }while(rst.next());
            }
       }catch(Exception e){}          
    }
    
    public double Pay(double p,double r){
        return p*r;
    }
    
                
    double pay,a,pay1;
    int book,priceR;
}
