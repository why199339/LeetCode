
public class Arranging_Coins_441 {

	public static void main(String[] args) {

	}

	public int arrangeCoins_1(int n) {
		int low = 0;
		int high = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (0.5 * mid * mid + 0.5 * mid <= n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low - 1;
	}
	
	public int arrangeCoins_2(int n) {
		return (int) ((Math.sqrt(1 + 8.0 * n) - 1) / 2);
	}
}
