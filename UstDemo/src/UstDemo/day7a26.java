package UstDemo;

import java.util.HashMap;
import java.util.Set;

public class day7a26 {

	public static void main(String[] args) {
		int k;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3,"blue");
		System.out.println("hashmap "+map);
		Set key = map.keySet();
		System.out.println(key);

	}

}
