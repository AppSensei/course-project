package com.infiniteskills.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Artist")
public class Artist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ArtistId")
	private Integer artistId;
	
	@Column(name="Name")
	private String name;
	
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
