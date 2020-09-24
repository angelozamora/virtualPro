/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Grado;
import Bean.Resultado;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface IGradoDAO {
    void crearGrado(Grado grado);
    
    void agregarSeccionaGrado(int idGrado, int idSeccion);
    
    Grado obtenerGradoxId(int id);
    
    List<Grado> obtenerGrados();
    
    List<Grado> obtenerGradosxNivel(String nivel);
    
    Grado obtenerGradoySeccion(int idGradoSeccion);
    
    Resultado eliminarGrado(int id);
}
