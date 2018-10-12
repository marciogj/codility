package codility.prefix_sums;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDivTest {

	@Test
	public void test() {
		CountDiv cd = new CountDiv();
		
		//1
		assertEquals(51, cd.solution(0, 50, 1));
		assertEquals(11, cd.solution(0, 10, 1));
		assertEquals(100, cd.solution(1, 100, 1));
		
		//2 multiples
		assertEquals(26, cd.solution(0, 50, 2));
		assertEquals(6, cd.solution(0, 10, 2));
		assertEquals(49, cd.solution(1, 99, 2));
		assertEquals(50, cd.solution(1, 100, 2));
		
		
		//3 multiples
		assertEquals(10, cd.solution(1, 30, 3));
		assertEquals(11, cd.solution(0, 30, 3));
		
		//4 - 4,8,12,16,20,24,28,32
		assertEquals(9, cd.solution(0, 32, 4));
		assertEquals(8, cd.solution(1, 33, 4));	

		//5 - 5, 10, 15, 20, 25, 30, 35
		assertEquals(8, cd.solution(0, 35, 5));
		assertEquals(7, cd.solution(1, 36, 5));
		
		
		//assertEquals(4, cd.solution(0, 10, 3));
		//assertEquals(6, cd.solution(0, 25, 5));
	}

}
