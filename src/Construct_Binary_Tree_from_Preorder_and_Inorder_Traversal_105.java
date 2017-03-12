
public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal_105 {

	public static void main(String[] args) {

	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return build(0, 0, inorder.length - 1, preorder, inorder);
	}

	private TreeNode build(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
		if (preStart > preorder.length - 1 || inStart > inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[preStart]);
		int index = 0;
		for (int i = inStart; i <= inEnd; i++) {
			if (inorder[i] == root.val) {
				index = i;
				break;
			}
		}
		root.left = build(preStart + 1, inStart, index - 1, preorder, inorder);
		root.right = build(preStart + index - inStart + 1, index + 1, inEnd, preorder, inorder);
		return root;
	}

}
