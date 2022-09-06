package UstDemo;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class filewrite {

	public static void main(String[] args) {
		try {
			FileWriter myWriter=new FileWriter("example.txt");
			myWriter.write("hello ");
			myWriter.write("welcome to the java course");
			myWriter.close();
			
			File fileobj=new File("example.txt");
			Scanner myReader=new Scanner(fileobj);
			while(myReader.hasNextLine()) {
				String data= myReader.nextLine();
				System.out.println(data);}
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	

	
}


