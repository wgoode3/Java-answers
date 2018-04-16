package com.hygogg.lookify.repository;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hygogg.lookify.models.Song;

public interface SongRepository extends CrudRepository<Song, Long>{
	
	public ArrayList<Song> findByArtistContaining(String artist);
	
	@Query(value="SELECT * FROM song ORDER BY rating desc LIMIT 10",nativeQuery=true)
	public ArrayList<Song> OrderByRatingDesc();
}