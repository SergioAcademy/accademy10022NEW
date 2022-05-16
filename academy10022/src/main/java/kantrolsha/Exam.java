package kantrolsha;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Exam<T extends Number> {

	private T[] mark;

	public Exam() {
		super();
	}

	public Exam(T[] mark) {
		super();
		this.mark = mark;
	}

	public double averageMark() {
		double sum = 0;
		for (T mark : mark) {
			sum += mark.doubleValue();
		}
		double averageMark = (double) sum / mark.length;
		System.out.print("Среднее значение: ");
		return averageMark;
	}

	public void add(T value) {
		T[] addMark = (T[]) new Number[mark.length + 1];
		System.arraycopy(mark, 0, addMark, 0, mark.length);
		mark = addMark;
		mark[mark.length - 1] = value;
	}

	public void add(int index, T value) {
		if (index <= mark.length && index >= 0) {
			T[] addMark = (T[]) new Number[mark.length + 1];
			System.arraycopy(mark, 0, addMark, 0, index);
			System.arraycopy(mark, index, addMark, index + 1, mark.length - index);
			mark = addMark;
			mark[index] = value;
		}

	}

	public void remove(int index) {
		if (index <= mark.length && index >= 0) {
			T[] removeMark = (T[]) new Number[mark.length - 1];
			System.arraycopy(mark, 0, removeMark, 0, index);
			System.arraycopy(mark, index + 1, removeMark, index, mark.length - index - 1);
			mark = removeMark;
		}

	}

	public T[] getMark() {
		return mark;
	}

	public void setMark(T[] mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Exam [mark=");
		builder.append(Arrays.toString(mark));
		builder.append("]");
		return builder.toString();
	}

}