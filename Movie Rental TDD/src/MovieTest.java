import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MovieTest {
	Movie movie;
	Price cprice;
	
	
	@Before
	public void setUp() throws Exception {
		cprice=new ChildrensPrice();
		movie = new Movie("Smurf", cprice);
	}

	@Test
	public void testName() {
		assertEquals("Smurf", movie.getName());
	}
	
	@Test
	public void testPrice() {
		assertEquals(240, movie.getPrice());
	}
	
	@Test
	public void testType() {
		assertEquals("CP", movie.getType());
	}
	
	

}
