/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Alumno;
import Bean.Resultado;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface IAlumnoDAO {
        
    void crearAlumno(Alumno alumno);
    
    void cambiarEstadoAlumno(Alumno alumno);
    
    Alumno obtenerAlumnoxId(int id);
    
    List<Alumno> obtenerAlumnos();
    
    List<Alumno> obtenerAlumnosxNivel(String nivel);
    
    List<Alumno> obtenerAlumnosxGradoxSeccion(int idGradoSeccion);
    
    Resultado eliminarAlumnno(int id);
}
