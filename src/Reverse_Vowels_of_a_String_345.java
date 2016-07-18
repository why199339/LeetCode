import java.util.HashSet;

public class Reverse_Vowels_of_a_String_345 {

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		if(s == null || s.length()==0) return s;
	    String vowels = "aeiouAEIOU";
	    char[] chars = s.toCharArray();
	    int start = 0;
	    int end = s.length()-1;
	    while(start<end){
	        
	        while(start<end && !vowels.contains(chars[start]+"")){
	            start++;
	        }
	        
	        while(start<end && !vowels.contains(chars[end]+"")){
	            end--;
	        }
	        
	        char temp = chars[start];
	        chars[start] = chars[end];
	        chars[end] = temp;
	        
	        start++;
	        end--;
	    }
	    return new String(chars);
	}
	
	/* own
	public static String reverseVowels(String s) {
		if(s == null) {
			return null;
		}
		HashSet<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		char[] b = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if(set.contains(b[i]) && set.contains(b[j])) {
				char temp = b[i];
				b[i] = b[j];
				b[j] = temp;
				i++;
				j--;
				continue;
			}
			
			if (!set.contains(b[i])) {
				i++;
			}
			if (!set.contains(b[j])) {
				j--;
			}
		}
		return new String(b);
	}
	*/
}
