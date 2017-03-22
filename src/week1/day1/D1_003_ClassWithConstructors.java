package week1.day1;

public class D1_003_ClassWithConstructors {
	
	public D1_003_ClassWithConstructors(){
		System.out.println("Constructor code getting executed");
	}
	
	public D1_003_ClassWithConstructors(int numOfIteration) {
		this();
		System.out.println("integer type One argument Constructor code getting executed");
	}

	public D1_003_ClassWithConstructors(String browserType) {
		this();
		System.out.println("String type One argument Constructor code getting executed");
	}

	public D1_003_ClassWithConstructors(String browserType, String AUT_URL) {
		this();
		System.out.println("String and String type Two argument Constructor code getting executed");
		System.out.println("Opening browser: " + browserType + " and navigating to the AUT: " + AUT_URL);
	}
	
	public void searchProduct(String itemToSearch) {
		System.out.println("searching for :" + itemToSearch);
	}
	
	public void addingItemToCart(int qty) {
		System.out.println("adding item to cart :" + qty);
	}
	
	
	public static void main(String[] args) {
		D1_003_ClassWithConstructors obj1 = new D1_003_ClassWithConstructors();
		obj1.searchProduct("IPhone 7 Plus");
		obj1.addingItemToCart(1);
		D1_003_ClassWithConstructors obj2 = new D1_003_ClassWithConstructors(10);
	}

}
