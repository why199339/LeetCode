
public class Integer_Break_343 {

	public static void main(String[] args) {

	}

	public int integerBreak(int n) {
		if (n == 2)
			return 1;
		if (n == 3)
			return 2;
		int product = 1;
		while (n > 4) {
			product *= 3;
			n -= 3;
		}
		product *= n;
		return product;
	}
}
