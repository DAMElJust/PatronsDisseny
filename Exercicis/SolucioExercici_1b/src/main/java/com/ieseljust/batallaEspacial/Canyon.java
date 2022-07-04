package com.ieseljust.batallaEspacial;

public class Canyon {
  // Atributs privats
  protected String Modelo;
  protected int potencia;

  // Constructor
  public Canyon(String Modelo, int potencia) {
    this.Modelo = Modelo;
    this.potencia = potencia;
  }

  // Getters
  public String getModelo(){ return Modelo; }
  public int getPotencia(){ return potencia; }

  
}
