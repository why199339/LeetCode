
public class Detect_Capital_520 {

	public static void main(String[] args) {

	}

	public boolean detectCapitalUse(String word) {
		if (word.toLowerCase().equals(word) || word.toUpperCase().equals(word)
				|| word.substring(1).toLowerCase().equals(word.substring(1))) {
			return true;
		}
		return false;
	}
}
