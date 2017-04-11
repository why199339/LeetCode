import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View_199 {

	public static void main(String[] args) {

	}

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		backtrack(root, list, 0);
		return list;
	}

	private void backtrack(TreeNode root, List<Integer> list, int level) {
		if (root == null) {
			return;
		}
		if (list.size() == level) {
			list.add(root.val);
		}
		backtrack(root.right, list, level + 1);
		backtrack(root.left, list, level + 1);
	}
}
