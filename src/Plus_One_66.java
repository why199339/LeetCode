
public class Plus_One_66 {

	public static void main(String[] args) {
		int[] digits = { 9 };
		int[] result = plusOne(digits);
		for (int i = 0; i < result.length; i++) {
			System.err.print(result[i] + " ");
		}
	}

	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;
		return newNumber;
	}

	public static int[] plusOne_2(int[] digits) {
		int carry = 0;
		digits[digits.length - 1] = digits[digits.length - 1] + 1;
		if (digits[digits.length - 1] >= 10 && digits.length != 1) {
			carry = 1;
			digits[digits.length - 1] = digits[digits.length - 1] - 10;
		}
		for (int i = digits.length - 2; i >= 0; i--) {
			digits[i] = digits[i] + carry;
			if (digits[i] >= 10 && i != 0) {
				carry = 1;
				digits[i] = digits[i] - 10;
			} else {
				carry = 0;
			}
		}
		if (digits[0] >= 10) {
			digits[0] = digits[0] - 10;
			int[] result = new int[digits.length + 1];
			for (int i = 0; i < digits.length; i++) {
				result[i + 1] = digits[i];
			}
			result[0] = 1;
			return result;
		}
		return digits;
	}

}
