import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.*;

public class DriverTest{
	
	@SuppressWarnings("unchecked")

	@Mock
	Driver mockedDriver = Mockito.mock(Driver.class);

	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(mockedDriver);
	}

	@After
	public void tearDown() throws Exception{

	}


	@Test
	public void newLocationTest(){
		
	}

	@Test
	public void returnLocationTest(){

	}

	@Test
	public void returnStreetTest(){

	}

}