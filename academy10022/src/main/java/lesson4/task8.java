package lesson4;

import java.util.Scanner;

public class task8 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¬ведите число: ");
		int x = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= x;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
