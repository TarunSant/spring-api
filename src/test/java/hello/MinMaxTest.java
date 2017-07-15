package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTest {

	@Test
	void TestFindMax() {
		int min = 10;
		int max = 20;
		MinMax minMax = new MinMax();
		int returnVal = minMax.findMin(min, max);
		assertEquals(min, returnVal);
	}	
	
	@Test
	void TestFindMin() {
		int min = 10;
		int max = 20;
		MinMax minMax = new MinMax();
		int returnVal = minMax.findMax(min, max);
		assertEquals(max, returnVal);
	}
}
