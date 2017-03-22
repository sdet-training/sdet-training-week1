package week1.day4;
/**
 * MultiThreading Example
 * @author sdettrainer
 * @version 1.0
 */
public class ClassWithThreads implements Runnable{
	
public void run(){
	System.out.println("....Thread is: " + Thread.currentThread().getName());
	System.out.println("....Thread is: " + Thread.currentThread().getId());
}


public static void main(String[] args) throws InterruptedException {
	ClassWithThreads objT = new ClassWithThreads();
	//objT.run();
	Thread t1 = new Thread(objT);
	t1.start();
	
	Thread.sleep(2000);
	for(int i=1;i<10;i++){
		System.out.println("Thread in main: " + Thread.currentThread().getName());
		System.out.println("Thread in main: " + Thread.currentThread().getId());
	}
 }
}
