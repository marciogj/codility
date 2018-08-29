package codility.counting_elements;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermCheckTest {

	@Test
	public void test() {
		PermCheck permCheck = new PermCheck();
		assertEquals(1, permCheck.solution(new int[] {4,1,3,2}));

		assertEquals(0, permCheck.solution(new int[] {4,1,3}));
	}

}
