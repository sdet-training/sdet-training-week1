package week1.day4;

public class ClassWithThreadsRunningSmokeTests implements Runnable{
	
	public void run(){
		System.out.println("Starting Code Performing Smoke Test Tasks..... on it's own thread ");
		System.out.println("Smoke Thread name is: " + Thread.currentThread().getName());
		System.out.println("Smoke Thread ID is: " + Thread.currentThread().getId());
	}
	

}
