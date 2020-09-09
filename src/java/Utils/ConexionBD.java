/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class ConexionBD {
    private static final ConexionBD unicaInstancia = null;
    private static Connection con = null;
    
    private static  class propiedades { 
        private static String driver = "com.mysql.jdbc.Driver";
        private static String url = "jdbc:mysql://localhost:3306/virtualPro?useSSL=false";
        private static String user = "root";
        private static String pass = "root";
    }
    
     ConexionBD() { }
    static public ConexionBD getInstance() {
        return unicaInstancia == null ? new ConexionBD(): unicaInstancia;
    }

    public Connection getConnection(){
        try{
            Class.forName(propiedades.driver);
            con = DriverManager.getConnection(propiedades.url,propiedades.user,propiedades.pass);         
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public void closeConnection() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}