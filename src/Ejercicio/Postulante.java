/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Keni
 */
public class Postulante {
    private String Nombre;
    private String Apellido;
    private Facultad FacultadPostular;

    public Postulante() {
    }

    public Postulante(String Nombre, String Apellido, Facultad FacultadPostular) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FacultadPostular = FacultadPostular;
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

    public Facultad getFacultadPostular() {
        return FacultadPostular;
    }

    public void setFacultadPostular(Facultad FacultadPostular) {
        this.FacultadPostular = FacultadPostular;
    }

    @Override
    public String toString() {
        return "Postulante{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", FacultadPostular=" + FacultadPostular + '}';
    }
    
    
    
    
}
