
public class Excel_Sheet_Column_Title_168 {

	public static void main(String[] args) {

	}

	public String convertToTitle(int n) {
		StringBuffer sb = new StringBuffer();
		while (n > 0) {
			n--;
			sb.insert(0, (char) ('A' + n % 26));
			n = n / 26;
		}
		return sb.toString();
	}
}
