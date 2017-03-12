
public class Recover_Binary_Search_Tree_99 {

	static TreeNode prev = new TreeNode(Integer.MIN_VALUE);
	static TreeNode first = null;
	static TreeNode second = null;

	public static void main(String[] args) {

	}

	public static void recoverTree(TreeNode root) {
		find(root);
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}

	private static void find(TreeNode root) {
		if (root == null) {
			return;
		}
		find(root.left);
		if (first == null && prev.val >= root.val) {
			first = prev;
		}
		if (first != null && prev.val >= root.val) {
			second = root;
		}
		prev = root;
		find(root.right);
	}
}
