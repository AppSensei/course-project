package com.infiniteskills.mvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mvc.dao.ArtistDao;
import com.infiniteskills.mvc.model.Artist;
import com.infiniteskills.mvc.service.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {
	
	@Autowired
	ArtistDao artistDao;
	
	@Override
	public List<Artist> getArtistHql() {
		List<Artist> artists = artistDao.getArtistHql();
		return artists;
	}

	@Override
	public void saveArtistnAlbums(Artist artist) {
		 
		artistDao.saveArtistnAlbums(artist);
	}

	
}
