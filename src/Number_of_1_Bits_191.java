
public class Number_of_1_Bits_191 {

	public static void main(String[] args) {

		System.out.println(hammingWeight(11));
	}

	// you need to treat n as an unsigned value
	
	//Bit Manipulation Trick: O(1). The run time depends on the number of 1-bits in n. In case of a 32-bit integer
	public static int hammingWeight(int n) {
		int sum = 0;
		while(n != 0) {
			sum++;
			n = n & (n-1);
		}
		return sum;
	}
	
	/*
	 * Loop and Flip: O(1), The run time depends on the number of bits in n, n in this piece of code is a 32-bit integer
	public static int hammingWeight(int n) {
		int bits = 0;
	    int mask = 1;
	    for (int i = 0; i < 32; i++) {
	        if ((n & mask) != 0) {
	            bits++;
	        }
	        mask <<= 1;
	    }
	    return bits;
	}
	 */
	
	/*
	 * own: O(n)
	public static int hammingWeight(int n) {
		String s = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
	*/
}
