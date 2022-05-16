package HW3;

public class BelarusPhoneValidator implements Validator {

	public boolean validate(String line) {
		if(RegexDate.validBelarus(line)==false) {
			return false;
		}else {
			return true;
		}
	}
}