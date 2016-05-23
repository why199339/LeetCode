
public class Excel_Sheet_Column_Number_171 {

	public static void main(String[] args) {
//		System.out.println(titleToNumber("A"));
//		System.out.println(titleToNumber("C"));
//		System.out.println(titleToNumber("Z"));
//		System.out.println(titleToNumber("AA"));
		System.out.println(titleToNumber("BA"));
//		System.out.println(titleToNumber("AAA"));

	}

	/*
	public static int titleToNumber(String s) {
		char[] a = s.toCharArray();
		double sum = 0.0;
		for (int i = a.length - 1; i >= 0; i--) {
			sum = (a[i] - 'A' + 1) * Math.pow(26.0, (double)a.length - 1 -i) + sum;
		}
		return (int)sum;
	}
	*/
	
	public static int titleToNumber(String s) {
		int result = 0;
	    for(int i = 0 ; i < s.length(); i++) {
	        result = result * 26 + (s.charAt(i) - 'A' + 1);
	      }
	    return result;
	}
}
