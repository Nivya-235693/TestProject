package UstDemo;
class stu{
	public void print() {
		System.out.println("ACCESS SPECIFIER");
	}
	private String name;
	protected int roll;
	int id_number;
}
class stu1 extends stu{	
}

public class day5a1 {

	public static void main(String[] args) {
		stu1 stu = new stu1();
		stu.print();
		stu.roll=10;
		System.out.println(stu.roll);
		stu.id_number=234;
		System.out.println(stu.id_number);
		//stu.name="abc";
		//System.out.println(stu.name);
	}
}
