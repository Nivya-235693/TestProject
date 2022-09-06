package UstDemo;

public class hprime {

 public static void main(String[] args) {
	int num=100;
	System.out.println("The prime numbers are:");
	for (int i=1;i<=num;i++) {
		int count=0;
		for(int j=2;j<=i/2;j++) {
			if(i%j == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print(i+" ");
		}
	}
 }
}
