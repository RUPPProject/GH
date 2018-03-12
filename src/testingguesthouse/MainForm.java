
package testingguesthouse;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainForm extends javax.swing.JFrame {
    public MainForm() {
        initComponents();
        setSize(1605, 776);
       
        ///setState(JFrame.MAXIMIZED_BOTH);
       Home home=new Home();
        con=getContentPane().add(home);
        repaint();
        Time(lblTime);
         
        colorHome();
            
    }
    PreparedStatement ps;
    Connection conn;
    Statement stm;
    ResultSet rst;
    Component con;
    public String positIon,Id,Pass,Name;
    public void setPosition(String p){
        positIon=p;
    }
    public void setStaffID(String id){
        this.Id=id;
    }
    public void setStaffPass(String pass){
        this.Pass=pass;
    }
    public void setStaffName(String name){
        this.Name=name;
    }
    public void  e(){
           // LogIn logIn =new LogIn(this,true);
            if(positIon.equalsIgnoreCase("Admin")){
                btnAbout.setEnabled(true);
                btnStaff.setEnabled(true);
                btnAccount.setEnabled(true);
                btnInformation.setEnabled(false);
            }
            else if(positIon.equalsIgnoreCase("A")){
                btnAbout.setEnabled(false);
            }
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRoom = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnInformation = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        btnCheckIn = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnService = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnRoom1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnEXit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnMax1 = new javax.swing.JButton();
        btnEXit1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnMax2 = new javax.swing.JButton();
        btnEXit2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btnMax3 = new javax.swing.JButton();
        btnEXit3 = new javax.swing.JButton();
        btnMax = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        btnMax17 = new javax.swing.JButton();
        btnEXit17 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        btnMax18 = new javax.swing.JButton();
        btnEXit18 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        btnMax19 = new javax.swing.JButton();
        btnEXit19 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        btnMax20 = new javax.swing.JButton();
        btnEXit20 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        btnMax21 = new javax.swing.JButton();
        btnEXit21 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        btnMax22 = new javax.swing.JButton();
        btnEXit22 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        btnMax23 = new javax.swing.JButton();
        btnEXit23 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        btnMax24 = new javax.swing.JButton();
        btnEXit24 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        btnMax25 = new javax.swing.JButton();
        btnEXit25 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        btnMax26 = new javax.swing.JButton();
        btnEXit26 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        btnMax27 = new javax.swing.JButton();
        btnEXit27 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        btnMax28 = new javax.swing.JButton();
        btnEXit28 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        lblShowName = new javax.swing.JLabel();

        btnRoom.setBackground(new java.awt.Color(254, 254, 254));
        btnRoom.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnRoom.setForeground(new java.awt.Color(41, 26, 26));
        btnRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/room.png"))); // NOI18N
        btnRoom.setText("Room");
        btnRoom.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(25, 7, 230)));
        btnRoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoom.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRoom.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        btnInformation.setBackground(new java.awt.Color(254, 254, 254));
        btnInformation.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnInformation.setForeground(new java.awt.Color(41, 26, 26));
        btnInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-information-30.png"))); // NOI18N
        btnInformation.setText("Information");
        btnInformation.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(27, 142, 244)));
        btnInformation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInformation.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnInformation.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });
        jPanel2.add(btnInformation);
        btnInformation.setBounds(80, 0, 140, 70);

        btnStaff.setBackground(new java.awt.Color(254, 254, 254));
        btnStaff.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnStaff.setForeground(new java.awt.Color(41, 26, 26));
        btnStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-staff-filled-30.png"))); // NOI18N
        btnStaff.setText("Staff");
        btnStaff.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(25, 7, 230)));
        btnStaff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStaff.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnStaff.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });
        jPanel2.add(btnStaff);
        btnStaff.setBounds(220, 0, 80, 70);

        btnAccount.setBackground(new java.awt.Color(254, 254, 254));
        btnAccount.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnAccount.setForeground(new java.awt.Color(41, 26, 26));
        btnAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account-filled-30.png"))); // NOI18N
        btnAccount.setText("Account");
        btnAccount.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(25, 7, 230)));
        btnAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccount.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });
        jPanel2.add(btnAccount);
        btnAccount.setBounds(300, 0, 100, 70);

        btnCheckIn.setBackground(new java.awt.Color(254, 254, 254));
        btnCheckIn.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnCheckIn.setForeground(new java.awt.Color(41, 26, 26));
        btnCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/checkin.png"))); // NOI18N
        btnCheckIn.setText("Check In");
        btnCheckIn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(27, 142, 244)));
        btnCheckIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCheckIn.setVerifyInputWhenFocusTarget(false);
        btnCheckIn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCheckIn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });
        jPanel2.add(btnCheckIn);
        btnCheckIn.setBounds(400, 0, 110, 70);

        btnCheckOut.setBackground(new java.awt.Color(254, 254, 254));
        btnCheckOut.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(41, 26, 26));
        btnCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/checkin.png"))); // NOI18N
        btnCheckOut.setText("Check Out");
        btnCheckOut.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(27, 142, 244)));
        btnCheckOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCheckOut.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCheckOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        jPanel2.add(btnCheckOut);
        btnCheckOut.setBounds(510, 0, 130, 70);

        btnBook.setBackground(new java.awt.Color(254, 254, 254));
        btnBook.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnBook.setForeground(new java.awt.Color(41, 26, 26));
        btnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book-30_1.png"))); // NOI18N
        btnBook.setText("Book");
        btnBook.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(25, 7, 230)));
        btnBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBook.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        jPanel2.add(btnBook);
        btnBook.setBounds(640, 0, 80, 70);

        btnCustomer.setBackground(new java.awt.Color(246, 246, 213));
        btnCustomer.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(41, 26, 26));
        btnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icustomer-30.png"))); // NOI18N
        btnCustomer.setText("Customer");
        btnCustomer.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(25, 7, 230)));
        btnCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomer.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        jPanel2.add(btnCustomer);
        btnCustomer.setBounds(720, 0, 120, 70);

        btnService.setBackground(new java.awt.Color(254, 254, 254));
        btnService.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnService.setForeground(new java.awt.Color(41, 26, 26));
        btnService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Food Service 30.png"))); // NOI18N
        btnService.setText("Service");
        btnService.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(27, 142, 244)));
        btnService.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnService.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnService.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceActionPerformed(evt);
            }
        });
        jPanel2.add(btnService);
        btnService.setBounds(840, 0, 90, 70);

        btnHome.setBackground(new java.awt.Color(254, 254, 254));
        btnHome.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(41, 26, 26));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(27, 142, 244)));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome);
        btnHome.setBounds(0, 0, 80, 70);

        btnAbout.setBackground(new java.awt.Color(254, 254, 254));
        btnAbout.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(41, 26, 26));
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/about.png"))); // NOI18N
        btnAbout.setText("About");
        btnAbout.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(27, 142, 244)));
        btnAbout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbout.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAbout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        jPanel2.add(btnAbout);
        btnAbout.setBounds(1200, 0, 90, 70);

        btnReport.setBackground(new java.awt.Color(254, 254, 254));
        btnReport.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnReport.setForeground(new java.awt.Color(41, 26, 26));
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-report-card-30.png"))); // NOI18N
        btnReport.setText("Report");
        btnReport.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(27, 142, 244)));
        btnReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReport.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        jPanel2.add(btnReport);
        btnReport.setBounds(1110, 0, 90, 70);

        btnProduct.setBackground(new java.awt.Color(254, 254, 254));
        btnProduct.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(41, 26, 26));
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-product-30.png"))); // NOI18N
        btnProduct.setText("Product");
        btnProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(27, 142, 244)));
        btnProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProduct.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        jPanel2.add(btnProduct);
        btnProduct.setBounds(930, 0, 90, 70);

        btnRoom1.setBackground(new java.awt.Color(254, 254, 254));
        btnRoom1.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        btnRoom1.setForeground(new java.awt.Color(41, 26, 26));
        btnRoom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/room.png"))); // NOI18N
        btnRoom1.setText("Room");
        btnRoom1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(27, 142, 244)));
        btnRoom1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoom1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRoom1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRoom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoom1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRoom1);
        btnRoom1.setBounds(1020, 0, 90, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(150, 30, 1290, 70);

        jPanel1.setBackground(new java.awt.Color(120, 130, 239));
        jPanel1.setLayout(null);

        btnEXit.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit.setText("x");
        btnEXit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXitActionPerformed(evt);
            }
        });
        jPanel1.add(btnEXit);
        btnEXit.setBounds(40, 0, 40, 29);

        jPanel3.setBackground(new java.awt.Color(120, 130, 239));
        jPanel3.setLayout(null);

        jButton2.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(41, 26, 26));
        jButton2.setText("Log out");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jButton2);
        jButton2.setBounds(0, 0, 150, 30);

        btnMax1.setBackground(new java.awt.Color(255, 255, 253));
        btnMax1.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax1.setText("-");
        btnMax1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnMax1);
        btnMax1.setBounds(160, 0, 40, 29);

        btnEXit1.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit1.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit1.setText("x");
        btnEXit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEXit1);
        btnEXit1.setBounds(200, 0, 40, 29);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(1350, 0, 240, 30);

        jPanel4.setBackground(new java.awt.Color(120, 130, 239));
        jPanel4.setLayout(null);

        btnMax2.setBackground(new java.awt.Color(255, 255, 253));
        btnMax2.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax2.setText("-");
        btnMax2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnMax2);
        btnMax2.setBounds(110, 0, 40, 29);

        btnEXit2.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit2.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit2.setText("x");
        btnEXit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnEXit2);
        btnEXit2.setBounds(160, 0, 40, 29);

        jPanel5.setBackground(new java.awt.Color(120, 130, 239));
        jPanel5.setLayout(null);

        jButton3.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(41, 26, 26));
        jButton3.setText("Log out");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel5.add(jButton3);
        jButton3.setBounds(0, 0, 150, 30);

        btnMax3.setBackground(new java.awt.Color(255, 255, 253));
        btnMax3.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax3.setText("-");
        btnMax3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnMax3);
        btnMax3.setBounds(160, 0, 40, 29);

        btnEXit3.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit3.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit3.setText("x");
        btnEXit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnEXit3);
        btnEXit3.setBounds(200, 0, 40, 29);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(1350, 0, 240, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(1400, 0, 210, 80);

        btnMax.setBackground(new java.awt.Color(255, 255, 253));
        btnMax.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax.setText("-");
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });
        jPanel1.add(btnMax);
        btnMax.setBounds(0, 0, 40, 29);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 30, 80, 30);

        jPanel22.setBackground(new java.awt.Color(254, 254, 254));
        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.setLayout(null);

        jPanel23.setBackground(new java.awt.Color(120, 130, 239));
        jPanel23.setLayout(null);

        jButton12.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(41, 26, 26));
        jButton12.setText("Log out");
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel23.add(jButton12);
        jButton12.setBounds(0, 0, 150, 30);

        btnMax17.setBackground(new java.awt.Color(255, 255, 253));
        btnMax17.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax17.setText("-");
        btnMax17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax17ActionPerformed(evt);
            }
        });
        jPanel23.add(btnMax17);
        btnMax17.setBounds(160, 0, 40, 29);

        btnEXit17.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit17.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit17.setText("x");
        btnEXit17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit17ActionPerformed(evt);
            }
        });
        jPanel23.add(btnEXit17);
        btnEXit17.setBounds(200, 0, 40, 29);

        jPanel22.add(jPanel23);
        jPanel23.setBounds(1350, 0, 240, 30);

        jPanel24.setBackground(new java.awt.Color(120, 130, 239));
        jPanel24.setLayout(null);

        btnMax18.setBackground(new java.awt.Color(255, 255, 253));
        btnMax18.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax18.setText("-");
        btnMax18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax18ActionPerformed(evt);
            }
        });
        jPanel24.add(btnMax18);
        btnMax18.setBounds(110, 0, 40, 29);

        btnEXit18.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit18.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit18.setText("x");
        btnEXit18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit18ActionPerformed(evt);
            }
        });
        jPanel24.add(btnEXit18);
        btnEXit18.setBounds(160, 0, 40, 29);

        jPanel25.setBackground(new java.awt.Color(120, 130, 239));
        jPanel25.setLayout(null);

        jButton13.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(41, 26, 26));
        jButton13.setText("Log out");
        jButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel25.add(jButton13);
        jButton13.setBounds(0, 0, 150, 30);

        btnMax19.setBackground(new java.awt.Color(255, 255, 253));
        btnMax19.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax19.setText("-");
        btnMax19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax19ActionPerformed(evt);
            }
        });
        jPanel25.add(btnMax19);
        btnMax19.setBounds(160, 0, 40, 29);

        btnEXit19.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit19.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit19.setText("x");
        btnEXit19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit19ActionPerformed(evt);
            }
        });
        jPanel25.add(btnEXit19);
        btnEXit19.setBounds(200, 0, 40, 29);

        jPanel24.add(jPanel25);
        jPanel25.setBounds(1350, 0, 240, 30);

        jPanel22.add(jPanel24);
        jPanel24.setBounds(1400, 0, 210, 80);

        jPanel26.setBackground(new java.awt.Color(254, 254, 254));
        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel26.setLayout(null);

        jPanel27.setBackground(new java.awt.Color(120, 130, 239));
        jPanel27.setLayout(null);

        jButton14.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(41, 26, 26));
        jButton14.setText("Log out");
        jButton14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel27.add(jButton14);
        jButton14.setBounds(0, 0, 150, 30);

        btnMax20.setBackground(new java.awt.Color(255, 255, 253));
        btnMax20.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax20.setText("-");
        btnMax20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax20ActionPerformed(evt);
            }
        });
        jPanel27.add(btnMax20);
        btnMax20.setBounds(160, 0, 40, 29);

        btnEXit20.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit20.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit20.setText("x");
        btnEXit20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit20ActionPerformed(evt);
            }
        });
        jPanel27.add(btnEXit20);
        btnEXit20.setBounds(200, 0, 40, 29);

        jPanel26.add(jPanel27);
        jPanel27.setBounds(1350, 0, 240, 30);

        jPanel28.setBackground(new java.awt.Color(120, 130, 239));
        jPanel28.setLayout(null);

        btnMax21.setBackground(new java.awt.Color(255, 255, 253));
        btnMax21.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax21.setText("-");
        btnMax21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax21ActionPerformed(evt);
            }
        });
        jPanel28.add(btnMax21);
        btnMax21.setBounds(110, 0, 40, 29);

        btnEXit21.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit21.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit21.setText("x");
        btnEXit21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit21ActionPerformed(evt);
            }
        });
        jPanel28.add(btnEXit21);
        btnEXit21.setBounds(160, 0, 40, 29);

        jPanel29.setBackground(new java.awt.Color(120, 130, 239));
        jPanel29.setLayout(null);

        jButton15.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(41, 26, 26));
        jButton15.setText("Log out");
        jButton15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel29.add(jButton15);
        jButton15.setBounds(0, 0, 150, 30);

        btnMax22.setBackground(new java.awt.Color(255, 255, 253));
        btnMax22.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax22.setText("-");
        btnMax22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax22ActionPerformed(evt);
            }
        });
        jPanel29.add(btnMax22);
        btnMax22.setBounds(160, 0, 40, 29);

        btnEXit22.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit22.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit22.setText("x");
        btnEXit22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit22ActionPerformed(evt);
            }
        });
        jPanel29.add(btnEXit22);
        btnEXit22.setBounds(200, 0, 40, 29);

        jPanel28.add(jPanel29);
        jPanel29.setBounds(1350, 0, 240, 30);

        jPanel26.add(jPanel28);
        jPanel28.setBounds(1400, 0, 210, 80);

        jPanel22.add(jPanel26);
        jPanel26.setBounds(1450, 30, 130, 50);

        jPanel30.setBackground(new java.awt.Color(254, 254, 254));
        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel30.setLayout(null);

        jPanel31.setBackground(new java.awt.Color(120, 130, 239));
        jPanel31.setLayout(null);

        jButton16.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(41, 26, 26));
        jButton16.setText("Log out");
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel31.add(jButton16);
        jButton16.setBounds(0, 0, 150, 30);

        btnMax23.setBackground(new java.awt.Color(255, 255, 253));
        btnMax23.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax23.setText("-");
        btnMax23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax23ActionPerformed(evt);
            }
        });
        jPanel31.add(btnMax23);
        btnMax23.setBounds(160, 0, 40, 29);

        btnEXit23.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit23.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit23.setText("x");
        btnEXit23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit23ActionPerformed(evt);
            }
        });
        jPanel31.add(btnEXit23);
        btnEXit23.setBounds(200, 0, 40, 29);

        jPanel30.add(jPanel31);
        jPanel31.setBounds(1350, 0, 240, 30);

        jPanel32.setBackground(new java.awt.Color(120, 130, 239));
        jPanel32.setLayout(null);

        btnMax24.setBackground(new java.awt.Color(255, 255, 253));
        btnMax24.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax24.setText("-");
        btnMax24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax24ActionPerformed(evt);
            }
        });
        jPanel32.add(btnMax24);
        btnMax24.setBounds(110, 0, 40, 29);

        btnEXit24.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit24.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit24.setText("x");
        btnEXit24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit24ActionPerformed(evt);
            }
        });
        jPanel32.add(btnEXit24);
        btnEXit24.setBounds(160, 0, 40, 29);

        jPanel33.setBackground(new java.awt.Color(120, 130, 239));
        jPanel33.setLayout(null);

        jButton17.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(41, 26, 26));
        jButton17.setText("Log out");
        jButton17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel33.add(jButton17);
        jButton17.setBounds(0, 0, 150, 30);

        btnMax25.setBackground(new java.awt.Color(255, 255, 253));
        btnMax25.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax25.setText("-");
        btnMax25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax25ActionPerformed(evt);
            }
        });
        jPanel33.add(btnMax25);
        btnMax25.setBounds(160, 0, 40, 29);

        btnEXit25.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit25.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit25.setText("x");
        btnEXit25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit25ActionPerformed(evt);
            }
        });
        jPanel33.add(btnEXit25);
        btnEXit25.setBounds(200, 0, 40, 29);

        jPanel32.add(jPanel33);
        jPanel33.setBounds(1350, 0, 240, 30);

        jPanel30.add(jPanel32);
        jPanel32.setBounds(1400, 0, 210, 80);

        jPanel34.setBackground(new java.awt.Color(254, 254, 254));
        jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel34.setLayout(null);

        jPanel35.setBackground(new java.awt.Color(120, 130, 239));
        jPanel35.setLayout(null);

        jButton18.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(41, 26, 26));
        jButton18.setText("Log out");
        jButton18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel35.add(jButton18);
        jButton18.setBounds(0, 0, 150, 30);

        btnMax26.setBackground(new java.awt.Color(255, 255, 253));
        btnMax26.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax26.setText("-");
        btnMax26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax26ActionPerformed(evt);
            }
        });
        jPanel35.add(btnMax26);
        btnMax26.setBounds(160, 0, 40, 29);

        btnEXit26.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit26.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit26.setText("x");
        btnEXit26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit26ActionPerformed(evt);
            }
        });
        jPanel35.add(btnEXit26);
        btnEXit26.setBounds(200, 0, 40, 29);

        jPanel34.add(jPanel35);
        jPanel35.setBounds(1350, 0, 240, 30);

        jPanel36.setBackground(new java.awt.Color(120, 130, 239));
        jPanel36.setLayout(null);

        btnMax27.setBackground(new java.awt.Color(255, 255, 253));
        btnMax27.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax27.setText("-");
        btnMax27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax27ActionPerformed(evt);
            }
        });
        jPanel36.add(btnMax27);
        btnMax27.setBounds(110, 0, 40, 29);

        btnEXit27.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit27.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit27.setText("x");
        btnEXit27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit27ActionPerformed(evt);
            }
        });
        jPanel36.add(btnEXit27);
        btnEXit27.setBounds(160, 0, 40, 29);

        jPanel37.setBackground(new java.awt.Color(120, 130, 239));
        jPanel37.setLayout(null);

        jButton19.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(41, 26, 26));
        jButton19.setText("Log out");
        jButton19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel37.add(jButton19);
        jButton19.setBounds(0, 0, 150, 30);

        btnMax28.setBackground(new java.awt.Color(255, 255, 253));
        btnMax28.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnMax28.setText("-");
        btnMax28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMax28ActionPerformed(evt);
            }
        });
        jPanel37.add(btnMax28);
        btnMax28.setBounds(160, 0, 40, 29);

        btnEXit28.setBackground(new java.awt.Color(231, 43, 35));
        btnEXit28.setFont(new java.awt.Font("Ume Gothic", 1, 18)); // NOI18N
        btnEXit28.setText("x");
        btnEXit28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXit28ActionPerformed(evt);
            }
        });
        jPanel37.add(btnEXit28);
        btnEXit28.setBounds(200, 0, 40, 29);

        jPanel36.add(jPanel37);
        jPanel37.setBounds(1350, 0, 240, 30);

        jPanel34.add(jPanel36);
        jPanel36.setBounds(1400, 0, 210, 80);

        jPanel30.add(jPanel34);
        jPanel34.setBounds(1450, 30, 130, 50);

        jPanel22.add(jPanel30);
        jPanel30.setBounds(1290, 130, 130, 50);

        jButton1.setFont(new java.awt.Font("Symbola", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(41, 26, 26));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-sign-out-30.png"))); // NOI18N
        jButton1.setText("Log out");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 97, 255)));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton1);
        jButton1.setBounds(0, 0, 110, 36);

        getContentPane().add(jPanel22);
        jPanel22.setBounds(10, 60, 110, 40);

        lblTime.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        lblTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblTime);
        lblTime.setBounds(0, 0, 330, 30);

        lblShowName.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblShowName.setForeground(new java.awt.Color(241, 10, 10));
        lblShowName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblShowName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblShowName);
        lblShowName.setBounds(610, -3, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformationActionPerformed
        close();
        Information infor=new Information();
        con=getContentPane().add(infor);
        repaint();
       colorInformation();
    }//GEN-LAST:event_btnInformationActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        close();
        Staff staff=new Staff();
        con=getContentPane().add(staff);
        repaint();
        colorStaff();
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        close();
        Account account=new Account();
        con=getContentPane().add(account);
        repaint();
        colorAccount();
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        close();
        CheckIn checkin=new CheckIn();
        con=getContentPane().add(checkin);
        repaint();
        colorCheckIn();
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        close();
        CheckOut checkout=new CheckOut();
        con=getContentPane().add(checkout);
        repaint();
        colorCheckOut();
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        close();
        Book book=new Book();
        con=getContentPane().add(book);
        repaint();
       colorBook();
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        close();
        Customer customer =new Customer ();
        con=getContentPane().add(customer);
        repaint();
        colorCustomer();
        
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceActionPerformed
        close();
        Service service=new Service();
        con=getContentPane().add(service);
        repaint();
        colorService();
    }//GEN-LAST:event_btnServiceActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        colorReport();
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        colorAbout();
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       close();
       Home home=new Home();
       con=getContentPane().add(home);
       repaint();
       colorHome();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed
         setState(JFrame.MAXIMIZED_BOTH);
           
    }//GEN-LAST:event_btnMaxActionPerformed

    private void btnEXitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXitActionPerformed
        int yesno=JOptionPane.showConfirmDialog(null,"Do you want to close!","Close",JOptionPane.YES_NO_OPTION);
        if(yesno==JOptionPane.YES_OPTION){
        System.exit(0);
        }
        else{
        }
    }//GEN-LAST:event_btnEXitActionPerformed

    private void btnMax1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax1ActionPerformed

    private void btnEXit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit1ActionPerformed

    private void btnRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomActionPerformed
        close();
       Room room=new Room();
       con=getContentPane().add(room);
       btnRoom.setForeground(Color.red);
       repaint();
        colorRoom();
    }//GEN-LAST:event_btnRoomActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        close();
        Product product=new Product();
        con=getContentPane().add(product);
        repaint();
       colorProduct();
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnMax2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax2ActionPerformed

    private void btnEXit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit2ActionPerformed

    private void btnMax3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax3ActionPerformed

    private void btnEXit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit3ActionPerformed

    private void btnMax17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax17ActionPerformed

    private void btnEXit17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit17ActionPerformed

    private void btnMax18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax18ActionPerformed

    private void btnEXit18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit18ActionPerformed

    private void btnMax19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax19ActionPerformed

    private void btnEXit19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit19ActionPerformed

    private void btnMax20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax20ActionPerformed

    private void btnEXit20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit20ActionPerformed

    private void btnMax21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax21ActionPerformed

    private void btnEXit21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit21ActionPerformed

    private void btnMax22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax22ActionPerformed

    private void btnEXit22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit22ActionPerformed

    private void btnMax23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax23ActionPerformed

    private void btnEXit23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit23ActionPerformed

    private void btnMax24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax24ActionPerformed

    private void btnEXit24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit24ActionPerformed

    private void btnMax25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax25ActionPerformed

    private void btnEXit25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit25ActionPerformed

    private void btnMax26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax26ActionPerformed

    private void btnEXit26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit26ActionPerformed

    private void btnMax27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax27ActionPerformed

    private void btnEXit27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit27ActionPerformed

    private void btnMax28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMax28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMax28ActionPerformed

    private void btnEXit28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXit28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEXit28ActionPerformed

    private void btnRoom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoom1ActionPerformed
       close();
        Room room=new Room();
        con=getContentPane().add(room);
        repaint();
        colorRoom();
    }//GEN-LAST:event_btnRoom1ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x=evt.getX();
        int y=evt.getY();
        
    }//GEN-LAST:event_formMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       LogIn login=new LogIn(null, true);
        login.setVisible(true);
        //e();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // LogIn log=new LogIn();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnEXit;
    private javax.swing.JButton btnEXit1;
    private javax.swing.JButton btnEXit17;
    private javax.swing.JButton btnEXit18;
    private javax.swing.JButton btnEXit19;
    private javax.swing.JButton btnEXit2;
    private javax.swing.JButton btnEXit20;
    private javax.swing.JButton btnEXit21;
    private javax.swing.JButton btnEXit22;
    private javax.swing.JButton btnEXit23;
    private javax.swing.JButton btnEXit24;
    private javax.swing.JButton btnEXit25;
    private javax.swing.JButton btnEXit26;
    private javax.swing.JButton btnEXit27;
    private javax.swing.JButton btnEXit28;
    private javax.swing.JButton btnEXit3;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInformation;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMax1;
    private javax.swing.JButton btnMax17;
    private javax.swing.JButton btnMax18;
    private javax.swing.JButton btnMax19;
    private javax.swing.JButton btnMax2;
    private javax.swing.JButton btnMax20;
    private javax.swing.JButton btnMax21;
    private javax.swing.JButton btnMax22;
    private javax.swing.JButton btnMax23;
    private javax.swing.JButton btnMax24;
    private javax.swing.JButton btnMax25;
    private javax.swing.JButton btnMax26;
    private javax.swing.JButton btnMax27;
    private javax.swing.JButton btnMax28;
    private javax.swing.JButton btnMax3;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnRoom;
    private javax.swing.JButton btnRoom1;
    private javax.swing.JButton btnService;
    private javax.swing.JButton btnStaff;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblShowName;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
   public void close(){
       getContentPane().remove(con);
     repaint();
   }
    private void Time(JLabel l){
        Runnable runnable=new Runnable() {

            @Override
            public void run() {
                
                long t=System.currentTimeMillis();
                Date d=new Date(t);
                String s;
                SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss  a"+"     "+"EEEE/dd/MM/yyyy");
                s=sdf.format(d);
                l.setText(s);
                
            }
        };
        Thread th=new Thread(runnable);
        th.start();
    }
   
    private void colorHome(){
         btnHome.setForeground(Color.RED);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
           
    }
   private void colorInformation(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.RED);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
   }
   private void colorStaff(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.red);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
   }
   private void colorAccount(){
          btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.RED);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
   } 
   private void colorCheckIn(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.RED);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
   }
   private void colorCheckOut(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.RED);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
   }
   private void colorBook(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.RED);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
   }
   private void colorCustomer(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.RED);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
   }
   private void colorService(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.RED);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
   }
   private void colorProduct(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.RED);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
   }
   private void colorRoom(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.RED);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.BLACK);
   }
   private void colorReport(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.RED);
           btnAbout.setForeground(Color.BLACK);
   }
   private void colorAbout(){
           btnHome.setForeground(Color.BLACK);
           btnInformation.setForeground(Color.BLACK);
           btnStaff.setForeground(Color.BLACK);
           btnAccount.setForeground(Color.BLACK);
           btnCheckIn.setForeground(Color.BLACK);
           btnCheckOut.setForeground(Color.BLACK);
           btnBook.setForeground(Color.BLACK);
           btnCustomer.setForeground(Color.BLACK);
           btnService.setForeground(Color.BLACK);
           btnProduct.setForeground(Color.BLACK);
           btnRoom1.setForeground(Color.BLACK);
           btnReport.setForeground(Color.BLACK);
           btnAbout.setForeground(Color.RED);
   }
   
   
   
}
