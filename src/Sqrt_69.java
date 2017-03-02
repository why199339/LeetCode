
public class Sqrt_69 {

	public static void main(String[] args) {

	}

	public static int mySqrt_Newton(int x) {
		long n = x;
		while (n * n > x) {
			n = (n + x / n) / 2;
		}
		return (int) n;
	}

	public static int mySqrt_BinarySearch(int x) {
		int left = 1;
		int right = x;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (mid == x / mid) {
				return mid;
			} else if (mid < x / mid) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return right;
	}
}
