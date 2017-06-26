
public class Binary_Tree_Tilt_563 {

	public static void main(String[] args) {

	}

	int tilt = 0;

	public int findTilt(TreeNode root) {
		traverse(root);
		return tilt;
	}

	private int traverse(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = traverse(root.left);
		int right = traverse(root.right);
		tilt += Math.abs(left - right);
		return left + right + root.val;
	}

	public int findTilt_own(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftSum = sum(root.left);
		int rightSum = sum(root.right);
		int res = Math.abs(leftSum - rightSum);
		return res + findTilt_own(root.left) + findTilt_own(root.right);
	}

	private int sum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return root.val + sum(root.left) + sum(root.right);
	}
}
