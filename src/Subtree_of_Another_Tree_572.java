
public class Subtree_of_Another_Tree_572 {

	public static void main(String[] args) {

	}

	public boolean isSubtree(TreeNode s, TreeNode t) {
		if(s == null) {
			return false;
		}
        return check(s,t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

	private boolean check(TreeNode s, TreeNode t) {
		if(t == null && s == null) {
			return true;
		}
		if(s == null || t == null || s.val != t.val) {
			return false;
		}
		return check(s.left, t.left) && check(s.right, t.right);
	}
}
