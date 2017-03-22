package week1.day3;

import java.util.ArrayList;

public class D3_002_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> browsers = new ArrayList<String>();
		// Adding
		browsers.add("InternetExplorer");
		browsers.add("GoogleChrome");
		browsers.add("Firefox");

		// Size
		int size = browsers.size();
		System.out.println("The size of the list is: " + size);

		// IndexOf
		System.out.println("\nIndexOf example");
		System.out.println("Index of GoogleChrome in the list = " + browsers.indexOf("GoogleChrome"));

		// Get
		System.out.println("The item on index 1 is: " + browsers.get(1));

		// Iteration
		System.out.println("\nIteraton example");
		for (int i = 0; i < size; i++) {
			System.out.println("Item on index " + i + " is: " + browsers.get(i));
		}

		System.out.println("\nNext for loop example");
		for (String browser : browsers) {
			System.out.println("The item is: " + browser);
		}

		// Remove
		browsers.remove(size - 1);

		System.out.println("\nNext for loop example after removing");
		for (String browser : browsers) {
			System.out.println("The item is: " + browser);
		}
	}

}
