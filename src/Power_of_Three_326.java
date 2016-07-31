
public class Power_of_Three_326 {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(45));
	}

	// Integer Limitations: O(1)
	public static boolean isPowerOfThree(int n) {
		return n > 0 && 1162261467 % n == 0;
	}
	/*
	 * Loop Iteration: O(log3n)
	public static boolean isPowerOfThree(int n) {
		if(n < 1) {
			return false;
		}
		while (n % 3 == 0) {
			n = n / 3;
		}
		return n == 1;
	}
	*/
	
	/*
	 * Base Conversion: O(log3n)
	public static boolean isPowerOfThree(int n) {
		return Integer.toString(n, 3).matches("^10*$");
	}
	*/
	
	/*
	 * Mathematics: The expensive operation here is Math.log, The implementation is dependent on the language we are using and the compiler
	public static boolean isPowerOfThree(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}
	 */
}
