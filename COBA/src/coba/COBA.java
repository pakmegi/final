/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class COBA {
    public static Connection getConnection(){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/datasiswa";
        String user = "root";
        String password = "";
        try{
            con = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return con;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Connection c = COBA.getConnection();
            System.out.println(String.format("Connected to database %s " + "successfully.", c.getCatalog()));
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    
}
