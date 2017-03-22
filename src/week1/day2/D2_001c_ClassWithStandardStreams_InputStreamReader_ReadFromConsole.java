package week1.day2;

import java.io.IOException;
import java.io.InputStreamReader;

public class D2_001c_ClassWithStandardStreams_InputStreamReader_ReadFromConsole {
	
	public static void main(String args[]) throws IOException {
	      
		InputStreamReader cin = null;

	      try {
	         cin = new InputStreamReader(System.in);
	         System.out.println("Enter characters, 'q' to quit.");
	         char c;
	         do {
	            c = (char) cin.read();
	            System.out.print(c);
	         } while(c != 'q');
	      }finally {
	         if (cin != null) {
	            cin.close();
	         }
	      }
	   }
}
