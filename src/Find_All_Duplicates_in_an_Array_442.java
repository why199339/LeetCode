import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array_442 {

	public static void main(String[] args) {

	}

	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] < 0) {
				res.add(Math.abs(index + 1));
			}
			nums[index] = -nums[index];
		}
		return res;
	}
}
