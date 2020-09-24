/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import Bean.Alumno;
import Utils.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import DAO.IAlumnoDAO;
import DAO.IUsuarioDAO;
import FactoryImpl.FactoryImpl;
import Bean.Resultado;

/**
 *
 * @author Angelo
 */


public class AlumnoDAOImpl implements IAlumnoDAO {
    
    Statement st=null;
    ResultSet rs=null;
    Connection cn ;

    public AlumnoDAOImpl() {
        cn=ConexionBD.getInstance().getConnection();

    }
    
    IUsuarioDAO usuarioDao=FactoryImpl.getInstance().getUsuarioService();
 
    
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
                alumno.setNivel(rs.getString("nivel"));
                
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
;
            alumno.setUsuario(usuarioDao.crearUsuario(alumno.getUsuario()));
            
            st=cn.createStatement();
            st.executeUpdate("INSERT INTO alumno (`nombre`, `email`, `telefono`, `dni`, `estado`, `idUsuario`, `nivel`) "
                    + "VALUES ('"+alumno.getNombre()+"','"+alumno.getEmail()+"','"+alumno.getTelefono()
                    +"','"+alumno.getDni()+"','inactivo','"+alumno.getUsuario().getId()+"','"+alumno.getNivel()+"')");
            
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

    @Override
    public List<Alumno> obtenerAlumnosxGradoxSeccion(int idGradoSeccion) {
        List<Alumno> alumnoList=new ArrayList<Alumno>();
        String procedimientoAlmacenado = "CALL SP_obtenerAlumnosxGradoxSeccion("+idGradoSeccion+")";

        try{
            
            st=cn.createStatement();
            rs=st.executeQuery(procedimientoAlmacenado);
            
            while(rs.next()){
                
                Alumno alumno=new Alumno();
                alumno.setId(rs.getInt("idMatricula"));
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
    public List<Alumno> obtenerAlumnosxNivel(String nivel) {
        List<Alumno> alumnoList=new ArrayList<Alumno>();
        String procedimientoAlmacenado = "SELECT * FROM alumno "
                + "WHERE nivel = '"+nivel+"' AND estado='inactivo'";

        try{
            
            st=cn.createStatement();
            rs=st.executeQuery(procedimientoAlmacenado);
            
            while(rs.next()){
                
                Alumno alumno=new Alumno();
                alumno.setId(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                
                alumnoList.add(alumno);
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return alumnoList;
        
        
        
    }

    @Override
    public void cambiarEstadoAlumno(Alumno alumno) {
        
        try{
            st=cn.createStatement();
            st.executeUpdate("UPDATE alumno SET estado = '"+alumno.getEstado()+"' WHERE idAlumno="+alumno.getId()+"");
            
        }
        catch(Exception e){
            e.getMessage();
        }
    }
    
}
