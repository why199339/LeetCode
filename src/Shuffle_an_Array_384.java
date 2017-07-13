import java.util.Random;

public class Shuffle_an_Array_384 {

	int[] nums;
	Random random;

	public Shuffle_an_Array_384(int[] nums, Random random) {
		this.nums = nums;
		this.random = random;
	}

	public int[] reset() {
		return nums;
	}

	public int[] shuffle() {
		if (nums == null) {
			return null;
		}
		int[] copy = nums.clone();
		for (int i = 1; i < copy.length; i++) {
			int j = random.nextInt(i + 1);
			swap(copy, i, j);
		}
		return copy;
	}

	private void swap(int[] copy, int i, int j) {
		int temp = copy[i];
		copy[i] = copy[j];
		copy[j] = temp;
	}

}
