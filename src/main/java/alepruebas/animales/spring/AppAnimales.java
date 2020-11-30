package alepruebas.animales.spring;

import alepruebas.animales.beans.Animal;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnimales {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("beansAnimales.xml");

        Animal rana = (Animal) appContext.getBean("Animal");
        System.out.println("Hola soy una " + rana.getNombre() +" y soy un "+rana.getEspecie().mostrar());

        //cerrar el bean
        appContext.close();

    }
}
