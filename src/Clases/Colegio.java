/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Keni
 */
public class Colegio {

    public static void main(String[] args) {
        ArrayList<Estudiante> ListaEstudiante = new ArrayList<>();
        Estudiante E1 = new Estudiante("Luz", "Daga", 12.3);
        Estudiante E2 = new Estudiante("Marcelo", "Diaz", 15.3);
        Estudiante E3 = new Estudiante("Paty", "Cantu", 18.3);

        Delegado D1 = new Delegado("Julio", "Cuenca", 15.25, 6);

        ListaEstudiante.add(E1);
        ListaEstudiante.add(E2);
        ListaEstudiante.add(E3);
        //ListaEstudiante.add(D1);

        Iterator<Estudiante> IteratorEstudiante = ListaEstudiante.iterator();

        Estudiante Primero = new Estudiante();
        Primero.setNota(0);
        while (IteratorEstudiante.hasNext()) {
            Estudiante EstFlag = IteratorEstudiante.next();
            if (Primero.getNota() < EstFlag.getNota()) {
                Primero = EstFlag;
            }
        }
        System.out.println("Alumnos con mas alta noota");
        System.out.println(Primero);

    }
}
