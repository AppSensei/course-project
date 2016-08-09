package com.infiniteskills.mvc.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
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
		
//		Artist artist = new Artist();
//		artist.setName("Rony John");
//		
//		Album album = new Album();
//		album.setTitle("Subin James");
//		album.setArtist(artist);
		
		
		Criteria criteria = session.createCriteria(Album.class);
		List<Album> album = criteria.list();
		System.out.println(album.toString());
				
	}

}
