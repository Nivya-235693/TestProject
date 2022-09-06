package UstDemo;

import java.util.Scanner;

public class ultapattern {

	public static void main(String[] args) {
		int k;
		Scanner scan = new Scanner (System.in);
		System.out.print("enter a number: ");
		int a = scan.nextInt();
		k=a;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+k);
				k=k-1;
			}
			k=a;
			System.out.println();
		}
	}
}
