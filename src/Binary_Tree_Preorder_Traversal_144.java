import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Preorder_Traversal_144 {

	public static void main(String[] args) {

	}

	public List<Integer> preorderTraversal_best(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		TreeNode cur1 = root;
		TreeNode cur2 = null;
		while(cur1 != null) {
			cur2 = cur1.left;
			if(cur2 != null) {
				while(cur2.right != null && cur2.right != cur1) {
					cur2 = cur2.right;
				}
				if(cur2.right == null) {
					cur2.right = cur1;
					list.add(cur1.val);
					cur1 = cur1.left;
					continue;
				} else {
					cur2.right = null;
				}
			} else {
				list.add(cur1.val);
			}
			cur1 = cur1.right;
		}
		return list;
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		if (root != null) {
			Stack<TreeNode> stack = new Stack<>();
			stack.add(root);
			while (!stack.isEmpty()) {
				root = stack.pop();
				list.add(root.val);
				if (root.right != null) {
					stack.push(root.right);
				}
				if (root.left != null) {
					stack.push(root.left);
				}
			}
		}
		return list;
	}
}
