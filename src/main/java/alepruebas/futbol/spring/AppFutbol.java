package alepruebas.futbol.spring;

import alepruebas.futbol.beans.AppConfigFut;
import alepruebas.futbol.beans.Equipos;
import alepruebas.futbol.beans.Ligas;
import alepruebas.futbol.beans.Paises;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFutbol {

    public static void main(String[] args) {

        //inyeccion por XML
        ApplicationContext institucion = new ClassPathXmlApplicationContext("beans.xml");
        Equipos rm = (Equipos) institucion.getBean("equipo");
        System.out.println("El "+rm.getEquipo() + " juega en la liga " + rm.getLiga().getNombreLiga() + " en " + rm.getLiga().getPais().getNombrePais());

        //inyeccion por Anotaciones
        //revisar como usar un solo getBean
        ApplicationContext appContexAnnotations = new AnnotationConfigApplicationContext(AppConfigFut.class);
        Equipos mu = (Equipos) appContexAnnotations.getBean("nombreEquipo");
        Ligas mul = (Ligas) appContexAnnotations.getBean("nombreLiga");
        Paises mup = (Paises) appContexAnnotations.getBean("nombrePais");
        System.out.println(mu.getEquipo() +" "+ mul.getNombreLiga() +" "+ mup.getNombrePais());


    }
}
