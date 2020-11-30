package alepruebas.futbol.spring;

import alepruebas.futbol.beans.AppConfigFut;
import alepruebas.futbol.beans.Equipos;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFutbol {

    public static void main(String[] args) {

//        //inyeccion por XML
//        ApplicationContext institucion = new ClassPathXmlApplicationContext("beans.xml");
//        Equipos rm = (Equipos) institucion.getBean("equipo");
//        System.out.println("El "+rm.getEquipo() + " juega en la liga " + rm.getLiga().getNombreLiga() + " de " + rm.getLiga().getPais().getNombrePais());
//
//        System.out.println("");

        //inyeccion por Anotaciones
        ApplicationContext appContexAnnotations = new AnnotationConfigApplicationContext(AppConfigFut.class);
        Equipos mu = (Equipos) appContexAnnotations.getBean("equipoApp");
        System.out.println(mu.getEquipo() + " " + mu.getLiga().getNombreLiga() +" "+ mu.getLiga().getPais().getNombrePais());


    }
}

