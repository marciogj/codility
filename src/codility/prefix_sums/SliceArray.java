package codility.prefix_sums;
/**
 A non-empty array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P < Q < N, is called a slice of array A (notice that the slice contains at least two elements). The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice. To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).

For example, array A such that:

    A[0] = 4
    A[1] = 2
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8
contains the following example slices:

slice (1, 2), whose average is (2 + 2) / 2 = 2;
slice (3, 4), whose average is (5 + 1) / 2 = 3;
slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.
The goal is to find the starting position of a slice whose average is minimal.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A consisting of N integers, returns the starting position of the slice with the minimal average. If there is more than one slice with a minimal average, you should return the smallest starting position of such a slice.

For example, given array A such that:

    A[0] = 4
    A[1] = 2
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8
the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−10,000..10,000].
 */
public class SliceArray {
	
	public int solution(int[] A) {
        double minAvg = Integer.MAX_VALUE;
        int startPosition = 0;
        double sum = 0;
        
        //P goes from zero up to array size -1; shall not be equal Q
        for(int p=0; p < A.length -1; p++) {
       
        	for(int size=2; size < A.length; size++) {
        		int q = (p+size)-1;
        		if (q == A.length) break;
        		
        		sum = 0;
    	        for(int i=p; i <= q; i++) {
    	        	sum += A[i];
    	        }
    	        
    	        double avg = sum/size;
    	        if (minAvg > avg) {
    	        	minAvg = avg;
    	        	startPosition = p;
    	        }
        	}
        }
        return startPosition;
    }

}
