
public class Climbing_Stairs_70 {

	public static void main(String[] args) {

		System.out.println(climbStairs_Fibonacci(4));
	}

	// O(n),O(1)
	public static int climbStairs_Fibonacci(int n) {
		if (n == 1) {
			return 1;
		}
		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}

	// O(n),O(n)
	public static int climbStairs_dp(int n) {
		int[] ways = new int[n];
		if (n == 1) {
			return 1;
		}
		ways[0] = 1;
		ways[1] = 2;
		for (int i = 2; i < n; i++) {
			ways[i] = ways[i - 1] + ways[i - 2];
		}
		return ways[n - 1];
	}

}
