
public class Divide_Two_Integers_29 {

	public static void main(String[] args) {

	}

	public static int divide(int dividend, int divisor) {
		if ((dividend == Integer.MIN_VALUE && divisor == -1) || divisor == 0) {
			return Integer.MAX_VALUE;
		}
		int res = 0;
		int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
		long div = Math.abs((long)dividend);
		long dis = Math.abs((long)divisor);
		while (div >= dis) {
			long temp = dis;
			int n = 1;
			while (div >= (temp << 1)) {
				temp = temp << 1;
				n = n << 1;
			}
			div -= temp;
			res += n;
		}
		return sign == 1 ? res : -res;
	}
}
