package UstDemo;
import java.util.Scanner;

public class day4a1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[];
		a=new int[10];
		System.out.println("enter the number");
		for(int i=0;i<10;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<10;i++) {
			System.out.println(a[i]);
		}

	}

}
