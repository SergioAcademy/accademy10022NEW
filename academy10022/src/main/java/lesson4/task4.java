package lesson4;

import java.util.Random;

public class task4 {
	public static void main(String[] args) {
		int x = 0;
		
		int[] array = new int[10];
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(9);
		}
		System.out.println("new array");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2==0 & array[i] !=0) {
				x++;
			}
		}
		System.out.println();
		System.out.println(x);
	}
}
