package week1.day1;

public class D1_007f_PassingArrayToMethod {

	
		static void min(int arr[]) {
			int min = arr[0];
			for (int i = 1; i < arr.length; i++)
				if (min > arr[i])
					min = arr[i];
			System.out.println(min);
		}

		public static void main(String args[]) {

		int a[] = { 33, 13, 4, 5 };
			min(a);// passing array to method
		}
	}


