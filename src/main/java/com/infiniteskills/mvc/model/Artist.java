package com.infiniteskills.mvc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "Artist")
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ArtistId")
	private Integer artistId;

	@Column(name = "Name")
	private String name;

	@OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
	@Fetch(FetchMode.JOIN)
	private List<Album> albums;

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

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Artist [artistId=");
		builder.append(artistId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", albums=");
		builder.append(albums);
		builder.append("]");
		return builder.toString();
	}

}
