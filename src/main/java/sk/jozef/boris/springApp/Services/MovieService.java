package sk.jozef.boris.springApp.Services;

import sk.jozef.boris.springApp.model.Movie;
import sk.jozef.boris.springApp.model.MovieDto;

import java.util.List;

public interface  MovieService {
    Movie createAndAddMovie();
    MovieDto getMovieById(Long id);
    List<MovieDto> getAllMovies();
    List<MovieDto> findMoveByName(String name);
}
