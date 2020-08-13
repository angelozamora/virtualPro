/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;


import Modelo.Alumno;
import Modelo.Resultado;
import Modelo.Seccion;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface ISeccionDAO {
    void crearSeccion(Seccion seccion);
    
    Seccion obtenerSeccionxId(int id);
    
    List<Seccion> obtenerSecciones();
    
    Resultado eliminarSeccion(int id);
    
    public void asignarAlumnos(String idGradoSeccion,Alumno alu);
}
