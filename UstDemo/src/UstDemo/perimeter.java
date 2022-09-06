package UstDemo;

class area{
	void printn(int a) {
		System.out.println("The area of square="+(a*a));
	}
	void printn(int a,int b) {
		System.out.println("The area of rectrangle="+(2*(a+b)));
	}
}
public class perimeter {

	public static void main(String[] args) {
		area a=new area();
		a.printn(2);
		a.printn(2,3);

	}

}
