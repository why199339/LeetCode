
public class Number_of_Segments_in_a_String_434 {

	public static void main(String[] args) {

	}

	public int countSegments(String s) {
		int res = 0;
		char[] chs = s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			if(chs[i] != ' ' && (i == 0 || chs[i-1] == ' ')) {
				res ++;
			}
		}
		return res;
	}
}
