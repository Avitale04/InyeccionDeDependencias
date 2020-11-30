package alepruebas.futbol.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("equipos")
public class Equipos {

    @Value("Manchester United")
    private String equipo;

    @Autowired
    private Ligas liga;

    public String getEquipo() {return equipo;}

    public void setEquipo(String equipo) {this.equipo = equipo;}

    public Ligas getLiga() {return liga;}

    public void setLiga(Ligas liga) {this.liga = liga;}
}
