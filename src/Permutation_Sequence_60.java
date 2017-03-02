import java.util.ArrayList;
import java.util.List;

public class Permutation_Sequence_60 {

	public static void main(String[] args) {

	}

	public static String getPermutation(int n, int k) {
		List<Integer> numbers = new ArrayList<>();
		int[] factorial = new int[n + 1];
		StringBuffer sb = new StringBuffer();
		// factorial[] = {1, 1, 2, 6, 24, ... n!}
		int sum = 1;
		factorial[0] = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
			factorial[i] = sum;
		}
		// numbers = {1, 2, 3, 4}
		for (int i = 1; i <= n; i++) {
			numbers.add(i);
		}
		k--;
		for (int i = 1; i <= n; i++) {
			int index = k / factorial[n - i];
			sb.append(numbers.get(index));
			numbers.remove(index);
			k = k - index * factorial[n - i];
		}
		return sb.toString();
	}
}
