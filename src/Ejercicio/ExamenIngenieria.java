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
public class ExamenIngenieria extends Examen{

    public ExamenIngenieria() {
        super();
    }

    
    
    @Override
    void AgregarPostulante(Postulante P) {
      if(P.getFacultadPostular().getCategoria().equals(Utils.Ing)){
            this.Postulantee = P;
            System.out.println("Postulante Agregado");
        }else{
            System.out.println("El Postulante tiene que ser de Una facultad de Ingenieria");
        } 
    }

    @Override
    void CalcularNota(boolean[] Respuesta) {
         double NotaParcial=0;
        for (int i = 0; i <Respuesta.length; i++) {
            if(Respuesta[i] == this.ListaPreguntas[i].isResultado()){
                if(this.ListaPreguntas[i].getCategoria() == Utils.Ing){
                    NotaParcial+=2.5;
                }else{
                    NotaParcial+=1.5;
                }
            }
        }
        this.setNota(NotaParcial);
    }
    
}
