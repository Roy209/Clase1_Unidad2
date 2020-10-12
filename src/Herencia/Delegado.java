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
public class Delegado extends Estudiante {
    private int Valoracion;

    public Delegado() {
        super();
        
    }

    public Delegado(int Valoracion, double Promedio, String Nombre, String Apellido) {
        super(Promedio, Nombre, Apellido);
        this.Valoracion = Valoracion;
        
    }

    public int getValoracion() {
        return Valoracion;
    }

    public void setValoracion(int Valoracion) {
        this.Valoracion = Valoracion;
    }

    public String InfoDelegado(){
        return "Nombre: "+ this.getNombre()+ " Apellido:"+this.getApellido()+ " Nota: "+this.getPromedio()+ " Valoracion :"+this.getValoracion();
    }   
    
    
   
    
}
