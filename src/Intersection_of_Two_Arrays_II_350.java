import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection_of_Two_Arrays_II_350 {

	public static void main(String[] args) {
		int[] nums1 = { 2, 2, 1, 3 };
		int[] nums2 = { 2, 2 };
		int[] nums3 = intersect(nums1, nums2);
		System.out.println(Arrays.toString(nums3));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
		List<Integer> intersect = new ArrayList<>();
		for (Integer i : nums1) {
			list.add(i);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (list.contains(nums2[i])) {
				intersect.add(nums2[i]);
				list.remove(list.indexOf(nums2[i]));
			}
		}
		int[] result = new int[intersect.size()];
		int i = 0;
		for (Integer num : intersect) {
			result[i++] = num;
		}
		return result;
	}
}
