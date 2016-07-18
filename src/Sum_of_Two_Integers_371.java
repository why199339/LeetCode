
public class Sum_of_Two_Integers_371 {

	public static void main(String[] args) {

		System.out.println(getSum(1,0));
	}

	// Bit Manipulation 
	public static int getSum(int a, int b) {
		int result = a ^ b;
		int carry = (a & b) << 1;
		if( carry!= 0 ) {
			return getSum(result, carry);
		}
		return result;
	}
	
	/* own
	public static int getSum(int a, int b) {
        return Integer.sum(a, b);
    }
    */
}
