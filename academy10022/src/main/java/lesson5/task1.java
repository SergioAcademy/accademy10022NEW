package lesson5;

import java.io.IOException;
import java.util.Scanner;

public class task1 {
    public static void main (String [] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("������� �����: ");

        int n = sc.nextInt();

        int i;
        int sum;
        for (i = 0; i <= n; i++) {
            sum = i+i;
            System.out.println("����� ����� = " + sum);
        }

    }
}

