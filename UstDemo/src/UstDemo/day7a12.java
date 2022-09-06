package UstDemo;
import java.util.*;

public class day7a12 {

	public static void main(String[] args) {
		String s;
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("r");
		p.add("a");
		p.add("f");
		p.add("l");
		System.out.println("The elements in the queue is" +p);
		System.out.println("enter the element to be added:");
		Scanner in = new Scanner(System.in);
		s=in.nextLine();
		p.add(s);
		System.out.println(p);
		

	}

}
