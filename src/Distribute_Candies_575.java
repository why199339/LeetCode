import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distribute_Candies_575 {

	public static void main(String[] args) {

	}

	// O(N), O(N)
	public int distributeCandies_set(int[] candies) {
		Set<Integer> set = new HashSet<>();
		for (int candy : candies) {
			set.add(candy);
		}
		return Math.min(candies.length / 2, set.size());
	}

	// O(N*logN), O(1)
	public int distributeCandies_sort(int[] candies) {
		Arrays.sort(candies);
		int count = 1;
		for (int i = 1; i < candies.length && count < candies.length / 2; i++) {
			if (candies[i] > candies[i - 1]) {
				count++;
			}
		}
		return count;
	}
}
