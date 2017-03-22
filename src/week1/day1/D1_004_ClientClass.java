package week1.day1;
import org.junit.Test;



//import Wk1_Loops.FirstClass.java;

public class D1_004_ClientClass {
	
	public static void main(String[] args) {
		D1_003_ClassWithConstructors obj = new D1_003_ClassWithConstructors("IE", "sdettraining.com");

		obj.searchProduct("Samsung Note7");
		obj.addingItemToCart(2);
	}

	@Test
	public void SA(){
		
		
		
		// System.out.println("Second Class A:");
		
		//assertEquals("A","B");
		
		// assertTrue(true);
		
		// assertFalse(false);
		
		
	}
	
	
	@Test
    public void SB(){
	System.out.println("Second Class B:");
	}

}
