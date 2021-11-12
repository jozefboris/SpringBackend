package sk.jozef.boris.springApp.restApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.jozef.boris.springApp.Services.MovieService;
import sk.jozef.boris.springApp.model.Movie;
import sk.jozef.boris.springApp.repositories.MovieRepository;

import java.util.List;

@RestController
@RequestMapping("/apip")
public class MovieRestController2 {
    MovieRepository movieRepository;

    public MovieRestController2(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies")
    List<Movie> all(){
        return  movieRepository.findAll();
    }
}
