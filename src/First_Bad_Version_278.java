
public class First_Bad_Version_278 {

	public static void main(String[] args) {

	}

	public int firstBadVersion(int n) {
		int left = 1;
		int right = n;
		int mid = n / 2;
		while (right > left) {
			mid = left + (right - left) / 2;
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return right;
	}

	private boolean isBadVersion(int mid) {

		return false;
	}
}
