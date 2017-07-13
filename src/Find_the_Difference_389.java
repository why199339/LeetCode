
public class Find_the_Difference_389 {

	public static void main(String[] args) {

	}

    public char findTheDifference(String s, String t) {
        String str = s + t;
        int res = 0;
        for(char c : str.toCharArray()) {
        	res ^= c - '0';
        }
        return (char) (res + '0');
    }
}
