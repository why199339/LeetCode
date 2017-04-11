
public class Count_Primes_204 {

	public static void main(String[] args) {

	}

	public int countPrimes(int n) {
		if (n < 3) {
			return 0;
		}
		boolean[] isPrime = new boolean[n];
		for (int i = 2; i < n; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i * i < n; i++) {
			if (!isPrime[i]) {
				continue;
			}
			for (int j = i * i; j < n; j += i) {
				isPrime[j] = false;
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (isPrime[i]) {
				count++;
			}
		}
		return count;
	}
}
