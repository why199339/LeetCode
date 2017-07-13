
public class Sum_of_Two_Integers_371 {

	public static void main(String[] args) {

		System.out.println(getSum_1(1,0));
	}

	// Bit Manipulation 
	public static int getSum_1(int a, int b) {
		int result = a ^ b;
		int carry = (a & b) << 1;
		if( carry != 0 ) {
			return getSum_1(result, carry);
		}
		return result;
	}
	
	public static int getSum_2(int a, int b) {
		int sum = a;
		while(b != 0) {
			sum = a ^ b;
			b = (a & b) << 1;
			a = sum;
		}
		return sum;
	}
	
	public static int getSum_own(int a, int b) {
        return Integer.sum(a, b);
    }
}
