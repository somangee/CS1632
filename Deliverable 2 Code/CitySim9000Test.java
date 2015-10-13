import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.*;

public class CitySim9000Test{
	
	@SuppressWarnings("unchecked")

	@Before
	public void setUp() throws Exception{

	}

	@After
	public void tearDown() throws Exception{

	}

	//All tests assume that the Scanner class provided by java is functional and therefore does not need to be mocked.
	/*Scanner scan = new Scanner(s.trim());
    	if(!scan.hasNextInt(radix)) return false;
    	scan.nextInt(radix);
    	return !scan.hasNext();*/

	//Tests to see if isInteger(String s, int radix) returns true if s is an integer, in this case 1.
	@Test
	public void isIntegerTest(){
		
		assertNull();
	}

	//Tests to see if isInteger(String s, int radix) returns false if s is not an integer, in this case blah.
	@Test
	public void isIntegerTest(){
		
		assertNull();
	}

	//Tests to see if isInteger(String s, int radix) returns false if s is not an integer, in this case NULL.
	@Test
	public void isIntegerTest(){
		
		assertNull();
	}

	//Tests to see if isInteger(String s, int radix) returns true if s is max integer.
	@Test
	public void isIntegerTest(){
		
		assertNull();
	}
}