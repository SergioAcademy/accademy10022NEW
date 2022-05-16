package HW2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("������� ����� ���� ����� ������:");
		String[] strings = scanner.nextLine().split(" ");
		int[] number = new int[strings.length];
		int min = Integer.MAX_VALUE;
		int index = 0;

		for (int i = 0; i < strings.length; i++) {
			char[] arrChar = strings[i].toCharArray();
			int value = arrChar.length;
			number[i] = value;
		}
		System.out.println("���������� �������� � ������ �����:");
		System.out.println(Arrays.toString(number));
		
		for(int i = 0;i<number.length;i++) {
			if(number[i]<min) {
				min = number[i];
				index = i;
			}
		}
		System.out.println("����������� ���������� �������� � ����� "+strings[index]+" ���������� �������:"+min);
		
		scanner.close();
	}
}