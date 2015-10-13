import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.*;

public class DriverTest{
	
	@SuppressWarnings("unchecked")

	@Mock
	Driver d = Mockito.mock(Driver.class);

	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(d);
	}

	@After
	public void tearDown() throws Exception{

	}


	//Tests whether newLocation() returns 4 when the random number generator expects it to return 4.
	@Test
	public void testNewLocation4(){
		d = Mockito.mock(Driver.class);
	}


	//Tests whether newLocation() returns "Chirp St" when the random number generator expects it to return "Chirp St".
	@Test
	public void testStreetDrivenChirp(){
		d = Mockito.mock(Driver.class);
	}


	//Tests whether firstLocation() returns a number between 0-4.
	@Test
	public void testFirstLocation(){
		d = Mockito.mock(Driver.class);
		boolean numBet04 = false;
		int val = 0;
		d.firstLocation();
		for(int x = 0; x<5; x++){
			if(d.returnLocation() == x){
				numBet04 = true;
				val = x;
				break;
			}
		}
		if(numBet04 == true){
			assertEquals(d.returnLocation(), val);
		}
		else{
			fail();
		}
	}


	//Tests whether returnLocation() returns 0 when location is first initialized.
	@Test
	public void testReturnLocationNull(){
		d = Mockito.mock(Driver.class);
		assertEquals(d.returnLocation(), 0);
	}
	//Tests whether returnLocation() returns the correct value of 1 when location is 1.
	@Test
	public void testReturnLocationOne(){
		d = Mockito.mock(Driver.class);
		d.location = 1;
		assertEquals(d.returnLocation(), 1);
	}
	//Tests whether returnLocation() returns 4 when location is 4.
	@Test
	public void testReturnLocation4(){
		d = Mockito.mock(Driver.class);
		d.location = 4;
		assertEquals(d.returnLocation(), 4);
	}


	//Tests whether returnStreet() returns "" when street is initialized.
	@Test
	public void testReturnStreetNull(){
		d = Mockito.mock(Driver.class);
		assertEquals(d.returnStreet(), "");
	}
	//Tests whether returnStreet() returns the correct value of "Chirp St" when street is "Chirp St".
	@Test
	public void testReturnStreetChirp(){
		d = Mockito.mock(Driver.class);
		d.street = "Chirp St";
		assertEquals(d.returnStreet(), "Chirp St");
	}
	//Tests whether returnStreet() returns "Meow St" when street is "Meow St".
	@Test
	public void testReturnStreetMeow(){
		d = Mockito.mock(Driver.class);
		d.street = "Meow St";
		assertEquals(d.returnStreet(), "Meow St");
	}
}