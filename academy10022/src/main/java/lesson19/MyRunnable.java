package lesson19;

import java.util.Arrays;

public class MyRunnable implements Runnable {

	private int[] array;

	public MyRunnable() {
		super();
	}

	public MyRunnable(int[] array) {
		super();
		this.array = array;
	}

	@Override
	public void run() {
		System.out.println("������ ������ �����������.");
		System.out.println(Arrays.toString(array));
	}
}