
public class Balanced_Binary_Tree_110 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		System.out.println(isBalanced(root));
	}

	public static boolean isBalanced(TreeNode root) {
		return dfsHeight (root) != -1;
	}

	private static int dfsHeight(TreeNode root) {
		if (root == null)
			return 0;
		int leftHeight = dfsHeight(root.left);
		if (leftHeight == -1)
			return -1;
		int rightHeight = dfsHeight(root.right);
		if (rightHeight == -1)
			return -1;
		if (Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	
	
	/* O(n^2)
	public static boolean isBalanced(TreeNode root) {
        if(root == null) {
        	return true;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if(left - right > 1 || right - left > 1) {
        	return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

	private static int depth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(depth(root.left), depth(root.right));
	}
	*/
}
