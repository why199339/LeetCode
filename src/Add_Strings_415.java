
public class Add_Strings_415 {

	public static void main(String[] args) {

	}

	public String addStrings(String num1, String num2) {
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int carry = 0;
		StringBuffer sb = new StringBuffer();
		while (i >= 0 || j >= 0 || carry == 1) {
			int x = i < 0 ? 0 : num1.charAt(i) - '0';
			int y = j < 0 ? 0 : num2.charAt(j) - '0';
			sb.append((x + y + carry) % 10);
			carry = (x + y + carry) / 10;
			i--;
			j--;
		}
		return sb.reverse().toString();
	}
}
