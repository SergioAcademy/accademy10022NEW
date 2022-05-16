package HW3;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDate {

	public static final Pattern PATTERN = Pattern.compile("^\\d{2}[\\/\\-]\\d{2}[\\/\\-]\\d{4}$");
	public static final Pattern VALIDATOR_AMERICAN = Pattern.compile("^\\+1\\d{10}$");
	public static final Pattern VALIDATOR_BELARUS = Pattern.compile("^\\+375\\d{9}$");
	public static final Pattern VALIDATOR_EMAIL = Pattern.compile("^([a-z0-9_-]+\\\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\\\.[a-z0-9_-]+)*\\\\.[a-z]{2,6}$");
	
	public static boolean test(String date) {
		Matcher matcher = PATTERN.matcher(date);
		return matcher.matches();
	}
	
	public static boolean validAmerican(String tel) {
		Matcher matcher = VALIDATOR_AMERICAN.matcher(tel);
		return matcher.matches();
	}
	
	public static boolean validBelarus(String tel) {
		Matcher matcher = VALIDATOR_BELARUS.matcher(tel);
		return matcher.matches();
	}
	
	public static boolean validEmail(String mail) {
		Matcher matcher = VALIDATOR_EMAIL.matcher(mail);
		return matcher.matches();
	}
}