package lesson15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
		public static void main(String[] args) {
			try (FileWriter writer = new FileWriter("src\\io\\javaclass.txt");
					BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
				String text = "1. Циклы\n"
						+ "2. Массивы\n"
						+ "3. Файлы\n";
				bufferedWriter.write(text);
				String text2="Цикл — это многократно повторяющийся фрагмент программы.\nМассив — это конечная последовательность упорядоченных элементов одного типа,"
						+ "\n доступ к каждому элементу в которой осуществляется по его индексу.\nФайлы это файлы )";
				bufferedWriter.newLine();
				bufferedWriter.write(text2);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
