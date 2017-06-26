
public class Diameter_of_Binary_Tree_543 {

	public static void main(String[] args) {

	}

    public int diameterOfBinaryTree(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
        int[] record = new int[1];
        return postOrder(root, record) - 1;
    }

	private int postOrder(TreeNode root, int[] record) {
		if(root == null) {
			record[0] = 0;
			return 0;
		}
		int lMax = postOrder(root.left, record);
		int maxFromLeft = record[0];
		int rMax = postOrder(root.right, record);
		int maxFromRight = record[0];
		int curMax = maxFromLeft + 1 + maxFromRight;
		record[0] = Math.max(maxFromLeft, maxFromRight) + 1;
		return Math.max(curMax, Math.max(lMax, rMax));
	}
}
