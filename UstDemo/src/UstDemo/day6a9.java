package UstDemo;
import java.util.*;

public class day6a9 {

	public static void main(String[] args) {
		int data,newdata;
		LinkedList <Integer> list = new LinkedList <Integer>();
		Scanner in = new Scanner (System.in);
		System.out.println("enter the element to the linked list");
		for(int i=0;i<4;i++) {
			data = in.nextInt();
			list.add(data);
		}
	System.out.println("The linked list");
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next()+"");
	}
	System.out.println("Enter the new element ");
	newdata = in.nextInt();
	list.addLast(newdata);
	
	System.out.println("the new linked list is");
	Iterator itr =list.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next()+"");
	}
}

}
