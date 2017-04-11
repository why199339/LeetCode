
public class Product_of_Array_Except_Self_238 {

	public static void main(String[] args) {

	}

	public int[] productExceptSelf_2(int[] nums) {
		int[] arr = new int[nums.length];
		arr[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			arr[i] = nums[i - 1] * arr[i - 1];
		}
		int temp = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			temp = temp * nums[i + 1];
			arr[i] = arr[i] * temp;
		}
		return arr;
	}
}
