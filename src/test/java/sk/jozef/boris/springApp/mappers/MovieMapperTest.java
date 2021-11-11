package sk.jozef.boris.springApp.mappers;

import org.junit.jupiter.api.Test;
import sk.jozef.boris.springApp.model.Movie;
import sk.jozef.boris.springApp.model.MovieDto;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


public class MovieMapperTest {
    @Test
    public void movieToMovieDtoIsSame(){
        Movie movie = new Movie();
        movie.setName("Fireproof");
        movie.setId(1l);
        Set<String> set = new HashSet<>();
        set.add("Alex Derik");

        MovieDto movieDto = MovieMapper.INSTANCE.movieToMovieDto(movie);

        assertEquals(movie.getId(), movieDto.getId());
        assertEquals(movie.getName(), movieDto.getName());
    }
}