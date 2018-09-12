package webapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmptyTest {
	private static Empty empty;
	
	@BeforeClass
	public static void initEmpty(){
		empty = new Empty();
	}
	
	@Before
	public void beforeEachTest(){
		System.out.println("This is executed before each Test");
	}
	
	@After
	public void afterEachTest(){
		System.out.println("This is executed after each Test");
	}
	
	@Test
	public void testMul() {
		try {
			int result = empty.multiply(3, 4);
			
			assertEquals(12, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
