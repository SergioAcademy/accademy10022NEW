package lesson11;

public class CatExceptionDemo {
 {
		public static void main(String[] args) {
			Cat cat=new Cat (13, "������");
		}

		public static void compute(int a) throws MyException {

			System.out.println("������ ����� compute(" + a + ")");
			if (a > 10) {
				throw new CatExceptionDemo(a, "Some message");
			}
			System.out.println("���������� ����������.");
		}
	}