package lesson3;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите первое число:");
		double x = scanner.nextInt();
		
		System.out.println("Введите второе число:");
		double y = scanner.nextInt();
		
		if(x > y) {
			System.out.println("Большее число " + x);
			System.out.println("Меньшее число " + y);
		} else {
			System.out.println("Большее число " + y);
			System.out.println("Меньшее число " + x);
		}
		
		double z = (x + y) / 2;
		System.out.println("Среднее арифметическое " + z);
		
		scanner.close();
	}
}
