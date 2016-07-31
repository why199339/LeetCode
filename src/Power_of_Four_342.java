
public class Power_of_Four_342 {

	public static void main(String[] args) {
		int num = 2;
		System.out.println(isPowerOfFour(num));
	}

	public static boolean isPowerOfFour(int num) {
		return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
	}
	
	/*
	public static boolean isPowerOfFour(int num) {
		return Integer.toString(num, 4).matches("^10*$");
	}
	*/
	/*
	public static boolean isPowerOfFour(int num) {
		return (Math.log10(num) / Math.log10(4)) % 1 == 0;
	}
	*/
	
	/*
	public static boolean isPowerOfFour(int num) {
        if(num > 0) {
        	while(num % 4 == 0) {
        		num = num / 4;
        	}
        }
        return num == 1;
    }
    */
}
