package UstDemo;

import java.util.HashMap;

public class day7a19 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3,"blue");
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}
}
