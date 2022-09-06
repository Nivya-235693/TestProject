package UstDemo;
import java.util.*;
import java.util.Set;

public class day7a10 {

	public static void main(String[] args) {
		Set <Integer> s= new HashSet <Integer>();
		Set <Integer> s2= new HashSet  <Integer>();
		Integer[] a= {22,23,24,25};
		s.addAll(Arrays.asList(a));
		System.out.println(s);
		Integer[] b= {22,23,24,25,27,28};
		s2.addAll(Arrays.asList(b));
		System.out.println(s2);
		System.out.println("The common element is");
		Set<Integer> sn = new HashSet(s);
		sn.retainAll(s2);
		System.out.println(sn);
	}
}
