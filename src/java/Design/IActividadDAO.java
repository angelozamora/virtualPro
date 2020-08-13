/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import Modelo.Actividad;
import Modelo.Resultado;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface IActividadDAO {
    int crearActividad(int idProfesor,Actividad actividad);
    
    Actividad obtenerActividadxId(int id);
    
    List<Actividad> obtenerActividades();
    
    Resultado eliminarActividad(int id);
}
