import java.util.Arrays;

public class Assign_Cookies_455 {

	public static void main(String[] args) {

	}

	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0;
		int j = 0;
		while (i < g.length && j < s.length) {
			if (g[i] <= s[j]) {
				i++;
			}
			j++;
		}
		return i;
	}

}
