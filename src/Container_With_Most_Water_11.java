
public class Container_With_Most_Water_11 {

	public static void main(String[] args) {
		int[] height = { 1, 2, 1 };
		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {
		int max = 0;
		int low = 0;
		int high = height.length - 1;
		while(low < high) {
			int temp = (high - low) * Math.min(height[low], height[high]);
			if(temp > max) {
				max = temp;
			}
			if(height[low] <= height[high]) {
				low ++;
			}
			else {
				high --;
			}
		}
		return max;
	}
}
