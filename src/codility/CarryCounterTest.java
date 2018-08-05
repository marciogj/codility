package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarryCounterTest {
	
	@Test
	public void test() {
		CarryCounter carryCounter = new CarryCounter();
		
		assertEquals(carryCounter.solution(5, 9), 1);
		assertEquals(carryCounter.solution(65, 55), 2);
		assertEquals(carryCounter.solution(665, 555), 3);
		assertEquals(carryCounter.solution(123, 456), 0);
		assertEquals(carryCounter.solution(555, 555), 3);
		assertEquals(carryCounter.solution(900, 11), 0);
		assertEquals(carryCounter.solution(145, 55), 2);
		assertEquals(carryCounter.solution(0, 0), 0);
		assertEquals(carryCounter.solution(1, 99999), 5);
		assertEquals(carryCounter.solution(999045, 1055), 5);
		assertEquals(carryCounter.solution(101, 809), 1);
		assertEquals(carryCounter.solution(189, 209), 1);
		assertEquals(carryCounter.solution(5, 9), 1);
	}

}
