package UstDemo;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class day7a6 {

	public static void main(String[] args) {
		TreeSet<String> Ts = new TreeSet<String>();
		Ts.add("green");
		Ts.add("blue");
		Ts.add("Red");
		Iterator <String> i = Ts.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");
	}
}
