package lesson12;

import java.util.Scanner;

public class task3 {

	public static String[] strings;

    public static void main(String[] args) {
   
        strings = new String[10];
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i] != null) {
                    if (strings[i].equals(strings[j])) {
                        strings[i] = null;
                        strings[j] = null;
                    }
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}