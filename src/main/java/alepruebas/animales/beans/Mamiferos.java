package alepruebas.animales.beans;

import alepruebas.animales.interfaces.Especie;
import org.springframework.stereotype.Component;

@Component
public class Mamiferos implements Especie {

    @Override
    public String mostrar() {
        return "Mamifero";
    }
}
