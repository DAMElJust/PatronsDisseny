package com.ieseljust.batallaEspacial;

import java.util.ArrayList;

public class BatallaEspacial {
    public static void main(String[] args) {

        // Definim les dues flotes
        ArrayList<Nave> FlotaRebelde = new ArrayList<Nave>();
        ArrayList<Nave> FlotaImperial = new ArrayList<Nave>();

        // Definim els tipus de canons i escuts
        Canyon c1 = new Canyon("C1", 5);
        Canyon c2 = new Canyon("C2", 4);
        Escudo e1 = new Escudo("E1", 4);
        Escudo e2 = new Escudo("E1", 5);

        // Omplim la flota rebel de naus de tipus XWing,
        // afegint els pilots i les propietats
        FlotaRebelde.add(new XWing(new Piloto("Luke Skywalker", 9), c1, e1));
        FlotaRebelde.add(new XWing(new Piloto("Wedge Antilles", 7), c1, e1));
        FlotaRebelde.add(new XWing(new Piloto("Jek Porkins ", 4), c1, e1));

        // Omplim la flota imperial de naus de tipus Tie Figther,
        // afegint els pilots i les propietats
        FlotaImperial.add(new TieFighter(new Piloto("Darth Vader", 10), c2, e2));
        FlotaImperial.add(new TieFighter(new Piloto("Trooper 1", 5), c2, e2));
        FlotaImperial.add(new TieFighter(new Piloto("Trooper 2", 5), c2, e2));

        // Comencem la simulació

        while (FlotaImperial.size() > 0 && FlotaRebelde.size() > 0) {

            // Triem una nau rebel per a disparar
            int indice1 = (int) (Math.random() * FlotaRebelde.size());
            FlotaRebelde.get(indice1).dispara(FlotaImperial);

            // Només passarem per aquesta última part del bucle si
            // encara queden naus imperials (ja que es pot haver
            // eliminat la última

            if (FlotaImperial.size() > 0) {
                // Triem una nau imperial per diaparar
                int indice2 = (int) (Math.random() * FlotaImperial.size());
                FlotaImperial.get(indice2).dispara(FlotaRebelde);
            }
        }

        if (FlotaImperial.size() == 0)
            System.out.println("Guanya el bàndol rebel");
        else
            System.out.println("Guanya el bàndol imperial");
    }
}
