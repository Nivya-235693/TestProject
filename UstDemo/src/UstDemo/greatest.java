package UstDemo;
import java.util.Scanner;

public class greatest {
	public static void main(String[] args) {
		System.out.println("enter first number:");
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		System.out.println("enter the second number");
		int b = scan.nextInt();
		if(a>b) {
			System.out.println("the greatest of the two numbers is "+a);
		}
		else {
			System.out.println("the greatest of the two numbers is "+b);
		}
	}
}
