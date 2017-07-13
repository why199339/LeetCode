
public class Merge_Sorted_Array_88 {

	public static void main(String[] args) {
		int[] nums1 = new int[10];
		nums1[0] = 1;
		nums1[1] = 3;
		nums1[2] = 4;
		int[] nums2 = { 2, 3, 5 };
		merge(nums1, 3, nums2, 3);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int p = m - 1;
		int q = n - 1;
		int r = m + n - 1;
		while (p >= 0 && q >= 0) {
			if (nums1[p] >= nums2[q]) {
				nums1[r--] = nums1[p--];
			} else {
				nums1[r--] = nums2[q--];
			}
		}
		while (q >= 0) {
			nums1[r--] = nums2[q--];
		}
	}

}
