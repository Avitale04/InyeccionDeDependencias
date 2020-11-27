package alepruebas.holaMundo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigMundo {

    @Bean
    public Mundo holaMundo(){
        return new Mundo();
    }
}
