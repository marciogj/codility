package codility.prefix_sums;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenomicRangeQueryTest {

	@Test
	public void test() {
		GenomicRangeQuery grq = new GenomicRangeQuery();
		
		
		String S;
		int[] P;
		int[] Q;
		int[] solution;
		
		S = "C";
		P = new int[] {0};
		Q = new int[] {0};
		solution = new int[] {2};
		assertArrayEquals(solution, grq.solution(S, P, Q));
		
		S = "CAGCCTA";
		P = new int[] {2,5,0};
		Q = new int[] {4,5,6};
		solution = new int[] {2,4,1};
		assertArrayEquals(solution, grq.solution(S, P, Q));
		
		
		S = "AC";
		P = new int[] {0,0,1};
		Q = new int[] {0,1,1};
		solution = new int[] {1,1,2};
		assertArrayEquals(solution, grq.solution(S, P, Q));
		
		
		
	}

}
