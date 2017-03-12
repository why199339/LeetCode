
public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal_106 {

	public static void main(String[] args) {

	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder == null || postorder == null || inorder.length != postorder.length) {
			return null;
		}
		return build(0, postorder.length -1 , 0, inorder.length -1 , inorder, postorder);
	}

	private TreeNode build(int postStart, int postEnd, int inStart, int inEnd, int[] inorder, int[] postorder) {
		if (inStart > inEnd || postStart > postEnd) {
			return null;
		}
		TreeNode root = new TreeNode(postorder[postEnd]);
		int index = 0;
		for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == root.val) {
				index = i;
				break;
			}
		}
		root.left = build(postStart, postStart + index - inStart - 1, inStart, index - 1, inorder, postorder);
		root.right = build(postStart + index - inStart, postEnd - 1, index + 1, inEnd, inorder, postorder);
		return root;
	}
}
