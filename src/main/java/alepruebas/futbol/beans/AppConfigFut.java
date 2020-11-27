package alepruebas.futbol.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigFut {

    @Bean
    public Equipos nombreEquipo(){
        return new Equipos();
    }

    @Bean
    public Ligas nombreLiga(){

        return new Ligas();
    }

    @Bean
    public Paises nombrePais(){

        return new Paises();
    }
}
