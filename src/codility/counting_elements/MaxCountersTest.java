package codility.counting_elements;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxCountersTest {

	@Test
	public void test() {
		MaxCounters mc = new MaxCounters();
		int[]  A = {3, 4, 4, 6, 1, 4, 4};
		int N = 5;
		
		assertArrayEquals(new int[] {3, 2, 2, 4, 2}, mc.solution(N, A));
		
	}

}
