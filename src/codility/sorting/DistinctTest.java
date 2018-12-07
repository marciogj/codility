package codility.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistinctTest {

	@Test
	public void test() {
		Distinct distinct = new Distinct();
		int[] A = {2, 1, 1, 2, 3 ,1};
		assertEquals(3, distinct.solution(A));
		
		A = new int[] {1, 1, 1, 1, 1 ,1};
		assertEquals(1, distinct.solution(A));
		
		A = new int[] {1, 2, 3, 4, 5 ,6};
		assertEquals(6, distinct.solution(A));
	}

}
