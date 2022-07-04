package com.ieseljust.batallaEspacial;

public class TieFighter extends Nave {

    // construtor
    public TieFighter(Piloto piloto, Canyon canyon, Escudo escudo) {
        super(piloto, canyon, escudo);
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
