import java.util.ArrayList;
import java.util.List;

public class Count_and_Say_38 {

	public static void main(String[] args) {
		System.out.println(countAndSay(4));
	}

	public static String countAndSay(int n) {
		StringBuffer curr = new StringBuffer("1");
		StringBuffer prev;
		int count;
		char say;
		for(int i=1; i<n; i++) {
			prev = curr;
			curr = new StringBuffer();
			count = 1;
			say = prev.charAt(0);
			int len = prev.length();
			for(int j=1; j < len; j++) {
				if(prev.charAt(j) != say) {
					curr.append(count).append(say);
					count = 1;
					say = prev.charAt(j);
				}
				else count ++;
			}
			curr.append(count).append(say);
		}
		return curr.toString();
	}
}
