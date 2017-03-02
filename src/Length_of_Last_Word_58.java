
public class Length_of_Last_Word_58 {

	public static void main(String[] args) {
		String s = " ";
		System.out.println(lengthOfLastWord(s));
	}

	public static int lengthOfLastWord(String s) {
		return s.trim().length() - s.trim().lastIndexOf(' ') - 1;
	}
}
