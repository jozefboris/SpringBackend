package sk.jozef.boris.springApp.config;

import bible.BibleVerses;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfigurator {
  //  @Bean
    public BibleVerses createBibleVerses(){
        return new BibleVerses();
    }

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
