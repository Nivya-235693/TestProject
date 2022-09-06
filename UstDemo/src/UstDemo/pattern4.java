package UstDemo;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		int i,j;
		Scanner scan = new Scanner (System.in);
		System.out.print("enter a number of rows you want: ");
		int a = scan.nextInt();
		for( i=1;i<a+1;i++) {
			for( j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		for( i=a-1;i>0;i--) {
			for( j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}

	
		
