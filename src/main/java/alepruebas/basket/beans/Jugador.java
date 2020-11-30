package alepruebas.basket.beans;

import alepruebas.basket.interfaces.IEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Jugador {

    private int numero;
    private String nombre;

    @Qualifier("miamiQualifier") //se indica de que bean va a sacar la informacion // no funciona
    @Autowired
    private IEquipo equipo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public IEquipo getEquipo() {
        return equipo;
    }

//    @Required
    public void setEquipo(IEquipo equipo) {
        this.equipo = equipo;
    }
}
