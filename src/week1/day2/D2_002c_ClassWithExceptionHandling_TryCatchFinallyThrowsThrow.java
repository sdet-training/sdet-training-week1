package week1.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class D2_002c_ClassWithExceptionHandling_TryCatchFinallyThrowsThrow {
	public static void main(String args[]) throws IOException {  
		fileReaderWriter();
	}

	private static void fileReaderWriter() throws IOException {
		FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         in = new FileInputStream("../../testdata/ubertestdata.txt");
	         //System.out.println("Reading data ......");
	         out = new FileOutputStream("../../testdata/ubertestdata_output.txt");
	         
	         int c;
	       //Java byte streams are used to perform input(read) and output(write) of 8-bit bytes.
	         
	         while ((c = in.read()) != -1) {
	        	 
	        	 //It will display the byte number it is reading.....
	        	 System.out.println("Reading data ......" + c);
	            out.write(c);
	         }
		} catch (FileNotFoundException e) {
			// System.out.println("Input/output error: " + e.getMessage());
			throw e;

		} finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	}

}
