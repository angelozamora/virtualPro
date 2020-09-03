/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import DAO.IActividadDAO;
import DAO.IAdministradorDAO;
import DAOImpl.AlumnoDAOImpl;
import DAO.IAlumnoDAO;
import DAO.ICursoDAO;
import DAO.IGradoDAO;
import DAO.IProfesorDAO;
import DAO.ISeccionDAO;
import DAO.IUsuarioDAO;
import DAOImpl.ActividadDAOImpl;
import DAOImpl.AdministradorDAOImpl;
import DAOImpl.CursoDAOImpl;
import DAOImpl.GradoDAOImpl;
import DAOImpl.ProfesorDAOImpl;
import DAOImpl.SeccionDAOImpl;
import DAOImpl.UsuarioDAOImpl;

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
