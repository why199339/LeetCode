import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges_228 {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 4, 5, 7 };
		System.out.println(summaryRanges(nums));
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		if (nums.length == 1) {
			list.add(nums[0] + "");
			return list;
		}
		for (int i = 0; i < nums.length; i++) {
			int a = nums[i];
			while (i < nums.length - 1 && (nums[i + 1] - nums[i]) == 1) {
				i++;
			}
			if (a != nums[i]) {
				list.add(a + "->" + nums[i]);
			} else {
				list.add(a + "");
			}
		}
		return list;
	}

	public static List<String> summaryRanges_own(int[] nums) {
		List<String> list = new ArrayList<String>();
		if (nums == null || nums.length == 0) {
			return list;
		}
		int start = 0;
		int end = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] != 1) {
				if (start != end) {
					String s = nums[start] + "->" + nums[end];
					list.add(s);
				} else {
					String s = String.valueOf(nums[start]);
					list.add(s);
				}
				start = i;
				end = i;
			} else {
				end++;
			}
		}
		if (start != end) {
			String s = nums[start] + "->" + nums[end];
			list.add(s);
		} else {
			String s = String.valueOf(nums[start]);
			list.add(s);
		}
		return list;

	}
}
