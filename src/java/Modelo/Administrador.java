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
    
  
    @Override
    public void subirActividad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
