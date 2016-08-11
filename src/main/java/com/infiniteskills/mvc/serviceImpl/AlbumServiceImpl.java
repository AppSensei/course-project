package com.infiniteskills.mvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mvc.dao.AlbumDao;
import com.infiniteskills.mvc.model.Album;
import com.infiniteskills.mvc.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	AlbumDao albumDao;

	@Override
	public void saveAlbum() {

		albumDao.saveAlbum();
	}
	
	public List<Album> getAlbums() {
		
		List<Album> albums = albumDao.getAlbums();
		return albums;
	}

	@Override
	public Album getSingleAlbumById() {

		Album album = albumDao.getSingleAlbumById();
		return album;
	}

	@Override
	public void deleteById(int id) {

		albumDao.deleteById (id);
	}

}
