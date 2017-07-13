import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Word_Ladder_127 {

	public static void main(String[] args) {

	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (!wordList.contains(endWord))
			return 0;
		Set<String> startSet = new HashSet<String>();
		Set<String> endSet = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		startSet.add(beginWord);
		endSet.add(endWord);
		int len = 1;
		for (String temp : wordList) {
			set.add(temp);// transfer list to hashset
		}
		while (!startSet.isEmpty() && !endSet.isEmpty()) {
			if (startSet.size() > endSet.size()) {
				Set<String> tmpSet = startSet;// search with less word's set to speed up
				startSet = endSet;
				endSet = tmpSet;
			}
			Set<String> tmp = new HashSet<String>();
			for (String word : startSet) {
				char[] charArr = word.toCharArray();
				for (int i = 0; i < word.length(); i++) {
					for (char c = 'a'; c <= 'z'; c++) {
						char replace = charArr[i];
						charArr[i] = c;
						String s = new String(charArr);
						if (endSet.contains(s))
							return len + 1;
						if (set.contains(s)) {
							tmp.add(s);
							set.remove(s);
						}
						charArr[i] = replace;
					}
				}
			}
			startSet = tmp;
			len++;
		}
		return 0;
	}
}
