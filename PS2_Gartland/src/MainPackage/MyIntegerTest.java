package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {

	private static MyInteger myIntEven;
	private static MyInteger myIntOdd;

	@Test
	public void testIsEven() throws Exception {
		myIntEven = new MyInteger(2);
		myIntOdd = new MyInteger(3);

		assertTrue(myIntEven.IsEven() == true);
		assertFalse(myIntOdd.IsEven() == true);
	}

}
