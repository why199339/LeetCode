package q32;
public class NumberOf1Between1AndN {

	public static void main(String[] args) {
		System.out.println(numberOf1Between1AndN_bad(12));
		System.out.println(numberOf1Between1AndN_good(13));
	}

	public static int numberOf1Between1AndN_good(int n) {
		int ones = 0;
		for(long m = 1; m <= n; m *= 10) {
			ones += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
		}
		return ones;
	}

	public static int numberOf1Between1AndN_bad(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int cur = i;
			while (cur != 0) {
				int m = cur % 10;
				if (m == 1) {
					count++;
				}
				cur = cur / 10;
			}
		}
		return count;
	}
}
