package HW2;

import java.util.Scanner;

public class Task1 {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {


		System.out.println("������� ������ ������:");
		String str1 = scanner.nextLine();
		System.out.println("������� ������ ������:");
		String str2 = scanner.nextLine();

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		int value1 = 0;
		int value2 = 0;

		for (int i = 0; i < arr1.length; i++) {
			value1 += (int)arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			value2 += (int)arr2[i];
		}

		if (value1 == value2) {
			System.out.println("C����� �������� ������������� ���� �����.");
		} else {
			System.out.println("C����� �� �������� ������������� ���� �����.");
		}

		scanner.close();
	}
}