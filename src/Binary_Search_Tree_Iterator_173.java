import java.util.Stack;

public class Binary_Search_Tree_Iterator_173 {

	Stack<TreeNode> stack = new Stack<TreeNode>();

	public static void main(String[] args) {

	}

	public Binary_Search_Tree_Iterator_173(TreeNode root) {
		pushAll(root);
	}

	private void pushAll(TreeNode root) {
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	/** @return the next smallest number */
	public int next() {
		TreeNode node = stack.pop();
		pushAll(node.right);
		return node.val;
	}
}
