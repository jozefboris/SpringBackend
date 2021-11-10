package sk.jozef.boris.springApp.Services.Impl;

import org.springframework.stereotype.Service;
import sk.jozef.boris.springApp.Services.HelloWordService;

//@Service
public class PrimaryHelloWorld implements HelloWordService {
    @Override
    public void helloWorld() {
        System.out.println("Primary hello world");
    }
}
