import java.math.BigInteger;

public class Add_Binary_67 {

	public static void main(String[] args) {

		String a = "1";
		String b = "111";
		String s = addBinary(a, b);
		System.out.println(s);
	}

	public static String addBinary(String a, String b) {
		if(a == null || a.isEmpty()) {
            return b;
        }
        if(b == null || b.isEmpty()) {
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        StringBuilder stb = new StringBuilder();

        int i = aArray.length - 1;
        int j = bArray.length - 1;
        int aByte;
        int bByte;
        int carry = 0;
        int result;

        while(i > -1 || j > -1 || carry == 1) {
            aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;
            bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
            result = aByte ^ bByte ^ carry;
            carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
            stb.append(result);
        }
        return stb.reverse().toString();
	}
	
	/*
	public static String addBinary(String a, String b) {
		BigInteger aa = new BigInteger(a, 2);
		BigInteger bb = new BigInteger(b, 2);
		return aa.add(bb).toString(2);
	}
	*/
	
	/*
	 * own
	public static String addBinary(String a, String b) {
		int len = a.length() > b.length() ? a.length() + 1 : b.length() + 1;
		if (a.length() == len - 1) {
			a = "0" + a;
			String s = "0";
			for (int i = 1; i < len - b.length(); i++) {
				s += "0";
			}
			b = s + b;
		} else {
			b = "0" + b;
			String s = "0";
			for (int i = 1; i < len - a.length(); i++) {
				s += "0";
			}
			a = s + a;
		}
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		String s = "";
		int next = 0;
		for (int i = len - 1; i >= 0; i--) {
			if (a.charAt(i) == '0' && b.charAt(i) == '0' && next == 0) {
				s = "0" + s;
				next = 0;
			} else if (a.charAt(i) == '0' && b.charAt(i) == '0' && next == 1) {
				s = "1" + s;
				next = 0;
			} else if (a.charAt(i) == '1' && b.charAt(i) == '0' && next == 0) {
				s = "1" + s;
				next = 0;
			} else if (a.charAt(i) == '1' && b.charAt(i) == '0' && next == 1) {
				s = "0" + s;
				next = 1;
			} else if (a.charAt(i) == '0' && b.charAt(i) == '1' && next == 0) {
				s = "1" + s;
				next = 0;
			} else if (a.charAt(i) == '0' && b.charAt(i) == '1' && next == 1) {
				s = "0" + s;
				next = 1;
			} else if (a.charAt(i) == '1' && b.charAt(i) == '1' && next == 0) {
				s = "0" + s;
				next = 1;
			} else if (a.charAt(i) == '1' && b.charAt(i) == '1' && next == 1) {
				s = "1" + s;
				next = 1;
			}
		}
		if(s.charAt(0) == '0') {
			s = s.substring(1);
		}
		return s;
	}
	*/
}
