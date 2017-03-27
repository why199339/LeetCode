import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Word_Ladder_127 {

	public static void main(String[] args) {

	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (!wordList.contains(endWord))
			return 0;
		Set<String> startSet = new HashSet<String>(), endSet = new HashSet<String>(), list = new HashSet<String>();
		startSet.add(beginWord);
		endSet.add(endWord);
		int len = 1;
		for (String temp : wordList) {
			list.add(temp);// transfer list to hashset
		}
		while (!startSet.isEmpty() && !endSet.isEmpty()) {
			if (startSet.size() > endSet.size()) {
				Set tmpSet = startSet;// search with less word's set to speed up
				startSet = endSet;
				endSet = tmpSet;
			}
			Set<String> tmp = new HashSet<String>();
			for (String word : startSet) {
				char[] charArr = word.toCharArray();// put this out of the inner
													// for loop to initialize
													// less times. This would
													// require to remember the
													// changed character
				for (int i = 0; i < word.length(); i++) {
					for (char c = 'a'; c <= 'z'; c++) {
						char replace = charArr[i];// remember the changed
													// character and change it
													// back later
						charArr[i] = c;
						String s = new String(charArr);
						if (endSet.contains(s))
							return len + 1;
						// if other set contains string s means there is a
						// intersect point between two sets. So return
						if (list.contains(s)) {// HashSet contains is constant
												// while List is not.
							tmp.add(s);
							list.remove(s);
						}
						charArr[i] = replace;// change it back
					}
				}
			}
			startSet = tmp;
			len++;
		}
		return 0;
	}
}
