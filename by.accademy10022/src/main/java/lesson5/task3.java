package lesson5;

import java.io.IOException;
import java.util.Scanner;

public class task3 {
	 public static void main(String[] args) throws IOException {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("������� �����: ");

	        int n = sc.nextInt();
	        int array[] = new int[n];

	        System.out.println("������� " + n + " �����");
	        int a;
	        int negativ = 0;
	        for (a = 0; a <= n; a++) {
	            array[a] = sc.nextInt();
	            System.out.println("�������� ����� = " + array[a]);
	        }
	        for (a = 0; a <= n; a++) {
	            if (a < 0) {
	                negativ++;
	                System.out.println("���������� ����������� ����� = " + negativ);
	            }

	        }
	    }
}
