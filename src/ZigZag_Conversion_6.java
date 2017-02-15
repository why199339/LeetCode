
public class ZigZag_Conversion_6 {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		System.out.println(convert(s, numRows));
		s = "AB";
		numRows = 1;
		System.out.println(convert(s, numRows));
	}

	public static String convert(String s, int numRows) {
		StringBuffer[] sb = new StringBuffer[numRows];
		for (int i = 0; i < numRows; i++) {
			sb[i] = new StringBuffer();
		}
		int i = 0;
		while (i < s.length()) {
			for (int j = 0; j < numRows && i < s.length(); j++) {
				sb[j].append(s.charAt(i++));
			}
			for (int j = numRows - 2; j >= 1 && i < s.length(); j--) {
				sb[j].append(s.charAt(i++));
			}
		}
		for (int index = 1; index < numRows; index++) {
			sb[0].append(sb[index]);
		}
		return sb[0].toString();
	}
}
