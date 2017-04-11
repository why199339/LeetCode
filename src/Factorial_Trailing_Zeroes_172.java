
public class Factorial_Trailing_Zeroes_172 {

	public static void main(String[] args) {

	}

	public int trailingZeroes(int n) {
		int count = 0;
		while (n > 0) {
			count += n / 5;
			n /= 5;
		}
		return count;
	}
}
