package codility.timecomplexity;

import static org.junit.Assert.*;

import org.junit.Test;

public class TapeEquilibriumTest {

	@Test
	public void test() {
		TapeEquilibrium te = new TapeEquilibrium();
		int[] A = {3,1,2,4,3};
		assertEquals(1, te.solution(A));
	}

}
