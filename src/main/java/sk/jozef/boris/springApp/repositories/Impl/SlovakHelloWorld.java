package sk.jozef.boris.springApp.repositories.Impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.jozef.boris.springApp.Services.HelloWordService;

@Service

public class SlovakHelloWorld implements HelloWordService {

    @Override
    public void helloWorld() {
        System.out.println("Ahoj svet");
    }
}
