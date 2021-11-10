package sk.jozef.boris.springApp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import sk.jozef.boris.springApp.Services.PrintService;

@Configuration
//@PropertySource("classpath:jozko.properties")
@PropertySources({@PropertySource("classpath:jozko.properties")})
public class JozkoConfig {

    @Value("${jozko.meno}")
    String meno;

    @Value("${jozko.priezvisko}")
    String priezvisko;

    @Bean
    public PrintService printService(){
        PrintService printService = new PrintService();
        printService.setData(meno + " " + priezvisko);
        return printService;
    }
}



