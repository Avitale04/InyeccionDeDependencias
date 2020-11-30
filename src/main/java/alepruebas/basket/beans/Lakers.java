package alepruebas.basket.beans;

import alepruebas.basket.interfaces.IEquipo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Lakers implements IEquipo {

    @Override
    public String mostrar() {
        return "Los Angeles Lakers";
    }
}
