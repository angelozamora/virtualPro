/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.IAdministradorDAO;
import DAO.ISeccionDAO;
import FactoryImpl.FactoryImpl;
import Bean.Administrador;
import Bean.Alumno;
import Bean.Resultado;
import Bean.Seccion;
import Utils.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Angelo
 */
public class AdministradorDAOImpl implements IAdministradorDAO{
    
    Statement st=null;
    ResultSet rs=null;
    Connection cn ;

    public AdministradorDAOImpl() {
        cn=ConexionBD.getInstance().getConnection();
    }
    
    
    
    ISeccionDAO seccionDAO= FactoryImpl.getInstance().getSeccionService();
    
    @Override
    public void crearAdministrador(Administrador administrador) {
        try{
            
            st=cn.createStatement();
            st.executeUpdate("SELECT * FROM administrador");
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
    }

    @Override
    public Administrador obtenerAdministradorxId(int id) {
        
        Administrador administrador=new Administrador();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM administrador");
            
            while(rs.next()){
                administrador.setId(rs.getInt("idAdministrador"));
                administrador.setNombre(rs.getString("nombre"));
                administrador.setDni(rs.getString("dni"));
                administrador.setEmail(rs.getString("email"));
                
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return administrador;
    }

    @Override
    public List<Administrador> obtenerAdministradors() {
        List<Administrador> administradorList= new ArrayList<Administrador>();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM administrador");
            
            while(rs.next()){
                
                Administrador administrador=new Administrador();
                administrador.setId(rs.getInt("idAdministrador"));
                administrador.setNombre(rs.getString("nombre"));
                administrador.setDni(rs.getString("dni"));
                administrador.setEmail(rs.getString("email"));
                
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return administradorList;
    }

    @Override
    public Resultado eliminarAdministrador(int id) {
        Resultado resultado=new Resultado();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("DELETE FROM usuario WHERE idUsuario='"+id+"'");
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
    public void matricularAlumnos(String idGradoSeccion, Seccion seccion) {
        
        Iterator<Alumno> iter = seccion.iterator();
        
        while(iter.hasNext()){
            Alumno alu=iter.next();
            
            seccionDAO.asignarAlumnos(idGradoSeccion, alu);
            
        }
    
    }
    
}
