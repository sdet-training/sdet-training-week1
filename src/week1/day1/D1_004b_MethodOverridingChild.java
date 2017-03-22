package week1.day1;

public class D1_004b_MethodOverridingChild extends D1_004b_MethodOverridingParent{
	   
	public D1_004b_MethodOverridingChild(){
		
		System.out.println("CHILD CONSTRUCTOR .....MethodOverridingChild...");
	}
	
	public void booking(){
		      //super.booking();
		System.out.println("Child class.....booking");
		   }
	
	public void ratelookup(String PULoc, String DOLoc){
		System.out.println("Child class.....ratelookup");
	   }
	
	@Override
	public void tax() {
		System.out.println("Child class.....TAX");
	}

	public void vat(){
		System.out.println("Child class....VAT");
	}

}
