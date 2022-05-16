package lesson4;

public class task5 {
	public static void main(String[] args) {
		int[] array = new int[50];
		int x = 0;
		int y = 1;
		
		while (x < 50) {
			array[x] = y;
			y += 2;
			x++;
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}
}
