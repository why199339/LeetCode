import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort_Characters_By_Frequency_451 {

	public static void main(String[] args) {

	}

	public String frequencySort(String s) {
		StringBuffer sb = new StringBuffer();
		Map<Character, Integer> map = new HashMap<>();
		@SuppressWarnings("unchecked")
		List<Character>[] buckets = new ArrayList[s.length() + 1];
		for (Character c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char key : map.keySet()) {
			int value = map.get(key);
			if (buckets[value] == null) {
				buckets[value] = new ArrayList<>();
			}
			buckets[value].add(key);
		}
		for (int i = s.length(); i >= 0; i--) {
			if (buckets[i] != null) {
				for (char c : buckets[i]) {
					for (int j = 0; j < map.get(c); j++) {
						sb.append(c);
					}
				}
			}
		}
		return sb.toString();
	}
}
