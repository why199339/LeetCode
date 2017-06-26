
public class Minimum_Moves_to_Equal_Array_Elements_453 {

	public static void main(String[] args) {

	}

	public int minMoves(int[] nums) {
		int min = nums[0];
		int res = 0;
		for (int num : nums) {
			min = Math.min(num, min);
		}
		for (int num : nums) {
			res += num - min;
		}
		return res;
	}
}
