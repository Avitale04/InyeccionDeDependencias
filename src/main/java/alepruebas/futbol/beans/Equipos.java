package alepruebas.futbol.beans;

import org.springframework.beans.factory.annotation.Value;

public class Equipos {

    @Value("Manchester United")
    private String equipo;

    public String getEquipo() {return equipo;}

    public void setEquipo(String equipo) {this.equipo = equipo;}

    private Ligas liga;

    public Ligas getLiga() {return liga;}

    public void setLiga(Ligas liga) {this.liga = liga;}
}
