/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impl;

import Design.ICursoDAO;
import Modelo.Curso;
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
public class CursoDAOImpl implements ICursoDAO{
    
    
    private ConexionBD con;
    Statement st=null;
    ResultSet rs=null;
    Connection cn = con.getConnection();
    
    @Override
    public void crearCurso(Curso curso) {
        
        
        try{
            st=cn.createStatement();
            st.executeUpdate("INSERT INTO curso (`nombreCurso`) VALUES ('"+curso.getNombreCurso()+"')");
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
    }

    @Override
    public Curso obtenerCursoxId(int id) {
        
         Curso curso=  new Curso();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM curso WHERE idCurso='"+id+"'");
            
            while(rs.next()){         
                curso.setId(rs.getInt("idCurso"));
                curso.setNombreCurso(rs.getString("nombreCurso"));


            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return curso;
    }

    @Override
    public List<Curso> obtenerCursos() {
        
        List<Curso> cursoList=new ArrayList<Curso>();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM curso");
            
            while(rs.next()){
                
                Curso curso=new Curso();
                curso.setId(rs.getInt("idCurso"));
                curso.setNombreCurso(rs.getString("nombreCurso"));

                
                cursoList.add(curso);
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return cursoList;
    
        
    }

    @Override
    public Resultado eliminarCurso(int id) {
        
        Resultado resultado=new Resultado();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("DELETE FROM curso WHERE idCurso='"+id+"'");
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
