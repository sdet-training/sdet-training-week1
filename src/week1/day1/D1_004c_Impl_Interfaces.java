package week1.day1;

public class D1_004c_Impl_Interfaces implements D1_004c_Interface_One, D1_004c_Interface_Two {

	@Override
	public void csvData(String filePath) {
		// TODO Auto-generated method stub
		System.out.println("Getting csv Data.....");

	}

	@Override
	public void excelData(String filePath) {
		// TODO Auto-generated method stub
		System.out.println("Getting excel Data.....");
	}

	@Override
	public void dbData(String filePath) {
		// TODO Auto-generated method stub
		System.out.println("Getting db Data.....");

	}

	@Override
	public void takeScreenshot() {
		// TODO Auto-generated method stub
		System.out.println("take screenshot.....");

	}

	@Override
	public void takeScreenshot(String filePath) {
		// TODO Auto-generated method stub
		System.out.println("takescreenshot and save as gif/png/jpg.....");
	}

	@Override
	public void tax() {
		// TODO Auto-generated method stub
		System.out.println("compute tax.....");
	}

	public static void main(String[] args) {

		D1_004c_Impl_Interfaces objTest = new D1_004c_Impl_Interfaces();

		String filePath = "xlFile.xls";
		objTest.csvData(filePath);
		objTest.excelData(filePath);
		objTest.takeScreenshot();

	}

}
