package UstDemo;

import java.util.HashMap;
import java.util.Scanner;

public class day7a25 {

	public static void main(String[] args) {
		int k;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3,"blue");
		System.out.println(map);
		System.out.println("enter the key to get the value ");
		Scanner in = new Scanner (System.in);
		k=in.nextInt();
		String val = (String) map.get(k);
		System.out.println("the value of "+k+" is "+val);
	}

}
