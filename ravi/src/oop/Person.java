package oop;

public class Person {
public static void main(String[] args) {
	Per p=new Per("ram","chandra");

p.toString();
	System.out.println(p.toString());
}
}
 class Per{
	 String fstname =null;
	 String secname =null;
	public Per() {}
	public Per(String s,String s2) {
		this.fstname=s;
		this.secname=s2;
	}
 public String toString() {
	 return fstname+secname;
 }	
}