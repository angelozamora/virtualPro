/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Bean.Administrador;
import Bean.Alumno;
import Bean.Resultado;
import Bean.Seccion;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface IAdministradorDAO {
    void crearAdministrador(Administrador administrador);
    
    Administrador obtenerAdministradorxId(int id);
    
    List<Administrador> obtenerAdministradors();
    
    Resultado eliminarAdministrador(int id);
    
    void matricularAlumnos(String idGradoSeccion, Seccion seccion);
}
