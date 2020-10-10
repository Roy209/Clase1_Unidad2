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
public class Persona extends Object{
    private String Nombre;
    private String Apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public Persona(String Nombre, String Apellido, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }
    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

  
    
     
    
}
