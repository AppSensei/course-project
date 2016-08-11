package com.infiniteskills.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Playlist")
public class Playlist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PlaylistId")
	private Integer PlaylistId;
	
	@Column(name="Name")
	private String Name;
	
	public Integer getPlaylistId() {
		return PlaylistId;
	}

	public void setPlaylistId(Integer playlistId) {
		PlaylistId = playlistId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	

}
