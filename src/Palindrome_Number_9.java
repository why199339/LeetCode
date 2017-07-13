
public class Palindrome_Number_9 {

	public static void main(String[] args) {
		int x = 121;
		System.out.println(x + " : " + isPalindrome(x));
		x = -121;
		System.out.println(x + " : " + isPalindrome(x));
		x = 0;
		System.out.println(x + " : " + isPalindrome(x));
		x = 1221;
		System.out.println(x + " : " + isPalindrome(x));
		x = 10;
		System.out.println(x + " : " + isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0)) {
			return false;
		}
		int ret = 0;
		while (ret < x) {
			ret = ret * 10 + x % 10;
			x = x / 10;
		}
		return (x == ret) || (x == ret / 10);
	}

	public static boolean isPalindrome_own(int x) {
		if (x < 0) {
			return false;
		}
		int count = 0;
		int temp = x;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		int n = 1;
		while (n <= count / 2) {
			int right = (int) (x % Math.pow(10, n) / Math.pow(10, n - 1));
			int left = (int) (x / Math.pow(10, count - n) % 10);
			if (right != left) {
				return false;
			}
			n++;
		}
		return true;
	}
}
