package HW3;

@Producer(startYear = 2022, founderFullName = "Нёманский")
public class Bread extends Product {

	private String grade;

	public Bread() {
		super();
	}

	public Bread(double price, int quantity, String name, String grade) {
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
		builder.append("Bread [price=");
		builder.append(getPrice());
		builder.append(", quantity=");
		builder.append(getQuantity());
		builder.append(", name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

}