/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaPolimorfismoAbstract;

import HerenciaPolimorfismo.*;
import Herencia.*;

/**
 *
 * @author Keni
 */
public class Profesor extends Persona {
    private String Especialidad;
    
    public Profesor(){}
    
    public Profesor(String nombre, String apellido, String especialidad){
        super(nombre,apellido);
        this.Especialidad = especialidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

   public String DarInfo(){
        return "Nombre: "+ this.getNombre()+ " Apellido:"+this.getApellido()+ " Especialidad: "+this.getEspecialidad();
    }
    
    
    
}
