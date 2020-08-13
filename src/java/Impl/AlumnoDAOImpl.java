/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impl;

import Modelo.Alumno;
import Utils.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import Design.IAlumnoDAO;
import Design.IPersona;
import Factory.FactoryPersona;
import Modelo.Persona;
import Modelo.Resultado;

/**
 *
 * @author Angelo
 */


public class AlumnoDAOImpl implements IAlumnoDAO {
    
    private ConexionBD con;
    Statement st=null;
    ResultSet rs=null;
    Connection cn = con.getConnection();
    
    @Override
    public List<Alumno> obtenerAlumnos() {
        
        List<Alumno> alumnoList=new ArrayList<Alumno>();

        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM alumno");
            
            while(rs.next()){
                
                Alumno alumno=new Alumno();
                alumno.setId(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getString("dni"));
                alumno.setEmail(rs.getString("email"));
                alumno.setTelefono(rs.getString("telefono"));
                
                alumnoList.add(alumno);
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return alumnoList;
        
    }

    @Override
    public void crearAlumno(Alumno alumno) {
        
        try{
            
            st=cn.createStatement();
            st.executeUpdate("SELECT * FROM alumno");
            
        }
        catch(Exception e){
               e.getMessage();
        }

    
    }

    @Override
    public Alumno obtenerAlumnoxId(int id) {
        
        Alumno alumno=  new Alumno();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM alumno WHERE idAlumno='"+id+"'");
            
            while(rs.next()){         
                alumno.setId(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getString("dni"));
                alumno.setEmail(rs.getString("email"));
                alumno.setTelefono(rs.getString("telefono"));

            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return alumno;
        
    }

    @Override
    public Resultado eliminarAlumnno(int id) {
        Resultado resultado=new Resultado();
        Connection cn = con.getConnection();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("DELETE FROM alumno WHERE idAlumno='"+id+"'");
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
