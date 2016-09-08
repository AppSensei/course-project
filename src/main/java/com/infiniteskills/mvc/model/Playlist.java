package com.infiniteskills.mvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PlaylistTrack", joinColumns=@JoinColumn(name="PlaylistId"),
	inverseJoinColumns=@JoinColumn(name="TrackId"))
	private List<Track> tracks = new ArrayList<Track>();
	
	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

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
