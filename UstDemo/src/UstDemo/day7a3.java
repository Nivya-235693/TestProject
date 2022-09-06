package UstDemo;
import java.util.*;
import java.util.Vector;

public class day7a3 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("hello");
		v.add("Hi");
		v.add("bye");
		Iterator vt = v.iterator();
		while(vt.hasNext())
			System.out.println(vt.next()+" ");
	}
}
