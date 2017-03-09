
public class Validate_Binary_Search_Tree_98 {

	public static void main(String[] args) {

	}

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

	private boolean isValidBST(TreeNode root, long minValue, long maxValue) {
		if(root == null) {
			return true;
		}
		if(root.val >= maxValue || root.val <= minValue) {
			return false;
		}
		return isValidBST(root.left, minValue, root.val) && isValidBST(root.right, root.val, maxValue);
	}
}
