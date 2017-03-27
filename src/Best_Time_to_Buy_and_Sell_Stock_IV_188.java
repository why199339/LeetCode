
public class Best_Time_to_Buy_and_Sell_Stock_IV_188 {

	public static void main(String[] args) {

	}

	public int maxProfit(int k, int[] prices) {
		if (prices.length < 2 || k < 1) {
			return 0;
		}
		if (k > prices.length / 2) {
			int sum = 0;
			for (int i = 1; i < prices.length; i++) {
				if (prices[i] > prices[i - 1]) {
					sum += prices[i] - prices[i - 1];
				}
			}
			return sum;
		}
		int[] local = new int[k + 1];
		int[] global = new int[k + 1];
		for (int i = 0; i < prices.length - 1; i++) {
			int diff = prices[i + 1] - prices[i];
			for (int j = k; j >= 1; j--) {
				local[j] = Math.max(global[j - 1] + Math.max(0, diff), local[j] + diff);
				global[j] = Math.max(local[j], global[j]);
			}
		}
		return global[k];
	}
}
