
public class Trapping_Rain_Water_42 {

	public static void main(String[] args) {

	}

	public static int trap(int[] height) {
		int maxLeft = 0;
		int maxRight = 0;
		int result = 0;
		int left = 0;
		int right = height.length - 1;
		while (left <= right) {
			maxLeft = Math.max(maxLeft, height[left]);
			maxRight = Math.max(maxRight, height[right]);
			if (maxLeft < maxRight) {
				result += maxLeft - height[left];
				left++;
			} else {
				result += maxRight - height[right];
				right--;
			}
		}
		return result;
	}
}
