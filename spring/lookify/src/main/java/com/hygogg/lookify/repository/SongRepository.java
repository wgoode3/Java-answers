package com.hygogg.lookify.repository;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import com.hygogg.lookify.models.Song;

public interface SongRepository extends CrudRepository<Song, Long>{
	
	public ArrayList<Song> findByArtistContaining(String artist);
	
	@Query(value="SELECT * FROM song ORDER BY rating DESC LIMIT 10",nativeQuery=true)
	public ArrayList<Song> OrderByRatingDesc();

	@Query(value="SELECT * FROM song WHERE id = ?1", nativeQuery=true)
	public Song findOne(long id);

	@Modifying
	@Query(value="DELETE FROM song WHERE id = ?1", nativeQuery=true)
	public void deleteSongById(Long id);

}