package UstDemo;

public class day5a2 {

	public static void main(String[] args) {
		try {
			int data=100/0;
			System.out.println(data);
		}catch(Exception e) {
			System.out.println("arithmetic exception");
		}
	}
}
