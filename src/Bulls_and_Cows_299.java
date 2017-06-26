import java.util.HashMap;

public class Bulls_and_Cows_299 {

	public static void main(String[] args) {

	}

	public String getHint(String secret, String guess) {
		int bulls = 0;
		int cows = 0;
		int[] numbers = new int[10];
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i))
				bulls++;
			else {
				if (numbers[secret.charAt(i) - '0']++ < 0)
					cows++;
				if (numbers[guess.charAt(i) - '0']-- > 0)
					cows++;
			}
		}
		return bulls + "A" + cows + "B";
	}

	public String getHint_own(String secret, String guess) {
		HashMap<Character, Integer> map = new HashMap<>();
		int aCount = 0;
		for (int i = 0; i < secret.length(); i++) {
			char c1 = secret.charAt(i);
			char c2 = guess.charAt(i);
			if (c1 == c2) {
				aCount++;
				continue;
			} else {
				if (map.containsKey(c1)) {
					map.put(c1, map.get(c1) + 1);
				} else {
					map.put(c1, 1);
				}
			}

		}
		int bCount = 0;
		for (int i = 0; i < secret.length(); i++) {
			char c1 = secret.charAt(i);
			char c2 = guess.charAt(i);
			if (c1 == c2) {
				continue;
			} else {
				if (!map.containsKey(c2) || map.get(c2) == 0) {
					continue;
				} else {
					bCount++;
					map.put(c2, map.get(c2) - 1);
				}
			}
		}
		return aCount + "A" + bCount + "B";
	}
}
