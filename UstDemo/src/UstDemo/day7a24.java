package UstDemo;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class day7a24 {

	public static void main(String[] args) {
		int k;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3,"blue");
		System.out.println("hashmap "+map);
		Set set = map.entrySet();
		System.out.println("set values: "+set);

	}

}
