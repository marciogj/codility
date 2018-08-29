package codility.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotationTest {
	
	@Test
	public void test() {
		CyclicRotation rotation = new CyclicRotation();
		int[] a = {1,2,3,4,5};
		int[] b = {5,1,2,3,4};
		int k = 1;
		//assertArrayEquals(b, rotation.solution(a, k));
		
		
		a = new int[] {3, 8, 9, 7, 6};
		b = new int[] {9, 7, 6, 3, 8};
		k = 3;
		assertArrayEquals(b, rotation.solution(a, k));
		
		
		a = new int[] {1, 2, 3, 4};
		b = new int[] {1, 2, 3, 4};
		k = 4;
		assertArrayEquals(b, rotation.solution(a, k));
		
		a = new int[] {1};
		b = new int[] {1};
		k = 6;
		assertArrayEquals(b, rotation.solution(a, k));
		

		a = null;
		b = null;
		k = 6;
		assertArrayEquals(b, rotation.solution(a, k));
		
		a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		b = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		k = 15;
		assertArrayEquals(b, rotation.solution(a, k));
		
		
		a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		b = new int[] {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		k = 10;
		assertArrayEquals(b, rotation.solution(a, k));
		 
	}
}
