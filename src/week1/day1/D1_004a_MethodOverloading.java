package week1.day1;
import java.util.Random;

public class D1_004a_MethodOverloading {
	
	public int NumOfBookings(){
		Random rand = new Random();
		int  n = rand.nextInt(500) + 1;
		return n;
	}
	
	public void bookings(char c)
    {
		
		int n=NumOfBookings();
		System.out.println(n + " Bookings by code: " + c);
    }
	
    public void bookings(char c, int num)  
    {
    	int n=NumOfBookings();
    	System.out.println(n + " Bookings by code: " + c + " " + num);
    }
    
    public void bookings(int num, char c)  
    {
    	int n=NumOfBookings();
    	System.out.println(n + " Bookings by code: " + c + " " + num);
    }
    
    //***************************************************************
    
    
    public void bookings(int c)
    {
       int n=NumOfBookings();
       System.out.println(n + " Bookings by code: " + c );
    }

}



