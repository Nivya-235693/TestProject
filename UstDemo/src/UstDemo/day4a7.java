package UstDemo;

abstract class Animals {
	public abstract void cats();
	public abstract void dogs();	
}
class cat extends Animals{
	public void cats() {
		System.out.println("cat mew");
	}
	@Override
	public void dogs() {
		
	}
}
class dog extends Animals{
	public void dogs() {
		System.out.println("dog bark");
	}
	@Override
	public void cats() {
	}
}		
public class day4a7 {

	public static void main(String[] args) {
		cat c=new cat();
		dog d=new dog();
		c.cats();
		d.dogs();
	}
}
