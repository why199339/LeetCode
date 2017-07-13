import java.util.HashMap;
import java.util.Map;

public class Remove_Duplicate_Letters_316 {

	public static void main(String[] args) {

	}

	public String removeDuplicateLetters_2(String s) {
		int[] cnt = new int[26];
		int pos = 0; // the position for the smallest s[i]
		for (int i = 0; i < s.length(); i++)
			cnt[s.charAt(i) - 'a']++;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < s.charAt(pos))
				pos = i;
			if (--cnt[s.charAt(i) - 'a'] == 0)
				break;
		}
		return s.length() == 0 ? ""
				: s.charAt(pos) + removeDuplicateLetters_2(s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));
	}

	public String removeDuplicateLetters(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		char[] result = new char[map.size()];
		int begin = 0;
		int end = findMin(map);
		for (int i = 0; i < result.length; i++) {
			char minChar = 'z' + 1;
			for (int j = begin; j <= end; j++) {
				if (map.containsKey(s.charAt(j)) && s.charAt(j) < minChar) {
					minChar = s.charAt(j);
					begin = j + 1;
				}
			}
			result[i] = minChar;
			if (i == result.length - 1) {
				break;
			}
			map.remove(minChar);
			if (s.charAt(end) == minChar) {
				end = findMin(map);
			}
		}
		return new String(result);
	}

	private int findMin(Map<Character, Integer> map) {
		if (map == null || map.size() == 0) {
			return -1;
		}
		int min = Integer.MAX_VALUE;
		for (int value : map.values()) {
			min = Math.min(min, value);
		}
		return min;
	}
}
