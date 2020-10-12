/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Keni
 */
public class Profesor {
    private String Nombre;
    private String Apellido;
    private String Especialidad;

    public Profesor() {
    }

    public Profesor(String Nombre, String Apellido, String Especialidad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Especialidad = Especialidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    @Override
    public String toString() {
        return  "Nombre:" + Nombre + " Apellido:" + Apellido + " Especialidad:" + Especialidad ;
    }
    
    
        
    
}
