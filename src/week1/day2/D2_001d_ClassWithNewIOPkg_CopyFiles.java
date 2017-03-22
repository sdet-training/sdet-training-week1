package week1.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class D2_001d_ClassWithNewIOPkg_CopyFiles {
	
	public static void main(String[] args) {
		
		Path source = Paths.get("C:/SeleniumJavaTraining/testdata/ubertestdata.txt");
		Path target = Paths.get("C:/SeleniumJavaTraining/testdata/ubertestdata_output_nio.txt");
		try {
		    Files.copy(source, target, 
		            StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
