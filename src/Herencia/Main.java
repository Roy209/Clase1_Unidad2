/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Keni
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Estudiante>  ListaEstudiante = new ArrayList<>();
        
        Estudiante E1 = new Estudiante(15.5,"Luz","Daga");
        Estudiante E2 = new Estudiante(18.2,"Felix","Monje");
        Estudiante E3 = new Estudiante(17.2,"Miguel","Palta");
        
        

        Delegado D1 = new Delegado(7,19.4,"Bell","Estrella");
        
        
        //Agregamos los Estudiantes
        ListaEstudiante.add(E1);
        ListaEstudiante.add(E2);
        ListaEstudiante.add(E3);
        
        
        
        

        Estudiante Primero = new Estudiante();
        Primero.setPromedio(0);
        
        Iterator<Estudiante> IteratorEstudiante = ListaEstudiante.iterator();
        System.out.println("*************ESTUDIANTES************");
        while (IteratorEstudiante.hasNext()) {
            Estudiante EstFlag = IteratorEstudiante.next();
            System.out.println(EstFlag.InfoEstudiante());
            if (Primero.getPromedio() < EstFlag.getPromedio()) {
                Primero = EstFlag;
            }
        }
        System.out.println(D1.InfoDelegado());
        
        
        
        System.out.println("********Alumnos con mas alta noota********");
        System.out.println(Primero.getNombre()+ " Promedio:"+Primero.getPromedio());
        
        
        
        
    }
}
