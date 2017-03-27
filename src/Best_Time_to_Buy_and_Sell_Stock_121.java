import java.util.Stack;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

	public static void main(String[] args) {
		int[] prices1 = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices1));
		int[] prices2 = { 7, 6, 4, 3, 1 };
		System.out.println(maxProfit(prices2));
	}

	// O(n), O(1)
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else if (prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}
		return maxProfit;
	}

	// O(n^2), O(1)
	public static int maxProfit_brute_force(int[] prices) {
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if ((prices[j] - prices[i]) > max) {
					max = prices[j] - prices[i];
				}
			}
		}
		return max;
	}
}
