package week1.day1;

public class D1_007f_PassingArraysFromMethods {

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];

		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

	public static void main(String[] args) {

		int arr[] = { 12, 23, 44, 56, 78 };

		for (int i : arr) {

			System.out.println(i);

		}

		System.out.println(reverse(arr));
	}

}
