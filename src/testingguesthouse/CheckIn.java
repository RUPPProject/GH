
package testingguesthouse;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;


public final class CheckIn extends javax.swing.JPanel {

    public CheckIn() {
        initComponents();
        setSize(1303, 639);
        setLocation(150,120);
        
        tbCheckIn.setAutoResizeMode(tbCheckIn.AUTO_RESIZE_OFF);
        tbCheckIn.getColumnModel().getColumn(0).setPreferredWidth(70);
        tbCheckIn.getColumnModel().getColumn(1).setPreferredWidth(105);
        tbCheckIn.getColumnModel().getColumn(2).setPreferredWidth(105);
        tbCheckIn.getColumnModel().getColumn(3).setPreferredWidth(105);
        tbCheckIn.getColumnModel().getColumn(4).setPreferredWidth(105);
        tbCheckIn.getColumnModel().getColumn(5).setPreferredWidth(105);
        tbCheckIn.getColumnModel().getColumn(6).setPreferredWidth(105);
        tbCheckIn.getColumnModel().getColumn(7).setPreferredWidth(150);
        tbCheckIn.getColumnModel().getColumn(8).setPreferredWidth(150);
        tbCheckIn.getColumnModel().getColumn(9).setPreferredWidth(130);
        tbCheckIn.getColumnModel().getColumn(10).setPreferredWidth(103);
        
        //Tatal1();
        try{
            con=ConnectionCon.ConnectMysql();
            
                    stm=con.createStatement();
                    rst=stm.executeQuery("select * from Room");
                while(rst.next()){
                    
                    String no = rst.getString("No_Room");
                    cboNoRoom.addItem(no);
                }
              stm=con.createStatement();
              rst=stm.executeQuery("select * from customer");
              while(rst.next()){
                  String no_room=rst.getString("KH_ID");
                  cboKH_ID.addItem(no_room);
              }
          }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
        showData();
        EnableFalse();
        
        btnDelete.setEnabled(false);
       
    }
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        cboNoRoom = new javax.swing.JComboBox();
        cboGender = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cboKH_ID = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnDelete1 = new javax.swing.JButton();
        btnNew1 = new javax.swing.JButton();
        lblPay = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCheckIn = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMemberInRoom = new javax.swing.JTextField();
        txtLeaveDate = new com.toedter.calendar.JDateChooser();
        txtStartDate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtDayStayIn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblVariable = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel6 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnDelete3 = new javax.swing.JButton();
        btnNew3 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("KH_ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(14, 14, 167, 35);

        txtName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
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

        lblPrice.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblPrice);
        lblPrice.setBounds(190, 200, 340, 35);

        cboNoRoom.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboNoRoom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboNoRoomFocusLost(evt);
            }
        });
        cboNoRoom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboNoRoomKeyReleased(evt);
            }
        });
        jPanel1.add(cboNoRoom);
        cboNoRoom.setBounds(190, 160, 340, 32);

        cboGender.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(cboGender);
        cboGender.setBounds(190, 110, 340, 32);

        jLabel15.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel15.setText("Price ");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 200, 167, 35);

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
        jPanel1.add(cboKH_ID);
        cboKH_ID.setBounds(190, 10, 340, 32);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("No Room");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(14, 155, 167, 35);

        add(jPanel1);
        jPanel1.setBounds(10, 0, 540, 250);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        btnDelete1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-30.png"))); // NOI18N
        btnDelete1.setText("Delete");
        btnDelete1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete1);
        btnDelete1.setBounds(10, 50, 140, 30);

        btnNew1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnNew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-natural-user-interface-2-30.png"))); // NOI18N
        btnNew1.setText("New");
        btnNew1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNew1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnNew1);
        btnNew1.setBounds(10, 10, 140, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(1120, 50, 160, 90);

        lblPay.setBackground(new java.awt.Color(138, 243, 241));
        lblPay.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblPay.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(194, 53, 53), new java.awt.Color(84, 202, 224)));
        jPanel3.add(lblPay);
        lblPay.setBounds(110, 10, 150, 35);

        lblTotal.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(88, 105, 217), new java.awt.Color(47, 90, 240)));
        jPanel3.add(lblTotal);
        lblTotal.setBounds(510, 10, 210, 35);

        jLabel12.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel12.setText("Pay");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(10, 10, 70, 35);

        jLabel14.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel14.setText("Customer Check In");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(280, 10, 220, 35);

        add(jPanel3);
        jPanel3.setBounds(160, 270, 740, 50);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        tbCheckIn.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        tbCheckIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KH_ID", "Name", "Gender", "No_Room", "Price", "Variable", "Day Stay In", "Start Date", "Leave Date", "Member In Room", "Pay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCheckIn.getTableHeader().setReorderingAllowed(false);
        tbCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCheckInMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCheckIn);
        if (tbCheckIn.getColumnModel().getColumnCount() > 0) {
            tbCheckIn.getColumnModel().getColumn(0).setResizable(false);
            tbCheckIn.getColumnModel().getColumn(1).setResizable(false);
            tbCheckIn.getColumnModel().getColumn(2).setResizable(false);
            tbCheckIn.getColumnModel().getColumn(3).setResizable(false);
            tbCheckIn.getColumnModel().getColumn(4).setResizable(false);
            tbCheckIn.getColumnModel().getColumn(5).setResizable(false);
            tbCheckIn.getColumnModel().getColumn(6).setResizable(false);
            tbCheckIn.getColumnModel().getColumn(7).setResizable(false);
            tbCheckIn.getColumnModel().getColumn(8).setResizable(false);
            tbCheckIn.getColumnModel().getColumn(9).setResizable(false);
            tbCheckIn.getColumnModel().getColumn(10).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 1240, 220);

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setText("Search");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 10, 167, 35);

        jTextField13.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel5.add(jTextField13);
        jTextField13.setBounds(190, 10, 337, 35);

        add(jPanel5);
        jPanel5.setBounds(10, 340, 1260, 280);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Start Date");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 110, 167, 35);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Leave Date");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 160, 167, 35);

        txtMemberInRoom.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel2.add(txtMemberInRoom);
        txtMemberInRoom.setBounds(210, 210, 337, 35);

        txtLeaveDate.setDateFormatString("dd/MM/yyyy");
        txtLeaveDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLeaveDateKeyReleased(evt);
            }
        });
        jPanel2.add(txtLeaveDate);
        txtLeaveDate.setBounds(210, 160, 330, 30);

        txtStartDate.setDateFormatString("dd/MM/yyyy");
        txtStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStartDateKeyReleased(evt);
            }
        });
        jPanel2.add(txtStartDate);
        txtStartDate.setBounds(210, 110, 330, 30);

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setText("Day Stay In");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 50, 167, 35);

        txtDayStayIn.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtDayStayIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDayStayInFocusLost(evt);
            }
        });
        txtDayStayIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDayStayInKeyReleased(evt);
            }
        });
        jPanel2.add(txtDayStayIn);
        txtDayStayIn.setBounds(210, 50, 337, 35);

        jLabel10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel10.setText("Member In Room");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 210, 190, 35);

        lblVariable.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel2.add(lblVariable);
        lblVariable.setBounds(210, 10, 330, 35);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setText("Viriable");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 10, 167, 35);

        add(jPanel2);
        jPanel2.setBounds(560, 0, 550, 250);
        add(jOptionPane1);
        jOptionPane1.setBounds(1250, 170, 10, 30);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);

        btnNew.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-natural-user-interface-2-30.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel6.add(btnNew);
        btnNew.setBounds(10, 10, 140, 30);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(null);

        btnDelete3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnDelete3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-30.png"))); // NOI18N
        btnDelete3.setText("Delete");
        btnDelete3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete3ActionPerformed(evt);
            }
        });
        jPanel7.add(btnDelete3);
        btnDelete3.setBounds(10, 50, 140, 30);

        btnNew3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnNew3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-natural-user-interface-2-30.png"))); // NOI18N
        btnNew3.setText("New");
        btnNew3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNew3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNew3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew3ActionPerformed(evt);
            }
        });
        jPanel7.add(btnNew3);
        btnNew3.setBounds(10, 10, 140, 30);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(1120, 50, 160, 90);

        btnDelete.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-30.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel6.add(btnDelete);
        btnDelete.setBounds(10, 50, 140, 30);

        add(jPanel6);
        jPanel6.setBounds(1130, 80, 160, 90);
    }// </editor-fold>//GEN-END:initComponents

    private void tbCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCheckInMouseClicked
        if(evt.getClickCount()==2){
            int index=tbCheckIn.getSelectedRow();
           cboKH_ID.setSelectedItem(tbCheckIn.getValueAt(index,0).toString());
            txtName.setText(tbCheckIn.getValueAt(index,1).toString());
            cboGender.setSelectedItem(tbCheckIn.getValueAt(index, 2));
            cboNoRoom .setSelectedItem(tbCheckIn.getValueAt(index,3).toString());
            lblPrice.setText(tbCheckIn.getValueAt(index,4).toString());
            lblVariable.setText(tbCheckIn.getValueAt(index,5).toString());
            txtDayStayIn.setText(tbCheckIn.getValueAt(index,6).toString());
            
            
            try {
                String sd=tbCheckIn.getValueAt(index,7).toString();
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date d=sdf.parse(sd);
                txtStartDate.setDate(d);
                
                String ld=tbCheckIn.getValueAt(index, 8).toString();
                SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date dl=sdf1.parse(ld);
                txtLeaveDate.setDate(dl);
            } catch (ParseException ex) {
                
            }
            txtMemberInRoom.setText(tbCheckIn.getValueAt(index, 9).toString());
            lblPay.setText(tbCheckIn.getValueAt(index,10).toString());
            btnDelete.setEnabled(true);
            
        }
         
         btnNew.setText("Update");
         btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-30.png")));
         EnabledTrue();
        // btnDelete.setEnabled(false);
    }//GEN-LAST:event_tbCheckInMouseClicked

    private void cboNoRoomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboNoRoomFocusLost
        try{
            con=ConnectionCon.ConnectMysql();
            stm=con.createStatement();            
            rst=stm.executeQuery("select * from Room where No_Room="+Integer.parseInt(cboNoRoom.getSelectedItem().toString()));
            while(rst.next()){
                lblPrice.setText(rst.getString(7));
                lblVariable.setText(rst.getString(3));
            }
        }catch(SQLException | NumberFormatException e){
            
        }
    }//GEN-LAST:event_cboNoRoomFocusLost

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNew1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNew1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            int index=tbCheckIn.getSelectedRow();
            int id=Integer.parseInt(tbCheckIn.getValueAt(index,0).toString());
            stm=con.createStatement();
            stm.execute("delete from checkIn where KH_ID="+id);
            showData();
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
            subRow();
            btnDelete.setEnabled(false);
            DeleteUpdateRoom();
        }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if(btnNew.getText().equals("New")){
            EnabledTrue();
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
            cboKH_ID.requestFocus();
        }
        else if(btnNew.getText().equals("Save")){
            try{
                updateRoom();
                //lblVariable.setText("F");
                con=ConnectionCon.ConnectMysql();
                stm=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                stm.execute("insert into checkIn values('"+Integer.parseInt(cboKH_ID.getSelectedItem().toString())
                        +"','"+txtName.getText().trim()
                        +"','"+cboGender.getSelectedItem().toString()
                        +"','"+cboNoRoom.getSelectedItem()
                        +"','"+Double.parseDouble(lblPrice.getText())
                        +"','"+lblVariable.getText()
                        +"','"+txtDayStayIn.getText().trim()
                        +"','"+((JTextField)txtStartDate.getDateEditor().getUiComponent()).getText()
                        +"','"+((JTextField)txtLeaveDate.getDateEditor().getUiComponent()).getText()
                        +"','"+txtMemberInRoom.getText().trim()
                        +"','"+Double.parseDouble(lblPay.getText())+"')");
                showData();
                Tatal1();
                
            }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
            
        }
        else {
            try{
                int index=tbCheckIn.getSelectedRow();
                int id=Integer.parseInt(tbCheckIn.getValueAt(index,0).toString());
                stm=con.createStatement();
                stm.execute("update checkIn set Name='"+txtName.getText().trim()
                        +"',Gender='"+cboGender.getSelectedItem().toString()
                        +"',No_Room='"+cboNoRoom.getSelectedItem()
                        +"',Price='"+Double.parseDouble(lblPrice.getText())
                        +"',Variable='"+lblVariable.getText()
                        +"',DayStayIN='"+txtDayStayIn.getText().trim()
                        +"',StartDate='"+((JTextField)txtStartDate.getDateEditor().getUiComponent()).getText()
                        +"',LeaveDate='"+((JTextField)txtLeaveDate.getDateEditor().getUiComponent()).getText()
                        +"',MemberInRoom='"+txtMemberInRoom.getText().trim()
                        +"',Pay='"+Double.parseDouble(lblPay.getText())
                        +"'where KH_ID="+id);
                showData();
               
                btnNew.setText("Save");
                btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
            }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete3ActionPerformed

    private void btnNew3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNew3ActionPerformed
        
    }//GEN-LAST:event_btnNew3ActionPerformed

    private void txtDayStayInKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayStayInKeyReleased
        
        double price=Double.parseDouble(lblPrice.getText());
        double m=Double.parseDouble(txtDayStayIn.getText());
        if(m>0){
        lblPay.setText(Pay(price,m)+"");
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid Number your input!!!");
        }
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtStartDate.requestFocus();
        }
    }//GEN-LAST:event_txtDayStayInKeyReleased

    private void txtDayStayInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayStayInFocusLost
        double price=Double.parseDouble(lblPrice.getText());
        double m=Double.parseDouble(txtDayStayIn.getText());
        lblPay.setText(Pay(price,m)+"");
    }//GEN-LAST:event_txtDayStayInFocusLost

    private void cboKH_IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboKH_IDFocusLost
       try{
           con=ConnectionCon.ConnectMysql();
            stm=con.createStatement();
            rst=stm.executeQuery("select * from customer where KH_ID="+cboKH_ID.getSelectedItem().toString());
            while(rst.next()){
                txtName.setText(rst.getString(2));
            }
       }catch(Exception e){}
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

    private void cboNoRoomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboNoRoomKeyReleased
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtDayStayIn.requestFocus();
        }
    }//GEN-LAST:event_cboNoRoomKeyReleased

    private void txtStartDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartDateKeyReleased
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtLeaveDate.requestFocus();
        }
    }//GEN-LAST:event_txtStartDateKeyReleased

    private void txtLeaveDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLeaveDateKeyReleased
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtMemberInRoom.requestFocus();
        }
    }//GEN-LAST:event_txtLeaveDateKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNew1;
    private javax.swing.JButton btnNew3;
    private javax.swing.JComboBox cboGender;
    private javax.swing.JComboBox cboKH_ID;
    private javax.swing.JComboBox cboNoRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JLabel lblPay;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVariable;
    private javax.swing.JTable tbCheckIn;
    private javax.swing.JTextField txtDayStayIn;
    private com.toedter.calendar.JDateChooser txtLeaveDate;
    private javax.swing.JTextField txtMemberInRoom;
    private javax.swing.JTextField txtName;
    private com.toedter.calendar.JDateChooser txtStartDate;
    // End of variables declaration//GEN-END:variables
    int row;
    int total=0;
    
    public void showData(){
        while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel)tbCheckIn.getModel();
            try{
                stm=con.createStatement();
                rst=stm.executeQuery("select * from checkIn");
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
                         rst.getString(11)
                        });
                        
                    
                    }while(rst.next());
                }
            
            }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
    }
    public void clearData(){
         cboKH_ID.setSelectedItem(null);
         txtName.setText(null);
         cboGender.setSelectedItem(null);
         cboNoRoom.setSelectedItem(null);
         //txtPrice.setText(null);
         txtDayStayIn.setText(null);
         txtStartDate.setDate(null);
         txtLeaveDate.setDate(null);
         txtMemberInRoom.setText(null);
    }
    public void EnabledTrue(){
        cboKH_ID.setEnabled(true);
         txtName.setEnabled(true);
         cboGender.setEnabled(true);
         cboNoRoom.setEnabled(true);
         //txtPrice.setEnabled(true);
         txtDayStayIn.setEnabled(true);
         txtStartDate.setEnabled(true);
         txtLeaveDate.setEnabled(true);
         txtMemberInRoom.setEnabled(true);
        
    }
    public void EnableFalse(){
        cboKH_ID.setEnabled(false);
        txtName.setEnabled(false);
        cboGender.setEnabled(false);
        cboNoRoom.setEnabled(false);
        //txtPrice.setEnabled(false);
        txtDayStayIn.setEnabled(false);
        txtStartDate.setEnabled(false);
        txtDayStayIn.setEnabled(false);
        txtLeaveDate.setEnabled(false);
        txtMemberInRoom.setEnabled(false);
    }
    public double Pay(double p,double m){
        return p*m;
    }
    /*
    public void Total(){
    Runnable r=new Runnable() {

        @Override
        public void run() {
            try{
            stm=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rst=stm.executeQuery("select count(*) from checkIn");
            for(int i=0;i<=rst.getRow();i++){
                total=total+i;
                lblTotal.setText(total+"");            }

        }catch(Exception e){JOptionPane.showMessageDialog(null,"Dalin");}
        }
    };
    Thread th=new Thread(r);
    th.start();
    }*/
    public void Tatal1(){
        try{
            con=ConnectionCon.ConnectMysql();
            stm=con.createStatement();
            rst=stm.executeQuery("select count(*) from checkIn");
            while(rst.next()){
               row=rst.getInt(1);
                lblTotal.setText(row+"");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
    }
    public void subRow(){
        try{
            Tatal1();
            stm=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rst=stm.executeQuery("select count(*) from checkIn");
            while(rst.next()){
                row=rst.getInt(1);    
            }
            total=row-1;
            lblTotal.setText(row+"");
            
        }catch(Exception e){JOptionPane.showMessageDialog(this,e);}
    }
    public void Hide(){
       try{
           stm=con.createStatement();
           rst=stm.executeQuery("select No_Room from checkIn");
           String no=rst.getString(1);
           //qery no .eqaul==tb.getvaluat
           //
       }catch(Exception e){}
    }
   public void updateRoom(){
       try{
       
       lblVariable.setText("Not Free");
       
       stm=con.createStatement();
       stm.execute("update Room set Variable='"+lblVariable.getText()+"'where No_Room="+cboNoRoom.getSelectedItem());
       }catch(Exception e){ JOptionPane.showMessageDialog(this, e.getMessage());}
           
   }
  public void DeleteUpdateRoom(){
       try{
       
       lblVariable.setText("Free");
       
       stm=con.createStatement();
       stm.execute("update Room set Variable='"+lblVariable.getText()+"'where No_Room="+cboNoRoom.getSelectedItem());
       }catch(Exception e){ JOptionPane.showMessageDialog(this, e.getMessage());}
           
   }
    
}
