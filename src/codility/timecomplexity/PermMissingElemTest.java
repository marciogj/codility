package codility.timecomplexity;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermMissingElemTest {

	@Test
	public void test() {
		PermMissingElem missingElem = new PermMissingElem();
		
		
		assertEquals(4, missingElem.solution(new int[] {2,3, 1, 5}));
		assertEquals(5, missingElem.solution(new int[] {1,2,3,4,6,7,8,9,10}));
	}

}
