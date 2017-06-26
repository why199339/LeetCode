
public class Hamming_Distance_461 {

	public static void main(String[] args) {
		System.out.println(hammingDistance1(1, 4));
	}

	public static int hammingDistance1(int x, int y) {
		return Integer.bitCount(x ^ y);
	}

	public static int hammingDistance2(int x, int y) {
		int xor = x ^ y;
		int count = 0;
		for (int i = 0; i < 32; i++) {
			count += (xor >> i) & 1;
		}
		return count;
	}
}
