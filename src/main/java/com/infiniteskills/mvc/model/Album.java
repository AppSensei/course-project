package com.infiniteskills.mvc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Album")
public class Album {	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "AlbumId", unique = true, nullable = false)
	private Integer albumId;

	@Column(name = "Title")
	private String title;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ArtistId")
	private Artist artist;
	
	@OneToMany(mappedBy="trackId",cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Track> track;

	public List<Track> getTrack() {
		return track;
	}

	public void setTrack(List<Track> track) {
		this.track = track;
	}

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
