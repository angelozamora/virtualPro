/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Design.IActividadDAO;
import Design.IAdministradorDAO;
import Impl.AlumnoDAOImpl;
import Design.IAlumnoDAO;
import Design.ICursoDAO;
import Design.IGradoDAO;
import Design.IProfesorDAO;
import Design.ISeccionDAO;
import Design.IUsuarioDAO;
import Impl.ActividadDAOImpl;
import Impl.AdministradorDAOImpl;

import Impl.CursoDAOImpl;
import Impl.GradoDAOImpl;
import Impl.ProfesorDAOImpl;
import Impl.SeccionDAOImpl;
import Impl.UsuarioDAOImpl;

/**
 *
 * @author Angelo
 */
public class FactoryDAO {
     
    private static FactoryDAO serviceFac;
    
    static{
        serviceFac = new FactoryDAO();
    }
    
    
    public static FactoryDAO getInstance(){
        return serviceFac;
    }
    
    public IUsuarioDAO getUsuarioService(){
        return new UsuarioDAOImpl();
    }
    
    public IAdministradorDAO getAdministradorService(){
        return new AdministradorDAOImpl();
    }
    
    public IAlumnoDAO getAlumnoService(){
        return new AlumnoDAOImpl();
    }
    
    public IProfesorDAO getProfesorService(){
        return new ProfesorDAOImpl();
    }
    
    public IGradoDAO getGradoService(){
        return new GradoDAOImpl();
    }
    
    public ICursoDAO getCursoService(){
        return new CursoDAOImpl();
    }
    
    public ISeccionDAO getSeccionService(){
        return new SeccionDAOImpl();
    }
    
    public IActividadDAO getActividadService(){
        return new ActividadDAOImpl();
    }
    
}
