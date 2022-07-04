package com.ieseljust.batallaEspacial;

import java.util.List;

abstract public class Nave implements Logable{
        // Nave és una agregació d'un canó i un escut
        // A més, tindrà una associació amb un pilot
        // Tot i que conceptualment s'interprete d'aquesta maanera, 
        // ia nivell d'implementació tot són referències a objectes
        // de tipus Piloto, Canyon i Escudo.
        protected Piloto piloto;
        protected Canyon canyon;
        protected Escudo escudo;

        public Nave(Piloto piloto, Canyon canyon, Escudo escudo){
            this.piloto=piloto;
            this.canyon=canyon;
            this.escudo=escudo;
        }

        public Piloto getPiloto() {return this.piloto;}
        public Canyon getCanyon() {return this.canyon;}
        public Escudo getEscudo() {return this.escudo;}


        
        public void dispara(List<Nave> naves) {
            // Triem una nau aleatòria del bàndol contrari
    
            // Triem una nau aleatòria del bàndol contrari
            int indice = (int) (Math.random() * naves.size());
    
            // I calculem dues probabilitats, segons quina siga major, 
            // fallarà o encertarà.
            float miProbabilidad = (this.piloto.habilidad * this.canyon.potencia)
                    * (1f + 1f / (int) (Math.random() * 10 + 1));
            float suProbabilidad = (naves.get(indice).piloto.habilidad * naves.get(indice).escudo.proteccion)
                    * (1f + 1f / (int) (Math.random() * 10 + 1));
    
            // Per mostrar les probabilitats podem descomentar esta línia
            // System.out.println(miProbabilidad+" "+suProbabilidad);
    
            if (miProbabilidad > suProbabilidad) {
                Log(this.piloto.nombre + " derriba a " + naves.get(indice).piloto.nombre);
                naves.remove(indice);
            } else
                Log(this.piloto.nombre + " falla");
    
        }

    }
