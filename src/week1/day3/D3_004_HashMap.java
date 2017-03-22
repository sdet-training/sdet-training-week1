package week1.day3;

import java.util.HashMap;
import java.util.Map;

public class D3_004_HashMap {
	public static void main(String[] args) {
		// Stores in pair, key -> value : Entry
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "IE");
		map.put(6, "FF");
		map.put(4, "Chrome");
		map.put(4, "Safari");
		map.put(4, "Opera");
		
		String value1 = map.get(4);
		System.out.println(value1);
		
		// Keys are unique, value can be duplicated
		map.put(2, "IE");
		map.put(4, "FF");
		String value2 = map.get(4);
		System.out.println(value2);

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}

	}
}
