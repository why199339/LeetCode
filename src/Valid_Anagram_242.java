import java.util.Arrays;

public class Valid_Anagram_242 {

	public static void main(String[] args) {

		String s = "atr";
		String t = "tar";
		System.out.println(isAnagram(s, t));
	}

	/*
	 * Hash Table
	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
        	return false;
    	}
    	int[] counter = new int[26];
    	for (int i = 0; i < s.length(); i++) {
	        counter[s.charAt(i) - 'a']++;
	        counter[t.charAt(i) - 'a']--;
    	}
	    for (int count : counter) {
	        if (count != 0) {
	            return false;
	        }
	    }
    	return true;
	}
	*/
	
	/*
	 * sorting
	 */
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
	        return false;
	    }
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    return Arrays.equals(str1, str2);
	}
}
