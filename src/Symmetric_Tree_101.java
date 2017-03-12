import java.util.LinkedList;
import java.util.Queue;

public class Symmetric_Tree_101 {

	public static void main(String[] args) {

	}

	public static boolean isSymmetric_Iterative(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode t1 = queue.poll();
			TreeNode t2 = queue.poll();
			if (t1 == null && t2 == null) {
				continue;
			}
			if (t1 == null || t2 == null) {
				return false;
			}
			if (t1.val != t2.val) {
				return false;
			}
			queue.add(t1.left);
			queue.add(t2.right);
			queue.add(t1.right);
			queue.add(t2.left);
		}
		return true;
	}

	public static boolean isSymmetric_Recursive(TreeNode root) {
		return isMirror(root, root);
	}

	private static boolean isMirror(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null || right == null) {
			return false;
		}
		if (left.val != right.val) {
			return false;
		}
		return isMirror(left.left, right.right) && isMirror(left.right, right.left);
	}
}
