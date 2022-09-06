package UstDemo;

public class day6a3 {

	public static void main(String[] args) {
		try {
			int a=Integer.parseInt("null");
			System.out.println(a);
		}catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
		}
	}
}
