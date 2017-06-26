
public class Maximum_Product_of_Word_Lengths_318 {

	public static void main(String[] args) {

	}

	public int maxProduct(String[] words) {
		if (words == null || words.length == 0) {
			return 0;
		}
		int[] count = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				count[i] |= 1 << (words[i].charAt(j) - 'a');
			}
		}
		int maxP = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (((count[i] & count[j]) == 0) && (words[i].length() * words[j].length() > maxP)) {
					maxP = words[i].length() * words[j].length();
				}
			}
		}
		return maxP;
	}
}
