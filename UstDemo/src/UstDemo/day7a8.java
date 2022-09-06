package UstDemo;
import java.util.*;
import java.util.Iterator;
import java.util.TreeSet;

public class day7a8 {

	public static void main(String[] args) {
		TreeSet<Integer> Ts = new TreeSet<Integer>();
		Ts.add(1);
		Ts.add(2);
		Ts.add(3);
		Ts.add(7);
		Ts.add(8);
		Ts.add(9);
		Ts.add(10);
		Ts.add(8);
		System.out.println(Ts);
		System.out.println("The numbers less than 7 is:");
		for(int e:Ts)
		{
			if(e<7)
			{
				System.out.print(e+" ");
			}
		}
	}
}
