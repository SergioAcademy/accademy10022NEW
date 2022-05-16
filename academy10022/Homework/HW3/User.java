package HW3;

import java.util.Scanner;

public class User {

	private int age;
	private String name;
	private double maney;
	private String dateOfBirth;
	private String phoneNum;
	private String email;

	public User() {
		super();
	}

	public User(int age, String name, double maney) {
		super();
		this.age = age;
		this.name = name;
		this.maney = maney;
		this.phoneNum = phoneNum;
		
		System.out.println("Введите дату рождения " + name);
		
		this.dateOfBirth = SCANNER.nextLine();
		
		if (RegexDate.test(dateOfBirth) == true) {
			System.out.println("Дата прошла проверку на паттерн");
		} else if (RegexDate.test(dateOfBirth) == false) {
			System.out.println("Измените дату на формат dd/mm/yyyy(dd-mm-yyyy)");
			while (RegexDate.test(dateOfBirth) == false) {
				System.out.println("Введите ещё раз");
				dateOfBirth = SCANNER.nextLine();
			}
		}
		System.out.println("Введите номер телефона " + name);
		
		this.phoneNum = SCANNER.nextLine();
		
		BelarusPhoneValidator v = new BelarusPhoneValidator();
		if(v.validate(phoneNum)==false) {
			System.out.println("Телефон должен быть в формате: +375XXXXXXXXX");
			while (v.validate(phoneNum)==false) {
				System.out.println("Введите ещё раз");
				phoneNum = SCANNER.nextLine();
			}
		}else if (RegexDate.test(dateOfBirth) == true) {
			System.out.println("Номер телефона проверку на паттерн");
		}
	}

	public User(int age, String name, double maney, String phoneNum, String email) {
		super();
		this.age = age;
		this.name = name;
		this.maney = maney;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public static final Scanner SCANNER = new Scanner(System.in);

	public double sellerManey(double fullPrice) {
		this.maney += fullPrice;
		return maney;
	}

	public double buyerManey(double fullPrice) {
		this.maney -= fullPrice;
		return maney;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getManey() {
		return maney;
	}

	public void setManey(double maney) {
		this.maney = maney;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [age=");
		builder.append(age);
		builder.append(", name=");
		builder.append(name);
		builder.append(", maney=");
		builder.append(maney);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", phoneNum=");
		builder.append(phoneNum);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}