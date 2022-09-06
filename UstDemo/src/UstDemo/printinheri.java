package UstDemo;

class PrintNumber{
	void printn(int a) {
		System.out.println(a);
	}
	void printn(double a)
	{
		System.out.println(a);
	}
}
public class printinheri {

	public static void main(String[] args) {
		PrintNumber n = new PrintNumber();
		n.printn(2);
		n.printn(2.5);
	}
}
