package lesson4;

public class task6 {
public static void main(String[] args) {
		
		int[] array = new int[10];
		int x = 0;
		int y = 2;
		
		while (x < 10) {
			array[x] = y;
			y += 2;
			x++;
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
