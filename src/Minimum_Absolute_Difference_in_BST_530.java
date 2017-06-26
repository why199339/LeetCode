import java.util.TreeSet;

public class Minimum_Absolute_Difference_in_BST_530 {

	public static void main(String[] args) {

	}

	int min = Integer.MAX_VALUE;
	Integer prev = null;

	// O(N), O(1)
	public int getMinimumDifference(TreeNode root) {
		if (root == null) {
			return min;
		}
		getMinimumDifference(root.left);
		if (prev != null) {
			min = Math.min(min, root.val - prev);
		}
		prev = root.val;
		getMinimumDifference(root.right);
		return min;
	}

	TreeSet<Integer> set = new TreeSet<>();

	// O(NlogN), O(N)s
	public int getMinimumDifference_general(TreeNode root) {
		if (root == null) {
			return min;
		}
		if (!set.isEmpty()) {
			if (set.ceiling(root.val) != null) {
				min = Math.min(min, set.ceiling(root.val) - root.val);
			}
			if (set.floor(root.val) != null) {
				min = Math.min(min, root.val - set.floor(root.val));
			}
		}
		set.add(root.val);
		getMinimumDifference_general(root.left);
		getMinimumDifference_general(root.right);
		return min;
	}
}
