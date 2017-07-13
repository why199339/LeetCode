import java.util.HashMap;

public class House_Robber_III_337 {

	public static void main(String[] args) {

	}

	public int rob(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int val = 0;
		if (root.left != null) {
			val += rob(root.left.left) + rob(root.left.right);
		}
		if (root.right != null) {
			val += rob(root.right.left) + rob(root.right.right);
		}
		return Math.max(val + root.val, rob(root.left) + rob(root.right));
	}

	public int rob_dp(TreeNode root) {
		return process(root, new HashMap<TreeNode, Integer>());
	}

	private int process(TreeNode root, HashMap<TreeNode, Integer> map) {
		if (root == null) {
			return 0;
		}
		if (map.containsKey(root)) {
			return map.get(root);
		}
		int val = 0;
		if (root.left != null) {
			val += process(root.left.left, map) + process(root.left.right, map);
		}
		if (root.right != null) {
			val += process(root.right.left, map) + process(root.right.right, map);
		}
		val = Math.max(val + root.val, process(root.left, map) + process(root.right, map));
		map.put(root, val);
		return val;
	}

	public int rob_greedy(TreeNode root) {
		int[] res = subRob(root);
		return Math.max(res[0], res[1]);
	}

	private int[] subRob(TreeNode root) {
		if (root == null) {
			return new int[2];
		}
		int[] left = subRob(root.left);
		int[] right = subRob(root.right);
		int[] res = new int[2];
		res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
		res[1] = left[0] + right[0] + root.val;
		return res;
	}
}
