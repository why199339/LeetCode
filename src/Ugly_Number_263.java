
public class Ugly_Number_263 {

	public static void main(String[] args) {

		System.out.println(isUgly(6));
		System.out.println(isUgly(8));
		System.out.println(isUgly(14));
		System.out.println(isUgly(16));
	}

	public static boolean isUgly(int num) {
		if(num > 0) {
			for(int i : new int[] {2,3,5}) {
				while(num % i == 0) {
					num = num / i;
				}
			}
		}
		return num == 1;
    }
}
