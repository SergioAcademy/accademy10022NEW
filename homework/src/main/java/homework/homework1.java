package homework;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ��������� ������:");
		double cost = scanner.nextDouble();
		System.out.println("������� ���� �������:");
		int age = scanner.nextInt();
		if (cost < 100) {
			System.out.println("���� ������:" + (cost * 0.05));
			System.out.println("��������� ����� ������� ��������:" + (cost - (cost * 0.05)));
		} else if (cost <= 100 && cost < 200) {
			System.out.println("���� ������:" + (cost * 0.07));
			System.out.println("��������� ����� ������� ��������:" + (cost - (cost * 0.07)));
		} else if (cost >= 200 && cost < 300 && age >= 18) {
			System.out.println("��� ���� 18 ���, ������ ����� ������!");
			System.out.println("���� ������:" + (cost * 0.16));
			System.out.println("��������� ����� ������� ��������:" + (cost - (cost * 0.16)));
		} else if (cost >= 200 && cost < 300 && age < 18) {
			System.out.println("��� ��� 18 ���, ������ ����� ������!");
			System.out.println("���� ������:" + (cost * 0.09));
			System.out.println("��������� ����� ������� ��������:" + (cost - (cost * 0.09)));
		} else if (cost >= 300 && cost < 400) {
			System.out.println("���� ������:" + (cost * 0.15));
			System.out.println("��������� ����� ������� ��������:" + (cost - (cost * 0.15)));
		} else {
			System.out.println("���� ������:" + (cost * 0.20));
			System.out.println("��������� ����� ������� ��������:" + (cost - (cost * 0.20)));
		}
		scanner.close();
	}
}

