package week1.day1;

public class D1_002_ClassWithMethods {

	public void openBrowser() {
		System.out.println("We will write the code to open a browser here....");
	}

	public void getSceenshot() {
		System.out.println("We will write the code to getscreenshot here....");
	}

	public void logMsg(String message) {
		System.out.println("We will write the code to log a message in the logfile here....");
	}

	public static void main(String[] args) {
		D1_002_ClassWithMethods obj = new D1_002_ClassWithMethods();
		obj.openBrowser();
		obj.getSceenshot();
		obj.logMsg("");
	}
}
