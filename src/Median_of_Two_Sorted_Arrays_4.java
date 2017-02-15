
public class Median_of_Two_Sorted_Arrays_4 {

	public static void main(String[] args) {
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		if (m > n) {
			int temp = m;
			m = n;
			n = temp;
			int[] t = nums1;
			nums1 = nums2;
			nums2 = t;
		}
		int imin = 0;
		int imax = m;
		int half = (m + n + 1) / 2;
		int maxOfLeft = 0;
		int minOfRight = 0;
		while (imin <= imax) {
			int i = (imin + imax) / 2;
			int j = (m + n + 1) / 2 - i;
			if (i < m && nums1[i] < nums2[j - 1]) {
				imin = i + 1;
			} else if (i > 0 && nums1[i - 1] > nums2[j]) {
				imax = i - 1;
			} else {
				if(i == 0) {
					maxOfLeft = nums2[j - 1];
				} else if (j == 0) {
					maxOfLeft = nums1[i - 1];
				} else {
					maxOfLeft = Math.max(nums1[i - 1], nums2[j - 1]);
				}
				if (((m + n) & 1) == 1) {
					return maxOfLeft;
				}
				if(i == m) {
					minOfRight = nums2[j];
				} else if (j == n) {
					minOfRight = nums1[i];
				} else {
					minOfRight = Math.min(nums1[i], nums2[j]);
				}
				return (maxOfLeft + minOfRight) / 2.0;
			}
		}
		return 0.0;
	}
}
