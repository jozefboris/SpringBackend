package sk.jozef.boris.springApp.Services;

import org.springframework.web.bind.annotation.RequestBody;
import sk.jozef.boris.springApp.model.Movie;
import sk.jozef.boris.springApp.model.MovieDto;

import java.util.List;

public interface  MovieService {
    Movie createAndAddMovie();
    MovieDto getMovieById(Long id);
    List<MovieDto> getAllMovies();
    List<MovieDto> findMoveByName(String name);
    MovieDto addMovie( MovieDto movieDto);
    void deleteMovie(Long id);
    MovieDto updateMovie(MovieDto movieDto, Long id);
}
