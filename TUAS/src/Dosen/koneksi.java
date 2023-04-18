
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author gawah
 */
public class koneksi {
        public static Connection con;
        public static Statement stm;

//    public static Connection getConnection() throws SQLException {
//        String db = "jdbc:mysql://localhost:3306/db_tuas";
//        String user = "root";
//        String pass= "";
//        
//        if (koneksi == null) {
//            koneksi = DriverManager.getConnection(db,user,pass);
//        }
//        return koneksi;
//    }
        
        
        public void koneksimysql(){
            try {
                String url = "jdbc:mysql://localhost:3306/db_tuas";
                String user = "root";
                String pass= "";
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection(url,user,pass);
                stm = (Statement) con.createStatement();
                JOptionPane.showMessageDialog(null, "berhasil koneksi");
                        
            } catch (Exception e) {
                System.out.println("koneksi gagal"+e.getMessage());
            }
        
        
        }
}
