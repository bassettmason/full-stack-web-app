package com.bassettmason.spring;

public class AlbumRepository {
    import org.springframework.data.repository.CrudRepository;

    public interface AlbumRepository extends CrudRepository<Album, Long> {
    }

}
