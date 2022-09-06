package UstDemo;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class day6a18 {
	public static void main(String[] args) {
		int data,pi=0,n,c=0,num;
		LinkedList <Integer> list = new LinkedList <Integer>();
		Scanner in = new Scanner (System.in);
		System.out.println("enter the element to the linked list");
		for(int i=0;i<4;i++) {
			data = in.nextInt();
			list.add(data);
		}
		System.out.println("enter the number");
		num = in.nextInt();
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			if(list.get(c)==num) {
				System.out.println("First occurance is "+c);
				break;
			}
			itr.next();
			c++;
		}
		c=0;
		while(itr.hasNext()) {
			if(list.get(c)==num) {
				pi=c;
			}
			itr.next();
			c++;
		}
		System.out.println("last occurance is"+pi);
	}

}
