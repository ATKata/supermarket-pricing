package kata.supermarket;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckoutTest {
    @Test 
    public void priceALoafOfBread() {
        Checkout checkout = new Checkout();
        assertEquals(100, checkout.calculateTotal(Whole.LOAF_OF_BREAD));
    }
    
    @Test 
    public void priceANoodle() {
        Checkout checkout = new Checkout();
        assertEquals(50, checkout.calculateTotal(Whole.NOODLES));
    }
    
    @Test 
    public void priceASoup() {
        Checkout checkout = new Checkout();
        assertEquals(200, checkout.calculateTotal(Whole.SOUP));
    }
    
    @Test
    public void priceMultipleProducts() {
    	Checkout checkout = new Checkout();
    	assertEquals(200, checkout.calculateTotal(Whole.LOAF_OF_BREAD, Whole.LOAF_OF_BREAD));
    }

    @Test
    public void priceAApple() {
    	Checkout checkout = new Checkout();
    	assertEquals(75, checkout.calculateTotal(new Apple(0.75)));
    }
    
    @Test
    public void shouldDoBuyFourGetOneFreeeeeOnSoup() {
    	Checkout checkout = new Checkout();
    	
    	??
    	checkout.addOffer(new GetXGetYFree(Whole.Soup, 4, 1));
    	checkout.addOffer(new PercentOff(Whole.Bread, 50));
    	
    	assertEquals(800, checkout.calculateTotal(Whole.SOUP, Whole.SOUP, Whole.SOUP, Whole.SOUP, Whole.SOUP));
    }
}
