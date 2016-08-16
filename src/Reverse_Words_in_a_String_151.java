import javax.xml.crypto.Data;

public class Reverse_Words_in_a_String_151 {

	public static void main(String[] args) {
		// String s = "I am a student.";
		String s = "   a   b ";
		String reversedData = reverseWords(s);
		System.out.println(reversedData);
	}

	public static String reverseWords(String s) {
		String[] parts = s.trim().split("\\s+");
		String out = "";
		for (int i = parts.length - 1; i > 0; i--) {
		    out += parts[i] + " ";
		}
		return out + parts[0];
	}
	
	/*
	public static String reverseWords(String s) {
		if (s == null) {
			return null;
		}
		s = s.trim();
		s = reverse(s);
		String[] strs = s.split("\\s+");
		for (int i = 0; i < strs.length; i++) {
			strs[i] = reverse(strs[i]);
		}
		
		StringBuffer bf = new StringBuffer();
		for (String str : strs) {
			bf.append(str + " ");
		}
		if(strs.length == 0) {
			return "";
		}
		return new String(bf).trim();
	}

	private static String reverse(String s) {
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = temp;
		}
		return new String(arr);
	}
	*/
}
