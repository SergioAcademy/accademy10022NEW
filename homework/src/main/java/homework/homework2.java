package homework;

import java.io.IOException;
import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ��� ������:");
		String type = scanner.nextLine();
		switch (type) {
		case "int":
			System.out.println("������� ���������� ���� int:");
			int a = scanner.nextInt();
			System.out.println("������� �� ������� �� 2:" + (a % 2));
			break;
		case "double":
			System.out.println("������� ���������� ���� double:");
			double b = scanner.nextDouble();
			System.out.println("70% �� �����:" + (b * 0.7));
			break;
		case "float":
			System.out.println("������� ���������� ���� float:");
			float c = scanner.nextFloat();
			System.out.println("������� ���������� �����:" + (c * c));
			break;
		case "char":
			System.out.println("������� ������:");
			int x = System.in.read();
			char z = (char) x;
			System.out.println("��� �������:" + z + "=" + x);
			break;
		case "String":
			System.out.println("������� ������:");
			String o = scanner.nextLine();
			System.out.println("Hello" + o);
			break;
		default:
			System.out.println("Unsupported type");
		}
		scanner.close();

	}
}
