/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impl;

import Design.IActividadDAO;
import Modelo.Actividad;
import Modelo.Resultado;
import Utils.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Angelo
 */
public class ActividadDAOImpl implements IActividadDAO{
    
    Statement st=null;
    ResultSet rs=null;
    Connection cn ;
    
    public ActividadDAOImpl() {
        cn=ConexionBD.getInstance().getConnection();
    }
    
    
    
    
    @Override
    public int crearActividad(int idProfesor,Actividad actividad) {
        
        int idActividad=0;
        
        try{
            st=cn.createStatement();
            rs=st.executeQuery("CALL SP_crearActividad('"+actividad.getNombreActividad()+"','"+actividad.getDescripcion()+"',"+idProfesor+")");
            
            while(rs.next()){
                idActividad=rs.getInt("id_Actividad");
            }
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return idActividad;
        
    }

    @Override
    public Actividad obtenerActividadxId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Actividad> obtenerActividades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Resultado eliminarActividad(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
