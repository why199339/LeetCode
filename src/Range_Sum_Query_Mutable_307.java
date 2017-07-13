
public class Range_Sum_Query_Mutable_307 {

	public static void main(String[] args) {

	}

	private int[] b;
	private int len;
	private int[] nums;

	public Range_Sum_Query_Mutable_307(int[] nums) {
		this.nums = nums;
		double l = Math.sqrt(nums.length);
		len = (int) Math.ceil(nums.length / l);
		b = new int[len];
		for (int i = 0; i < nums.length; i++)
			b[i / len] += nums[i];

	}

	public void update(int i, int val) {
		int b_l = i / len;
		b[b_l] = b[b_l] - nums[i] + val;
		nums[i] = val;
	}

	public int sumRange(int i, int j) {
		int sum = 0;
		int startBlock = i / len;
		int endBlock = j / len;
		if (startBlock == endBlock) {
			for (int k = i; k <= j; k++)
				sum += nums[k];
		} else {
			for (int k = i; k <= (startBlock + 1) * len - 1; k++)
				sum += nums[k];
			for (int k = startBlock + 1; k <= endBlock - 1; k++)
				sum += b[k];
			for (int k = endBlock * len; k <= j; k++)
				sum += nums[k];
		}
		return sum;

	}
}
