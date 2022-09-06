package UstDemo;
abstract class C {
	public void a() {
		System.out.println("abc");
	}
	public abstract void b();
	public abstract void c();	
}
abstract class D extends C{
	public void b() {
		System.out.println("bcd");
	}
}
class E extends D{
	public void c() {
		System.out.println("cde");
	}
}
public class abstraction {
	public static void main(String[] args) {
		D cc=new E();
		cc.a();
		cc.b();
		cc.c();
	}
}