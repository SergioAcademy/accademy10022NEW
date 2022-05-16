package lesson19;

public class RunDemo {
	public static void main(String[] args) {
		Run run = new Run();
		Thread one = new Thread(run);
		Thread two = new Thread(run);
		Thread three = new Thread(run);

		one.setName("1");
		two.setName("2");
		three.setName("3");

		one.start();
		two.start();
		three.start();
	}
}