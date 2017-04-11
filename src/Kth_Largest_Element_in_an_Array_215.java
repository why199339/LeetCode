import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class Kth_Largest_Element_in_an_Array_215 {

	public static void main(String[] args) {

	}

	// O(n), O(1)
	public int findKthLargest_Partition_shuffle(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 1) {
			return 0;
		}
		shuffle(nums);
		int N = nums.length;
		int start = 0;
		int end = nums.length - 1;
		int index = Partition(nums, start, end);
		while (index != N - k) {
			if (index > N - k) {
				index = Partition(nums, start, index - 1);
			} else {
				index = Partition(nums, index + 1, end);
			}
		}
		return nums[index];
	}

	private void shuffle(int[] nums) {
		Random random = new Random();
		for (int i = 1; i < nums.length; i++) {
			int r = random.nextInt(i + 1);
			int temp = nums[i];
			nums[i] = nums[r];
			nums[r] = temp;
		}
	}

	// O(N) best, O(N^2) worst, O(1)
	public int findKthLargest_Partition(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 1) {
			return 0;
		}
		int N = nums.length;
		int start = 0;
		int end = nums.length - 1;
		int index = Partition(nums, start, end);
		while (index != N - k) {
			if (index > N - k) {
				index = Partition(nums, start, index - 1);
			} else {
				index = Partition(nums, index + 1, end);
			}
		}
		return nums[index];
	}

	private int Partition(int[] nums, int start, int end) {
		int index = (int) (start + Math.random() * (end - start + 1));
		int small = start - 1;
		int temp = nums[end];
		nums[end] = nums[index];
		nums[index] = temp;
		for (int i = start; i < end; i++) {
			if (nums[i] < nums[end]) {
				small++;
				if (small != i) {
					temp = nums[small];
					nums[small] = nums[i];
					nums[i] = temp;
				}
			}
		}
		small++;
		temp = nums[end];
		nums[end] = nums[small];
		nums[small] = temp;
		return small;
	}

	// O(NlogK), O(K)
	public int findKthLargest_PriorityQueue(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 1) {
			return 0;
		}
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < nums.length; i++) {
			queue.add(nums[i]);
			if (queue.size() > k) {
				queue.poll();
			}
		}
		return queue.peek();
	}

	// O(NlogN), O(1)
	public int findKthLargest_sort(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 1) {
			return 0;
		}
		int N = nums.length;
		Arrays.sort(nums);
		return nums[N - k];
	}

}
