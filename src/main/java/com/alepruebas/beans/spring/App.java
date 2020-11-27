package com.alepruebas.beans.spring;

import com.alepruebas.beans.Mundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //Mundo m = new Mundo();

        ApplicationContext appContex = new ClassPathXmlApplicationContext("beans.xml");

        Mundo m = (Mundo) appContex.getBean("mundo");
        System.out.println(m.getSaludo());
    }
}
