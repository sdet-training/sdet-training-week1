package week1.day1;

public class D1_004_ClassWithEncapsulation {

	private int number;

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		/*
		 * if (name.equals("Tim") || name.equals("Bob")) { System.out.
		 * println("This student has been rusticated due to indiscipline"); }
		 */
		System.out.println("45th President of USA " + name);
		this.name = name;
	}

	public static void main(String[] args) {
		D1_004_ClassWithEncapsulation objPrez = new D1_004_ClassWithEncapsulation();

		objPrez.name = "Barack Obama"; // what happened here????

		objPrez.setName("Donald Trump");

		System.out.println("Current US President = " + (objPrez.getName()));
	}

}
