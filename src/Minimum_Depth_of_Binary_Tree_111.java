
public class Minimum_Depth_of_Binary_Tree_111 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(5);
		System.out.println(minDepth(root));
	}

	public static int minDepth(TreeNode root) {
        if(root == null) {
        	return 0;
        }
		int left = minDepth(root.left);
		int right = minDepth(root.right);
        if(left == 0 || right == 0) {
        	return left + right + 1;
        } else {
        	return 1 + Math.min(left,right);
        }
    }
}
