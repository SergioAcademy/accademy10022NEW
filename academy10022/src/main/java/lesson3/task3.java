package lesson3;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������� ������ �����:");
		double x = scanner.nextInt();
		
		System.out.println("������� ������ �����:");
		double y = scanner.nextInt();
		
		if(x > y) {
			System.out.println("������� ����� " + x);
			System.out.println("������� ����� " + y);
		} else {
			System.out.println("������� ����� " + y);
			System.out.println("������� ����� " + x);
		}
		
		double z = (x + y) / 2;
		System.out.println("������� �������������� " + z);
		
		scanner.close();
	}
}
