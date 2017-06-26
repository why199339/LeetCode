
public class Valid_Perfect_Square_367 {

	public static void main(String[] args) {

	}

	public boolean isPerfectSquare_math(int num) {
		int i = 1;
		while (num > 0) {
			num -= i;
			i += 2;
		}
		return num == 0;
	}

	public boolean isPerfectSquare_binarySearch(int num) {
		long low = 1;
		long high = num;
		while (low <= high) {
			long mid = (low + high) >> 1;
			if (mid * mid == num) {
				return true;
			}
			if (mid * mid < num) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
	}

	public boolean isPerfectSquare_newton(int num) {
		long x = num;
		while (x * x > num) {
			x = (x + num / x) >> 1;
		}
		return x * x == num;
	}
}
