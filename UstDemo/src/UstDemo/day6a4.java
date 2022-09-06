package UstDemo;

public class day6a4 {

	public static void main(String[] args) {
		String str="hello";
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println(str.length());
		try {
			System.out.println(str.charAt(7));
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("string index out of bound exception");
		}
	}
}
