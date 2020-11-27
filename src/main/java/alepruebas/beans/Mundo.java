package alepruebas.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {

    @Value("Hola mundo con Anotaciones") //Valor por defecto en annotation
    private String saludo;

    public String getSaludo() {
        return saludo;
    }
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    @Value("Chao mundo con Anotaciones")
    private String despedida;

    public String getDespedida() {return despedida;}
    public void setDespedida(String despedida) {this.despedida = despedida;}




}
