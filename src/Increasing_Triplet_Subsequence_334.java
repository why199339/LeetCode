
public class Increasing_Triplet_Subsequence_334 {

	public static void main(String[] args) {

	}

	public boolean increasingTriplet(int[] nums) {
		int small = Integer.MAX_VALUE;
		int big = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num <= small) {
				small = num;
			} else if (num <= big) {
				big = num;
			} else {
				return true;
			}
		}
		return false;
	}
}
