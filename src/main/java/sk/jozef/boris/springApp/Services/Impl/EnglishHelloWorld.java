package sk.jozef.boris.springApp.Services.Impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.jozef.boris.springApp.Services.HelloWordService;

/*@Service
@Profile("eng")*/
public class EnglishHelloWorld implements HelloWordService {

    @Override
    public void helloWorld() {
        System.out.println("Hello world");
    }
}
