

public class Maximum_Depth_of_Binary_Tree_104 {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node1.left = node2;
		node2.left = node3;
		System.out.println(maxDepth(node1));
		
	}

	public static int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

