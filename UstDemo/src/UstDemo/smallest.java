package UstDemo;
import java.util.Scanner;

public class smallest {
	public static void main(String[] args) {
		System.out.print("enter first number: ");
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		System.out.print("enter the second number: ");
		int b = scan.nextInt();
		System.out.print("enter the third number: ");
		int c = scan.nextInt();
		if(a<b && a<c) {
			System.out.println("the smallest number is "+a);
		}
		else if(b<a && b<c) {
			System.out.println("the smallest number is "+b);
		}
		else {
			System.out.println("the smallest number is "+c);
		}
	}
}
