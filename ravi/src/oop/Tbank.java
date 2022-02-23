package oop;

public class Tbank {
public static void main(String []args) {
	Bank[] b=new Bank[3];
	b[0]=new HdfcBank();
	b[1]=new IciciBank();
	b[2]=new PunjabBank();
getIntrestRate(b);
}
public static void getIntrestRate(Bank[] b) {
	for(int i=0;i<b.length;i++) {
		System.out.print((String)b[i].bankName()+"\tintrestrate\t"+(double)b[i].intrestRate());	
	System.out.println();	
	}
}

}
class Bank {
	private double  ir =0;
	public double intrestRate () {
		return 11.50;
	}public String bankName() {
		return "RBI";
	} 
}
class IciciBank extends Bank{
	
	public  double intrestRate () {
		return 11;
	}public  String bankName() {
		return "ICICI";
	} 
}
class HdfcBank extends Bank{
	
	public  double intrestRate () {
		return 12.50;
	}public  String bankName() {
		return "HDFC";
	} 
}
class PunjabBank extends Bank {
	
	public  double intrestRate () {
		return 12.00;
	}public  String bankName() {
		return "PNJAB";
	} 
}