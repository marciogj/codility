package codility.sorting;

/**
 * An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
 * 
 * A[P] + A[Q] > A[R],
 * A[Q] + A[R] > A[P],
 * A[R] + A[P] > A[Q].
 * For example, consider array A such that:
 * 
 *   A[0] = 10    A[1] = 2    A[2] = 5
 *   A[3] = 1     A[4] = 8    A[5] = 20
 * Triplet (0, 2, 4) is triangular.
 * 
 * Write a function:
 * 
 * class Solution { public int solution(int[] A); }
 * 
 * that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
 * 
 * For example, given array A such that:
 * 
 *   A[0] = 10    A[1] = 2    A[2] = 5
 *   A[3] = 1     A[4] = 8    A[5] = 20
 * the function should return 1, as explained above. Given array A such that:
 * 
 *   A[0] = 10    A[1] = 50    A[2] = 5
 *   A[3] = 1
 * the function should return 0.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 *
 */
public class Triangle {
	
	
	public int solution(int[] A) {
		if (A.length < 3) return 0;
		
        int P = 0, Q = 1, R = 2;
        
        java.util.Arrays.sort(A);
        while(R < A.length) {
        	//Long is required to avoid overflow on sum operations
        	long p = A[P], q = A[Q], r = A[R];
        	boolean isTriplet =   p + q > r && q + r > p && r + p > q;
        	
        	if (isTriplet) {
        		return 1;
        	}
        	P++; Q++; R++;
        }
        return 0;
    }

}