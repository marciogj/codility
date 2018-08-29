package codility.timecomplexity;

/**
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
 * 
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * 
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * 
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 * 
 * For example, consider array A such that:
 * 
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * We can split this tape in four places:
 * 
 * P = 1, difference = |3 − 10| = 7 
 * P = 2, difference = |4 − 9| = 5 
 * P = 3, difference = |6 − 7| = 1 
 * P = 4, difference = |10 − 3| = 7 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 * 
 * For example, given:
 * 
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * the function should return 1, as explained above.
 * 
 * Assume that:
 * 
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 * Complexity:
 * 
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 * 
 */
public class TapeEquilibrium {
	
	public int solution(int[] A){
		int smallest = Integer.MAX_VALUE;
		for(int P=1; P < A.length; P++) {
			int p1Sum = 0;
			int p2Sum = 0;
			for(int i=0; i < A.length; i++){ 
				if(i < P) {
					p1Sum += A[i];
	 			} else {
	 				p2Sum += A[i];
	 			}
			}
			
			int newValue =  Math.abs(p1Sum - p2Sum);
			if(newValue < smallest) {
				smallest = newValue;
			}
		}
		return smallest;
	}
	
	
	public int solution2(int[] A){
		int[] solutions = new int[A.length-1];
		int smallest = 100000;
		for(int p=1; p < A.length; p++) {
			solutions[p-1] = solution(A, p);
			if(solutions[p-1] < smallest) {
				smallest = solutions[p-1];
			}
		}
		return smallest;
	}
	
	public int solution(int[] A, int P) {
		if (P < 1 || P >= A.length) throw new RuntimeException("Invalid P Value: 0 < P < N");
		
		int[] part1 = new int[P];
		int[] part2 = new int[A.length - P];
		
		int p1index = 0;
		int p2index = 0;
		for(int i=0; i < A.length; i++){ 
			if(i < P) {
				part1[p1index++] = A[i];
 			} else {
 				part2[p2index++] = A[i];
 			}
		}
		
		return Math.abs(sum(part1) - sum(part2));
		
	}
	
	public int sum(int[] A) {
		int sum = 0;
		for(int v : A) {
			sum += v;
		}
		return sum;
	}

}
