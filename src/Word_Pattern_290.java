import java.util.HashMap;
import java.util.Objects;

public class Word_Pattern_290 {

	public static void main(String[] args) {

	}

	public boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		HashMap<Object, Integer> map = new HashMap<>();
		if (words.length != pattern.length()) {
			return false;
		}
		for (int i = 0; i < words.length; i++) {
			if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(words[i], i))) {
				return false;
			}
		}
		return true;
	}
}
