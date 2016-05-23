
public class Single_Number_II_137 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 4, 3, 2, 2, 3, 2, 3 };
		int num = singleNumber(nums);
		System.out.println(num);
	}

	public static int singleNumber(int[] nums) {
		int[] count = new int[32];
		int result = 0;
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < nums.length; j++) {
				count[i] += ((nums[j] >> i) & 1); 
				count[i] = count[i] % 3; 
			}
			result |= (count[i] << i);
		}
		return result;
		
//		int na = 0, nb = 0, nc = 0;
//	    for(int i = 0; i < n; i++){
//	        nb = nb ^ (A[i] & na);
//	        na = (na ^ A[i]) & ~nc;
//	        nc = nc ^ (A[i] & ~na & ~nb);
//	    }
//	    return na & ~nb & ~nc;
	}
}
