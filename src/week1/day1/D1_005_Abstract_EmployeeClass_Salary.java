package week1.day1;

public class D1_005_Abstract_EmployeeClass_Salary extends D1_005_Abstract_EmployeeClass {

	private double salary; // Annual salary

	public D1_005_Abstract_EmployeeClass_Salary(String name, String address, int number) {
		super(name, address, number);
		setSalary(salary);
	}

	@Override
	public void mailCheck() {
		System.out.println("Within mailCheck of D1_005_Abstract_EmployeeClass_Salary class ");
		System.out.println("Mailing check to " + getName() + " with salary " + salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}

	@Override
	public double computePay() {
		System.out.println("Computing salary pay for " + getName());
		return salary / 52;
	}

	public static void main(String[] args) {
		D1_005_Abstract_EmployeeClass_Salary s = new D1_005_Abstract_EmployeeClass_Salary("Modi", "Baroda, Gujrat",
				3600);
		D1_005_Abstract_EmployeeClass e = new D1_005_Abstract_EmployeeClass_Salary("John Adams", "Boston, MA", 2400);

		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();
		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();
	}

}
