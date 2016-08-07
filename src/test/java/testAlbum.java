import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.infiniteskills.mvc.model.Album;
import com.infiniteskills.mvc.model.Artist;

@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath*: dispatcher-servlet.xml"})
@TransactionConfiguration(defaultRollback=true)
public class testAlbum {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Test
	public void testAlbumArtistSave() {
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		
		Artist artist = new Artist();
		artist.setName("Midhun Mathew");
		
		Album album = new Album();
		album.setTitle("Black Mallie In The House");
		album.setArtist(artist);
		
		session.save(album);
		session.beginTransaction().commit();
		
		
	}
}
