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


public class Pregunta {
    private String Descripcion;
    private String Categoria;
    private boolean  Resultado;

    public Pregunta() {
    }
    public Pregunta(String Descripcion, String Categoria, boolean Resultado) {
        this.Descripcion = Descripcion;
        this.Categoria = Categoria;
        this.Resultado = Resultado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public boolean isResultado() {
        return Resultado;
    }

    public void setResultado(boolean Resultado) {
        this.Resultado = Resultado;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "Descripcion=" + Descripcion + ", Categoria=" + Categoria + ", Resultado=" + Resultado + '}';
    }
    
    
    
}
