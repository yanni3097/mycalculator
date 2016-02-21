import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester extends MyCalculator {

	@Test
	public void testNfactorial() {
		MyCalculator c = new MyCalculator();
		
		float actual = c.nfactorial(-5);
		assertEquals("-5! = 1 (ERROR)",1,actual,0.0);
		
		actual = c.nfactorial(0);
		assertEquals("0! = 1",1,actual,0.0);
		
		actual = c.nfactorial(1);
		assertEquals("1! = 1",1,actual,0.0);
		
		actual = c.nfactorial(4);
		assertEquals("4! = 24",24,actual,0.0);
	}

	@Test
	public void testBinarySearch() {
		int[] a = {0, 2, 3, 5, 6};
		int[] b = {};
		
		MyCalculator ca = new MyCalculator();
		int place = ca.binarySearch(a, 0);
		assertEquals("{0} in 0", 0, place, 0.0);
		
		place = ca.binarySearch(a, 3);
		assertEquals("{3} in 2", 2, place, 0.0);
		
		place = ca.binarySearch(a, 6);
		assertEquals("{6} in 4", 4, place, 0.0);
		
		place = ca.binarySearch(a, 8);
		assertEquals("{8} in -1", -1, place, 0.0);
		
		place = ca.binarySearch(b, 8);
		assertEquals("{8} in -1", -1, place, 0.0);
	}

}
