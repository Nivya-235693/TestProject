package UstDemo;
import java.util.*;

public class day7a1 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("d");
		System.out.print("array : [ ");
		Iterator at =arr.iterator();
		while(at.hasNext())
			System.out.print(at.next()+" ");
		System.out.print("]");
	}

}
