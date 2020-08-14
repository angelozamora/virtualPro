/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impl;

import Design.IGradoDAO;
import Modelo.Grado;
import Modelo.Resultado;
import Utils.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angelo
 */
public class GradoDAOImpl implements IGradoDAO{
    
    Statement st=null;
    ResultSet rs=null;
    Connection cn ;

    public GradoDAOImpl() {
        cn=ConexionBD.getInstance().getConnection();
    }
    
    
    @Override
    public void crearGrado(Grado grado) {
        
        try{
            st=cn.createStatement();
            st.executeUpdate("INSERT INTO grado (`nombreGrado`) VALUES ('"+grado.getNombreGrado()+"');");
            
        }
        catch(Exception e){
               e.getMessage();
        }
    
    }

    @Override
    public Grado obtenerGradoxId(int id) {
        
        Grado grado=  new Grado();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM grado WHERE idGrado='"+id+"'");
            
            while(rs.next()){         
                grado.setId(rs.getInt("idGrado"));
                grado.setNombreGrado(rs.getString("nombreGrado"));
                grado.setNivel(rs.getString("nivel"));
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return grado;
    
    }

    @Override
    public List<Grado> obtenerGrados() {
        
         List<Grado> gradoList=new ArrayList<Grado>();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM grado");
            
            while(rs.next()){   
                Grado grado=  new Grado();
                grado.setId(rs.getInt("idGrado"));
                grado.setNombreGrado(rs.getString("nombreGrado"));
                grado.setNivel(rs.getString("nivel"));
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return gradoList;
    
    }

    @Override
    public Resultado eliminarGrado(int id) {
        
        Resultado resultado=new Resultado();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("DELETE FROM grado WHERE idGrado='"+id+"'");
            resultado.setCodigoRespuesta("200");
            resultado.setMensajeRespuesta("Operacion exitosa");
            
        }
        catch(Exception e){
               e.getMessage();
               resultado.setCodigoRespuesta("200");
                resultado.setMensajeRespuesta("Operacion exitosa");
               
        }
        
        return resultado;
    
    }
    
}
