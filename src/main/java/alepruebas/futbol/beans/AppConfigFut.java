package alepruebas.futbol.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigFut {

    @Bean
    public Equipos equipoApp(){
        return new Equipos();
    }

    @Bean
    public Ligas ligaApp(){return new Ligas();}

    @Bean
    public Paises paisApp(){
        return new Paises();
    }
}
