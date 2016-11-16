package com.infiniteskills.mvc.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infiniteskills.mvc.dao.ArtistDao;
import com.infiniteskills.mvc.dto.ArtistDTO;
import com.infiniteskills.mvc.model.Album;
import com.infiniteskills.mvc.model.Artist;

@Repository
@Transactional()
public class ArtistDaoImpl implements ArtistDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Artist> getArtistHql() {

		Session session = sessionFactory.openSession();
		String hql = null;
		List<Artist> artistList = new ArrayList<Artist>();

		try {

			Query query = (Query) session.createQuery(
					"select artist.artistId as artistId, artist.name as name, "
							+ "album.title as title, album.albumId as albumId "
							+ "from Artist artist "
							+ "left join artist.albums as album ")
					.setResultTransformer(
							Transformers.aliasToBean(ArtistDTO.class));

			query.setFirstResult(0);
			query.setMaxResults(5);

			artistList = query.list();

		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return artistList;

	}

	@Override
	public void saveArtistnAlbums(Artist artist) {

		Session session = sessionFactory.openSession();

		try {

			Album albumOne = new Album();
			albumOne.setArtist(artist);
			albumOne.setTitle(artist.getAlbums().get(0).getTitle());
			
			
			Album albumTwo = new Album();
			albumTwo.setArtist(artist);
			albumTwo.setTitle(artist.getAlbums().get(1).getTitle());
			
			Album albumThree = new Album();
			albumThree.setArtist(artist);
			albumThree.setTitle(artist.getAlbums().get(2).getTitle());


			List<Album> albums = new ArrayList<Album>();
			albums.add(albumOne);
			albums.add(albumTwo);
			albums.add(albumThree);

			artist.setAlbums(albums);
			session.save(artist);

		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}
}
