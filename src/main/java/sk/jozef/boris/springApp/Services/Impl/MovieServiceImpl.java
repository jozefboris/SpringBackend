package sk.jozef.boris.springApp.Services.Impl;

import org.springframework.stereotype.Service;
import sk.jozef.boris.springApp.Services.MovieService;
import sk.jozef.boris.springApp.model.Movie;
import sk.jozef.boris.springApp.repositories.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie createAndAddMovie() {
        Movie movie = new Movie();
        movie.setName("fdff");

        return movieRepository.save(movie);
    }
}
