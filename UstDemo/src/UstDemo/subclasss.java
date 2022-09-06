package UstDemo

class shape{
	 public void print() {
		System.out.println("This is Shape");
	}
}
class rectangle extends shape{
	public void show() {
		System.out.println("This is rectangle");
	}
}
class square extends rectangle{
	public void shows() {
		System.out.println("Square is a rectangle");
	}
}
class circle extends shape{
	public void showsi() {
		System.out.println("This is circle");
	}
}

public class subclasss {

	public static void main(String[] args) {
		square s = new square();
		s.show();
		s.print();
	}
}
