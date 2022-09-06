package UstDemo;

import java.util.HashMap;

public class day7a18 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		HashMap<Integer, String> map1 = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3,"blue");
		map1.putAll(map);
		System.out.println(map1);
		System.out.println(map);
	}
}
