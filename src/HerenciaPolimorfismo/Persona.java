/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaPolimorfismo;

import Herencia.*;

/**
 *
 * @author Keni
 */
public class Persona {
    protected String Nombre; //Acceso a clases y las clases del mismo packages
    private String Apellido;
   

    public Persona() {
    }

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
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

       
       
    
}
