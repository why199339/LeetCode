
public class Integer_Replacement_397 {

	public static void main(String[] args) {

	}

	public int integerReplacement(int n) {
		int res = 0;
		while (n != 1) {
			if ((n & 1) == 0) {
				n >>>= 1;
			} else if (n == 3 || ((n >>> 1) & 1) == 0) {
				n--;
			} else {
				n++;
			}
			res++;
		}
		return res;
	}
}
