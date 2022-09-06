package UstDemo;
import java.io.File;

public class filedelete {

	public static void main(String[] args) {
		File f=new File("example.txt");
		if(f.delete()) {
			System.out.println(f.getName() + " deleted");
		}
		else {
			System.out.println("already deleted");
		}

	}

}
