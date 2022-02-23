package oop;

public  class Immutebal {
public static void main(String []args) {
	Chack c =new Chack("ram");
System.out.println(c.getname());
}
}
final class Chack{
	private  final String t;
public Chack(String s) {
	this.t=s;

}
public String getname () {
	return t;
}
}