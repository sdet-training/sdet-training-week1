package week1.day4;

public class ClassWithThreadsRunningExcelFunctions implements Runnable{

	public void run(){
		System.out.println("Starting Code Performing Excel Tasks..... on it's own thread ");
		System.out.println("XL Thread name is: " + Thread.currentThread().getName());
		System.out.println("XL Thread ID is: " + Thread.currentThread().getId());
	}
}
