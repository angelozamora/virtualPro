/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;


import Modelo.Curso;
import Modelo.Resultado;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface ICursoDAO {
    void crearCurso(Curso curso);
    
    Curso obtenerCursoxId(int id);
    
    List<Curso> obtenerCursos();
    
    Resultado eliminarCurso(int id);
}
