package com.infiniteskills.mvc.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infiniteskills.mvc.dao.ArtistDao;
import com.infiniteskills.mvc.model.Album;
import com.infiniteskills.mvc.model.Artist;

@Repository
@Transactional(readOnly=true)
public class ArtistDaoImpl implements ArtistDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Artist> getArtistHql() {

		Session session = sessionFactory.openSession();
		String hql = null;
		List<Artist> artistList = null;
		
		
		try {
			
			Query query = session.createQuery("select art.artistId, art.name, album.title from Artist art "
					+ "inner join art.albums as album ");			
		
/*	    query.setFirstResult(0);
	    query.setMaxResults(10);*/
		artistList = query.list();	
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		

//		Criteria criteria = session.createCriteria(Album.class);
//		criteria.setMaxResults(4);
//		List<Album> albums = criteria.list();
		return artistList;

	}

}
