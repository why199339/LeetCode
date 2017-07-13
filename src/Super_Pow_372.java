
public class Super_Pow_372 {

	public static void main(String[] args) {

	}

	public int superPow(int a, int[] b) {
		return superPow(a, b, b.length, 1337);
	}

	private int superPow(int a, int[] b, int length, int k) {
		if (length == 1) {
			return powMod(a, b[0], k);
		}
		return powMod(superPow(a, b, length - 1, k), 10, k) * powMod(a, b[length - 1], k) % k;
	}

	// x^y mod k
	private int powMod(int x, int y, int k) {
		x %= k;
		int pow = 1;
		for (int i = 0; i < y; i++) {
			pow = (pow * x) % k;
		}
		return pow;
	}
}
