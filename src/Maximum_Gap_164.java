import java.util.Arrays;

public class Maximum_Gap_164 {

	public static void main(String[] args) {

	}

	public int maximumGap_bucket(int[] nums) {
		if (nums == null || nums.length < 2)
			return 0;
		// get the max and min value of the array
		int min = nums[0];
		int max = nums[0];
		for (int i : nums) {
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		// the minimum possibale gap, ceiling of the integer division
		int gap = (int) Math.ceil((double) (max - min) / (nums.length - 1));
		int[] bucketsMIN = new int[nums.length - 1]; // store the min value in that bucket
		int[] bucketsMAX = new int[nums.length - 1]; // store the max value in that bucket
		Arrays.fill(bucketsMIN, Integer.MAX_VALUE);
		Arrays.fill(bucketsMAX, Integer.MIN_VALUE);
		// put numbers into buckets
		for (int i : nums) {
			if (i == min || i == max)
				continue;
			int idx = (i - min) / gap; // index of the right position in the buckets
			bucketsMIN[idx] = Math.min(i, bucketsMIN[idx]);
			bucketsMAX[idx] = Math.max(i, bucketsMAX[idx]);
		}
		// scan the buckets for the max gap
		int maxGap = Integer.MIN_VALUE;
		int previous = min;
		for (int i = 0; i < nums.length - 1; i++) {
			if (bucketsMIN[i] == Integer.MAX_VALUE && bucketsMAX[i] == Integer.MIN_VALUE)
				// empty bucket
				continue;
			// min value minus the previous value is the current gap
			maxGap = Math.max(maxGap, bucketsMIN[i] - previous);
			// update previous bucket value
			previous = bucketsMAX[i];
		}
		maxGap = Math.max(maxGap, max - previous); // updata the final max value gap
		return maxGap;
	}

	public int maximumGap_radixSort(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		int maxNum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			maxNum = Math.max(maxNum, nums[i]);
		}
		int exp = 1;
		int base = 10;
		int[] aux = new int[nums.length];
		while (maxNum / exp > 0) {
			int[] count = new int[base];
			for (int i = 0; i < nums.length; i++) {
				count[nums[i] / exp % 10]++;
			}
			for (int i = 1; i < count.length; i++) {
				count[i] = count[i - 1] + count[i];
			}
			for (int i = nums.length - 1; i >= 0; i--) {
				aux[--count[nums[i] / exp % 10]] = nums[i];
			}
			for (int i = 0; i < nums.length; i++) {
				nums[i] = aux[i];
			}
			exp = exp * 10;
		}
		int max = 0;
		for (int i = 1; i < nums.length; i++) {
			max = Math.max(max, nums[i] - nums[i - 1]);
		}
		return max;
	}
}
