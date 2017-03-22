package week1.day4;

public class ClassWithThreadsRunningDBFunctions implements Runnable{
	
	public void run(){
		
		System.out.println("Starting Code Performing Database Tasks..... on it's own thread ");
		System.out.println("DB Thread name is: " + Thread.currentThread().getName());
		System.out.println("DB Thread ID is: " + Thread.currentThread().getId());
		for(long i=1;i<100000000;i++){
			//System.out.println("Performing DATABASE tasks........." );
			//System.out.println("still performing DB tasks using thread: " + Thread.currentThread().getId());
		}
	}
}
