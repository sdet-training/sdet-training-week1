package week1.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D2_001e_ClassWithFiles {

	public static void main(String[] args) throws IOException {
		String line;
		String strFilePath = "C:\\SeleniumJAVATraining\\testdata\\ubertestdata.txt";
		BufferedReader br = new BufferedReader(new FileReader(strFilePath));

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

	}

}
