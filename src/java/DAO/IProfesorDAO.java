/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Actividad;
import Bean.Profesor;
import Bean.Resultado;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface IProfesorDAO {
    void crearProfesor(Profesor profesor);
    
    Profesor obtenerProfesorxId(int id);
    
    List<Profesor> obtenerProfesores();
    
    Resultado eliminarProfesor(int id);
    
    void subirActividad(int idProfesor,int idGradoSeccion,int  idCurso, Actividad actividad);
    
}
