
public class Decode_Ways_91 {

	public static void main(String[] args) {
		String s = "132";
		System.out.println(numDecodings(s));
	}

	public static int numDecodings(String s) {
		int n = s.length();
		if (n == 0) {
			return 0;
		}
		int[] dp = new int[n + 1];
		dp[n] = 1;
		dp[n - 1] = s.charAt(n - 1) == '0' ? 0 : 1;
		for (int i = n - 2; i >= 0; i--) {
			if (s.charAt(i) == '0') {
				continue;
			}
			if (Integer.parseInt(s.substring(i, i + 2)) <= 26) {
				dp[i] = dp[i + 1] + dp[i + 2];
			} else {
				dp[i] = dp[i + 1];
			}
		}
		return dp[0];
	}

}
