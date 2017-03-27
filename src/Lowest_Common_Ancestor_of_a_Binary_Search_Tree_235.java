
public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235 {

	public static void main(String[] args) {

		TreeNode node1 = new TreeNode(6);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(8);
		TreeNode node4 = new TreeNode(0);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(7);
		TreeNode node7 = new TreeNode(9);
		TreeNode node8 = new TreeNode(3);
		TreeNode node9 = new TreeNode(5);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node4.left = node7;
		node5.left = node8;
		node5.right = node9;

		System.out.println(lowestCommonAncestor_1(node1, node7, node8));
		System.out.println(lowestCommonAncestor_2(node1, node7, node8));
	}

	// Iterative
	public static TreeNode lowestCommonAncestor_1(TreeNode root, TreeNode p, TreeNode q) {
		while ((root.val - p.val) * (root.val - q.val) > 0) {
			root = root.val > p.val ? root.left : root.right;
		}
		return root;
	}
	

	// Recursive
	 public static TreeNode lowestCommonAncestor_2(TreeNode root, TreeNode p, TreeNode q) {
    	return (root.val - p.val) * (root.val - q.val) < 1 ? root :
           lowestCommonAncestor_2(p.val < root.val ? root.left : root.right, p, q);
	 }
}
