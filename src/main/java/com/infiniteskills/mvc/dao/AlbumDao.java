package com.infiniteskills.mvc.dao;

import java.io.Serializable;
import java.util.List;

import com.infiniteskills.mvc.model.Album;


public interface AlbumDao {
	
	// Insert New Album
	public void saveAlbum();
	
	public List<Album> getAlbums();
	
	public Album getSingleAlbumById();
	
	public void deleteById(int id);
	
}
