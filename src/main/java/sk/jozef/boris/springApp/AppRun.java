package sk.jozef.boris.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sk.jozef.boris.springApp.Services.HelloWordService;
import sk.jozef.boris.springApp.Services.MovieService;

@Component
public class AppRun {

    @Autowired
    MovieService movieService;

    HelloWordService helloWordService;

    @Autowired
    public AppRun(@Qualifier("slovakHelloWorld") HelloWordService helloWordService) {
        this.helloWordService = helloWordService;
    }

    public  void  run(){
        movieService.createAndAddMovie();
        helloWordService.helloWorld();
    }

}
