package sk.jozef.boris.springApp.config;

import bible.BibleVerses;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class BeanConfigurator {
  //  @Bean
    public BibleVerses createBibleVerses(){
        return new BibleVerses();
    }
}
