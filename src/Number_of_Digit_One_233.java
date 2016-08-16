

public class Number_of_Digit_One_233 {

	public static void main(String[] args) {
		System.out.println(countDigitOne(13));
	}

	// O(logn)
	public static int countDigitOne(int n) {
		int ones = 0;
		for(long m = 1; m <= n; m *= 10) {
			ones += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
		}
		return ones;
	}
	
	
	/*  Time Limit Exceeded
	public static int countDigitOne(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int cur = i;
			while (cur != 0) {
				int m = cur % 10;
				if(m == 1) {
					count ++;
				}
				cur = cur / 10;
			}
		}
		return count;
    }
    */
}
