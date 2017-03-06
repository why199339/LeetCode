
public class Word_Search_79 {

	public static void main(String[] args) {

	}

	public static boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (exist(board, i, j, word, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean exist(char[][] board, int i, int j, String word, int k) {
		if (k == word.length()) {
			return true;
		}
		if (i > board.length-1 || i < 0 || j > board[0].length-1 || j < 0 || board[i][j] != word.charAt(k)) {
			return false;
		}
		board[i][j] = '*';
		boolean result = exist(board, i + 1, j, word, k + 1) || exist(board, i, j + 1, word, k + 1)
				|| exist(board, i - 1, j, word, k + 1) || exist(board, i, j - 1, word, k + 1);
		board[i][j] = word.charAt(k);
		return result;
	}
}
