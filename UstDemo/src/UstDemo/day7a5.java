package UstDemo;
import java.util.Iterator;
import java.util.TreeSet;

public class day7a5 {

	public static void main(String[] args) {
		TreeSet<String> Tse = new TreeSet<String>();
		Tse.add("green");
		Tse.add("blue");
		Tse.add("Red");
		Iterator <String> i = Tse.iterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");
	}
}
