/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impl;

import Design.IProfesorDAO;
import Modelo.Alumno;
import Modelo.Profesor;
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
public class ProfesorDAOImpl implements IProfesorDAO{
    
    private ConexionBD con;
    Statement st=null;
    ResultSet rs=null;
    Connection cn = con.getConnection();
    
    @Override
    public void crearProfesor(Profesor profesor) {
        
        
        try{
            st=cn.createStatement();
            st.executeUpdate("");
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
    }

    @Override
    public Profesor obtenerProfesorxId(int id) {
   
        Profesor profesor=  new Profesor();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM profesor WHERE idProfesor='"+id+"'");
            
            while(rs.next()){         
                profesor.setId(rs.getInt("idProfesor"));
                profesor.setNombre(rs.getString("nombre"));
                profesor.setDni(rs.getString("dni"));
                profesor.setEmail(rs.getString("email"));
                profesor.setTelefono(rs.getString("telefono"));

            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return profesor;

    }

    @Override
    public List<Profesor> obtenerProfesores() {
        
        List<Profesor> profesorList=new ArrayList<Profesor>();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM profesor");
            
            while(rs.next()){
                
                Profesor profesor=new Profesor();
                profesor.setId(rs.getInt("idAlumno"));
                profesor.setNombre(rs.getString("nombre"));
                profesor.setDni(rs.getString("dni"));
                profesor.setEmail(rs.getString("email"));
                profesor.setTelefono(rs.getString("telefono"));
                
                profesorList.add(profesor);
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return profesorList;
    
    }

    @Override
    public Resultado eliminarProfesor(int id) {
        
        Resultado resultado=new Resultado();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("DELETE FROM profesor WHERE idProfesor='"+id+"'");
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
