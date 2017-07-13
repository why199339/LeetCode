import java.util.LinkedList;

public class Lowest_Common_Ancestor_of_a_Binary_Tree_236 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(1);
		TreeNode node4 = new TreeNode(6);
		TreeNode node5 = new TreeNode(2);
		TreeNode node6 = new TreeNode(0);
		TreeNode node7 = new TreeNode(8);
		TreeNode node8 = new TreeNode(7);
		TreeNode node9 = new TreeNode(4);
		root.left = node2;
		root.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node5.left = node8;
		node5.right = node9;
		TreeNode result = lowestCommonAncestor(root, node2, node3);
		System.out.println(result.val);
		result = lowestCommonAncestor(root, node2, node9);
		System.out.println(result.val);
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q)
			return root;
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left != null && right != null)
			return root;
		return left != null ? left : right;
	}

	public static TreeNode lowestCommonAncestor_2(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || p == null || q == null) {
			return null;
		}
		LinkedList<TreeNode> path1 = new LinkedList<>();
		LinkedList<TreeNode> path2 = new LinkedList<>();
		getNodePath(root, p, path1);
		getNodePath(root, q, path2);
		return getLastCommonNode(path1, path2);
	}

	private static TreeNode getLastCommonNode(LinkedList<TreeNode> path1, LinkedList<TreeNode> path2) {
		int index1 = 0;
		int index2 = 0;
		TreeNode commonNode = null;
		while (index1 != path1.size() && index2 != path2.size()) {
			if (path1.get(index1) == path2.get(index2)) {
				commonNode = path1.get(index1);
			}
			index1++;
			index2++;
		}
		return commonNode;
	}

	private static boolean getNodePath(TreeNode root, TreeNode p, LinkedList<TreeNode> path) {
		if (root == p) {
			path.add(root);
			return true;
		}
		path.add(root);
		boolean found = false;
		if (!found && root.left != null) {
			found = getNodePath(root.left, p, path);
		}
		if (!found && root.right != null) {
			found = getNodePath(root.right, p, path);
		}
		if (!found) {
			path.removeLast();
		}
		return found;
	}

}
