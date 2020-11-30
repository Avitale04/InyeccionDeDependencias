package alepruebas.basket.beans;

import alepruebas.basket.interfaces.IEquipo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigBasket {

    @Bean
    public Jugador jugadorApp(){return new Jugador();}

    @Bean
    public IEquipo lakersApp(){return new Lakers();}

    @Bean
    public IEquipo miamiApp(){return new MiamiHeat();}


}
