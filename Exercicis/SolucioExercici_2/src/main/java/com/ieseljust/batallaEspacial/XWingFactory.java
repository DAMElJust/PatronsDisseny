package com.ieseljust.batallaEspacial;

public class XWingFactory extends NaveFactory {
    @Override
    public Nave createNave(String nombrePiloto, int habilidadPiloto) {
        // Ací creem i retornem la nau TieFifhter
        Piloto pilot = new Piloto(nombrePiloto, habilidadPiloto);
        Canyon c = new Canyon("C2", 4);
        Escudo e = new Escudo("E2", 5);
        return (new XWing(pilot, c, e));
    }
}