
public class Repeated_Substring_Pattern_459 {

	public static void main(String[] args) {

	}

	public boolean repeatedSubstringPattern(String s) {
		int len = s.length();
		for (int i = len / 2; i >= 1; i--) {
			if (len % i == 0) {
				int m = len / i;
				String sub = s.substring(0, i);
				StringBuffer sb = new StringBuffer();
				for (int j = 0; j < m; j++) {
					sb.append(sub);
				}
				if (sb.toString().equals(s)) {
					return true;
				}
			}
		}
		return false;
	}

}
