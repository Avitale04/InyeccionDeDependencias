package alepruebas.holaMundo.spring;

import alepruebas.holaMundo.beans.AppConfigMundo;
import alepruebas.holaMundo.beans.Mundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMundo {

    public static void main(String[] args) {

        //lamado a traves del XML
        ApplicationContext appContexXML = new ClassPathXmlApplicationContext("beans.xml");
        Mundo mXML = (Mundo) appContexXML.getBean("mundo");
        System.out.println(mXML.getSaludo());
        System.out.println(mXML.getDespedida());

        System.out.println(" ");

        //lamado a traves del Annotations
        ApplicationContext appContexAnnotations = new AnnotationConfigApplicationContext(AppConfigMundo.class);
        Mundo mA = (Mundo) appContexAnnotations.getBean("holaMundo");
        System.out.println(mA.getSaludo());
        System.out.println(mA.getDespedida());

    }
}
