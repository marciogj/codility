package codility.counting_elements;

/**
 * Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 *
 */
public class MissingInt {
	
	public int solution(int[] A) {
        int biggest = Integer.MIN_VALUE;
        int missing = 1;
        for(int i=0; i < A.length; i++) {
            if (A[i] >= biggest) {
            	biggest = A[i];
            }
        }
        if (biggest <= 0) {
        	return missing;
        }

        Integer[] positions = new Integer[biggest];
        for(int i=0; i < A.length; i++) {
            int num = A[i]; //-1
            if (num > 0) {
            	positions[A[i]-1] = A[i];
            }
            
        }
        
        for(int i=0; i < positions.length; i++) {
        	if (positions[i] == null) {
        		return missing;
        	}
        	missing++;
        }
        
        
        return missing;
    }

}
