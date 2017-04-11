import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths_257 {

	public static void main(String[] args) {

	}

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<String>();
		if (root == null) {
			return list;
		}
		backtrack(root, list, "");
		return list;
	}

	private void backtrack(TreeNode root, List<String> list, String s) {
		if (root.left == null && root.right == null) {
			list.add(s + root.val);
		}
		if (root.left != null) {
			backtrack(root.left, list, s + root.val + "->");
		}
		if (root.right != null) {
			backtrack(root.right, list, s + root.val + "->");
		}
	}
}
