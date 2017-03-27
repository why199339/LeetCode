
public class Best_Time_to_Buy_and_Sell_Stock_II_122 {

	public static void main(String[] args) {

	}

	// O(n), O(1)
	public static int maxProfit_valley_peak(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int maxProfit = 0;
		int i = 0;
		int valley = prices[0];
		int peak = prices[0];
		while (i < prices.length - 1) {
			while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
				i++;
			}
			valley = prices[i];
			while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
				i++;
			}
			peak = prices[i];
			maxProfit += peak - valley;
		}
		return maxProfit;
	}

	// O(n), O(1)
	public static int maxProfit_summation(int[] prices) {
		if (prices == null) {
			return 0;
		}
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				maxProfit += prices[i] - prices[i - 1];
			}
		}
		return maxProfit;
	}
}
