package kata.supermarket;

public class Checkout {

	public int calculateTotal(Product... products) {
		int total = 0;
		for(Product product : products){
			total += product.getPrice();
		}
		
		return total;		
	}
}
