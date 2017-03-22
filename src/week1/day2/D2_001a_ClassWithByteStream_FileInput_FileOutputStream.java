package week1.day2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D2_001a_ClassWithByteStream_FileInput_FileOutputStream {
	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		in = new FileInputStream("C:\\SeleniumJAVATraining\\testdata\\ubertestdata.txt");
		// System.out.println("Reading data ......");
		out = new FileOutputStream("C:/SeleniumJAVATraining/testdata/ubertestdata_output.txt");

		int c;
		// Java byte streams are used to perform input(read) and output(write)
		// of 8-bit bytes.

		while ((c = in.read()) != -1) {

			// It will display the byte number it is reading.....
			System.out.println("Reading data ......" + c);
			out.write(c);
		}

	}
}
