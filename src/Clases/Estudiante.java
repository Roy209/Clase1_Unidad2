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
public class Estudiante {
    private String Nombre;
    private String Apellido;
    private double Nota;

    public Estudiante() {
    }

    public Estudiante(String Nombre, String Apellido, double Nota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nota = Nota;
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

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    @Override
    public String toString() {
        return  "Nombre: "+this.Nombre+" Apellido:"+this.Apellido+" Promedio: "+this.Nota;
    }
    
    
    
    
}
