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
public class Facultad {
    private String Nombre;
    private String Categoria;

    public Facultad() {
    }

    public Facultad(String Nombre, String Categoria) {
        this.Nombre = Nombre;
        this.Categoria = Categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public String toString() {
        return "Facultad{" + "Nombre=" + Nombre + ", Categoria=" + Categoria + '}';
    }
    
    
}
