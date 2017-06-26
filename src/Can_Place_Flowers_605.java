
public class Can_Place_Flowers_605 {

	public static void main(String[] args) {

	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		int i = 0;
		while (i < flowerbed.length) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
					&& (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				count++;
				flowerbed[i] = 1;
			}
			i++;
		}
		return count >= n;
	}

	public boolean canPlaceFlowers_better(int[] flowerbed, int n) {
		int count = 0;
		int i = 0;
		while (i < flowerbed.length) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
					&& (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				count++;
				flowerbed[i] = 1;
			}
			if (count >= n) {
				return true;
			}
			i++;
		}
		return false;
	}
}
