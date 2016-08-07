package com.infiniteskills.mvc.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infiniteskills.mvc.dao.AlbumDao;
import com.infiniteskills.mvc.model.Album;
import com.infiniteskills.mvc.model.Artist;

@Repository
@Transactional(readOnly = true)
public class AlbumDaoImpl implements AlbumDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveAlbum() {
		
		Session session = sessionFactory.openSession();
		
		Artist artist = new Artist();
		artist.setName("Rajendra Prasad");
		
		Album album = new Album();
		album.setTitle("Satyan Mash");
		album.setArtist(artist);
		
		session.save(album);
		
	}

}
