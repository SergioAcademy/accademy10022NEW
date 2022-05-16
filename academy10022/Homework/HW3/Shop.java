package HW3;

public class Shop {
	
	public static void main(String[] args) {

		Validator emailValidator = new Validator() {

			public boolean validate(String line) {
				if (RegexDate.validEmail(line) == false) {
					return false;
				} else {
					return true;
				}
			}
		};
		
		User buyer = new User(20, "Alex", 100);
		User seller = new User(21, "Igor", 10);
		Product[] products = new Product[4];

		Product milk = new Milk(2.5, 3, "Milk", "1");
		Product bread = new Bread(2, 1, "Bread", "1");
		Product cheese = new Cheese(5, 2, "Cheese", "1");
		Product butter = new Butter(3, 1, "Butter", "1");

		Deal deal1 = new Deal("25/10/2022", "Minsk", buyer, seller, products);

		deal1.addProduct(milk);
		deal1.addProduct(bread);
		deal1.addProduct(cheese);
		deal1.addProduct(butter);
		System.out.println(deal1);

		deal1.removeProduct(1);
		System.out.println(deal1);

		deal1.deal();

	}
}
