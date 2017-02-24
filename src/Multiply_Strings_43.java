
public class Multiply_Strings_43 {

	public static void main(String[] args) {
		String num1 = "9";
		String num2 = "99";
		System.out.println(multiply(num1, num2));
	}

	public static String multiply(String num1, String num2) {
		int[] pos = new int[num1.length() + num2.length()];
		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0; j--) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int p1 = i + j;
				int p2 = i + j + 1;
				int sum = mul + pos[p2];
				pos[p1] += sum / 10;
				pos[p2] = sum % 10;
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int p : pos) {
			if (!(sb.length() == 0 && p == 0)) {
				sb.append(p);
			}
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}
}
