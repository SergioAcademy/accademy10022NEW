package lesson12;

import java.util.LinkedList;

public class LinkedListCustomDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("F");
		list.add("B");
		list.add("D");
		list.add("E");
		list.add("C");
		list.addLast("Z");
		list.addFirst("A");
		list.add(1, "A2");
		System.out.println("����������: " + list);

		list.remove("F");
		list.remove(2);
		list.removeFirst();
		list.removeLast();
		System.out.println("���������� ����� ��������: " + list);

		String val = list.get(2);
		list.set(2, val + "+");
		System.out.println("���������� ����� ���������: " + list);
	}
}