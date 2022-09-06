package UstDemo;
import java.util.*;
import java.util.TreeSet;

public class day7a7 {

	public static void main(String[] args) {
		TreeSet<String> Ts = new TreeSet<String>();
		Ts.add("green");
		Ts.add("blue");
		Ts.add("Red");
		Object F = Ts.first();
		System.out.println("first element is "+F);
		Object L = Ts.last();
		System.out.println("The last element is "+L);
	}
}
