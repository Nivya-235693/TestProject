package UstDemo;
import java.io.*;

public class day6a1 {

	public static void main(String[] args) {
		String ptr=null;
		try {
			if(ptr.equals("gfg"))
				System.out.println("same");
		}
		catch(NullPointerException e) {
			System.out.println("null pointer exception");
		}

	}

}
