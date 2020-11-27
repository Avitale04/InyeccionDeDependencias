package alepruebas.futbol.beans;

import org.springframework.beans.factory.annotation.Value;

public class Ligas {

    @Value("Premier Ligue")
    private String NombreLiga;
    private Paises pais;

    public String getNombreLiga() {
        return NombreLiga;
    }

    public void setNombreLiga(String nombreLiga) {
        this.NombreLiga = nombreLiga;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }
}
