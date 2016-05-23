
public class Add_Digits_258 {

	public static void main(String[] args) {
		int n = addDigits(1091);
		System.out.println(n);

	}

//	public static int addDigits(int num) {
//		if (num < 10) {
//			return num;
//		}
//		int sum = 0;
//		while (num >= 10) {
//			sum = 0;
//			while (num >= 1) {
//				sum += num % 10;
//				num = num / 10;
//			}
//			num = sum;
//		}
//		return sum;
//	}
	
	public static int addDigits(int num) {
		return num > 9 ? (num % 9 == 0 ? 9 : num % 9) : num;
	}
}
