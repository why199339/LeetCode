import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Best_Time_to_Buy_and_Sell_Stock_III_123 {

	public static void main(String[] args) {
		int[] prices = { 1 };
		System.out.println(maxProfit_2(prices));
	}

	// O(nk), O(n)
	public static int maxProfit_1(int[] prices) {
		if (prices == null || prices.length == 0)
			return 0;
		int[] local = new int[3];
		int[] global = new int[3];
		for (int i = 0; i < prices.length - 1; i++) {
			int diff = prices[i + 1] - prices[i];
			for (int j = 2; j >= 1; j--) {
				local[j] = Math.max(global[j - 1] + Math.max(0, diff), local[j] + diff);
				global[j] = Math.max(local[j], global[j]);
			}
		}
		return global[2];
	}

	// O(nk), O(nk)
	public static int maxProfit_2(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int k = 2;
		int[][] global = new int[prices.length][k + 1];
		int[][] local = new int[prices.length][k + 1];
		for (int i = 1; i < prices.length; i++) {
			int diff = prices[i] - prices[i - 1];
			for (int j = 1; j <= k; j++) {
				local[i][j] = Math.max(global[i - 1][j - 1] + Math.max(0, diff), local[i - 1][j] + diff);
				global[i][j] = Math.max(local[i][j], global[i - 1][j]);
			}
		}
		return global[prices.length - 1][2];
	}
}
