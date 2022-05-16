package lesson9;

public class City {
public int i=1;
public static int j=2;
public class District {
	int houseNumber = 40;
	private void go() {
		System.out.println (i);
		System.out.println (j);
		System.out.println ("Go to the District. ");
		
	}
	private void printHouseNumber() {
		System.out.println ("House number: "+ houseNumber);
	}
}
}
