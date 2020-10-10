/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Keni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de Facultades
        Facultad Sistemas = new Facultad("Ingenieria en Informatica y sistemas",Utils.Ing);
        Facultad Contabilidad = new Facultad("Contabilidad",Utils.Fcea);

        //Creacion de Postulantes
        Postulante Benjamin = new Postulante("Benjamin","Paz Foles",Sistemas);
        Postulante Luz = new Postulante("Luz","Daga",Contabilidad);
        
        //Creacion Examanes
        Examen Ex1 = new ExamenFcea();
        Examen Ex2 = new ExamenIngenieria();
        
        Ex1.AgregarPostulante(Luz);
        Ex2.AgregarPostulante(Benjamin);
       
       //Terminacion de Examen
        boolean[] RespuestasPostulante = new boolean[]{false,false,false,true,true,true,false,true,false,false};
        Ex1.ExamenTerminadoManual(RespuestasPostulante);
        Ex2.ExamenTerminadoManual(RespuestasPostulante);
       
        ArrayList<Examen> ListaExamen = new ArrayList<>();
        ListaExamen.add(Ex1);
        ListaExamen.add(Ex2);
        
        
        boolean[] Respuestas = new boolean[]{true,false,false,true,true,true,false,true,false,false};
        for(Examen ex: ListaExamen){
            ex.CalcularNota(Respuestas);
            System.out.println("Nota de "+ ex.Postulantee.getNombre()+ " -> "+ex.getNota());
         }
        }
       }
    

