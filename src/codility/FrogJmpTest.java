package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogJmpTest {

	@Test
	public void test() {
		FrogJmp jmp = new FrogJmp();
		
		assertEquals(3, jmp.solution(10, 85, 30));
	}

}
