package codility.prefix_sums;

import static org.junit.Assert.*;

import org.junit.Test;

public class SliceArrayTest {

	@Test
	public void test() {
		
		int[] A = {4, 2, 2, 5, 1, 5, 8};
		SliceArray sa = new SliceArray();
		assertEquals(1, sa.solution(A));
		
		
		
	}

}
