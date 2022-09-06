package UstDemo;
import java.util.*;
import java.util.HashSet;

public class day7a9 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> Hs = new LinkedHashSet<Integer>();
		Hs.add(2);
		Hs.add(55);
		Hs.add(33);
		Hs.add(44);
		System.out.println("Hash set elements is: "+Hs);
		LinkedHashSet<Integer>chs = new LinkedHashSet<Integer>();
		chs=(LinkedHashSet)Hs.clone();
		System.out.println("cloned hash set elements is: "+chs);
	}
}
