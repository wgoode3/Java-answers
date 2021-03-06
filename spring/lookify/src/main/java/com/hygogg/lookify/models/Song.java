package com.hygogg.lookify.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


@Entity
public class Song {
	
	@Id
    @GeneratedValue
    private Long id;

	@Size(min = 5)
	private String title;
	
	@Size(min = 5)
	private String artist;
	
	@Size(min = 15)
	private String url;

	@Min(1)
	@Max(5)
	private Integer rating;
	
	public Song() {
	}
	
	public Song(String title, String artist, Integer rating, String url) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

}