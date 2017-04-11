import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Repeated_DNA_Sequences_187 {

	public static void main(String[] args) {

	}

	public List<String> findRepeatedDnaSequences(String s) {
		List<String> result = new ArrayList<String>();
		HashSet<Integer> first = new HashSet<Integer>();
		HashSet<Integer> second = new HashSet<Integer>();
		int[] map = new int[26];
		map['C' - 'A'] = 1;
		map['G' - 'A'] = 2;
		map['T' - 'A'] = 3;
		for (int i = 0; i < s.length() - 9; i++) {
			int v = 0;
			for (int j = i; j < i + 10; j++) {
				v = v << 2;
				v = v | map[s.charAt(j) - 'A'];
			}
			if (!first.add(v) && second.add(v)) {
				result.add(s.substring(i, i + 10));
			}
		}
		return result;
	}
}
