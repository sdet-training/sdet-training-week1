package week1.day1;

public class D1_007b_IfElseIfStatements {
	public static void main(String[] arguments) {
		int yearNow = 2017;
		int monthNow = 4;
		if (monthNow == 1)
			System.out.println("Month is: " + "Jan");
		else if (monthNow == 2)
			System.out.println("Month is: " + "Feb");
		else if ((monthNow == 3) && (yearNow == 2017))
			System.out.println("Month is: " + "March, 2017");
		else
			System.out.println("Some future month");
	}

}
