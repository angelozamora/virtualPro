/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Angelo
 */
public class ConexionBD {
    
    private String rol;
    private static ConexionBD conBD;
    
    static{
        conBD = new ConexionBD();
    }
    
    
    public static ConexionBD getInstance(){
        return conBD;
    }
    
    
   
    
    /*
     public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/virtualPro?useSSL=false",
                    "root","root");
        }catch(SQLException e){            
        }catch (Exception e){            
        }
        return cn; 
    }
    */
    
    public ConexionBD(){
        
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    

    public Connection getConnection(){
         Connection  cn = null;
        
        String url = "jdbc:mysql://localhost:3306/virtualPro?useSSL=false";
        String user;
        String pass;
        
        if(rol.equals("root")){
            user = "root";
            pass = "root";
        }else{
            user = rol;
            pass = rol;
        }
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url,user,pass);

            if(cn!=null){
                System.out.println("Connexion establecida");
            }else{
                System.out.println("No se establecio la conexion");
            }           
        }catch (Exception e){            
        }
        return cn; 
    }
     
     
    
}
