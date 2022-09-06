package UstDemo;
import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		int i,j,c=1;
		Scanner scan = new Scanner (System.in);
		System.out.print("enter a number of rows you want: ");
		int a = scan.nextInt();
		c=a-1;
		for( i=1;i<=a;i++) {
			for( j=1;j<=c;j++) {
				System.out.print(" ");
			}
			c--;
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		c=1;
		for( i=1;i<=a-1;i++) {
			for( j=1;j<=c;j++) {
				System.out.print(" ");
			}
			c++;
			for(j=1;j<=2*(a-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}