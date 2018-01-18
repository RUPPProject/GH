
package testingguesthouse;

import Number_JTextField.TextField;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Room extends javax.swing.JPanel {
    public Room() {
        initComponents();
        setSize(901, 614);
        setLocation(400,100);
        //cboBed.m
        try{
        con=ConnectionCon.ConnectMysql();
        }catch(Exception e){}
        txtNo_Room.setEditable(false);
        cboRoom_Type.setEnabled(false);
        cboBed.setEnabled(false);
        cboAir_Condition.setEnabled(false);
        cboFan.setEnabled(false);
        txtPrice.setEnabled(false);
        btnDelete.setEnabled(false);
        tbRoom.setAutoscrolls(false);
        
        showData();
        lblFree_Not.setText("Free");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblFree_Not = new javax.swing.JLabel();
        cboRoom_Type = new javax.swing.JComboBox();
        cboBed = new javax.swing.JComboBox();
        cboAir_Condition = new javax.swing.JComboBox();
        cboFan = new javax.swing.JComboBox();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNo_Room = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRoom = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("No Room");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(14, 14, 167, 35);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Room Type");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(14, 61, 167, 35);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Bed");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(14, 108, 167, 35);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Air Condition");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(14, 155, 167, 35);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Fan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 200, 167, 35);

        lblFree_Not.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel1.add(lblFree_Not);
        lblFree_Not.setBounds(190, 300, 240, 35);

        cboRoom_Type.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboRoom_Type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VIP", "Normal" }));
        jPanel1.add(cboRoom_Type);
        cboRoom_Type.setBounds(190, 60, 340, 30);

        cboBed.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboBed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        jPanel1.add(cboBed);
        cboBed.setBounds(190, 110, 340, 30);

        cboAir_Condition.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboAir_Condition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        jPanel1.add(cboAir_Condition);
        cboAir_Condition.setBounds(190, 160, 340, 30);

        cboFan.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboFan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        jPanel1.add(cboFan);
        cboFan.setBounds(190, 210, 340, 32);

        txtPrice.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrice);
        txtPrice.setBounds(190, 260, 340, 32);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setText("Price");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 250, 167, 35);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setText("Free or Not");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 300, 167, 35);

        txtNo_Room.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtNo_Room.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNo_RoomKeyTyped(evt);
            }
        });
        jPanel1.add(txtNo_Room);
        txtNo_Room.setBounds(190, 10, 340, 32);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 540, 340);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        tbRoom.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        tbRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INo Room", "Room Type", "Free or Not", "Bed", "Air Condition", "Fan", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRoom.setAutoscrolls(false);
        tbRoom.getTableHeader().setReorderingAllowed(false);
        tbRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRoom);
        if (tbRoom.getColumnModel().getColumnCount() > 0) {
            tbRoom.getColumnModel().getColumn(0).setResizable(false);
            tbRoom.getColumnModel().getColumn(1).setResizable(false);
            tbRoom.getColumnModel().getColumn(2).setResizable(false);
            tbRoom.getColumnModel().getColumn(3).setResizable(false);
            tbRoom.getColumnModel().getColumn(4).setResizable(false);
            tbRoom.getColumnModel().getColumn(5).setResizable(false);
            tbRoom.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 750, 190);

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

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel5.add(btnSearch);
        btnSearch.setBounds(542, 10, 160, 40);

        add(jPanel5);
        jPanel5.setBounds(10, 360, 770, 250);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jButton1.setText("Brows");
        jPanel4.add(jButton1);
        jButton1.setBounds(1160, 210, 57, 29);

        btnDelete.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-trash-30.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete);
        btnDelete.setBounds(10, 60, 130, 40);

        btnNew.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-natural-user-interface-2-30.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel4.add(btnNew);
        btnNew.setBounds(10, 10, 130, 40);

        add(jPanel4);
        jPanel4.setBounds(570, 160, 150, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if(btnNew.getText().equals("New")){
            txtNo_Room.setEditable(true);
            cboRoom_Type.setEnabled(true);
            cboBed.setEnabled(true);
            cboAir_Condition.setEnabled(true);
            cboFan.setEnabled(true);
            txtPrice.setEnabled(true);
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
        }
        else if(btnNew.getText().equals("Save")){
            try{
                //int price=Integer.parseInt(txtPrice.getText());
                float price=Float.parseFloat(txtPrice.getText().trim());
                stm=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                stm.execute("insert into Room values ('"+Integer.parseInt(txtNo_Room.getText().trim())
                            +"','"+cboRoom_Type.getSelectedItem().toString()
                            +"','"+lblFree_Not.getText()
                            +"','"+cboBed.getSelectedItem().toString()
                            +"','"+cboAir_Condition.getSelectedItem().toString()
                            +"','"+cboFan.getSelectedItem().toString()
                            +"','"+price+"')");
                showData();
                clearData();
                
            }catch(SQLException | NumberFormatException e){JOptionPane.showMessageDialog(this,e);}
        }
        else {
            try{
               
                int index=tbRoom.getSelectedRow();
                int id=Integer.parseInt(tbRoom.getValueAt(index, 0).toString());
                stm=con.createStatement();
                stm.execute("update Room set Room_Type='"+cboRoom_Type.getSelectedItem().toString()
                                                         +"',Bed='"+cboBed.getSelectedItem().toString()
                                                         +"',Air_Condition='"+cboAir_Condition.getSelectedItem().toString()
                                                         +"',Fan='"+cboFan.getSelectedItem().toString()
                                                         +"',Price='"+txtPrice.getText().trim()
                                                         +"'where No_Room="+id);
                btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
                btnNew.setText("Save");
            showData();
            clearData();
            }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this, e);}
        }
    }//GEN-LAST:event_btnNewActionPerformed
     String roomv="Free";
    private void tbRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRoomMouseClicked
       if(evt.getClickCount()==2){
           int index=tbRoom.getSelectedRow();
           txtNo_Room.setText(tbRoom.getValueAt(index,0).toString());
           cboRoom_Type.setSelectedItem(tbRoom.getValueAt(index, 1));
           cboBed.setSelectedItem(tbRoom.getValueAt(index, 2));
           cboAir_Condition.setSelectedItem(tbRoom.getValueAt(index,3));
           cboFan.setSelectedItem(tbRoom.getValueAt(index,4));
           txtPrice.setText(tbRoom.getValueAt(index,5).toString());
             txtNo_Room.setEditable(true);
            cboRoom_Type.setEnabled(true);
            cboBed.setEnabled(true);
            cboAir_Condition.setEnabled(true);
            cboFan.setEnabled(true);
            txtPrice.setEnabled(true);
            btnDelete.setEnabled(true);
            btnNew.setText("Update");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-30.png")));
       }
    }//GEN-LAST:event_tbRoomMouseClicked
    private void Search(JTextField txt){
        try{
        while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel)tbRoom.getModel();
            stm=con.createStatement(ResultSet.CONCUR_READ_ONLY,ResultSet.CONCUR_UPDATABLE);
            rst=stm.executeQuery("Select * from Room where No_Room='"+txt.getText()+"'");
            while(rst.next()){
                    mode.addRow(new String[] {
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5),
                        rst.getString(6)
                    });
            }
            //rst.close();
            //stm.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try{
            int isearch=Integer.parseInt(txtSearch.getText());
            //if(isearch>0){
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel) tbRoom.getModel();
            stm=con.createStatement();
            rst=stm.executeQuery("select * from Room where No_Room="+txtSearch.getText());
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
            
           
            else {
                showData();
            }
        }catch(Exception e){}
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(btnSearch.getText().equalsIgnoreCase("Search")){
           // Search(txtNo_Room);
            btnSearch.setText("Unsearch");
        }
        else{
            btnSearch.setText("Search");
            showData();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         try{
             int index=tbRoom.getSelectedRow();
             int id=Integer.parseInt(tbRoom.getValueAt(index,0).toString());
             stm=con.createStatement();
             stm.execute("delete from Room where No_Room="+id);
             showData();
             clearData();
             btnNew.setText("Save");
             btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
         }catch(NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(this,e);
         }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
       if(evt.getKeyChar()==46){
           if(txtPrice.getText().indexOf(46)!=-1){
               Toolkit.getDefaultToolkit().beep();
               evt.consume();
           }
       }
       else if(!(Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!=8)){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtNo_RoomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNo_RoomKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNo_RoomKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cboAir_Condition;
    private javax.swing.JComboBox cboBed;
    private javax.swing.JComboBox cboFan;
    private javax.swing.JComboBox cboRoom_Type;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFree_Not;
    private javax.swing.JTable tbRoom;
    private javax.swing.JTextField txtNo_Room;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    DecimalFormat df=new DecimalFormat("$");
    public void showData(){
        while(mode.getRowCount()>0)
            mode.removeRow(0);
            mode=(DefaultTableModel)tbRoom.getModel();
            try{
               stm=con.createStatement();
               rst=stm.executeQuery("select * from Room");
            if(rst.first()){
                do {                    
                    mode.addRow(new String[]{
                    
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7)
                    
                    });
                    
                } while (rst.next());
            }
            }catch(Exception e){}
    }
    public void clearData(){
        txtNo_Room.setText(null);
        cboRoom_Type.setSelectedItem(null);
        cboBed.setSelectedItem(null);
        cboAir_Condition.setSelectedItem(null);
        cboFan.setSelectedItem(null);
        txtPrice.setText(null);
    
    }
    
    public void Number(KeyEvent evt){
           char c=evt.getKeyChar();
           if(!(Character.isDigit(c)||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)){
             evt.consume();
             getToolkit().beep();
           }
           
    }
    
    
}
