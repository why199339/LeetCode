import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element_169 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 1, 1, 1 };
		System.out.println(majorityElement(nums));
	}

	// Moore voting algorithm
	public static int majorityElement(int[] num) {
		int major = num[0], count = 1;
		for (int i = 1; i < num.length; i++) {
			if (count == 0) {
				count++;
				major = num[i];
			} else if (major == num[i]) {
				count++;
			} else
				count--;
		}
		return major;
	}

	public int majorityElement_sort(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		return nums[len / 2];
	}

	public static int majorityElement_hashTable(int[] nums) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		int ret = 0;
		for (int num : nums) {
			if (!myMap.containsKey(num))
				myMap.put(num, 1);
			else
				myMap.put(num, myMap.get(num) + 1);
			if (myMap.get(num) > nums.length / 2) {
				ret = num;
				break;
			}
		}
		return ret;
	}

}
