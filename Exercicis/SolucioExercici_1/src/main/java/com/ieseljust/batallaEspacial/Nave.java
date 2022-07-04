package com.ieseljust.batallaEspacial;

import java.util.List;

abstract public class Nave{
        // Nave és una agregació d'un canó i un escut
        // A més, tindrà una associació amb un pilot
        // Tot i que conceptualment s'interprete d'aquesta manera, 
        // a nivell d'implementació tot són referències a objectes
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
        
    public abstract void dispara(List<Nave> naves);

    }
