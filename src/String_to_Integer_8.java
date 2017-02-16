
public class String_to_Integer_8 {

	public static void main(String[] args) {
		String str = "";
		System.out.println(myAtoi(str));
		str = null;
		System.out.println(myAtoi(str));
		str = "  12";
		System.out.println(myAtoi(str));
		str = "-123";
		System.out.println(myAtoi(str));
		str = "1234abc";
		System.out.println(myAtoi(str));
		str = "abc";
		System.out.println(myAtoi(str));
		str = "12345678987654321";
		System.out.println(myAtoi(str));
		str = "-12345678987654321";
		System.out.println(myAtoi(str));
	}

	public static int myAtoi(String str) {
        if(str == null || str.length() == 0) {
        	return 0;
        }
        int i = 0;
        while(i < str.length()) {
        	if(str.charAt(i) != ' ') {
        		break;
        	}
        	i ++;
        }
        int sign = 1;
        if(str.charAt(i) == '+' || str.charAt(i) == '-') {
        	sign = str.charAt(i) == '+' ? 1 : -1;
        	i ++;
        }
        int total = 0;
        while(i < str.length()) {
        	int digit = str.charAt(i) - '0';
        	if(digit < 0 || digit > 9) {
        		break;
        	}
        	if(total > Integer.MAX_VALUE / 10 || (total == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
        		return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        	}
        	total = total * 10 + digit;
        	i++;
        }
        return total * sign;
    }
}
