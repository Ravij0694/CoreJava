package oop;

public class stapoly {
public static void main(String []args) {
	
	Xyz x=new Xyz();
	x.abc();
	x.abc(1);
	x.abc(1, "hi");
	
	
}
}
class Abc {
	public static void abc () {
		System.out.println("Ststic()overlode ");
	}
}
class Xyz extends Abc  {

	public static void abc(int i) {
		System.out.println(i+" overlode () invock");
	}
	public static void abc(int i,String s) {
		System.out.println(i+" overlode () "+s);
	}
}