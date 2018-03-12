
package testingguesthouse;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CheckOut extends javax.swing.JPanel {
    public CheckOut() {
        initComponents();
        setSize(1237, 515);
        setLocation(150,120);
        try{
        con=ConnectionCon.ConnectMysql();
        stm=con.createStatement();
        rst=stm.executeQuery("select * from checkIn");
        while(rst.next()){
            String no=rst.getString("KH_ID");
            cboKH_ID.addItem(no);
        }
            
        }catch(Exception e){
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboKH_ID = new javax.swing.JComboBox();
        txtGender = new javax.swing.JTextField();
        txtNo_Room = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        txtDayStayIn = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtServicePay = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel12 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("KH_ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(14, 14, 167, 35);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 120, 167, 35);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("No Room");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 170, 120, 35);

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setText("Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 70, 167, 35);

        cboKH_ID.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        cboKH_ID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboKH_IDItemStateChanged(evt);
            }
        });
        cboKH_ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cboKH_IDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboKH_IDFocusLost(evt);
            }
        });
        cboKH_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboKH_IDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cboKH_IDMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboKH_IDMouseClicked(evt);
            }
        });
        cboKH_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cboKH_IDKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboKH_IDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboKH_IDKeyReleased(evt);
            }
        });
        jPanel1.add(cboKH_ID);
        cboKH_ID.setBounds(140, 20, 330, 29);

        txtGender.setEditable(false);
        txtGender.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtGender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGenderFocusLost(evt);
            }
        });
        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGenderKeyReleased(evt);
            }
        });
        jPanel1.add(txtGender);
        txtGender.setBounds(140, 120, 330, 35);

        txtNo_Room.setEditable(false);
        txtNo_Room.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtNo_Room.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNo_RoomFocusLost(evt);
            }
        });
        txtNo_Room.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNo_RoomKeyReleased(evt);
            }
        });
        jPanel1.add(txtNo_Room);
        txtNo_Room.setBounds(137, 170, 330, 35);

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(140, 70, 330, 35);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 220);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Day Stay In");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(14, 14, 167, 35);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Price");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(14, 61, 167, 35);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("Service Pay");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 110, 140, 35);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setText("Payment");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 160, 130, 35);

        txtPayment.setEditable(false);
        txtPayment.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtPayment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPaymentFocusLost(evt);
            }
        });
        txtPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaymentKeyReleased(evt);
            }
        });
        jPanel2.add(txtPayment);
        txtPayment.setBounds(160, 160, 330, 35);

        txtDayStayIn.setEditable(false);
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
        txtDayStayIn.setBounds(160, 10, 330, 35);

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriceFocusLost(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        jPanel2.add(txtPrice);
        txtPrice.setBounds(160, 60, 330, 35);

        txtServicePay.setEditable(false);
        txtServicePay.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtServicePay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtServicePayFocusLost(evt);
            }
        });
        txtServicePay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtServicePayKeyReleased(evt);
            }
        });
        jPanel2.add(txtServicePay);
        txtServicePay.setBounds(160, 110, 330, 35);

        add(jPanel2);
        jPanel2.setBounds(490, 0, 500, 210);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "No Room", "Day Stay In", "Price", "Service", "Payment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 1210, 220);

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setText("Search");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 10, 167, 35);

        jTextField13.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel5.add(jTextField13);
        jTextField13.setBounds(190, 10, 337, 35);

        add(jPanel5);
        jPanel5.setBounds(0, 230, 1230, 280);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jButton2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton2.setText("Print");
        jPanel3.add(jButton2);
        jButton2.setBounds(10, 10, 140, 30);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jButton3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton3.setText("Delete");
        jPanel4.add(jButton3);
        jButton3.setBounds(10, 50, 140, 30);

        jButton4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton4.setText("New");
        jPanel4.add(jButton4);
        jButton4.setBounds(10, 10, 140, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(1000, 40, 160, 90);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);

        jButton5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton5.setText("Delete");
        jPanel6.add(jButton5);
        jButton5.setBounds(10, 50, 140, 30);

        jButton6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton6.setText("New");
        jPanel6.add(jButton6);
        jButton6.setBounds(10, 10, 140, 30);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(null);

        jButton7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton7.setText("Delete");
        jPanel7.add(jButton7);
        jButton7.setBounds(10, 50, 140, 30);

        jButton8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton8.setText("New");
        jPanel7.add(jButton8);
        jButton8.setBounds(10, 10, 140, 30);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(1000, 40, 160, 90);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(1000, 30, 160, 90);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(null);

        jButton9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton9.setText("Delete");
        jPanel8.add(jButton9);
        jButton9.setBounds(10, 50, 140, 30);

        jButton10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton10.setText("New");
        jPanel8.add(jButton10);
        jButton10.setBounds(10, 10, 140, 30);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(null);

        jButton11.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton11.setText("Delete");
        jPanel9.add(jButton11);
        jButton11.setBounds(10, 50, 140, 30);

        jButton12.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton12.setText("New");
        jPanel9.add(jButton12);
        jButton12.setBounds(10, 10, 140, 30);

        jPanel8.add(jPanel9);
        jPanel9.setBounds(1000, 40, 160, 90);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(null);

        jButton13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton13.setText("Delete");
        jPanel10.add(jButton13);
        jButton13.setBounds(10, 50, 140, 30);

        jButton14.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton14.setText("New");
        jPanel10.add(jButton14);
        jButton14.setBounds(10, 10, 140, 30);

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(null);

        jButton15.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton15.setText("Delete");
        jPanel11.add(jButton15);
        jButton15.setBounds(10, 50, 140, 30);

        jButton16.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton16.setText("New");
        jPanel11.add(jButton16);
        jButton16.setBounds(10, 10, 140, 30);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(1000, 40, 160, 90);

        jPanel8.add(jPanel10);
        jPanel10.setBounds(1000, 30, 160, 90);

        jPanel3.add(jPanel8);
        jPanel8.setBounds(1010, 50, 160, 90);

        add(jPanel3);
        jPanel3.setBounds(1010, 120, 160, 50);
        add(jOptionPane1);
        jOptionPane1.setBounds(1172, 140, 10, 50);

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(null);

        jButton18.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-natural-user-interface-2-30.png"))); // NOI18N
        jButton18.setText("New");
        jPanel12.add(jButton18);
        jButton18.setBounds(10, 10, 140, 30);

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setLayout(null);

        jButton19.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton19.setText("Delete");
        jPanel13.add(jButton19);
        jButton19.setBounds(10, 50, 140, 30);

        jButton20.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton20.setText("New");
        jPanel13.add(jButton20);
        jButton20.setBounds(10, 10, 140, 30);

        jPanel12.add(jPanel13);
        jPanel13.setBounds(1000, 40, 160, 90);

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setLayout(null);

        jButton21.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton21.setText("Delete");
        jPanel14.add(jButton21);
        jButton21.setBounds(10, 50, 140, 30);

        jButton22.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton22.setText("New");
        jPanel14.add(jButton22);
        jButton22.setBounds(10, 10, 140, 30);

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.setLayout(null);

        jButton23.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton23.setText("Delete");
        jPanel15.add(jButton23);
        jButton23.setBounds(10, 50, 140, 30);

        jButton24.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton24.setText("New");
        jPanel15.add(jButton24);
        jButton24.setBounds(10, 10, 140, 30);

        jPanel14.add(jPanel15);
        jPanel15.setBounds(1000, 40, 160, 90);

        jPanel12.add(jPanel14);
        jPanel14.setBounds(1000, 30, 160, 90);

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.setLayout(null);

        jButton25.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton25.setText("Delete");
        jPanel16.add(jButton25);
        jButton25.setBounds(10, 50, 140, 30);

        jButton26.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton26.setText("New");
        jPanel16.add(jButton26);
        jButton26.setBounds(10, 10, 140, 30);

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel17.setLayout(null);

        jButton27.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton27.setText("Delete");
        jPanel17.add(jButton27);
        jButton27.setBounds(10, 50, 140, 30);

        jButton28.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton28.setText("New");
        jPanel17.add(jButton28);
        jButton28.setBounds(10, 10, 140, 30);

        jPanel16.add(jPanel17);
        jPanel17.setBounds(1000, 40, 160, 90);

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.setLayout(null);

        jButton29.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton29.setText("Delete");
        jPanel18.add(jButton29);
        jButton29.setBounds(10, 50, 140, 30);

        jButton30.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton30.setText("New");
        jPanel18.add(jButton30);
        jButton30.setBounds(10, 10, 140, 30);

        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel19.setLayout(null);

        jButton31.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton31.setText("Delete");
        jPanel19.add(jButton31);
        jButton31.setBounds(10, 50, 140, 30);

        jButton32.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton32.setText("New");
        jPanel19.add(jButton32);
        jButton32.setBounds(10, 10, 140, 30);

        jPanel18.add(jPanel19);
        jPanel19.setBounds(1000, 40, 160, 90);

        jPanel16.add(jPanel18);
        jPanel18.setBounds(1000, 30, 160, 90);

        jPanel12.add(jPanel16);
        jPanel16.setBounds(1010, 50, 160, 90);

        add(jPanel12);
        jPanel12.setBounds(1010, 60, 160, 50);

        jLabel16.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel16.setText("Name");
        add(jLabel16);
        jLabel16.setBounds(150, 110, 330, 35);
    }// </editor-fold>//GEN-END:initComponents

    private void cboKH_IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboKH_IDKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtName.requestFocus();
        }
    }//GEN-LAST:event_cboKH_IDKeyReleased

    private void cboKH_IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboKH_IDFocusLost
        qeryCheckIn();
        txtNo_Room.requestFocus();
    }//GEN-LAST:event_cboKH_IDFocusLost

    private void cboKH_IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboKH_IDKeyPressed
    }//GEN-LAST:event_cboKH_IDKeyPressed

    private void cboKH_IDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboKH_IDItemStateChanged
    }//GEN-LAST:event_cboKH_IDItemStateChanged

    private void cboKH_IDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboKH_IDMouseReleased
       
    }//GEN-LAST:event_cboKH_IDMouseReleased

    private void cboKH_IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboKH_IDMouseClicked
        
    }//GEN-LAST:event_cboKH_IDMouseClicked

    private void cboKH_IDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboKH_IDMousePressed
        
    }//GEN-LAST:event_cboKH_IDMousePressed

    private void cboKH_IDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboKH_IDFocusGained
        
    }//GEN-LAST:event_cboKH_IDFocusGained

    private void cboKH_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboKH_IDKeyTyped
        
    }//GEN-LAST:event_cboKH_IDKeyTyped

    private void txtGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyReleased
    }//GEN-LAST:event_txtGenderKeyReleased

    private void txtGenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGenderFocusLost
 
    }//GEN-LAST:event_txtGenderFocusLost

    private void txtPaymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaymentFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentFocusLost

    private void txtPaymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentKeyReleased

    private void txtNo_RoomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNo_RoomFocusLost
             try{
            stm=con.createStatement();
            rst=stm.executeQuery("select * from service where No_Room="+txtNo_Room.getText());
            while(rst.next()){
                txtServicePay.setText(rst.getString(6));
            }
        }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
    }//GEN-LAST:event_txtNo_RoomFocusLost

    private void txtNo_RoomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNo_RoomKeyReleased
 
    }//GEN-LAST:event_txtNo_RoomKeyReleased

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameFocusLost

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtDayStayInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDayStayInFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayStayInFocusLost

    private void txtDayStayInKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayStayInKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayStayInKeyReleased

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceFocusLost

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyReleased

    private void txtServicePayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtServicePayFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicePayFocusLost

    private void txtServicePayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServicePayKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicePayKeyReleased
    Connection con;
    Statement stm;
    ResultSet rst;
    DefaultTableModel mode=new DefaultTableModel();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboKH_ID;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField txtDayStayIn;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo_Room;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtServicePay;
    // End of variables declaration//GEN-END:variables
    public void clearData(){
        cboKH_ID.setSelectedItem(null);
        txtName.setText(null);
        txtGender.setText(null);
        txtGender.setText(null);
        txtDayStayIn.setText(null);
        txtPrice.setText(null);
        txtServicePay.setText(null);
        txtPayment.setText(null);
    }
    public void qeryCheckIn(){
        try{
            con=ConnectionCon.ConnectMysql();
            stm=con.createStatement();
            rst=stm.executeQuery("select * from checkIn where KH_ID="+cboKH_ID.getSelectedItem());
            if(rst.first()){
                do{
                    txtName.setText(rst.getString(2));
                    txtGender.setText(rst.getString(3));
                   txtNo_Room.setText(rst.getString(4));
                    txtPrice.setText(rst.getString(5));
                    txtDayStayIn.setText(rst.getString(7));  
                }while(rst.next());
                
            }
            
            else{
                JOptionPane.showMessageDialog(null,"គ្នានអតិថិជនមកស្នាក់នៅ!");
                clearData();
            }
        }catch(Exception e){
            
        }
             txtGender.requestFocus(); 
    
    }
    
}