
public class Pow_50 {

	public static void main(String[] args) {

	}

	public static double myPow(double x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == Integer.MIN_VALUE) {
			n = n / 2;
			x = x * x;
		}
		if (n < 0) {
			n = -n;
			x = 1 / x;
		}
		return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
	}
}
