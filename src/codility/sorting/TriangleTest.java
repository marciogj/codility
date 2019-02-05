package codility.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		Triangle triangle = new Triangle();
		int[] A = {10, 2, 5, 1, 8, 20};
		assertEquals(1, triangle.solution(A));
		
		assertEquals(0, triangle.solution(new int[] {10, 50, 5, 1}));
		
		
	}

}
