/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impl;

import Design.IUsuarioDAO;
import Modelo.Resultado;
import Modelo.Usuario;
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
public class UsuarioDAOImpl implements IUsuarioDAO{
    
    private ConexionBD con;
    Statement st=null;
    ResultSet rs=null;
    Connection cn = con.getConnection();
    
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        try{
            
            st=cn.createStatement();
            st.executeUpdate("SELECT * FROM usuario");
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return usuario;
    }

    @Override
    public Usuario obtenerUsuarioxId(int id) {
        
        Usuario usuario=new Usuario();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM usuario");
            
            while(rs.next()){
                usuario.setId(rs.getInt("idUsuario"));
                usuario.setUser(rs.getString("user"));
                usuario.setRol(rs.getString("rol"));
                
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return usuario;
        
    
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        
        List<Usuario> usuarioList= new ArrayList<Usuario>();
        
        try{
            
            st=cn.createStatement();
            rs=st.executeQuery("SELECT * FROM usuario");
            
            while(rs.next()){
                
                Usuario usuario=new Usuario();
                usuario.setId(rs.getInt("idUsuario"));
                usuario.setUser(rs.getString("user"));
                usuario.setRol(rs.getString("rol"));

                
            }
            
        }
        catch(Exception e){
               e.getMessage();
        }
        
        return usuarioList;
    
    }

    @Override
    public Resultado eliminarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
