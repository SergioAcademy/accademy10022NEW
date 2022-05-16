package lesson19;

public class Run implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			
		
			System.out.println("Run by " + Thread.currentThread().getName() + ", i is " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}