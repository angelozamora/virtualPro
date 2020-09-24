/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.IPersona;

/**
 *
 * @author Angelo
 */
public class Alumno extends Persona  {
    private int id;
    private int codigo;
    private String telefono;
    private String estado;
    private String nivel;

    public Alumno() {
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
    
    public void matriculado(){
        this.estado="matriculado";
    }
    
    public void retirado(){
        this.estado="inactivo";
    }
    
    public void suspendido(){
        this.estado="suspendido";
    }
    
}
