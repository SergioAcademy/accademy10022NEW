package lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
	public static void main(String[] args) {
		System.out.println(test("cab"));
		System.out.println(test("ccab"));
		System.out.println(test("cccab"));
		System.out.println(test("casdaab"));
		System.out.println(test("cccccccccccccccccab"));
	}
	
	public static boolean test(String str) {
		Pattern pattern = Pattern.compile("c{1,3}ab");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
