
public class Flatten_Binary_Tree_to_Linked_List_114 {

	private TreeNode prev = null;
	
	public static void main(String[] args) {

	}

    public void flatten(TreeNode root) {
        if(root == null) {
        	return ;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
