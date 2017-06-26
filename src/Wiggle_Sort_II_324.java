
public class Wiggle_Sort_II_324 {

	public static void main(String[] args) {

	}

	public void wiggleSort(int[] nums) {
		int median = findKthLargest(nums, (nums.length + 1) / 2);
		int odd = 1;
		int even = nums.length % 2 == 0 ? nums.length - 2 : nums.length - 1;
		int[] tmpArr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > median) {
				tmpArr[odd] = nums[i];
				odd += 2;
				continue;
			}
			if (nums[i] < median) {
				tmpArr[even] = nums[i];
				even -= 2;
				continue;
			}
		}
		while (odd < nums.length) {
			tmpArr[odd] = median;
			odd += 2;
		}
		while (even >= 0) {
			tmpArr[even] = median;
			even -= 2;
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = tmpArr[i];
		}
	}

	private int findKthLargest(int[] nums, int k) {
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

}
