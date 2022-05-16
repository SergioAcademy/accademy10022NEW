package HW2;

import java.util.Scanner;

public class Task3 {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Введите два слова, состоящие из четного числа букв:");
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		while(str1.length()%2!=0 || str2.length()%2!=0) {
			System.out.println("Нечётное количество букв!!! Введите ещё раз:");
			str1 = scanner.next();
			str2 = scanner.next();
		}
		
		int n1 = str1.length()/2;
		int n2 = str2.length()/2;
		
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder(str2);
		
		sb1.delete(n1, (n1*2));
		sb2.delete(0, n2);
		
		sb1.append(sb2);
		
		System.out.println(sb1);
		
		scanner.close();
	} 
}