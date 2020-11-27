package alepruebas.spring;

import alepruebas.beans.AppConfig;
import alepruebas.beans.Mundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //lamado a traves del XML
        ApplicationContext appContexXML = new ClassPathXmlApplicationContext("beans.xml");
        Mundo mXML = (Mundo) appContexXML.getBean("mundo");
        System.out.println(mXML.getSaludo());
        System.out.println(mXML.getDespedida());

        System.out.println(" ");

        //lamado a traves del Annotations
        ApplicationContext appContexAnnotations = new AnnotationConfigApplicationContext(AppConfig.class);
        Mundo mA = (Mundo) appContexAnnotations.getBean("holaMundo");
        System.out.println(mA.getSaludo());
        System.out.println(mA.getDespedida());

    }
}
