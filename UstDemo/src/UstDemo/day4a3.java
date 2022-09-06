package UstDemo;

import java.util.Scanner;

public class day4a3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[],sum=0,p=1;
		a=new int[10];
		System.out.println("enter the number");
		for(int i=0;i<10;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<10;i++) {
			sum=sum+a[i];
			p=p*a[i];
		}
		System.out.println("The sum of the numbers is "+sum);
		System.out.println("The product od the numbers "+p);

	}
}