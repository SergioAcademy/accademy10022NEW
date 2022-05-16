package HW3;

public class EmailValidator implements Validator {

	public boolean validate(String line) {
		if(RegexDate.validEmail(line)==false) {
			return false;
		}else {
			return true;
		}
	}
}