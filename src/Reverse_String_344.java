
public class Reverse_String_344 {

	public static void main(String[] args) {

		String s = "hello";
		s = reverseString(s);
		System.out.println(s);
	}

	public static String reverseString(String s) {
		int l = s.length();
		char[] ss = s.toCharArray();
		for (int i = 0; i < l / 2; i++) {
			char t;
			t = ss[i];
			ss[i] = ss[l - i - 1];
			ss[l - i - 1] = t;
		}
		return new String(ss);
	}
}
