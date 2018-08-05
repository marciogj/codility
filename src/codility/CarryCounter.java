package codility;


/***
 * In addition (arithmetic operation), a carry refers to a digit that is transferred from one column to the adjacent column on the left when the result of the addition cannot be represented by a single digit. For example:
 * 
 * 			  55
 *    		+ 29
 *    			----
 *    			  84
 *    
 *    			In this example, 5 + 9 = 14, which cannot be represented by a single digit, so the 1 is carried to the column on the left and added to the result of 5 + 2.
 *    
 *    			Write a function that given two numbers returns the total count of carry operations performed while adding them.
 *    
 *    			Example:
 *    			numberOfCarryOperations(65, 55) // 2
 *       		65 + 55 =>
 *       			1st column: 5 + 5 = 0 (1 is carried)
 *       			2nd column: 6 + 5 + 1 (carried) = 2 (1 is carried)
 *           		3rd column: 1 (carried) = 1
 *           			=> 120 (2 carry operations)	
 */
public class CarryCounter {

	
	public int solution(int n1, int n2) {
		int n1Size = Integer.toString(n1).length();
		int n2Size = Integer.toString(n2).length();
		
		int maxDigits = n1Size > n2Size ? n1Size : n2Size;
		//System.out.println(n1 + " + " + n2);

		int[] n1Digits = numberToArray(n1, maxDigits);
		int[] n2Digits = numberToArray(n2, maxDigits);

		//Arrays.stream(n1Digits).forEach(num -> System.out.print(num + " | "));
		//System.out.println();
		//Arrays.stream(n2Digits).forEach(num -> System.out.print(num + " | "));

		int numberCarries = 0;
		for (int i=n1Digits.length - 1; i >= 0; i--) {
			if (n1Digits[i] + n2Digits[i] > 9) {
				numberCarries++;
				//Add the carry to next digit
				if (i - 1 >= 0) { 
					n2Digits[i-1] += 1;
				}
			}
		}
		//System.out.println("\nCarries " + numberCarries + "\n");
		return numberCarries;
	}
	
	private int[] numberToArray(int n, int maxDigits) {
		char[] nStr = ("" + n).toCharArray();
		
		int[] nArray = new int[maxDigits];
		int j = 1;
		for (int i=maxDigits-1; i >= 0; i--) {
			nArray[i] = 0;
			if (nStr.length - j >= 0) {
				nArray[i] = Integer.parseInt(""+nStr[nStr.length - j++]);
			}
		}
		
		return nArray;
	}
	
	public int solution2(int n1, int n2) {
		int n1Digits = Integer.toString(n1).length();
		int n2Digits = Integer.toString(n2).length();
		int maxDigits = n1Digits > n2Digits ? n1Digits : n2Digits;
		
		boolean isCarried = false;
		int carries = 0;
		int div = 10;
		
		int n1r = 0;
		int n2r = 0;
		for (int i=0; i < maxDigits; i++) {
			
			//Isolate the numbers that will be evaluated 
			n1r = (n1 % div) - n1r;
			n2r = (n2 % div) - n2r;
			
			//If there's a pending carry, add to n1r
			if (isCarried) {
				n1r += div/10;
				isCarried = false;
			}
			
			//Check for new carry
			if (n1r + n2r >= div) {
				isCarried = true;
				carries++;
			}
			
			div *= 10;
		}
		
		return carries;
	}
}
