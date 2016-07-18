
public class Single_Number_136 {

	public static void main(String[] args) {
		int[] n = {2,7,0,3,6,4,0,2,7,3,6};
		System.out.println(singleNumber(n));
	}

	public static int singleNumber(int[] nums) {
        int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		return result;
    }
}
