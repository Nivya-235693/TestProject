package UstDemo;
class A{
	static void print() {
		System.out.println("parent");
	}
}
class B extends A{
	static void print() {
		System.out.println("child");
	}
}
public class staticinheri {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		A obj=new B();
		a.print();
		b.print();
		obj.print();
	}
}
