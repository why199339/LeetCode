import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Inorder_Traversal_94 {

	public static void main(String[] args) {

	}

	public static List<Integer> inorderTraversal_best(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		TreeNode cur1 = root;
		TreeNode cur2 = null;
		while (cur1 != null) {
			cur2 = cur1.left;
			if (cur2 != null) {
				while (cur2.right != null && cur2.right != cur1) {
					cur2 = cur2.right;
				}
				if (cur2.right == null) {
					cur2.right = cur1;
					cur1 = cur1.left;
					continue;
				} else {
					cur2.right = null;
				}
			}
			list.add(cur1.val);
			cur1 = cur1.right;
		}
		return list;
	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		while (cur != null || !stack.isEmpty()) {
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			list.add(cur.val);
			cur = cur.right;
		}
		return list;
	}

}
