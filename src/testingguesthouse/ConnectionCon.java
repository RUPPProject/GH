
package testingguesthouse;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionCon {
    public static Connection con;
    public static Connection ConnectMysql(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GH","root","");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e+"NOT CONNECT");
        }
         return con;
    }
}
