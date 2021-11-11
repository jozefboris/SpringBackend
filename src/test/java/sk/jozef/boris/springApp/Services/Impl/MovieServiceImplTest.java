package sk.jozef.boris.springApp.Services.Impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sk.jozef.boris.springApp.Services.MovieService;
import sk.jozef.boris.springApp.mappers.MovieMapper;
import sk.jozef.boris.springApp.model.Movie;
import sk.jozef.boris.springApp.model.MovieDto;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class MovieServiceImplTest {
    @Autowired
    MovieService movieService;

    @Test
    @Transactional
    public void movieToServiceToDoIsai(){
        Movie movie = new Movie();
        movie.setName("Fireproof");
        movie.setId(1L);
       /* Set<String> set = new HashSet<>();
        set.add("Alex Derik");*/

        MovieDto movieDto = movieService.getMovieById(1L);

        assertEquals(movie.getId(), movieDto.getId());
        assertEquals(movie.getName(), movieDto.getName());

    }

    @Test
    @Transactional
    public void AllMovies(){
        Movie movie = new Movie();
        movie.setName("Fireproof");
        movie.setId(1L);

        Movie movie2 = new Movie();
        movie2.setName("Fireproof");
        movie2.setId(2L);

        Set<Movie> set = new HashSet<>();
        set.add(movie);
        set.add(movie2);

        List<MovieDto> movieDtos = movieService.getAllMovies();
        assertEquals(movie.getId(), movieDtos.get(0).getId());
    }

    @Test
    @Transactional
    public void movieFromDbFireProof(){
        List<MovieDto> movieDto = movieService.findMoveByName("Fireproof");
        assertEquals("Fireproof", movieDto.get(0).getName());
    }
}