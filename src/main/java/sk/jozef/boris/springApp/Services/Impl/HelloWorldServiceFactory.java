package sk.jozef.boris.springApp.Services.Impl;

import sk.jozef.boris.springApp.Services.HelloWordService;

public class HelloWorldServiceFactory {
    public HelloWordService createHelloWorldService(String language){
        switch (language){
            case "enj":
                return new EnglishHelloWorld();
            case "sk":
                return new SlovakHelloWorld();
            default:
                return new PrimaryHelloWorld();

        }
    }
}
