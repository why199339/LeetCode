import java.util.Arrays;
import java.util.Comparator;

public class Largest_Number_179 {

	public static void main(String[] args) {
		int[] nums = { 0, 0 };
		System.out.println(largestNumber(nums));
	}

	public static String largestNumber(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		String[] str = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			str[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String s1s2 = s1 + s2;
				String s2s1 = s2 + s1;
				return s2s1.compareTo(s1s2);
			}
		});
		if (str[0].equals("0")) {
			return "0";
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i]);
		}
		return sb.toString();
	}
}
