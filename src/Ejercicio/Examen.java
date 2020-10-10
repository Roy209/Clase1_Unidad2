/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Keni
 */
public abstract class Examen {
    protected Pregunta[] ListaPreguntas;
    protected Postulante Postulantee;
    protected double Nota;

    public Examen() {
        this.ListaPreguntas = new Pregunta[10];
        ColocarPreguntasAutomatico();
    }
    
    protected double getNota() {
        return Nota;
    }

    protected void setNota(double Nota) {
        this.Nota = Nota;
    }
    
    public void ColocarPreguntasManual(){
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < this.ListaPreguntas.length; i++) {
            System.out.println("Ingrese la pregunta");
            this.ListaPreguntas[i].setDescripcion(entrada.nextLine());
            System.out.println("Ingrese Categoria");
            this.ListaPreguntas[i].setCategoria(entrada.nextLine());
            System.out.println("Ingrese alternativa V(Verdader) F(Falso) ");
            
            switch( entrada.nextLine().toUpperCase()){
                case "V":
                        this.ListaPreguntas[i].setResultado(true);
                        break;
                case "F":
                        this.ListaPreguntas[i].setResultado(false);
                        break;
                    
            }
    
        }
     }
    
    //Este metodo introduce la respuesta verdadero o falso aleatoriamente 
    public void ExamenTerminadoAleatorio(){
       Random aleatorio = new Random();
       int flag;
       for (int i = 0; i < this.ListaPreguntas.length; i++) {
           flag = aleatorio.nextInt(2);
           if(flag == 1){
             this.ListaPreguntas[i].setResultado(true);  
           }else{
             this.ListaPreguntas[i].setResultado(false);  
         }
      }
      for(Pregunta P : this.ListaPreguntas){
          System.out.println(P.isResultado() + "     : "+P.getCategoria() );
      } 
       
    }
    
    
    
    
    //Agrega las preguntas y sus respuestas por defecto en falso
    public void ColocarPreguntasAutomatico(){
        Random aleatorio = new Random(1);
        Pregunta P1 = new Pregunta("Pregunta 1",Utils.Ing, false);
        Pregunta P2 = new Pregunta("Pregunta 2",Utils.Ing, false);
        Pregunta P3 = new Pregunta("Pregunta 3",Utils.Ing, false);
        Pregunta P4 = new Pregunta("Pregunta 4",Utils.Ing, false);
        Pregunta P5 = new Pregunta("Pregunta 5",Utils.Ing, false);
        Pregunta P6 = new Pregunta("Pregunta 6",Utils.Fcea, false);
        Pregunta P7 = new Pregunta("Pregunta 7",Utils.Fcea, false);
        Pregunta P8 = new Pregunta("Pregunta 8",Utils.Fcea, false);
        Pregunta P9 = new Pregunta("Pregunta 9",Utils.Fcea, false);
        Pregunta P10 = new Pregunta("Pregunta 10",Utils.Fcea, false);
        ListaPreguntas[0] = P1;
        ListaPreguntas[1] = P2;
        ListaPreguntas[2] = P3;
        ListaPreguntas[3] = P4;
        ListaPreguntas[4] = P5;
        ListaPreguntas[5] = P6;
        ListaPreguntas[6] = P7;
        ListaPreguntas[7] = P8;
        ListaPreguntas[8] = P9;
        ListaPreguntas[9] = P10;
   }
    //Este metodo se introduce como parametro las respuestas que se marco
    public void ExamenTerminadoManual(boolean[] Respondido){
        for (int i = 0; i < this.ListaPreguntas.length; i++) {
            this.ListaPreguntas[i].setResultado(Respondido[i]);
         }
    }
      
    abstract void AgregarPostulante(Postulante Pos); 
    abstract void CalcularNota(boolean[] Respues);
   
    
   
    
    
}
