import java.util.HashMap;

public class Minimum_Window_Substring_76 {

	public static void main(String[] args) {

	}

	public String minWindow(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, 0);
		}
		for (char c : t.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				return "";
			}
		}
		int MinLength = Integer.MAX_VALUE;
		int MinStart = 0;
		int start = 0;
		int end = 0;
		int count = t.length();
		while (end < s.length()) {
			char c1 = s.charAt(end);
			if (map.get(c1) > 0) {
				count--;
			}
			map.put(c1, map.get(c1) - 1);
			end++;
			while (count == 0) {
				if (end - start < MinLength) {
					MinLength = end - start;
					MinStart = start;
				}
				char c2 = s.charAt(start);
				map.put(c2, map.get(c2) + 1);
				if (map.get(c2) > 0) {
					count++;
				}
				start++;
			}
		}
		return MinLength == Integer.MAX_VALUE ? "" : s.substring(MinStart, MinStart + MinLength);
	}
}
