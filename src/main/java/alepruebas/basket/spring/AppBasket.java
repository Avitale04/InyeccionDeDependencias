package alepruebas.basket.spring;

import alepruebas.basket.beans.AppConfigBasket;
import alepruebas.basket.beans.Jugador;
import alepruebas.basket.interfaces.IEquipo;
import alepruebas.futbol.beans.AppConfigFut;
import alepruebas.futbol.beans.Equipos;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBasket {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("beansBasket.xml");
        Jugador jug = (Jugador) appContext.getBean("LeBron");
        System.out.println(jug.getNombre()+" "+jug.getNumero() +" "+ jug.getEquipo().mostrar());

        System.out.println(" ");

        //mostrar por interface
        IEquipo equipo = (IEquipo) appContext.getBean("Miami");
        //IEquipo equipo = (IEquipo) appContext.getBean("Lakers");
        System.out.println(equipo.mostrar());

        System.out.println(" ");

        //inyeccion por Anotaciones
        ApplicationContext appContexAnnotations = new AnnotationConfigApplicationContext(AppConfigBasket.class);
        Jugador lb = (Jugador) appContexAnnotations.getBean("jugadorApp");
        System.out.println(lb.getNombre()+" "+lb.getNumero()+" "+lb.getEquipo().mostrar());

        //cerrar el bean
        appContext.close();

    }
}
