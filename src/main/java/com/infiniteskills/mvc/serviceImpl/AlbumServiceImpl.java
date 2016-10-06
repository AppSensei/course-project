package com.infiniteskills.mvc.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mvc.dao.AlbumDao;
import com.infiniteskills.mvc.model.Album;
import com.infiniteskills.mvc.model.Artist;
import com.infiniteskills.mvc.model.Track;
import com.infiniteskills.mvc.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	AlbumDao albumDao;

	@Override
	public void saveAlbum() {
		
		Album album = new Album();
		
		// Won't insert inside Album Table
		// without giving artistId.
		Artist artist = new Artist();
		artist.setArtistId(82);
		
		album.setTitle("Hibernate & Spring MVC Album Dao Test");
		album.setArtist(artist);

		albumDao.saveAlbum(album);
	}
	
	public List<Album> getAlbumsHql() {
				
		List<Album> albums = albumDao.getAlbumsHql();
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
