package UstDemo;

class Print{
	void printn(int a,char c) {
		System.out.println(a+" "+c);
	}
	void printn(char c,int a)
	{
		System.out.println(a+" "+c);
	}
}
public class jumble {

	public static void main(String[] args) {
		Print n = new Print();
		n.printn(2,'a');
		n.printn('a',2);
	}
}

