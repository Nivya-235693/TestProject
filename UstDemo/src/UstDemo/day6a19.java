package UstDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class day6a19 {

	public static void main(String[] args) {
		int data,pi=0,n,c=0,num;
		LinkedList <Integer> list = new LinkedList <Integer>();
		Scanner in = new Scanner (System.in);
		System.out.println("enter the element to the linked list");
		for(int i=0;i<4;i++) {
			data = in.nextInt();
			list.add(data);
		}
		System.out.println("Enter the element to be deleted");
		n=in.nextInt();
		Iterator itr=list.iterator();
		while(itr.hasNext())
			if(list.get(c)==n) {
				list.remove(c-1);
				break;
			}	
		System.out.println("the new linked list is");
		Iterator itr1 =list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()+"");
		}
	}
}
}

