package com.infiniteskills.mvc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infiniteskills.mvc.dao.AlbumDao;
import com.infiniteskills.mvc.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {
	
	@Autowired
	AlbumDao albumDao;

	@Override
	public void saveAlbum() {

		albumDao.saveAlbum();
		
	}

}
