
package testingguesthouse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Information extends javax.swing.JPanel {

    public Information() {
        initComponents();
        setSize(914, 430);
        setLocation(400,100);
        try{
            con=ConnectionCon.ConnectMysql();
            
        }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
        showData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbImformation = new javax.swing.JTable();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Price");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 10, 167, 35);

        txtSearch.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch);
        txtSearch.setBounds(190, 10, 337, 35);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 540, 60);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        tbImformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INo Room", "Room Type", "Free  or Not", "Bed", "Air Condition", "Fan", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbImformation);
        if (tbImformation.getColumnModel().getColumnCount() > 0) {
            tbImformation.getColumnModel().getColumn(0).setResizable(false);
            tbImformation.getColumnModel().getColumn(2).setResizable(false);
            tbImformation.getColumnModel().getColumn(3).setResizable(false);
            tbImformation.getColumnModel().getColumn(4).setResizable(false);
            tbImformation.getColumnModel().getColumn(5).setResizable(false);
            tbImformation.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 750, 190);

        add(jPanel5);
        jPanel5.setBounds(10, 80, 770, 210);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel) tbImformation.getModel();
                stm=con.createStatement();
                rst=stm.executeQuery("select * from Room where No_Room ='"+txtSearch.getText()+"'or Room_Type ='"+txtSearch.getText().trim()+"'");
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
               rst.close();
        }catch(Exception e){}
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbImformation;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    Statement stm;
    ResultSet rst;
    Connection con;
    DefaultTableModel mode=new DefaultTableModel();
    public void showData(){
        try{
           stm=con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_SENSITIVE);
           rst=stm.executeQuery("select * from Room where Variable='Free'");
           while(mode.getRowCount()>0)
               mode.removeRow(0);
               mode=(DefaultTableModel)tbImformation.getModel();
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
           
        
        }catch(Exception e){JOptionPane.showMessageDialog(this, e.getMessage());}
    }
}
