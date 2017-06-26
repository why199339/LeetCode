
public class Longest_Uncommon_Subsequence_I_521 {

	public static void main(String[] args) {

	}

	public int findLUSlength(String a, String b) {
		if(a.equals(b)) {
			return -1;
		}
		return Math.max(a.length(), b.length());
	}
}
