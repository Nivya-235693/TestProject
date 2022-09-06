package UstDemo;

class degree{
	void getdegree() {
		System.out.println("I got a degree");
	}
}
class undergraduate extends degree{
	void getdegree() {
		System.out.println("I am undergraduate");
	}
}
class postgraduate extends degree{
	void getdegree(){
		System.out.println("I am postgraduate");
	}
}
public class deg {

	public static void main(String[] args) {
		degree d=new degree();
		undergraduate u=new undergraduate();
		postgraduate p=new postgraduate();
		d.getdegree();
		u.getdegree();
		p.getdegree();
	}
}
