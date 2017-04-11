import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Preorder_Traversal_144 {

	public static void main(String[] args) {

	}

	public List<Integer> preorderTraversal(TreeNode root) {
		Stack<TreeNode> rights = new Stack<>();
		List<Integer> list = new ArrayList<>();
		while (root != null) {
			list.add(root.val);
			if (root.right != null) {
				rights.push(root.right);
			}
			root = root.left;
			if (root == null && !rights.isEmpty()) {
				root = rights.pop();
			}
		}
		return list;
	}
}
