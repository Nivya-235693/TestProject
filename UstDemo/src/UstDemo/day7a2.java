package UstDemo;
import java.util.*;
import java.util.Stack;

public class day7a2 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(23);
		s.push(22);
		s.push(21);
		s.push(20);
		s.push(19);
		System.out.println("stack :");
		Iterator st= s.iterator();
		while(st.hasNext())
			System.out.println(st.next()+" ");
		s.pop();
		System.out.println("\nStack after pop: ");
		Iterator st1=s.iterator();
		while(st1.hasNext())
			System.out.println(st1.next()+" ");
	}

}
