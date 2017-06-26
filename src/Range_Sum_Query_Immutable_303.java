import java.util.HashMap;
import java.util.Map;

public class Range_Sum_Query_Immutable_303 {

	public static void main(String[] args) {

	}

	private int[] sum;

	public Range_Sum_Query_Immutable_303(int[] nums) {
		sum = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			sum[i + 1] = sum[i] + nums[i];
		}
	}

	public int sumRange(int i, int j) {
		return sum[j + 1] - sum[i];
	}

}
