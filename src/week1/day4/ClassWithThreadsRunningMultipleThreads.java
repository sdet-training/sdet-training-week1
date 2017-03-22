package week1.day4;

public class ClassWithThreadsRunningMultipleThreads {
	
	public static void main(String[] args) {
		
		ClassWithThreadsRunningExcelFunctions objXL = new ClassWithThreadsRunningExcelFunctions();
		Thread tXL = new Thread(objXL);
		tXL.start();
		
		ClassWithThreadsRunningDBFunctions objDB = new ClassWithThreadsRunningDBFunctions();
		Thread tDB = new Thread(objDB);
		tDB.start();
		
		ClassWithThreadsRunningSmokeTests objSmoke = new ClassWithThreadsRunningSmokeTests();
		Thread tSmoke = new Thread(objSmoke);
		tSmoke.start();
		
		
		ClassWithThreadsRunningRegressionTests objRegression = new ClassWithThreadsRunningRegressionTests();
		Thread tRegression = new Thread(objRegression);
		tRegression.start();
		
		if (tDB.isAlive()){
			System.out.println("DB Tasks still running.....using thread: " + tDB.getId());
			tDB.interrupt();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("DB Thread STATE: " + tDB.getState());
		}
		
	}

}
