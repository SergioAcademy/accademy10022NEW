package homework;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		System.out.print("¬ведите число: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}
		scanner.close();
	}
}
