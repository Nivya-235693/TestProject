package UstDemo;
import java.util.*;
import java.util.Arrays;
import java.util.PriorityQueue;

public class day7a14 {

	public static void main(String[] args) {
		int c=0;
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();
		Integer a[]= {1,2,3,4};
		Integer b[]= {1,2,3,4};
		p1.addAll(Arrays.asList(a));
		System.out.println(p1);
		p2.addAll(Arrays.asList(b));
		System.out.println(p2);
		for(int e:p1) {
			for(int e1:p2) {
				if (e==e1) {
					c++;
					break;
				}
			}
		}
		if(c==4) {
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		}

	}


