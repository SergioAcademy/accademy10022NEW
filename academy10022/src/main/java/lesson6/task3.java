package lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
	public static final Pattern p = Pattern.compile("Java\\s+\\d+");
	
	public static void main(String[] args) {
		String text = "Version: Java   5, Java        6, Java   7, Java     8, Java     12.";
		String s = text.replaceAll("\\s+", " ");
		
		Matcher matcher = p.matcher(s);
		
		while(matcher.find()) {
			
			int start = matcher.start();
			int end = matcher.end();
			
			System.out.println(s.substring(start,end));
		}
	}
}
