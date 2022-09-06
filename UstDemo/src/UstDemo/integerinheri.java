package UstDemo;

class data{
	int i;
	void printnum1() {
		System.out.println(i);
	}
}
class subdata extends data{
	int j;
	void printnum() {
		System.out.println(j);
	}
}
public class integerinheri {

	public static void main(String[] args) {
		subdata s=new subdata();
		s.i=5;
		s.j=10;
		s.printnum();
		s.printnum1();
	}
}
