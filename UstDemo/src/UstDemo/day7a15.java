package UstDemo;
import java.util.*;
import java.util.PriorityQueue;

public class day7a15 {

	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("r");
		p.add("a");
		p.add("f");
		p.add("l");
		p.add("o");
		System.out.println("The elements in the queue is " +p);
		System.out.println("The first element is : " +p.peek());

	}

}
