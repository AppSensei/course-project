package com.infiniteskills.mvc.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infiniteskills.mvc.dao.AlbumDao;
import com.infiniteskills.mvc.model.Album;

@Repository
@Transactional(readOnly = true)
public class AlbumDaoImpl implements AlbumDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveAlbum(Album album) {

		Session session = sessionFactory.openSession();

		try {
			session.save(album);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		session.save(album);
	}

	@Override
	public List<Album> getAlbumsHql() {

		Session session = sessionFactory.openSession();
		String hql = null;
		List<Album> albumList = null;

		try {
			Query query = session
					.createQuery("select album.albumId, album.title, artist.name from Album album "
							+ "left join album.artist as artist ");

			query.setFirstResult(0);
			query.setMaxResults(10);
			albumList = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return albumList;

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

	// @Override
	// private boolean deleteById(Class<?> type, Serializable id) {
	//
	// Session session = sessionFactory.openSession();
	//
	// Object persistentInstance = session.load(type, id);
	// if (persistentInstance != null) {
	// session.delete(persistentInstance);
	// return true;
	// }
	// return false;
	// }

}
