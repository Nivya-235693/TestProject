package UstDemo;

class encap{
	private int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		encap e=new encap();
		e.setName("Nivya");
		e.setRoll(10);
		System.out.println(e.getName());
		System.out.println(e.getRoll());
	}

}
