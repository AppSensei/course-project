package com.infiniteskills.mvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Album")
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="AlbumId")
	private int albumId;

	@Column(name = "Title")
	private String title;

	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="artistId")
	private Artist artist;
	
	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

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
