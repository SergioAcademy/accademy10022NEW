package lesson2;

public class Operation {

	public static void main(String[] args) {
		int number = 5;
		number = -number;
		System.out.println(number);
		boolean bool = true;
		bool = !bool;
		System.out.println(bool);

		char a = 'A';
		a = (char) (a + 1);
		System.out.println((int) 'a');

		int c = 6 % 5;
		double b = 6.2 % 5.0;
		System.out.println(c);
		System.out.println(b);

		int number1 = 10;
		System.out.println(number1);
		number1 += 10;
		System.out.println(number1);
		number1 -= 10;
		System.out.println(number1);
		number1 *= 10;
		System.out.println(number1);
		number1 /= 10;
		System.out.println(number1);
		number1 %= 10;
		System.out.println(number1);

		int i = 1;
		i++;
		System.out.println(i);
		i += 1;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);
		i--;
		System.out.println(i);
		i -= 1;
		System.out.println(i);
		i = i - 1;
		System.out.println(i);

		int j = 0;
		// --j
		// ++j
		System.out.println(j++);
		System.out.println(++j);

	}

}