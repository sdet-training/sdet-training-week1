package week1.day2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class D2_001b_ClassWithCharacterStreams_FileInputReader_FileOutputWriter {
	
	public static void main(String args[]) throws IOException {
	      FileReader in = null;
	      FileWriter out = null;

	      try {
	         in = new FileReader("../../testdata/ubertestdata.txt");
	         out = new FileWriter("../../testdata/ubertestdata_filewriter_output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	        	 //This read() method reads the specified byte of data from the InputStream. Returns an int. 
	        	 //Returns the next byte of data and -1 will be returned if it's the end of the file.
	        	System.out.println("Reading data ......" + c);
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
}
