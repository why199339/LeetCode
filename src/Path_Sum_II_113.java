import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II_113 {

	public static void main(String[] args) {

	}

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		find(root, sum, list, new ArrayList<Integer>());
		return list;
	}

	private void find(TreeNode root, int sum, List<List<Integer>> list, ArrayList<Integer> temp) {
		if (root == null) {
			return;
		}
		temp.add(root.val);
		if (root.left == null && root.right == null && sum == root.val) {
			list.add(new ArrayList<>(temp));
		} else {
			find(root.left, sum - root.val, list, temp);
			find(root.right, sum - root.val, list, temp);
		}
		temp.remove(temp.size() - 1);
	}
}
