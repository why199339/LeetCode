import java.util.Arrays;

public class Candy_135 {

	public static void main(String[] args) {
		int[] ratings = { 1, 2 };
		System.out.println(candy_twoArrays(ratings));
	}

	// O(n), O(1)
	public int candy(int[] ratings) {
		if (ratings.length < 1) {
			return ratings.length;
		}
		int candies = 0;
		int up = 0;
		int down = 0;
		int old_slope = 0;
		for (int i = 1; i < ratings.length; i++) {
			int new_slope = (ratings[i] > ratings[i - 1]) ? 1 : ((ratings[i] < ratings[i - 1]) ? -1 : 0);
			if ((old_slope > 0 && new_slope == 0) || (old_slope < 0 && new_slope >= 0)) {
				candies += count(up) + count(down) + Math.max(up, down);
				up = 0;
				down = 0;
			}
			if (new_slope > 0) {
				up++;
			}
			if (new_slope < 0) {
				down++;
			}
			if (new_slope == 0) {
				candies++;
			}
			old_slope = new_slope;
		}
		candies += count(up) + count(down) + Math.max(up, down) + 1;
		return candies;
	}

	private int count(int n) {
		return n * (n + 1) / 2;
	}

	// O(n), O(n)
	public int candy_oneArray(int[] ratings) {
		int[] candies = new int[ratings.length];
		Arrays.fill(candies, 1);
		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candies[i] = candies[i - 1] + 1;
			}
		}
		int sum = candies[ratings.length - 1];
		for (int i = ratings.length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				candies[i] = Math.max(candies[i], candies[i + 1] + 1);
			}
			sum += candies[i];
		}
		return sum;
	}

	// O(n), O(n)
	public static int candy_twoArrays(int[] ratings) {
		int sum = 0;
		int[] left2right = new int[ratings.length];
		int[] right2left = new int[ratings.length];
		Arrays.fill(left2right, 1);
		Arrays.fill(right2left, 1);
		for (int i = 1; i < left2right.length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				left2right[i] = left2right[i - 1] + 1;
			}
		}
		for (int i = right2left.length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				right2left[i] = right2left[i + 1] + 1;
			}
		}
		for (int i = 0; i < left2right.length; i++) {
			sum += Math.max(left2right[i], right2left[i]);
		}
		return sum;
	}
}
