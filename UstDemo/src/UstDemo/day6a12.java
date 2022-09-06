package UstDemo;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Collections;

public class day6a12 {

	public static void main(String[] args) {
		int data;
		LinkedList <Integer> list = new LinkedList <Integer>();
		Scanner in = new Scanner (System.in);
		System.out.println("enter the element to the linked list");
		for(int i=0;i<4;i++) {
			data = in.nextInt();
			list.add(data);
		}
		Collections.reverse(list);
		ListIterator it = list.listIterator();
		System.out.println("after reversing");
		while(it.hasNext()) {
			System.out.println(""+it.next()+"");
		}
	}
}
