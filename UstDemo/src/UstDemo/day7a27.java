package UstDemo;

import java.util.HashMap;
import java.util.Set;

public class day7a27 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3,"blue");
		System.out.println("hashmap "+map);
		System.out.println("the collection view is :" +map.values());
	}
}
