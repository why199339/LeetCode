
public class Kth_Smallest_Element_in_a_BST_230 {

	public static void main(String[] args) {

	}

	int number = 0;
	int count = 0;

	public int kthSmallest_inorder_Recursive(TreeNode root, int k) {
		count = k;
		inorder_recursive(root);
		return number;
	}

	private void inorder_recursive(TreeNode root) {
		if (root.left != null) {
			inorder_recursive(root.left);
		}
		count--;
		if (count == 0) {
			number = root.val;
			return;
		}
		if (root.right != null) {
			inorder_recursive(root.right);
		}
	}

	public int kthSmallest_binarySearch(TreeNode root, int k) {
		int count = countNodes(root.left);
		if (count >= k) {
			return kthSmallest_binarySearch(root.left, k);
		} else if (count < k - 1) {
			return kthSmallest_binarySearch(root.right, k - count - 1);
		}
		return root.val;
	}

	private int countNodes(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + countNodes(root.left) + countNodes(root.right);
	}
}
