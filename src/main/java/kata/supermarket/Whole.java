package kata.supermarket;

public enum Whole implements Product{
	LOAF_OF_BREAD(100), NOODLES(50), SOUP(200);
	
	private int price;

	private Whole(int price){
		this.price=price;
	}
	
	public int getPrice(){
		return price;
	}
	
}
