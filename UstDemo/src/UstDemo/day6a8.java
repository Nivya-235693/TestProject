package UstDemo;

class Myexception extends Exception{
	
}
public class day6a8 {

	public static void main(String[] args) {
		try {
			throw new Myexception();
		}
		catch (Myexception e) 
		{
			System.out.println("caught the exception");
			System.out.println(e);
		}
	}
}
