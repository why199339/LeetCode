import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II_229 {

	public static void main(String[] args) {

	}

	public List<Integer> majorityElement(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return list;
		}
		int count1 = 0;
		int count2 = 0;
		int number1 = nums[0];
		int number2 = nums[0];
		for (int num : nums) {
			if (num == number1) {
				count1++;
			} else if (num == number2) {
				count2++;
			} else if (count1 == 0) {
				number1 = num;
				count1 = 1;
			} else if (count2 == 0) {
				number2 = num;
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for (int num : nums) {
			if (num == number1) {
				count1++;
			} else if (num == number2) {
				count2++;
			}
		}
		if (count1 > nums.length / 3) {
			list.add(number1);
		}
		if (count2 > nums.length / 3) {
			list.add(number2);
		}
		return list;
	}
}
