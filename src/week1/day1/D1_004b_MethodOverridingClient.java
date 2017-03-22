package week1.day1;

public class D1_004b_MethodOverridingClient {
	
	 public static void main( String args[]) {
		D1_004b_MethodOverridingChild objCC = new D1_004b_MethodOverridingChild();
		objCC.booking();
		objCC.ratelookup("JFK", "Manhattan");
		objCC.tax();
		objCC.vat();
	      
	      
	      System.out.println("************************************************");
	      
	    //Parent class reference to child class object
		D1_004b_MethodOverridingParent objPC = new D1_004b_MethodOverridingChild();
	   
		objPC.takeScreenshot();
		objPC.tax();
	      
	      
	   }

}
