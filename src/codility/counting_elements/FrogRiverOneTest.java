package codility.counting_elements;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogRiverOneTest {

	@Test
	public void test() {
		FrogRiverOne fro = new FrogRiverOne();
		
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		int X = 5;
		assertEquals(6, fro.solution(X, A));
	}

}
