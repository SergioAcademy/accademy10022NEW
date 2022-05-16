package HW3;

public class AmericanPhoneValidator implements Validator {

	public boolean validate(String line) {
		if(RegexDate.validAmerican(line)==false) {
			return false;
		}else {
			return true;
		}
	}

}