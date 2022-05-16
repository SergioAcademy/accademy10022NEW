package lesson19;

public class MyRunnableDemo {
	public static void main(String[] args) {

		MyRunnable myRunnable = new MyRunnable();

		Thread thread1 = new Thread(myRunnable, "Вася");
		Thread thread2 = new Thread(myRunnable);
		Thread thread3 = new Thread(myRunnable);

		thread1.start();
		thread2.start();
		thread3.start();

		System.out.println(thread1.getName());

		System.out.println(Thread.currentThread().getPriority());
		System.out.println(thread1.getPriority());

	}
}