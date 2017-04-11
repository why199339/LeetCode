
public class Add_and_Search_Word_Data_structure_design_211 {

	public static void main(String[] args) {

	}

	class TrieNode {
		TrieNode[] children = new TrieNode[26];
		boolean isEnd;
	}

	TrieNode root = null;

	/** Initialize your data structure here. */
	public Add_and_Search_Word_Data_structure_design_211() {
		root = new TrieNode();
	}

	/** Adds a word into the data structure. */
	public void addWord(String word) {
		TrieNode node = root;
		for (char c : word.toCharArray()) {
			if (node.children[c - 'a'] == null) {
				node.children[c - 'a'] = new TrieNode();
			}
			node = node.children[c - 'a'];
		}
		node.isEnd = true;
	}

	/**
	 * Returns if the word is in the data structure. A word could contain the
	 * dot character '.' to represent any one letter.
	 */
	public boolean search(String word) {
		return match(word.toCharArray(), 0, root);
	}

	private boolean match(char[] chs, int k, TrieNode node) {
		if (k == chs.length) {
			return node.isEnd;
		}
		if (chs[k] == '.') {
			for (int i = 0; i < node.children.length; i++) {
				if (node.children[i] != null && match(chs, k + 1, node.children[i])) {
					return true;
				}
			}
		} else {
			return node.children[chs[k] - 'a'] != null && match(chs, k + 1, node.children[chs[k] - 'a']);
		}
		return false;
	}
}
