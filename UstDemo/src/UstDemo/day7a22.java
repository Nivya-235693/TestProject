package UstDemo;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class day7a22 {

	public static void main(String[] args) {
		int k;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"red");
		map.put(2, "green");
		map.put(3,"blue");
		System.out.println(map);
		System.out.println("enter the key to be checked in the map ");
		Scanner in = new Scanner (System.in);
		k=in.nextInt();
		System.out.println("is the value "+k+" present? "+map.containsKey(k));

	}

}

