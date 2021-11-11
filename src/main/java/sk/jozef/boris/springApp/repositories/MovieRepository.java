package sk.jozef.boris.springApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sk.jozef.boris.springApp.model.Movie;
import sk.jozef.boris.springApp.model.MovieDto;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByName(String name);
}
