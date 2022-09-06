package UstDemo;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class day6a13 {

	public static void main(String[] args) {
			int data,pos,newdata;
			LinkedList <Integer> list = new LinkedList <Integer>();
			Scanner in = new Scanner (System.in);
			System.out.println("enter the element to the linked list");
			for(int i=0;i<4;i++) {
				data = in.nextInt();
				list.add(data);
			}
			System.out.println("enter the element ");
			newdata=in.nextInt();
		System.out.println("Enter the position");
		pos = in.nextInt();
		list.add(pos-1,newdata);
		System.out.println("the new linked list is");
		Iterator itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next()+"");
	}
}
