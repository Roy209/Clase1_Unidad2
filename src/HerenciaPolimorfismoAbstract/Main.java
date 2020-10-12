/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaPolimorfismoAbstract;

import HerenciaPolimorfismo.*;
import Herencia.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Keni
 */
public class Main {
    
    public static void main(String[] args) {
        
        
       //ListarEstudiante();
       
       ArrayList<Persona>  ListaPersona = new ArrayList<>();
        
        Estudiante E1 = new Estudiante(15.5,"Luz","Daga");
        Estudiante E2 = new Estudiante(18.2,"Felix","Monje");
        Estudiante E3 = new Estudiante(17.2,"Miguel","Palta");
        
        Delegado D1 = new Delegado(7,19.4,"Bell","Estrella");
        Profesor Profe1 = new Profesor("Pedro", "Trujillo", "Programacion");
        
        //Agregamos los Estudiantes
        ListaPersona.add(E1);
        ListaPersona.add(E2);
        ListaPersona.add(E3);
        ListaPersona.add(D1);
        ListaPersona.add(Profe1);
        
        for (Persona persona : ListaPersona) {
            System.out.println(persona.DarInfo());
        }
        
        
        
    }
    
    public static void ListarEstudiante(){
        ArrayList<Estudiante>  ListaEstudiante = new ArrayList<>();
        
        Estudiante E1 = new Estudiante(15.5,"Luz","Daga");
        Estudiante E2 = new Estudiante(18.2,"Felix","Monje");
        Estudiante E3 = new Estudiante(17.2,"Miguel","Palta");
        
        

        Delegado D1 = new Delegado(7,19.4,"Bell","Estrella");
        
        
        //Agregamos los Estudiantes
        ListaEstudiante.add(E1);
        ListaEstudiante.add(E2);
        ListaEstudiante.add(E3);
        ListaEstudiante.add(D1);
        
        
        Iterator<Estudiante> IteratorEstudiante = ListaEstudiante.iterator();

        Estudiante Primero = new Estudiante();
        Primero.setPromedio(0);
        System.out.println("*************ESTUDIANTES************");
        while (IteratorEstudiante.hasNext()) {
            Estudiante EstFlag = IteratorEstudiante.next();
                     
             System.out.println(EstFlag.DarInfo());
                     
            if (Primero.getPromedio() < EstFlag.getPromedio()) {
                Primero = EstFlag;
            }
        }
       // System.out.println(D1.InfoDelegado());
      
        
        
        System.out.println("********Alumnos con mas alta noota********");
        System.out.println(Primero.getNombre()+ " Promedio:"+Primero.getPromedio());
    }
}
