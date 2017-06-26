
public class Super_Ugly_Number_313 {

	public static void main(String[] args) {

	}

	public int nthSuperUglyNumber(int n, int[] primes) {
		int[] res = new int[n];
		res[0] = 1;
		int[] cur = new int[primes.length];
		for (int i = 1; i < n; i++) {
			res[i] = Integer.MAX_VALUE;
			for (int j = 0; j < primes.length; j++) {
				if (primes[j] * res[cur[j]] == res[i - 1]) {
					cur[j]++;
				}
				res[i] = Math.min(res[i], primes[j] * res[cur[j]]);
			}
		}
		return res[n - 1];
	}
}
