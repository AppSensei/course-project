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
@Table(name="Track")
public class Track {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TrackId")
	private Integer trackId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Composer")
	private String composer;
	
	@Column(name="Milliseconds")
	private Integer milliseconds;
	
	@Column(name="Bytes")
	private Integer bytes;
	
	@Column(name="UnitPrice")
	private Integer unitPrice;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="AlbumId")
	private Album album;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="GenreId")
	private Genre genre;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="MediaTypeId")
	private MediaType mediaType;

	public Integer getTrackId() {
		return trackId;
	}

	public void setTrackId(Integer trackId) {
		this.trackId = trackId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public Integer getMilliseconds() {
		return milliseconds;
	}

	public void setMilliseconds(Integer milliseconds) {
		this.milliseconds = milliseconds;
	}

	public Integer getBytes() {
		return bytes;
	}

	public void setBytes(Integer bytes) {
		this.bytes = bytes;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public MediaType getMediaType() {
		return mediaType;
	}

	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}
	
	

}
