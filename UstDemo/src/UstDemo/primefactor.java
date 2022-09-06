package UstDemo;

import java.util.Scanner;

public class primefactor {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("enter a number: ");
		int a = scan.nextInt();
		for(int i=2;i<a;i++) {
			while(a%i == 0) {
				System.out.println(i);
				a=a/i;
			}
		}
		if(a>2) {
			System.out.println(a);
		}
	}
}
