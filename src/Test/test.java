/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Computer
 */
public class test {
    public static void main(String [] args){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
             Connection conn=DriverManager.getConnection("jdbc.ucanaccess://C:/Users/Computer/Documents/Student.accdb");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}