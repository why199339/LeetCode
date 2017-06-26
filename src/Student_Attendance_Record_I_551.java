
public class Student_Attendance_Record_I_551 {

	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLL"));
	}

	public static boolean checkRecord(String s) {
		char[] chs = s.toCharArray();
		int absent = 0;
		int late = 0;
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] == 'A') {
				absent++;
				late = 0;
			} else if (chs[i] == 'L') {
				late++;
			} else {
				late = 0;
			}
			if (absent > 1 || late > 2) {
				return false;
			}
		}
		return true;
	}
}
