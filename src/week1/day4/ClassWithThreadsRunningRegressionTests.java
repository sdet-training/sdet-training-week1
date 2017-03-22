package week1.day4;

public class ClassWithThreadsRunningRegressionTests implements Runnable{

	
	public void run(){
		System.out.println("Starting Code Performing Regression Tests Tasks..... on it's own thread ");
		System.out.println("Regression Thread name is: " + Thread.currentThread().getName());
		System.out.println("Regression Thread ID is: " + Thread.currentThread().getId());
	}
	
}
