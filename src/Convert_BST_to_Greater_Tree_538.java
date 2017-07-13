
public class Convert_BST_to_Greater_Tree_538 {

	public static void main(String[] args) {

	}

	int sum = 0;
	
    public TreeNode convertBST(TreeNode root) {
    	convert(root);
    	return root;
    }

	private void convert(TreeNode root) {
		if(root == null) {
			return ;
		}
		convert(root.right);
		root.val += sum;
		sum = root.val;
		convert(root.left);
	}
}
