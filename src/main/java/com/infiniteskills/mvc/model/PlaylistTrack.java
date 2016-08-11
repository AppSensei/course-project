package com.infiniteskills.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PlaylistTrack")
public class PlaylistTrack {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PlaylistId")
	private Integer playlistId;

	@Column(name="TrackId")
	private Integer trackId;

	public Integer getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(Integer playlistId) {
		this.playlistId = playlistId;
	}

	public Integer getTrackId() {
		return trackId;
	}

	public void setTrackId(Integer trackId) {
		this.trackId = trackId;
	}
	
	

}
