package com.ieseljust.batallaEspacial;

public class Piloto {

    protected String nombre;
    protected int habilidad;
    
    public Piloto(String nombre, int habilidad) {
        this.nombre = nombre;
        this.habilidad = habilidad;
    }

    public String getNombre(){ return nombre;}
    public int getHabilidad(){ return habilidad;}

}