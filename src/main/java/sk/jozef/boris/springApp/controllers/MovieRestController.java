package sk.jozef.boris.springApp.controllers;


import org.springframework.web.bind.annotation.*;
import sk.jozef.boris.springApp.Services.MovieService;
import sk.jozef.boris.springApp.model.MovieDto;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieRestController {

    MovieService movieService;

    public MovieRestController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    List<MovieDto> getMovies(@RequestParam(required = false) String name){
        if (name != null && !name.isEmpty()) {
            return movieService.findMoveByName(name);
        }
        return movieService.getAllMovies();

    }

    @GetMapping("/movies/{id}")
    MovieDto getMovieId(@PathVariable("id") long id){
        return movieService.getMovieById(id);


    }

    @PostMapping("/movies" )
    MovieDto addMovie(@RequestBody MovieDto movieDto){
        return movieService.addMovie(movieDto);
    }


    @DeleteMapping("/movies/{id}")
    void deleteMovie(@PathVariable long id){
        movieService.deleteMovie(id);
    }

    @PutMapping("/movies/{id}")
    MovieDto updateMovie(@RequestBody MovieDto movieDto, @PathVariable("id") long id){
        return movieService.updateMovie(movieDto, id);
    }


}
