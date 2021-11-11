package sk.jozef.boris.springApp.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sk.jozef.boris.springApp.model.Movie;
import sk.jozef.boris.springApp.model.MovieDto;

@Mapper
public interface MovieMapper {
    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);
    @Mapping(target = "directorsOfTheMovie", source = "directors")
    MovieDto movieToMovieDto(Movie movie);
}
