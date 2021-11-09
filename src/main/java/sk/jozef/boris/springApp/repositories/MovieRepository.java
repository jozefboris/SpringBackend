package sk.jozef.boris.springApp.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.jozef.boris.springApp.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
