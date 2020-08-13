/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import org.omg.DynamicAny.DynValueCommonOperations;

/**
 *
 * @author Angelo
 */
public class Grado {
    private  int id;
    private  String nombreGrado;
    private String nivel;
    private List<Seccion> seccionesList;
    private List<Curso> cursosList;

    public Grado() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreGrado() {
        return nombreGrado;
    }

    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


    public List<Seccion> getSeccionesList() {
        return seccionesList;
    }

    public void setSeccionesList(List<Seccion> seccionesList) {
        this.seccionesList = seccionesList;
    }

    public List<Curso> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Curso> cursosList) {
        this.cursosList = cursosList;
    }
    
    
    
    
    
    
}
