package week1.day1;

public class D1_004a_MethodOverloadingClient {
	
	public static void main(String args[])
	   {
		//Overloading – Different Number of parameters in argument list
	       D1_004a_MethodOverloading objOverloading = new D1_004a_MethodOverloading();
	       objOverloading.bookings('S');
	       objOverloading.bookings('S',1001);
	       
	       
	     //Overloading – Difference in data type of arguments
	       objOverloading.bookings(5555);
	       
	       
	     //Overloading – Sequence of data type of arguments
	       objOverloading.bookings(2002, 'S');
	       
	   }

}
