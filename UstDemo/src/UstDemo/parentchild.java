package UstDemo;
class PARENT{
	void show() {
		System.out.println("This is parent class");
	}
}
class CHILD extends PARENT{
	void show() {
		System.out.println("This is a child class");
	}
}

public class parentchild {
	public static void main(String[] args) {
		PARENT p = new PARENT();
		CHILD c = new CHILD();
		PARENT cp = new CHILD();
		p.show();
		c.show();
		cp.show();
	}

}
