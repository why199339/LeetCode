
public class Same_Tree_100 {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		TreeNode q = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);
		System.out.println(isSameTree(p, q));

	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}
		if (p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		return false;
	}
}
