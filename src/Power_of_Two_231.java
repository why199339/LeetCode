
public class Power_of_Two_231 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo_best(0));
		System.out.println(isPowerOfTwo_best(2));
		System.out.println(isPowerOfTwo_best(5));
		System.out.println(isPowerOfTwo_best(8));
		System.out.println(isPowerOfTwo_best(17));
	}

	public static boolean isPowerOfTwo_best(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}

	public static boolean isPowerOfTwo_bit(int n) {
		return n > 0 && Integer.bitCount(n) == 1;
	}

	public static boolean isPowerOfTwo_recursive(int n) {
		if (n > 0) {
			while (n % 2 == 0) {
				n = n / 2;
			}
		}
		return n == 1;
	}

	public static boolean isPowerOfTwo_math(int n) {
		return (Math.log10(n) / Math.log10(2)) % 1 == 0;
	}

	public static boolean isPowerOfTwo_regex(int n) {
		return Integer.toString(n, 2).matches("^10*$");
	}

}
