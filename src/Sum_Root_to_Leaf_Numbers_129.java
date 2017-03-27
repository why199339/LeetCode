
public class Sum_Root_to_Leaf_Numbers_129 {

	public static void main(String[] args) {

	}

	public static int sumNumbers(TreeNode root) {
		return sum(root, 0);
	}

	public static int sum(TreeNode root, int s) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return s * 10 + root.val;
		}
		return sum(root.left, s * 10 + root.val) + sum(root.right, s * 10 + root.val);
	}
}
