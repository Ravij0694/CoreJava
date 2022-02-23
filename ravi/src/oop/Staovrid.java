package oop;

public class Staovrid {
public static void main(String []args) {
	
	Bcd b = new Bcd();
	b.def();
	
	Bcd b1 =new Def();
	b1.def();
	
	Def x= new Def();
	x.def();
}
}
class Bcd{
	public static void  def() {
		System.out.println(" simpal static ()");
	}
}
class Def extends Bcd {
	public static void def() {
		System.out.println("over ride static()");
	}
}