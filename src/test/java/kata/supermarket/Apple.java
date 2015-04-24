package kata.supermarket;

public class Apple implements Product {
	private static final int pricePerUnitWeight = 100;
	private double weight;

	public Apple(double weight) {
		this.weight = weight;
	}

	@Override
	public int getPrice() {
		return (int) Math.round(pricePerUnitWeight*weight);
	}

}
