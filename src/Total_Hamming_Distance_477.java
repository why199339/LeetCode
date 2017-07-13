
public class Total_Hamming_Distance_477 {

	public static void main(String[] args) {

	}

	public int totalHammingDistance(int[] nums) {
		int res = 0;
		int n = nums.length;
		for (int j = 0; j < 32; j++) {
			int diff = 0;
			for (int i = 0; i < nums.length; i++) {
				diff += (nums[i] >> j) & 1;
			}
			res += diff * (n - diff);
		}
		return res;
	}
}
