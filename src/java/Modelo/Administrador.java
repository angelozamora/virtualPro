/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Utils.ConexionBD;
import Design.IPersona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Angelo
 */
public class Administrador extends Persona implements IPersona{
    private int id;

    
    ConexionBD bd;
    Connection con;
    Statement st=null;
    ResultSet rs=null;

    public Administrador() {
        bd = new ConexionBD();
        con = bd.getConnection();
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public void crearAlumno(Alumno alumno){
        try{
               st = con.createStatement();
               rs = st.executeQuery("INSERT INTO usuario (`user`, `password`, `rol`) "
                       + "VALUES ('"+alumno.getUsuario().getUser()+"', '"+alumno.getUsuario().getPassword()+"','alumn')");
               System.out.println("se agregar usuario");
               
               
        }catch(Exception e){
            
        }
        
        
        
        
        
    }
    
    public void crearProfesor(Profesor profesor){
        try{
               st = con.createStatement();
               rs = st.executeQuery("INSERT INTO usuario (`user`, `password`, `rol`) "
                       + "VALUES ('"+profesor.getUsuario().getUser()+"', '"+profesor.getUsuario().getPassword()+"','alumn')");
               System.out.println("se agregar usuario");
        }catch(Exception e){
            
        } 
        
    }
    
    public void crearAdministrador(){
        try{
               st = con.createStatement();
               rs = st.executeQuery("INSERT INTO usuario (`user`, `password`, `rol`) "
                       + "VALUES ('"+this.getUsuario().getUser()+"', '"+this.getUsuario().getPassword()+"','alumn')");
               System.out.println("se agregar usuario");
        }catch(Exception e){
            
        }  
    }
   

    @Override
    public void subirActividad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
