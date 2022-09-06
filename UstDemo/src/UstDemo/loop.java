package UstDemo;
import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int i, sum=0;
		int avg;
		int a[];
		a=new int [10];
		System.out.println("enter 10 numbers:");
		for( i=0;i<10;i++) {
			 a[i] =scan.nextInt();
		}
		for(i=0;i<10;i++) {
			sum = sum + a[i];
		}
		avg = sum/10;
		System.out.println("the average is:"+avg);
	}

}
