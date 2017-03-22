package week1.day1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class D1_004d_Impl_Invoice_Interface implements D1_004d_Invoice {
	int invnum = 0;
	String invdte = null;
	int ordnum = 1;


	@Override
	public void invoiceNumber(int newValue) {
		invnum = newValue;
		System.out.println("invoiceNumber: " + invnum);

	}


	@Override
	public void invoiceDate(String newValue) {
		invdte = newValue;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		Date date = new Date();
		System.out.println(sdf.format(date));
		Date date1;
		try {
			date1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(invdte);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(date1.toString());
		// invdte = date1.toString();
		System.out.println("invoiceDate: " + invdte);
	}


	@Override
	public void orderNumber(int increment) {
		ordnum = increment;
		System.out.println("orderNumber: " + ordnum);
	}


	@Override
	public void netTerm(String termDetails) {
		// TODO Auto-generated method stub

	}

	public static void main(String args[]) {
		System.out.println("-----------------------------");

		try {
			D1_004d_Impl_Invoice_Interface Invoice = new D1_004d_Impl_Invoice_Interface();
			Invoice.invoiceNumber(1001);
			System.out.println("-----------------------------");
			Invoice.orderNumber(666666);
			System.out.println("-----------------------------");
			Invoice.invoiceDate("March 20, 2017");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
