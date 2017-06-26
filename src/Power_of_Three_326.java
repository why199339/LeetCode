
public class Power_of_Three_326 {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree_limit(45));
	}

	// Integer Limitations: O(1)
	public static boolean isPowerOfThree_limit(int n) {
		return n > 0 && 1162261467 % n == 0;
	}

	// Loop Iteration: O(log3n)
	public static boolean isPowerOfThree_loop(int n) {
		if (n < 1) {
			return false;
		}
		while (n % 3 == 0) {
			n = n / 3;
		}
		return n == 1;
	}

	// Base Conversion: O(log3n)
	public static boolean isPowerOfThree_base(int n) {
		return Integer.toString(n, 3).matches("^10*$");
	}

	// Mathematics: The expensive operation here is Math.log
	public static boolean isPowerOfThree_math(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}
}
