import java.util.Arrays;

public class Coin_Change_322 {

	public static void main(String[] args) {

	}

	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		int max = amount + 1;
		Arrays.fill(dp, max);
		dp[0] = 0;
		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (i >= coins[j]) {
					dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
				}
			}
		}
		if (dp[amount] > amount) {
			return -1;
		} else {
			return dp[amount];
		}
	}
}
