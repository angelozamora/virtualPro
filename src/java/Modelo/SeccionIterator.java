/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Angelo
 */
public class SeccionIterator implements Iterator<Alumno>{
    private List<Alumno> alumnos;
    private int locacion;

    public SeccionIterator(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public Alumno next(){
        return alumnos.get(locacion++);
    }
    
    public boolean hasNext(){
        if(locacion<alumnos.size() && alumnos.get(locacion)!=null){
            return true;
        }
        else{
            return false;
        }
    }
    
}
