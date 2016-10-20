package com.infiniteskills.mvc.dto;

import java.util.List;

import com.infiniteskills.mvc.model.Album;

public class ArtistDTO {

	public Integer artistId;
	
	public String name;
	
	public Integer albumId;
	
	public String title;

	
	public Integer getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getArtistId() {
		return artistId;
	}

	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
