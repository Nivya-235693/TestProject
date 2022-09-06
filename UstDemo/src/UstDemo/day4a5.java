package UstDemo;
import java.util.Scanner;

public class day4a5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[][];
		a=new int[3][3];
		System.out.println("enter the number");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("the array is");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();		}
	}

}

