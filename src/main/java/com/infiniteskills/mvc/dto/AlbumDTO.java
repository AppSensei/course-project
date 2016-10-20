package com.infiniteskills.mvc.dto;

import javax.persistence.Column;

public class AlbumDTO {
	
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
	
	

}
