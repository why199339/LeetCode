
public class Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309 {

	public static void main(String[] args) {

	}

	public int maxProfit(int[] prices) {
		int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
		for (int price : prices) {
			prev_buy = buy;
			buy = Math.max(prev_sell - price, prev_buy);
			prev_sell = sell;
			sell = Math.max(prev_buy + price, prev_sell);
		}
		return sell;
	}
}
