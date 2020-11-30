package alepruebas.animales.beans;

import alepruebas.animales.interfaces.Especie;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("anfi")
public class Anfibios implements Especie {

    @Override
    public String mostrar() {
        return "Anfibio";
    }
}
