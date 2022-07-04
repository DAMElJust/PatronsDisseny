package com.ieseljust.batallaEspacial;

import java.util.List;

public class XWing extends Nave
{
    // Constructor
    public XWing(Piloto piloto, Canyon canyon, Escudo escudo){
        // Invoca al constructor de la classe base
         super(piloto, canyon, escudo);
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
