package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddOccurrencesInArrayTest {

	@Test
	public void test() {
		OddOccurrencesInArray oddOccurrences = new OddOccurrencesInArray();
		
		assertEquals(7, oddOccurrences.solution(new int[]  {9, 3, 9, 3, 9, 7, 9}));

		assertEquals(9, oddOccurrences.solution(new int[] {9}));
		
		assertEquals(-1, oddOccurrences.solution(new int[] {}));

		assertEquals(9, oddOccurrences.solution(new int[]  {9, 3, 9, 3, 9, 7, 9, 7, 9}));
		
	}

}
