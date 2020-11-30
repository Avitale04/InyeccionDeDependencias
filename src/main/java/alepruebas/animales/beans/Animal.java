package alepruebas.animales.beans;

import alepruebas.animales.interfaces.Especie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("Animal")
public class Animal {

    @Value("Rana")
    private String nombre;

    @Autowired
    private Especie especie;

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public Especie getEspecie() {return especie;}

    public void setEspecie(Especie especie) {this.especie = especie;}

}
