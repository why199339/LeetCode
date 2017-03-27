
public class Binary_Tree_Maximum_Path_Sum_124 {

	int maxValue = Integer.MIN_VALUE;

	public static void main(String[] args) {

	}

	public int maxPathSum(TreeNode root) {
		maxPathDown(root);
		return maxValue;
	}

	private int maxPathDown(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = Math.max(0, maxPathDown(root.left));
		int right = Math.max(0, maxPathDown(root.right));
		maxValue = Math.max(maxValue, left + right + root.val);
		return Math.max(left, right) + root.val;
	}

}
