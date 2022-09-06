package UstDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class day6a17 {

	public static void main(String[] args) {
		int data,newdata,n,pos;
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
		System.out.println("enter the position");
		pos=in.nextInt();
		System.out.println("Enter number of element to be added");
		n=in.nextInt();
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			newdata = in.nextInt();
			list.add(pos-1+i,newdata);
		}
		
		System.out.println("the new linked list is");
		Iterator itr =list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()+"");

}
	}
	
}

