
public class Perfect_Number_507 {

	public static void main(String[] args) {

	}

	// O(sqrt(n)), O(1)
	public boolean checkPerfectNumber(int num) {
		if(num <= 0) {
			return false;
		}
		int sum = 0;
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				sum += i;
				if (i * i < num) {
					sum += num / i;
				}
			}
		}
		return sum - num == num;
	}
}
