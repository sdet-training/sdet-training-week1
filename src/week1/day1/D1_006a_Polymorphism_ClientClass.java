package week1.day1;

public class D1_006a_Polymorphism_ClientClass {
	public static void main(String[] args) {
		D1_006a_Polymorphism_AutomationTesting objAT = new D1_006a_Polymorphism_AutomationTesting();
		objAT.testing();
		objAT.sendEmail();
		
		D1_006a_Polymorphism_AutomationTesting objPT = new D1_006a_Polymorphism_PerformanceTesting();
		objPT.testing();
		objPT.sendEmail();

		/*
		 * An instance of PerformanceTesting class is created and store in a
		 * reference variable of type AutomationTesting. AutomationTesting objPT
		 * = new PerformanceTesting(); //Reference variable type =>
		 * AutomationTesting //Object referred to => PerformanceTesting
		 * //PerformanceTesting's testing method is called.
		 * System.out.println(objPT.testing()); // When testing method is called
		 * on objPT, it invokes the testing method in PerformanceTesting class
		 * (type of the object pointed to by reference variable onjPT).
		 * 
		 * Even though PerformanceTesting has a method run, it cannot be invoked
		 * using super class reference variable. //objPT.printReport();//COMPILE
		 * ERROR
		 */
		
	}
}
