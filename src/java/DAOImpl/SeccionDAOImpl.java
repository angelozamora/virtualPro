/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.ISeccionDAO;
import Bean.Alumno;
import Bean.Resultado;
import Bean.Seccion;
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
public class SeccionDAOImpl implements ISeccionDAO{
    
    Statement st=null;
    ResultSet rs=null;
    Connection cn ;

    
    public SeccionDAOImpl() {
        cn=ConexionBD.getInstance().getConnection();
    }
    
    
    @Override
    public void crearSeccion(Seccion seccion) {
        try{
            st=cn.createStatement();
            st.executeUpdate("INSERT INTO seccion (`nombreSeccion`) VALUES ('"+seccion.getNombreSeccion()+"')");
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
    }

    @Override
    public Seccion obtenerSeccionxId(int id) {
        Seccion seccion=  new Seccion();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM seccion WHERE idSeccion='"+id+"'");
            
            while(rs.next()){         
                seccion.setId(rs.getInt("idSeccion"));
                seccion.setNombreSeccion(rs.getString("nombreSeccion"));


            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return seccion;
    
    }

    @Override
    public List<Seccion> obtenerSecciones() {
        
        List<Seccion> seccionList=new ArrayList<Seccion>();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM seccion");
            
            while(rs.next()){
                
                Seccion seccion=new Seccion();
                seccion.setId(rs.getInt("idSeccion"));
                seccion.setNombreSeccion(rs.getString("nombreSeccion"));
                
                seccionList.add(seccion);
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return seccionList;
        
    }

    @Override
    public Resultado eliminarSeccion(int id) {
        Resultado resultado=new Resultado();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("DELETE FROM seccion WHERE idSeccion='"+id+"'");
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

    @Override
    public void asignarAlumnos(String idGradoSeccion,Alumno alu) {
        
        int Id=Integer.parseInt(idGradoSeccion);
        
        try{
            st=cn.createStatement();
            st.executeUpdate("INSERT INTO matricula (`idGrado_Seccion`, `idAlumno`) VALUES ('"+Id+"','"+alu.getId()+"')"); 
            
            
        }
        catch(Exception e){
            
        }
        
    
    
    }

    @Override
    public List<Seccion> obtenerSeccionesxGrado(int gradoId) {
        List<Seccion> seccionList=new ArrayList<Seccion>();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("CALL SP_seccionxGrado("+gradoId+")");
            
            while(rs.next()){
                
                Seccion seccion=new Seccion();
                seccion.setId(rs.getInt("idGrado_Seccion"));
                seccion.setNombreSeccion(rs.getString("nombreSeccion"));
                
                seccionList.add(seccion);
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return seccionList;
    
    }
    
    
}
