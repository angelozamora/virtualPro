/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryImpl;

import DAO.IPersona;
import Bean.Administrador;
import Bean.Alumno;
import Bean.Persona;
import Bean.Profesor;

/**
 *
 * @author Angelo
 */
public class FactoryPersonaImpl {
    
    
    public static Persona getPersona(String persona){
        
        if(persona==null){
            return null;
        }
        else if(persona.equals("ALUMNO")){
            return new Alumno();
        }
        else if (persona.equals("PROFESOR")){
            return new Profesor();
        }
        else if (persona.equals("ADMINISTRADOR")){
            return new Administrador();
        }
        
        return null;
    }
}
