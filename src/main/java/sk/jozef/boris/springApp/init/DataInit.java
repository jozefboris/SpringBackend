package sk.jozef.boris.springApp.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sk.jozef.boris.springApp.Services.MovieService;

@Component
public class DataInit implements ApplicationListener<ContextRefreshedEvent> {

    MovieService movieService;

    @Autowired
    public DataInit(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        movieService.createAndAddMovie();
        movieService.createAndAddMovie();

    }
}
