
public class Reverse_Integer_7 {

	public static void main(String[] args) {
		int x = 123;
		System.out.println(reverse(x));
		x = -123;
		System.out.println(reverse(x));
		x = 0;
		System.out.println(reverse(x));
	}

	public static int reverse(int x) {
		int result = 0;
		while (x != 0) {
			int tail = x % 10;
			int temp = result * 10 + tail;
			if ((temp - tail) / 10 != result) {
				return 0;
			}
			result = temp;
			x = x / 10;
		}
		return result;
	}
}
