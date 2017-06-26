
public class Find_Mode_in_Binary_Search_Tree_501 {

	public static void main(String[] args) {

	}

	int maxCount = 0;
	int curCount = 0;
	int modeCount = 0;
	int curValue;
	int[] modes;

	public int[] findMode(TreeNode root) {
		inorder(root);
		modes = new int[modeCount];
		modeCount = 0;
		curCount = 0;
		inorder(root);
		return modes;
	}

	private void handleValue(int val) {
		if (curValue != val) {
			curValue = val;
			curCount = 0;
		}
		curCount++;
		if (curCount > maxCount) {
			maxCount = curCount;
			modeCount = 1;
		} else if (curCount == maxCount) {
			if (modes != null) {
				modes[modeCount] = curValue;
			}
			modeCount++;
		}
	}

	private void inorder(TreeNode root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		handleValue(root.val);
		inorder(root.right);
	}

	private void inorder_morris(TreeNode root) {
		if (root == null) {
			return;
		}
		TreeNode cur1 = root;
		TreeNode cur2 = null;
		while (cur1 != null) {
			cur2 = cur1.left;
			if (cur2 != null) {
				while (cur2.right != null && cur2.right != cur1) {
					cur2 = cur2.right;
				}
				if (cur2.right == null) {
					cur2.right = cur1;
					cur1 = cur1.left;
					continue;
				} else {
					cur2.right = null;
				}
			}
			handleValue(root.val);
			cur1 = cur1.right;
		}
	}

}
