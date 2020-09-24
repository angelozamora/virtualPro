/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Bean.Alumno;
import Bean.Resultado;
import Bean.Seccion;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface ISeccionDAO {
    void crearSeccion(Seccion seccion);
    
    Seccion obtenerSeccionxId(int id);
    
    List<Seccion> obtenerSecciones();
    
    List<Seccion> obtenerSeccionesxGrado(int gradoId);
    
    Resultado eliminarSeccion(int id);
    
    public void asignarAlumnos(String idGradoSeccion,Alumno alu);
}
