import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Postorder_Traversal_145 {

	public static void main(String[] args) {

	}

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		while (!stack.isEmpty() || root != null) {
			if (root != null) {
				list.add(root.val);
				stack.push(root);
				root = root.right;
			} else {
				root = stack.pop().left;
			}
		}
		Collections.reverse(list);
		return list;
	}
}
