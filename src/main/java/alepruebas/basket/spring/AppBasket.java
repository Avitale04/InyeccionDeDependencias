package alepruebas.basket.spring;

import alepruebas.basket.beans.Jugador;
import alepruebas.basket.interfaces.IEquipo;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBasket {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("beansBasket.xml");
        Jugador jug = (Jugador) appContext.getBean("LeBron");
        System.out.println(jug.getNombre()+" "+jug.getNumero() +" "+ jug.getEquipo().mostrar());

        //mostrar por interface
        IEquipo equipo = (IEquipo) appContext.getBean("Miami");
        //IEquipo equipo = (IEquipo) appContext.getBean("Lakers");
        System.out.println(equipo.mostrar());

        //cerrar el bean
        appContext.close();

    }
}
