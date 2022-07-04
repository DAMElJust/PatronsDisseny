package com.ieseljust.batallaEspacial;

import java.util.List;

public class TieFighter extends Nave implements Logable {

    // construtor
    public TieFighter(Piloto piloto, Canyon canyon, Escudo escudo) {
        super(piloto, canyon, escudo);
    }

    @Override
    public void dispara(List<Nave> naves) {
        // Triem una nau aleatòria del bàndol contrari

        // Triem una nau aleatòria del bàndol contrari
        int indice = (int) (Math.random() * naves.size());

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

    public void Log(String mensaje) {
        // Consola a color rojo
        System.out.print("\u001B[31m");
        // Missatge
        System.out.println(mensaje);
        // Reset
        System.out.print("\u001B[0m");

    }

 
}
