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
public class ExamenFcea extends Examen{

    public ExamenFcea() {
        super();
    }
        

    
    
    @Override
    void AgregarPostulante(Postulante P) {
        if(P.getFacultadPostular().getCategoria().equals(Utils.Fcea)){
            this.Postulantee = P;
           System.out.println("Postulante Agregado");

        }else{
            System.out.println("El Postulante tiene que ser de Una facultad de Facea");
        }
    }
    
    
    /*Cada pregunta de la categoria Face bien respondia equivale a 2.5 mientras que las preguntas de 
    ingenieria equivale a 1.5 */
    @Override
    void CalcularNota(boolean[] Repuesta) {
        double NotaParcial=0;
        for (int i = 0; i <Repuesta.length; i++) {
            //System.out.println(this.ListaPreguntas[i].isResultado() + " == "+ Repuesta[i]);
            
            if(Repuesta[i] == this.ListaPreguntas[i].isResultado()){
                if(this.ListaPreguntas[i].getCategoria() == Utils.Fcea){
                    NotaParcial+=2.5;
                    //System.out.println( this.ListaPreguntas[i].getCategoria()+" +2.5  --> "+NotaParcial);
                }else{
                    NotaParcial+=1.5;
                    //System.out.println(this.ListaPreguntas[i].getCategoria()+" +1.5  --> "+NotaParcial);
                }
            }
        }
        this.setNota(NotaParcial);
    }
}
