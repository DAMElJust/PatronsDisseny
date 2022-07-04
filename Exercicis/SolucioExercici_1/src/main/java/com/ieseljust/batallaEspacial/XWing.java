package com.ieseljust.batallaEspacial;

import java.util.List;

public class XWing extends Nave implements Logable
{
    // Constructor
    public XWing(Piloto piloto, Canyon canyon, Escudo escudo){
        // Invoca al constructor de la classe base
         super(piloto, canyon, escudo);
    }
        @Override
        public void dispara(List<Nave> naves)
        {

            // Triem una nau aleatòria del bàndol contrari
            int indice = (int)(Math.random()*naves.size());

            float miProbabilidad=(this.piloto.habilidad*this.canyon.potencia)*(1f+1f/ (int)(Math.random()*10+1));
            float suProbabilidad=(naves.get(indice).piloto.habilidad*naves.get(indice).escudo.proteccion)*(1f+1f/(int)(Math.random()*10+1));

            // Per mostrar les probabilitats podem descomentar esta línia
            //System.out.println(miProbabilidad+" "+suProbabilidad);

            if (miProbabilidad>suProbabilidad) {
                Log(this.piloto.nombre+" derriba a "+naves.get(indice).piloto.nombre);
                naves.remove(indice);
            } else Log(this.piloto.nombre+" falla");


        }

    public void Log(String mensaje) {
        
        // Consola a color cyan
        System.out.println("\u001B[36m");
        // Misstge
        System.out.println(mensaje);
        // Reset
        System.out.println("\u001B[0m");
    }

}
