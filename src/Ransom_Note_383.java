import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ransom_Note_383 {

	public static void main(String[] args) {
		System.out.println(canConstruct_1("a", "b"));
		System.out.println(canConstruct_1("aa", "ab"));
		System.out.println(canConstruct_1("aa", "aab"));
	}

	public static boolean canConstruct_1(String ransomNote, String magazine) {
		int[] arr = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			arr[magazine.charAt(i) - 'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean canConstruct_2(String ransomNote, String magazine) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < magazine.length(); i++) {
			if (map.containsKey(magazine.charAt(i))) {
				map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
			} else {
				map.put(magazine.charAt(i), 1);
			}
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if (!map.containsKey(ransomNote.charAt(i))) {
				return false;
			}
			map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
			if (map.get(ransomNote.charAt(i)) < 0) {
				return false;
			}
		}
		return true;
	}

}
