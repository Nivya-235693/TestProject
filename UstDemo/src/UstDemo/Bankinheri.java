package UstDemo;

class bank{
	void getbalance() {
		System.out.println(0);
	}
}
class banka extends bank{
	void getbalance() {
		System.out.println("balance in bank A is 1000");
	}
}
class bankb extends bank{
	void getbalance() {
		System.out.println("balance in bank B is 1500");
	}
}
class bankc extends bank{
	void getbalance() {
		System.out.println("balance in bank C is 2000");
	}
}
public class Bankinheri {

	public static void main(String[] args) {
		banka ba=new banka();
		bankb bb=new bankb();
		bankc bc=new bankc();
		ba.getbalance();
		bb.getbalance();
		bc.getbalance();
	}
}
