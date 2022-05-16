package HW3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Deal {

	private String timeDate;
	private String place;
	private User buyer;
	private User seller;
	private Product[] products;
	private int index = 0;
	private static final LocalDate DEADLINE = LocalDate.now().plusDays(10);

	public Deal() {
		super();
	}

	public Deal(String timeDate, String place, User buyer, User seller) {
		super();
		this.timeDate = timeDate;
		this.place = place;
		this.buyer = buyer;
		this.seller = seller;
	}

	public Deal(String timeDate, String place, User buyer, User seller, Product[] products) {
		super();
		this.timeDate = timeDate;
		this.place = place;
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public void addProduct(Product product) {
		if (products == null) {
			index = 0;
			products = new Product[10];
		}
		if (index >= products.length) {
			productsGrow();
		}
		products[index++] = product;
	}

	public void productsGrow() {
		Product[] tempProducts = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempProducts, 0, products.length);
		products = tempProducts;
	}

	public void removeProduct(int removeIndex) {
		if (removeIndex < products.length && removeIndex >= 0) {
			System.arraycopy(products, removeIndex + 1, products, removeIndex, products.length - removeIndex - 1);
			products[--index] = null;
		}
	}

	public void deal() {
		if (RegexDate.test(timeDate) == true) {
			System.out.println("Дата сделки прошла проверку");
		} else if (RegexDate.test(timeDate) == false) {
			System.out.println("Измените дату на формат dd/mm/yyyy(dd-mm-yyyy)");
			return;
		}
		if (products == null) {
			System.out.println("В корзине ничего нет)");
			return;
		}
		double fullPrice = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				fullPrice += products[i].getCalculatePrice();
			}
		}
		if (buyer.getManey() < fullPrice) {
			System.out.println("У Вас недостаточно денег");
			return;
		} else {
			System.out.println("-----------CHECK-----------");
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM u");
			String s = timeDate.replaceAll("\\/", " ");
			System.out.println(dateTimeFormatter.parse(s));
			System.out.println("Больше двух единиц товара - скидка 20%");
			for (int i = 0; i < products.length; i++) {
				if (products[i] != null) {
					System.out.println(i + 1 + ". " + products[i].getName() + "    " + products[i].getQuantity() + "шт   "
							+ products[i].getCalculatePrice() + "$");
				}
			}
			System.out.println("Итого: " + fullPrice + "$");
			System.out.println("--------------------------");
			System.out.println("Стало денег у продавца: " + seller.sellerManey(fullPrice) + "$");
			System.out.println("Стало денег у покупателя: " + buyer.buyerManey(fullPrice) + "$");
		}
	}

	public String getTimeDate() {
		return timeDate;
	}

	public void setTimeDate(String timeDate) {
		this.timeDate = timeDate;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public static LocalDate getDeadline() {
		return DEADLINE;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [timeDate=");
		builder.append(timeDate);
		builder.append(", place=");
		builder.append(place);
		builder.append(", buyer=");
		builder.append(buyer);
		builder.append(", seller=");
		builder.append(seller);
		builder.append(", products=");
		builder.append(Arrays.toString(products));
		builder.append("]");
		return builder.toString();
	}

}