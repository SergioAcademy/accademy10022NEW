package lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
	public static void main(String[] args) {
		System.out.println(test("google.com"));
		System.out.println(test("reference1.by"));
		System.out.println(test("reference2.org"));
	}

	public static boolean test(String str) {
		Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|by|org)");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
