package HW3;


@Producer(startYear = 2022, founderFullName = "Брест-литовск")
public class Butter extends Milk {

	private String grade;

	public Butter() {
		super();
	}

	public Butter(double price, int quantity, String name, String grade) {
		super(price, quantity, name, grade);
	}

	@Override
	public double getDiscount() {
		if (getQuantity() >= 3) {
			return 0.8;
		}
		return 1;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Butter [price=");
		builder.append(getPrice());
		builder.append(", quantity=");
		builder.append(getQuantity());
		builder.append(", name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

}