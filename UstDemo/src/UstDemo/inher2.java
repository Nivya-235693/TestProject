package UstDemo;

class Member{
	String name = "xyz";
	int age=18;
	int pno=1234567891;
	String address = "abcdefghs";
	int salary = 35000;
	void printSalary() {
		System.out.println(salary);
	}
	void show() {
		System.out.println(name+" " +age+" "+pno+" "+address+" "+salary);
	}
}
class Employee extends Member{
	String spec;
}
class Manager extends Member{
	String dept;
}
public class inher2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="abc";
		e.age=18;
		e.pno=1234567654;
		e.address="adchedf";
		e.salary=23000;
		e.show();
		Manager m = new Manager();
		m.name="abd";
		m.age=19;
		m.pno=1994567654;
		m.address="xyzhedf";
		m.salary=34000;
		m.show();
	}

}
