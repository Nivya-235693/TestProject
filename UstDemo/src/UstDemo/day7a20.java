package UstDemo;

import java.util.HashMap;

public class day7a20 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"red");
		if(map.isEmpty())
			System.out.println("empty");
		else
			System.out.println("not empty");
	}

}
