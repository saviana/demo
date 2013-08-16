import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MovieRentalTest {
	MovieRental mr;
	
	@Before
	public void setUp() throws Exception {
		Customer cust = new Customer();
		Price newrelease = new NewReleasePrice();
		Movie mrmovie = new Movie("Thor", newrelease);
		mr = new MovieRental(mrmovie, 15, cust);
	}

	@Test
	public void test() {
		int cost = mr.calculate();
		assertEquals(3000,cost);
		assertEquals(17, mr.getpoints());
	}
	
	@Test
	public void testCustomer() {
		assertEquals("Peter", mr.getCustName());
		
	}
	
}
