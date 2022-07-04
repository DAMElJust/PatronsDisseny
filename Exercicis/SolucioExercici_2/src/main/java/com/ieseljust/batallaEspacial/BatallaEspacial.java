package com.ieseljust.batallaEspacial;

import java.util.ArrayList;

public class BatallaEspacial {
    public static void main(String[] args) {

        // Definim les dues flotes
        ArrayList<Nave> FlotaRebelde = new ArrayList<Nave>();
        ArrayList<Nave> FlotaImperial = new ArrayList<Nave>();

        XWingFactory xwf=new XWingFactory();
        TieFighterFactory tff=new TieFighterFactory();
        
        // Omplim la flota rebel de naus de tipus XWing,
        // afegint els pilots i les propietats
        FlotaRebelde.add(xwf.createNave("Luke Skywalker", 9));
        FlotaRebelde.add(xwf.createNave("Wedge Antilles", 7));
        FlotaRebelde.add(xwf.createNave("Jek Porkins ", 4));

        // Omplim la flota imperial de naus de tipus Tie Figther,
        // afegint els pilots i les propietats
        FlotaImperial.add(tff.createNave("Darth Vader", 10));
        FlotaImperial.add(tff.createNave("Trooper 1", 5));
        FlotaImperial.add(tff.createNave("Trooper 2", 5));

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
