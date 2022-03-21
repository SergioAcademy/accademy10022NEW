package homework;

import java.io.IOException;
import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите тип данных:");
		String type = scanner.nextLine();
		switch (type) {
		case "int":
			System.out.println("¬ведите переменную типа int:");
			int a = scanner.nextInt();
			System.out.println("ќстаток от делени€ на 2:" + (a % 2));
			break;
		case "double":
			System.out.println("¬ведите переменную типа double:");
			double b = scanner.nextDouble();
			System.out.println("70% от числа:" + (b * 0.7));
			break;
		case "float":
			System.out.println("¬ведите переменную типа float:");
			float c = scanner.nextFloat();
			System.out.println(" вадрат введенного числа:" + (c * c));
			break;
		case "char":
			System.out.println("¬ведите символ:");
			int x = System.in.read();
			char z = (char) x;
			System.out.println(" од символа:" + z + "=" + x);
			break;
		case "String":
			System.out.println("¬ведите строку:");
			String o = scanner.nextLine();
			System.out.println("Hello" + o);
			break;
		default:
			System.out.println("Unsupported type");
		}
		scanner.close();

	}
}
