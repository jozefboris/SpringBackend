package sk.jozef.boris.springApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import sk.jozef.boris.springApp.Services.HelloWordService;
import sk.jozef.boris.springApp.Services.Impl.HelloWorldServiceFactory;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorldServiceFactory createFatory(){
        return new HelloWorldServiceFactory();
    }

    @Bean
    @Profile("sk")
    public HelloWordService slovakHelloWorld(HelloWorldServiceFactory factory){
         return factory.createHelloWorldService("sk");
    }

    @Bean
    @Profile("eng")
    public HelloWordService englishHelloWorld(HelloWorldServiceFactory factory){
        return factory.createHelloWorldService("eng");
    }

    @Bean
    @Profile("default")
    public HelloWordService primaryHelloWorld(HelloWorldServiceFactory factory){
        return factory.createHelloWorldService("default");
    }
}
