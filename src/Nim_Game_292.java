
import java.util.Scanner;

public class Nim_Game_292 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(canWinNim(i));
		}

	}

	public static boolean canWinNim(int n) {
		return (n % 4 != 0);
	}

}
