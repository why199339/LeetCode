
public class Power_of_Two_231 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(2));
		System.out.println(isPowerOfTwo(5));
		System.out.println(isPowerOfTwo(8));
		System.out.println(isPowerOfTwo(17));
	}


	public static boolean isPowerOfTwo(int n) {
		return n > 0 && (n & (n-1)) == 0;
	}
	
	/*
	public static boolean isPowerOfTwo(int n) {
		return n>0 && Integer.bitCount(n) == 1;
	}
	*/
	
	/*
	public static boolean isPowerOfTwo(int n) {
		if (n > 0) {
			while (n % 2 == 0) {
				n = n / 2;
			}
		}
		return n == 1;
	}
	*/
	
	/*
	public static boolean isPowerOfTwo(int n) {
		return (Math.log10(n) / Math.log10(2)) % 1 == 0;
	}
	*/
	
	/*
	public static boolean isPowerOfTwo(int n) {
		return Integer.toString(n,2).matches("^10*$");
	}
	*/
	
	
}
