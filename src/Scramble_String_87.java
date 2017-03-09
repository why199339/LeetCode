
public class Scramble_String_87 {

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "b";
		System.out.println(isScramble(s1, s2));
	}

	public static boolean isScramble(String s1, String s2) {
		if (s1.equals(s2)) {
			return true;
		}
		int[] letters = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			letters[s1.charAt(i) - 'a']++;
			letters[s2.charAt(i) - 'a']--;
		}
		for (int letter : letters) {
			if (letter != 0) {
				return false;
			}
		}
		for (int i = 1; i < s1.length(); i++) {
			if (isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i))) {
				return true;
			}
			if (isScramble(s1.substring(0, i), s2.substring(s2.length() - i)) && isScramble(s1.substring(i), s2.substring(0, s2.length() - i))) {
				return true;
			}
		}
		return false;
	}
}
