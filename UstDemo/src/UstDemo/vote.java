package UstDemo;
import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		System.out.println("Enter your age : ");
		Scanner scan = new Scanner (System.in);
		int age = scan.nextInt();
		if(age<18) {
			System.out.println("You are not eligible to vote");
		}
		else {
			System.out.println("you are eligible to vote");
		}
	}
}
