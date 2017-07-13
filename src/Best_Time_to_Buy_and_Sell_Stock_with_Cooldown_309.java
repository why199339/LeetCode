
public class Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309 {

	public static void main(String[] args) {

	}

	public int maxProfit(int[] prices) {
		int sell = 0;
		int prev_sell = 0;
		int buy = Integer.MIN_VALUE;
		int prev_buy;
		for (int price : prices) {
			prev_buy = buy;
			buy = Math.max(prev_sell - price, prev_buy);
			prev_sell = sell;
			sell = Math.max(prev_buy + price, prev_sell);
		}
		return sell;
	}

	public int maxProfit_better(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int n = prices.length;
		int[] s0 = new int[n];
		int[] s1 = new int[n];
		int[] s2 = new int[n];
		s0[0] = 0;
		s1[0] = -prices[0];
		s2[0] = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++) {
			s0[i] = Math.max(s0[i - 1], s2[i - 1]);
			s1[i] = Math.max(s1[i - 1], s0[i - 1] - prices[i]);
			s2[i] = s1[i - 1] + prices[i];
		}
		return Math.max(s0[n - 1], s2[n - 1]);
	}
}
