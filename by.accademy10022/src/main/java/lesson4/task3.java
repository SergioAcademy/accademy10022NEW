package lesson4;

public class task3 {
	public static void main(String[] args) {

		outer: for (int i = 0; i < 10; i++) {
			System.out.print("Проход " + i + " : ");
			inter: for (int j = 0; j < 10; j++) {
				int x = i * j;
				if (x == 56) {
					System.out.println();
					System.out.print("STOP: i = " + i);
					System.out.print("; j = " + j);
					break outer;
				}
				System.out.print(j + "  ");
			}
			System.out.println();
		}
	}
}
