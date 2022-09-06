package UstDemo;
import java.util.Scanner;

public class day4a4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[];
		int s=100,l=0;
		a=new int[5];
		System.out.println("enter 10 the number less than 100");
		for(int i=0;i<5;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<5;i++) {
			if(a[i]>l)
				l=a[i];
		}
		for(int i=0;i<5;i++) {
			if(a[i]<s)
				s=a[i];
		}
		System.out.println("The largest number in array is "+l);
		System.out.println("Th smallest number in array is " +s);
	}
}

