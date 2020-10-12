/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Keni
 */
public class Estudiante extends Persona {
    
    protected double Promedio;

    public Estudiante() {
    }

    
    public Estudiante(double Promedio, String Nombre, String Apellido) {
        super(Nombre, Apellido);
        this.Promedio = Promedio;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    public String InfoEstudiante(){
        return "Nombre: "+ this.getNombre()+ " Apellido:"+this.getApellido()+ " Nota: "+this.getPromedio();
    }
    
        
}
