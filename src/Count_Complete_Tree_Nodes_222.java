
public class Count_Complete_Tree_Nodes_222 {

	public static void main(String[] args) {

	}

	public int countNodes(TreeNode root) {
		int nodes = 0;
		int h = height(root);
		while (root != null) {
			if (height(root.right) == h - 1) {
				nodes += 1 << h;
				root = root.right;
			} else {
				nodes += 1 << h - 1;
				root = root.left;
			}
			h--;
		}
		return nodes;
	}

	private int height(TreeNode root) {
		if (root == null) {
			return -1;
		}
		return 1 + height(root.left);
	}
}
