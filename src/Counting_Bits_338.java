import java.util.Arrays;

public class Counting_Bits_338 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(countBits(i)));
		}
	}
	
	/*
	public static int[] countBits(int num) {
        int[] array = new int[num + 1];
		for (int i=0; i<=num; i++) {
        	int count = 0;
        	char[] charArray = Integer.toBinaryString(i).toCharArray();
        	for (char c : charArray) {
				if(c == '1') {
					count ++;
				}
			}
        	array[i] = count;
        }
		return array;
		
    }
	*/
	
	public static int[] countBits(int num) {
		int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) 
        	f[i] = f[i >> 1] + (i & 1);
        return f;
	}
}
