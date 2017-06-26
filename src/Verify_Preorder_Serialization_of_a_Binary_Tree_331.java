
public class Verify_Preorder_Serialization_of_a_Binary_Tree_331 {

	public static void main(String[] args) {

	}

	public boolean isValidSerialization(String preorder) {
		String[] nodes = preorder.split(",");
		int diff = 1;
		for (String node : nodes) {
			diff--;
			if (diff < 0) {
				return false;
			}
			if (!node.equals("#")) {
				diff += 2;
			}
		}
		return diff == 0;
	}
}
