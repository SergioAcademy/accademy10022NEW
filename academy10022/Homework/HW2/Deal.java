package HW2;

import java.util.Random;
import java.util.Scanner;

public class Deal {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Random random = new Random();

		String[] cards1 = { "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
		String[] cards2 = { "пики", "трефи", "черви", "бубны" };

		int playersCards = 5;
		int value = cards1.length * cards2.length;

		System.out.println("Введите количество игроков:");
		int players = scanner.nextInt();
		boolean b = false;

		while (b == false) {
			if (players * playersCards < value && players > 0) {
				b = true;
			} else {
				System.out.println("Введите допустимое количество игроков");
				players = scanner.nextInt();
			}
		}

		String[] desk = new String[value];
		for (int i = 0; i < cards1.length; i++) {
			for (int j = 0; j < cards2.length; j++) {
				desk[cards2.length * i + j] = cards1[i] + " " + cards2[j];
			}
		}

		for (int i = 0; i < desk.length; i++) {
			int r = i + (int) (Math.random() * (desk.length - i));
			String temp = desk[r];
			desk[r] = desk[i];
			desk[i] = temp;
		}

		for (int i = 0; i < players * playersCards; i++) {
			System.out.print(desk[i] + "|");
			if (i % playersCards == playersCards - 1)
				System.out.println(";");
		}

		scanner.close();
	}
}