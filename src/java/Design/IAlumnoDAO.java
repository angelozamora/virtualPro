/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import Modelo.Alumno;
import Modelo.Resultado;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface IAlumnoDAO {
        
    void crearAlumno(Alumno alumno);
    
    Alumno obtenerAlumnoxId(int id);
    
    List<Alumno> obtenerAlumnos();
    
    Resultado eliminarAlumnno(int id);
}
