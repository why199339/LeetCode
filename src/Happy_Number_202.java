import java.util.HashSet;
import java.util.Set;

public class Happy_Number_202 {

	public static void main(String[] args) {

	}

	// Floyd Cycle detection algorithm
	public static boolean isHappy(int n) {
		int slow, fast;
		slow = fast = n;
		do {
			slow = digitSquareSum(slow);
			fast = digitSquareSum(fast);
			fast = digitSquareSum(fast);
		} while (slow != fast);
		if (slow == 1)
			return true;
		else
			return false;
	}

	private static int digitSquareSum(int n) {
		int sum = 0, tmp;
		while (n != 0) {
			tmp = n % 10;
			sum += tmp * tmp;
			n /= 10;
		}
		return sum;
	}

	// HashSet
	public static boolean isHappy_hashSet(int n) {
		Set<Integer> inLoop = new HashSet<Integer>();
		int squareSum, remain;
		while (inLoop.add(n)) {
			squareSum = 0;
			while (n > 0) {
				remain = n % 10;
				squareSum += remain * remain;
				n /= 10;
			}
			if (squareSum == 1)
				return true;
			else
				n = squareSum;
		}
		return false;
	}

}
