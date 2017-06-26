
public class Count_Numbers_with_Unique_Digits_357 {

	public static void main(String[] args) {

	}

	public int countNumbersWithUniqueDigits(int n) {
		if (n == 0) {
			return 1;
		}
		int result = 10;
		int base = 9;
		for (int i = 2; i <= n && i <= 10; i++) {
			base = base * (11 - i);
			result += base;
		}
		return result;
	}
}
