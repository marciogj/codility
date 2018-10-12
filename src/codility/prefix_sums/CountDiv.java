package codility.prefix_sums;

/**
 * Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
 * @author marciogj
 *
 */
public class CountDiv {
	
	public int solution(int A, int B, int K) {
		int max = B;
		while (max % K != 0) {
			max--;
		}
		int maxDivCount = max / K;
		
		int min = A;
		while (min % K != 0) {
			min++;
		}
		int minDivCount = (min / K)-1; //remove zero 
		
		return maxDivCount - minDivCount;
		
    }

}
