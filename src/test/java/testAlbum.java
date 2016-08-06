import org.apache.jasper.tagplugins.jstl.core.When;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.infiniteskills.mvc.model.Album;

@RunWith(MockitoJUnitRunner.class)
public class testAlbum {
	
	@Mock
	Album student;

	
	@Test
	public void testSomething() {
		
		
		Mockito.when(student.toString());
		
		
		
	}
}
