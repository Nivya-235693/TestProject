package UstDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class day6a14 {

	public static void main(String[] args) {
		int data,newdata,newdata1;
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
		System.out.println("Enter first element and last element ");
		newdata = in.nextInt();
		list.addFirst(newdata);
		newdata1 = in.nextInt();
		list.addLast(newdata1);
			
		System.out.println("the new linked list is");
		Iterator itr =list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()+"");

	}

	}
}
