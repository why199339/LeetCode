
public class Ugly_Number_II_264 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(nthUglyNumber(i));
		}
	}

	public static int nthUglyNumber(int n) {
		if (n <= 0) {
			return 0;
		}
		int[] ugly = new int[n];
		ugly[0] = 1;
		int index2 = 0, index3 = 0, index5 = 0;
		int factor2 = 2, factor3 = 3, factor5 = 5;
		for (int i = 1; i < n; i++) {
			int min = Math.min(Math.min(factor2, factor3), factor5);
			ugly[i] = min;
			if (factor2 == min)
				factor2 = 2 * ugly[++index2];
			if (factor3 == min)
				factor3 = 3 * ugly[++index3];
			if (factor5 == min)
				factor5 = 5 * ugly[++index5];
		}
		return ugly[n - 1];
	}
	
	/* Time Limit Exceeded 
	public static int nthUglyNumber(int n) {
		if(n < 0) {
			return 0;
		}
		int count = 0;
		int number = 0;
		while(count != n) {
			number ++;
			if(isUgly(number)) {
				count ++;
			}
		}
		return number;
    }
	
	private static boolean isUgly(int number) {
		while(number % 2 == 0) {
			number = number / 2;
		}
		while(number % 3 == 0) {
			number = number / 3;
		}
		while(number % 5 == 0) {
			number = number / 5;
		}
		return number == 1;
	}
	*/
}
