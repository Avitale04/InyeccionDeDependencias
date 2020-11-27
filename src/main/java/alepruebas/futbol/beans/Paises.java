package alepruebas.futbol.beans;

import org.springframework.beans.factory.annotation.Value;

public class Paises {

    @Value("Inglaterra")
    private String NombrePais;

    public void setNombrePais(String nombrePais) {
        this.NombrePais = nombrePais;
    }

    public String getNombrePais() {
        return NombrePais;
    }
}
