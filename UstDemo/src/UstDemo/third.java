package UstDemo;

public class third {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			if(i==3) {
				System.out.print((i+1)+" "+(i+1));
				i=i+1;
			}
			else {
				System.out.print(i+" "+(i+1));
			}
			System.out.println();
		}
	}

}
