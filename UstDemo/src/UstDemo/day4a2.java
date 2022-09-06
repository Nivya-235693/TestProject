package UstDemo;
import java.util.Scanner;

public class day4a2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[],b,flag=0;
		a=new int[10];
		System.out.println("enter 10 numbers");
		for(int i=0;i<10;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("enter any number");
		b=scan.nextInt();
		for(int i=0;i<10;i++) {
			if(a[i]==b) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("The number is present in the array");
		}
		else {
			System.out.println("The number is not present in array");
			}
	}
}
