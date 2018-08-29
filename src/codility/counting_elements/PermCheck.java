package codility.counting_elements;

public class PermCheck {
	
	int solution(int A[]) {
		int N = A.length;
		int[] perm = new int[N];
		for(int i=0; i < A.length; i++) {
			if (A[i]-1 < A.length) {
				perm[A[i]-1] += 1;
			}
		}
		for (int i=1; i <= N; i++) {
			if (perm[i-1] == 0) {
				return 0;
			}
		}
		return 1;
	}

}
