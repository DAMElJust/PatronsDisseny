package com.ieseljust.batallaEspacial;

public class Escudo
{
    protected String tipo;
    protected int proteccion;

    public Escudo(String tipo, int proteccion){
      this.tipo=tipo;
      this.proteccion=proteccion;
    }
    public String getTipo() {return tipo;}
    public int getProteccion() {return proteccion;}
}

