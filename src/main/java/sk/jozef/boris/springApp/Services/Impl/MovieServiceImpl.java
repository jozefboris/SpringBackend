package sk.jozef.boris.springApp.Services.Impl;

import org.springframework.stereotype.Service;
import sk.jozef.boris.springApp.Services.MovieService;
import sk.jozef.boris.springApp.mappers.MovieMapper;
import sk.jozef.boris.springApp.model.Movie;
import sk.jozef.boris.springApp.model.MovieDto;
import sk.jozef.boris.springApp.repositories.MovieRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;
    MovieMapper movieMapper;

    public MovieServiceImpl(MovieRepository movieRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    @Override
    public Movie createAndAddMovie() {
        Movie movie = new Movie();
        movie.setName("Fireproof");

        return movieRepository.save(movie);
    }

    @Override
    public MovieDto getMovieById(Long id) {
        return movieMapper.movieToMovieDto(movieRepository.findById(id).orElse(null));
    }

    @Override
    public List<MovieDto> getAllMovies() {
        return movieRepository.findAll().stream().map(movieMapper::movieToMovieDto).collect(Collectors.toList());
    }

    @Override
    public List<MovieDto> findMoveByName(String name) {
        return movieRepository.findByName(name).stream().map(movieMapper::movieToMovieDto).collect(Collectors.toList());
    }

    @Override
    public MovieDto addMovie(MovieDto movieDto) {
        return movieMapper.movieToMovieDto(movieRepository.save(movieMapper.moveDtoToMovie(movieDto)));
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public MovieDto updateMovie(MovieDto movieDto, Long id) {
        return movieMapper.movieToMovieDto( movieRepository.findById(id).map(movie -> {
            movie.setName(movieDto.getName());
            movie.setDirectors(movieDto.getDirectorsOfTheMovie());
            return movieRepository.save(movie);
        }).orElseGet(() ->{
            return movieRepository.save(movieMapper.moveDtoToMovie(movieDto));
        }));

    }
}
