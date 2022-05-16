package lesson19;



public class MyThreadDemo {
	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.setDaemon(true);
		myThread.start();
		myThread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("hello there I  don't care about daemon");
	}
}

