package com.hygogg.lookify.serviices;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hygogg.lookify.models.Song;
import com.hygogg.lookify.repository.SongRepository;

@Transactional
@Service
public class SongService {
	private SongRepository songRepo;
	
	public SongService(SongRepository songRepo) {
		this.songRepo = songRepo;
	}
	
	public void addSong(Song song) {
		songRepo.save(song);
	}
	
	public ArrayList<Song> all(){
		return (ArrayList<Song>) songRepo.findAll();
	}
	
	public ArrayList<Song> top10(){
		return (ArrayList<Song>) songRepo.OrderByRatingDesc();
	}
	
	public ArrayList<Song> searchByArtist(String artist){
		return (ArrayList<Song>) songRepo.findByArtistContaining(artist);
	}

	public Song getById(long id) {
		return songRepo.findOne(id);
	}

	public void updateSong(Song song) {
		songRepo.save(song);
	}

	
	public void deleteSong(Long id) {
		songRepo.deleteSongById(id);
	}

}