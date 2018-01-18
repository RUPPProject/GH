
package testingguesthouse;

import java.io.File;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Staff extends javax.swing.JPanel {

    
    public Staff() {
        initComponents();
        setSize(1267, 656);
        setLocation(330,120);
       try{
       con=ConnectionCon.ConnectMysql();
       }catch(Exception e){}
       showData();
       EnableFalse();
       btnDelete.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDateofBirth = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboPosition = new javax.swing.JComboBox();
        chkStop = new javax.swing.JCheckBox();
        txtHiredDate = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cboGender = new javax.swing.JComboBox();
        txtName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtBirthDate = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_Image = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStaff = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("Position");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(14, 14, 167, 35);

        txtSalary.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalaryKeyReleased(evt);
            }
        });
        jPanel1.add(txtSalary);
        txtSalary.setBounds(193, 61, 337, 35);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Salary");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(14, 61, 167, 35);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Hired Date");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(14, 108, 167, 35);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Stop Work");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(14, 155, 167, 35);

        cboPosition.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        cboPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Managerment", "Amdin", "Recieptionish", "Security", "Cleaner" }));
        cboPosition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboPositionKeyReleased(evt);
            }
        });
        jPanel1.add(cboPosition);
        cboPosition.setBounds(190, 10, 340, 29);

        chkStop.setText("jCheckBox1");
        jPanel1.add(chkStop);
        chkStop.setBounds(210, 160, 98, 24);

        txtHiredDate.setDateFormatString("dd-MM-yyyy");
        txtHiredDate.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        txtHiredDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHiredDateKeyReleased(evt);
            }
        });
        jPanel1.add(txtHiredDate);
        txtHiredDate.setBounds(190, 110, 330, 30);

        add(jPanel1);
        jPanel1.setBounds(530, 0, 540, 210);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        txtID.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });
        jPanel2.add(txtID);
        txtID.setBounds(170, 10, 337, 35);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setText("Name");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(14, 61, 167, 35);

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setText("Gender");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(14, 108, 167, 35);

        jLabel10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel10.setText("Birth Date");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 160, 167, 35);

        txtPhone.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneKeyReleased(evt);
            }
        });
        jPanel2.add(txtPhone);
        txtPhone.setBounds(170, 210, 337, 35);

        jLabel11.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel11.setText("Phone");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 210, 167, 35);

        txtAddress.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        jPanel2.add(txtAddress);
        txtAddress.setBounds(170, 260, 337, 70);

        jLabel12.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel12.setText("Address");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 260, 167, 35);

        cboGender.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        cboGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboGenderKeyReleased(evt);
            }
        });
        jPanel2.add(cboGender);
        cboGender.setBounds(170, 110, 340, 30);

        txtName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(170, 60, 337, 35);

        jLabel14.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel14.setText("ID");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(14, 14, 167, 35);

        txtBirthDate.setDateFormatString("dd-MM-yyyy");
        txtBirthDate.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        txtBirthDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBirthDateKeyReleased(evt);
            }
        });
        jPanel2.add(txtBirthDate);
        txtBirthDate.setBounds(170, 160, 330, 30);

        add(jPanel2);
        jPanel2.setBounds(0, 0, 520, 340);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jButton1.setText("Brows");
        jPanel4.add(jButton1);
        jButton1.setBounds(1160, 210, 48, 28);

        btnDelete.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete);
        btnDelete.setBounds(10, 50, 170, 40);

        btnNew.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel4.add(btnNew);
        btnNew.setBounds(10, 10, 170, 40);

        add(jPanel4);
        jPanel4.setBounds(690, 220, 190, 100);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Photo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 0, 14))); // NOI18N
        jPanel3.setLayout(null);

        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(1000, 300, 44, 16);
        jPanel3.add(lbl_Image);
        lbl_Image.setBounds(10, 20, 150, 200);

        add(jPanel3);
        jPanel3.setBounds(1090, 0, 170, 230);

        btnBrowse.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        btnBrowse.setText("Brows");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        add(btnBrowse);
        btnBrowse.setBounds(1140, 230, 80, 30);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        tbStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Birth Date", "Phone", "Address", "Position", "Salary", "HiredDate", "Stopw ork", "Photo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbStaff.getTableHeader().setReorderingAllowed(false);
        tbStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbStaff);
        if (tbStaff.getColumnModel().getColumnCount() > 0) {
            tbStaff.getColumnModel().getColumn(0).setResizable(false);
            tbStaff.getColumnModel().getColumn(1).setResizable(false);
            tbStaff.getColumnModel().getColumn(2).setResizable(false);
            tbStaff.getColumnModel().getColumn(3).setResizable(false);
            tbStaff.getColumnModel().getColumn(4).setResizable(false);
            tbStaff.getColumnModel().getColumn(5).setResizable(false);
            tbStaff.getColumnModel().getColumn(6).setResizable(false);
            tbStaff.getColumnModel().getColumn(8).setResizable(false);
            tbStaff.getColumnModel().getColumn(9).setResizable(false);
            tbStaff.getColumnModel().getColumn(10).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(12, 50, 1240, 190);

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setText("Search");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 10, 167, 35);

        jTextField13.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel5.add(jTextField13);
        jTextField13.setBounds(190, 10, 337, 35);

        add(jPanel5);
        jPanel5.setBounds(0, 370, 1260, 250);
    }// </editor-fold>//GEN-END:initComponents
    FileInputStream fis;
    int leng;
    byte[] img;
    PreparedStatement ps;
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        switch (btnNew.getText()) {
            case "New":
                EnableTrue();
                btnNew.setText("Save");
                btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
                txtID.requestFocus();
                break;
            case "Save":
                try{
                    String no="";
                    if(chkStop.isSelected()){
                        no="Yes";
                    }
                    else {
                        no="No";
                    }
                    con=ConnectionCon.ConnectMysql();
                   ps=con.prepareStatement("insert into staff values(?,?,?,?,?,?,?,?,?,?,?)");
                        ps.setInt(1,Integer.parseInt(txtID.getText().trim()));
                        ps.setString(2, txtName.getText().trim());
                        ps.setString(3, cboGender.getSelectedItem().toString());
                          
                        ps.setString(4,((JTextField)txtBirthDate.getDateEditor().getUiComponent()).getText());
                        
                        ps.setString(5, txtPhone.getText().trim());
                        ps.setString(6,txtAddress.getText().trim());
                        ps.setString(7, cboPosition.getSelectedItem().toString());
                        ps.setString(8, txtSalary.getText().trim());
                        
                       // String hiredate=sdf.format();
                        ps.setString(9, ((JTextField)txtHiredDate.getDateEditor().getUiComponent()).getText());
                        ps.setString(10, no);
                        
                        if(fileName!=null){
                            fis=new FileInputStream(f);
                            leng=(int)f.length();
                            ps.setBinaryStream(11, fis, leng);
                        }
                        else {
                            ps.setBinaryStream(11, new ByteArrayInputStream(img),img.length);
                        }
                        
                        ps.execute();
                        showData();
                }catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
                break;
            case "Update":
                            try{
                                
                                if(imgPath!=null){
                                   ps=con.prepareStatement("update staff set Name=?,Gender=?,BirthDate=?,Phone=?,Address=?,Position=?,Salary=?,HiredDate=?,StopWork=?,Picture=?");
                                   ps.setString(1, txtName.getText().trim());
                                   ps.setString(2, cboGender.getSelectedItem().toString());
                                   ps.setString(3, ((JTextField)txtDateofBirth.getDateEditor().getUiComponent()).getText().toString());
                                   ps.setString(4,txtPhone.getText().trim());
                                   ps.setString(5,txtAddress.getText().trim());
                                   ps.setString(6, cboPosition.getSelectedItem().toString());
                                   ps.setString(7, txtSalary.getText().trim());
                                   ps.setString(8, ((JTextField)txtHiredDate.getDateEditor().getUiComponent()).getText().toString());
                                   String check="";
                                   if(chkStop.isSelected()){
                                       check="Yes";
                                   }
                                   else{
                                       check="No";
                                   }
                                   ps.setString(9, check);
                                }
                                if(fileName!=null){
                                    fis=new FileInputStream(f);
                                    
                                }
                            }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
  
                break;
      }
    }//GEN-LAST:event_btnNewActionPerformed
  
   
    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        imgBros();
        /*
        JFileChooser file=new JFileChooser("Home");            
            FileNameExtensionFilter filter1=new FileNameExtensionFilter("*.image","jpg","png");
            file.addChoosableFileFilter(filter1);
            int result=file.showOpenDialog(this);
            if(result==JFileChooser.APPROVE_OPTION){
                File selectFile=file.getSelectedFile();
                String path=selectFile.getAbsolutePath();
                lbl_Image.setIcon(resizeImage(path,null));
                imgPath=path;
            }
            else{
                JOptionPane.showMessageDialog(this,"NO File");
            }  */    
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void tbStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStaffMouseClicked
        if(evt.getClickCount()==2){
            int index=tbStaff.getSelectedRow();
            
            txtID.setText(tbStaff.getValueAt(index,0).toString());
            txtName.setText(tbStaff.getValueAt(index, 1).toString());
            cboGender.setSelectedItem(tbStaff.getValueAt(index,2).toString());
           try{
               String birth=tbStaff.getValueAt(index,3).toString();
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date d=sdf.parse(birth);
            txtBirthDate.setDate(d);
            
            String hireddate=tbStaff.getValueAt(index,8).toString();
            d=sdf.parse(hireddate);
            txtHiredDate.setDate(d);
           }catch(Exception e){}
           
           txtPhone.setText(tbStaff.getValueAt(index,4).toString());
           txtAddress.setText(tbStaff.getValueAt(index,5).toString());
           cboPosition.setSelectedItem(tbStaff.getValueAt(index,6).toString());
           txtSalary.setText(tbStaff.getValueAt(index,7).toString());
           String stopWork=tbStaff.getValueAt(index, 9).toString();
           if(stopWork.equals("Yes")){
               chkStop.setSelected(true);
           }
           else{
               chkStop.setSelected(false);
           }
           try{
               int id=Integer.parseInt(tbStaff.getValueAt(index,0).toString());
               stm=con.createStatement();
               rst=stm.executeQuery("select Picture from staff where ID ="+id);
               if(rst.next()){
                   img=rst.getBytes(1);
                   lbl_Image.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(img).getScaledInstance(lbl_Image.getWidth(), lbl_Image.getHeight(), Image.SCALE_SMOOTH)));
               }
               EnableTrue();
               btnNew.setText("Update");
               btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-available-updates-30.png")));
           }catch(Exception e){
               JOptionPane.showMessageDialog(this,e.getMessage());
           }
           
        }
        
    }//GEN-LAST:event_tbStaffMouseClicked

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtName.requestFocus();
       }
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cboGender.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void cboGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboGenderKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           txtBirthDate.requestFocus();
       }
    }//GEN-LAST:event_cboGenderKeyReleased

    private void txtBirthDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBirthDateKeyReleased
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             txtPhone.requestFocus();
         }
    }//GEN-LAST:event_txtBirthDateKeyReleased

    private void txtPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtAddress.requestFocus();
        }
    }//GEN-LAST:event_txtPhoneKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cboPosition.requestFocus();
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void cboPositionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboPositionKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtSalary.requestFocus();
        }
    }//GEN-LAST:event_cboPositionKeyReleased

    private void txtSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtHiredDate.requestFocus();
        }
    }//GEN-LAST:event_txtSalaryKeyReleased

    private void txtHiredDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHiredDateKeyReleased
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             chkStop.requestFocus();
         }
    }//GEN-LAST:event_txtHiredDateKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
           int index=tbStaff.getSelectedRow();
           int id=Integer.parseInt(tbStaff.getValueAt(index, 0).toString());
            stm=con.createStatement();
            stm.execute("delete from staff where ID="+id);
            showData();
            btnDelete.setEnabled(false);
            btnNew.setText("Save");
            btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png")));
        }catch(Exception e){JOptionPane.showMessageDialog(this, e);}
    }//GEN-LAST:event_btnDeleteActionPerformed

     public ImageIcon resizeImage(String imagePath,byte[] pic){
         ImageIcon myImage=null;
         if(imagePath!=null){
             myImage=new ImageIcon(imagePath);
             }
         else {
                myImage =new ImageIcon(pic);
            }
         Image img=myImage.getImage();
         Image img1=img.getScaledInstance(lbl_Image.getWidth(),lbl_Image.getHeight(),Image.SCALE_SMOOTH);
         ImageIcon image=new ImageIcon(img1);
         return image;
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox cboGender;
    private javax.swing.JComboBox cboPosition;
    private javax.swing.JCheckBox chkStop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JLabel lbl_Image;
    private javax.swing.JTable tbStaff;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtBirthDate;
    private com.toedter.calendar.JDateChooser txtDateofBirth;
    private com.toedter.calendar.JDateChooser txtHiredDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
    Connection con;
    ResultSet rst;
    Statement stm;
    DefaultTableModel mode=new DefaultTableModel();
    String imgPath=null;
    
    
    public void EnableTrue(){
        txtID.setEnabled(true);
        txtName.setEnabled(true);
        cboGender.setEnabled(true);
        txtPhone.setEnabled(true);
        txtAddress.setEnabled(true);
        cboPosition.setEnabled(true);
        txtSalary.setEnabled(true);
        txtHiredDate.setEnabled(true);
        txtBirthDate.setEnabled(true);
        chkStop.setSelected(true);
        btnBrowse.setEnabled(true);
        chkStop.setEnabled(true);
    }
    
    public void EnableFalse(){
        chkStop.setEnabled(false);
        txtID.setEnabled(false);
        txtName.setEnabled(false);
        cboGender.setEnabled(false);
        txtPhone.setEnabled(false);
        txtAddress.setEnabled(false);
        cboPosition.setEnabled(false);
        txtSalary.setEnabled(false);
        txtHiredDate.setEnabled(false);
        txtBirthDate.setEnabled(false);
        chkStop.setSelected(false);
        btnBrowse.setEnabled(false);
    }
    
    public void showData(){
        try{
            while(mode.getRowCount()>0)
                mode.removeRow(0);
                mode=(DefaultTableModel) tbStaff.getModel();
            stm=con.createStatement();
            rst=stm.executeQuery("select * from staff");
            while(rst.next()){
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
            }
            rst.close();
            stm.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(this,e);
        }
    }
     public void imgBros(){
         JFileChooser fc=new JFileChooser("Home");
         fc.setDialogTitle("Choose your Image");
         FileNameExtensionFilter filter=new FileNameExtensionFilter("*.image", "jpg","png");
         fc.addChoosableFileFilter(filter);
         int result=fc.showOpenDialog(this);
         if(result==JFileChooser.APPROVE_OPTION){
             f=fc.getSelectedFile();
             fileName=f.getAbsolutePath();
             try{
             fileName=fileName.replace("\\","\\\\");
             int w=lbl_Image.getWidth(),h=lbl_Image.getHeight();
                     
             lbl_Image.setIcon(new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(w,h, Image.SCALE_SMOOTH)));
             }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
             }
     }
      File f;
      String fileName;
}
