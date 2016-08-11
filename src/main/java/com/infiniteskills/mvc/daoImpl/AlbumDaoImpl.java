package com.infiniteskills.mvc.daoImpl;

import java.util.List;

import javax.management.Query;

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

		Session session = sessionFactory.getCurrentSession();

		Artist artist = new Artist();
		artist.setName("Midhun Mathew");

		Album album = new Album();
		album.setTitle("Mohammed Nisar");
		album.setArtist(artist);

		session.save(album);

	}

	@Override
	public List<Album> getAlbums() {

		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Album.class);
		criteria.setMaxResults(4);
		List<Album> albums = criteria.list();
		return albums;

	}

	@Override
	public Album getSingleAlbumById() {

		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Album.class);
		criteria.setMaxResults(1);
		Album album = (Album) criteria.uniqueResult();
		return album;
	}

	@Override
	public void deleteById(int id) {
		
		Session session = sessionFactory.openSession();
		
		session.getTransaction().begin();
		Album album = (Album) session.get(Album.class, id);
		session.delete(album);
	
		session.getTransaction().commit();
				
	}
	
	
//	@Override
//	private boolean deleteById(Class<?> type, Serializable id) {
//		
//		Session session = sessionFactory.openSession();
//
//	    Object persistentInstance = session.load(type, id);
//	    if (persistentInstance != null) {
//	        session.delete(persistentInstance);
//	        return true;
//	    }
//	    return false;
//	}
	
	

}
