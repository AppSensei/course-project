package com.infiniteskills.mvc.service;

import java.util.List;

import com.infiniteskills.mvc.model.Album;

public interface AlbumService {

	public void saveAlbum();

	public List<Album> getAlbums();

	public Album getSingleAlbumById();

	public void deleteById(int id);

}
