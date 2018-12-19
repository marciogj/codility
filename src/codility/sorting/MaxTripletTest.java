package codility.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxTripletTest {

	@Test
	public void test() {
		MaxTriplet maxTriplet = new MaxTriplet();
		int[] A = { -3, 1, 2, -2, 5, 6 };
		assertEquals(60, maxTriplet.solution(A));
		
		
		A = new int[] {-10, -2, -4};
		assertEquals(-80, maxTriplet.solution(A));
		
		A = new int[] {-4, -6, 3, 4, 5};
		assertEquals(120, maxTriplet.solution(A));
	}

}
