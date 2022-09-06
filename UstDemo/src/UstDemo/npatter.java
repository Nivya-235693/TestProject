package UstDemo;

import java.util.Scanner;

public class npatter {

	public static void main(String[] args) {
		{
			Scanner scan = new Scanner (System.in);
			System.out.print("enter a number: ");
			int a = scan.nextInt();
			for(int i=1;i<a+1;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}

	}

}
