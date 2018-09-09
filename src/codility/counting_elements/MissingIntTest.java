package codility.counting_elements;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingIntTest {

	@Test
	public void test() {
		MissingInt mi = new MissingInt();
		int[] A = {1, 3, 6, 4, 1, 2};
		assertEquals(5, mi.solution(A));
	
		assertEquals(4, mi.solution(new int[] {1, 2, 3}));
		
		assertEquals(1, mi.solution(new int[] {-1, -3}));
		
	}

}
