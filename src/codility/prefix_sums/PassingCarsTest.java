package codility.prefix_sums;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassingCarsTest {

	@Test
	public void test() {
		PassingCars pc = new PassingCars();
		
		assertEquals(5, pc.solution(new int[] {0,1,0,1,1}));
		assertEquals(0, pc.solution(new int[] {1,1,1,1,1}));
		assertEquals(0, pc.solution(new int[] {0,0,0,0,0}));
		

		assertEquals(6, pc.solution(new int[] {1,0,1,0,1,0,1})); //3 + 2 + 1
	}

}
