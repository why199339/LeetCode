
public class Reverse_Words_in_a_String_III_557 {

	public static void main(String[] args) {

	}

	public String reverseWords1(String s) {
		String[] words = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for (String word : words) {
			sb.append(new StringBuffer(word).reverse().toString() + " ");
		}
		return sb.toString().trim();
	}

}
