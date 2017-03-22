package week1.day2;
public class D2_002a_ClassWithExceptionHandling {
	

	

	public void TryAndCatch(){
		int totals;
		int Num1 = 100;
		double Num2 = 20.20;
		float Num3 = 50.055f;
		int Num4 = 0;
		
		long total = (long)(Num1+Num2+Num3);
		
		long DivideTotalByANumber = total/Num4;
		System.out.println("Total: " + DivideTotalByANumber);
		
	}
	

	
	public static void main(String args[]){
		System.out.println("--------------");
		
	try{	
		D2_002a_ClassWithExceptionHandling TC = new D2_002a_ClassWithExceptionHandling();
		TC.TryAndCatch();
		System.out.println("Error handled gracefully");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	}

}
