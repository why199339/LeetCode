
public class Sum_of_Left_Leaves_404 {

	public static void main(String[] args) {

	}

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null)
			return 0;
		int ans = 0;
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null)
				ans += root.left.val;
			else
				ans += sumOfLeftLeaves(root.left);
		}
		ans += sumOfLeftLeaves(root.right);
		return ans;
	}

	public int sumOfLeftLeaves_own(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int[] sum = new int[1];
		return traverse(root, sum, false);
	}

	private int traverse(TreeNode root, int[] sum, boolean flag) {
		if (root.left == null && root.right == null) {
			if (flag)
				sum[0] += root.val;
			return sum[0];
		}
		if (root.left != null) {
			traverse(root.left, sum, true);
		}
		if (root.right != null) {
			traverse(root.right, sum, false);
		}
		return sum[0];
	}
}
