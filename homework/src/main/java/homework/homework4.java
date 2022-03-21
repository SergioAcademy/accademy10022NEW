package homework;

public class homework4 {
	public static void main(String[] args) {

		int a = 2;
		int b = 1;
		int result;
		do {
			result = (int) Math.pow(a, b);
			b++;
			System.out.println(result);
		} while (result < 1000000);
	}
}