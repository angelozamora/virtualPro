/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import Modelo.Profesor;
import Modelo.Resultado;
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
}
