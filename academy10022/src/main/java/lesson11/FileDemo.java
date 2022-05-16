package lesson11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo {
	public static void main(String[] args) {
		try (InputStream input = new FileInputStream("Car.txt");
				OutputStream output = new FileOutputStream("Car1.txt")) {
			char[] symbols = { 'o', 'p', 'e', 'l', ')' };
			for (int i = 0; i < symbols.length; i++) {
				// Запись каждого символа в текстовый файл
				output.write(symbols[i]);
				
			}

			int size = input.available();
			for (int i = 0; i < size; i++) {
				// Чтение текстового файла посимвольно
				System.out.print((char) input.read() + " ");

			}
		} catch (IOException e) {
			System.out.print("Exception");

		}
	}
}