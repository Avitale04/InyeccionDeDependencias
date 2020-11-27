package alepruebas.persona.spring;

import alepruebas.holaMundo.beans.Mundo;
import alepruebas.persona.beans.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPersona{

    public static void main(String[] args) {

        ApplicationContext identificacion = new ClassPathXmlApplicationContext("beans.xml");
        Persona persona1 = (Persona) identificacion.getBean("persona");
        System.out.println("dni: "+persona1.getId()+", Nombre: "+persona1.getNombre()+", Apellido: "+persona1.getApellido()+", oficio: "+persona1.getOficio());
    }
}


