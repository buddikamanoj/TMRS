/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TMRS_SYSTEM;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Buddika
 */
public class DBConnector {
    static final String DB_Driver="com.mysql.jdbc.Driver";
        static final String DB_URL="jdbc:mysql://localhost:3306/group_project";
        static final String DB_USER="root";
        static final String DB_PASSWRD="";
        Connection con= null;
       
        public Connection getConnection(){
            try{
                Class.forName(DB_Driver);
                con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWRD);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Connection Error!", JOptionPane.ERROR_MESSAGE);
            }
        return con;
        }
    
}
