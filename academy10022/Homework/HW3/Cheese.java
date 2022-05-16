package HW3;

@Producer(startYear = 2022, founderFullName = "Брест-литовск")
public class Cheese extends Product {

	private String grade;

	public Cheese() {
		super();
	}

	public Cheese(double price, int quantity, String name, String grade) {
		super(price, quantity, name);
		this.grade = grade;
	}

	@Override
	public double getDiscount() {
		if (getQuantity() >= 3) {
			return 0.8;
		}
		return 1;
	}

	public String getColor() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheese [price=");
		builder.append(getPrice());
		builder.append(", quantity=");
		builder.append(getQuantity());
		builder.append(", name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

}