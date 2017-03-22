package week1.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class D3_003_HashSet {
	public static void main(String[] args) {

		// HashSet - Does not maintain order
		Set<String> set = new HashSet<String>();

		set.add("textFile_HashSet");
		set.add("csvFile_HashSet");
		set.add("excelFile_HashSet");
		set.add("dbFile_HashSet");

		// System.out.println(set);
		System.out.println("\nHash");
		for (String item : set) {
			System.out.println(item);
		}

		// LinkedHashSet - It maintains the order in which the elements are
		// added
		Set<String> lHSet = new LinkedHashSet<String>();
		lHSet.add("textFile_LinkedHashSet");
		lHSet.add("csvFile_LinkedHashSet");
		lHSet.add("excelFile_LinkedHashSet");
		System.out.println("\nLinked");
		for (String item : lHSet) {
			System.out.println(item);
		}

		// TreeSet - IT maintains the natural sorting 1, 2, 3... alphabetical
		Set<String> tSet = new TreeSet<String>();
		tSet.add("textFile_TreeSet");
		tSet.add("csvFile_TreeSet");
		tSet.add("excelFile_TreeSet");
		System.out.println("\nTree");
		for (String item : tSet) {
			System.out.println(item);
		}

		List<String> list = new ArrayList<String>();

		list.add("textFile_ArrayList");
		list.add("csvFile_ArrayList");
		list.add("excelFile_ArrayList");
		list.add("excelFile_ArrayList");
		System.out.println("\nList");
		for (String item : list) {
			System.out.println("The item is: " + item);
		}

	}


}
