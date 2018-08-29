package codility.iterations;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryGapTest {

	@Test
	public void test() {
		BinaryGap binaryGap = new BinaryGap();
		assertEquals(binaryGap.solution(9), 2);
		assertEquals(binaryGap.solution(529), 4);
		assertEquals(binaryGap.solution(1041), 5);
		assertEquals(binaryGap.solution(32), 0);
		
	}

}
