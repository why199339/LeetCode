
public class Number_Complement_476 {

	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}

	public static int findComplement(int num) {
		return ~num & (Integer.highestOneBit(num) - 1);
	}
	
	public static int findComplement_own(int num) {
		String n = Integer.toBinaryString(num);
		char[] chs = n.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			chs[i] = chs[i] == '0' ? '1' : '0';
		}
		System.out.println(chs);
		int res = 0;
		int count = 0;
		for (int i = chs.length - 1; i >= 0; i--) {
			res += (chs[i] - '0') * Math.pow(2, count);
			count++;
		}
		return res;
	}
}
