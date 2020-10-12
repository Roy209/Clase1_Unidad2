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
public class Delegado {
    public String Nombre;
    private String Apellido;
    private double Nota;
    private int Valoracion;

    public Delegado() {
    }

    public Delegado(String Nombre, String Apellido, double Nota, int Valoracion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nota = Nota;
        this.Valoracion = Valoracion;
        
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

    public int getValoracion() {
        return Valoracion;
    }

    public void setValoracion(int Valoracion) {
        this.Valoracion = Valoracion;
    }
    
  @Override
    public String toString() {
        return  "Nombre: "+this.Nombre+" Apellido:"+this.Apellido+" Promedio: "+this.Nota +" Valoracion:"+this.Valoracion;
    }   
    
}
