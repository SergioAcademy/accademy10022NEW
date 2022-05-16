package lesson15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
		public static void main(String[] args) {
			try (FileWriter writer = new FileWriter("src\\io\\javaclass.txt");
					BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
				String text = "1. �����\n"
						+ "2. �������\n"
						+ "3. �����\n";
				bufferedWriter.write(text);
				String text2="���� � ��� ����������� ������������� �������� ���������.\n������ � ��� �������� ������������������ ������������� ��������� ������ ����,"
						+ "\n ������ � ������� �������� � ������� �������������� �� ��� �������.\n����� ��� ����� )";
				bufferedWriter.newLine();
				bufferedWriter.write(text2);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
