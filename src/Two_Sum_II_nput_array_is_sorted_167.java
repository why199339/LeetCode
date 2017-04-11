
public class Two_Sum_II_nput_array_is_sorted_167 {

	public static void main(String[] args) {

	}

	public int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length == 0) {
			return null;
		}
		int low = 0;
		int high = numbers.length - 1;
		while (low < high) {
			if (numbers[low] + numbers[high] == target) {
				return new int[] { low + 1, high + 1 };
			} else if (numbers[low] + numbers[high] < target) {
				low++;
			} else {
				high--;
			}
		}
		return null;
	}
}
