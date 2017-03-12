
public class Convert_Sorted_Array_to_Binary_Search_Tree_108 {

	public static void main(String[] args) {

	}

	public TreeNode sortedArrayToBST_better(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		return build_better(nums, 0, nums.length - 1);
	}

	private TreeNode build_better(int[] nums, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = (low + high) / 2;
		TreeNode root = new TreeNode(mid);
		root.left = build_better(nums, low, mid - 1);
		root.right = build_better(nums, mid + 1, high);
		return root;
	}

	public TreeNode sortedArrayToBST_own(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		return build_own(nums, 0, nums.length - 1);
	}

	private TreeNode build_own(int[] nums, int start, int end) {
		if (start == end) {
			return new TreeNode(nums[start]);
		}
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		if (mid > start) {
			root.left = build_own(nums, start, mid - 1);
		}
		if (mid < end) {
			root.right = build_own(nums, mid + 1, end);
		}
		return root;
	}
}
