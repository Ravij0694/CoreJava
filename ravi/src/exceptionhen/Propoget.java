package exceptionhen;

public class Propoget {
public static void main(String []args) {
	Propo p = new  Propo(8,0);
	p.firest();
}
}
class Propo{
public int i=0;
public  int j=0;
public Propo() {}
public Propo(int i,int j) {
	this.i=i;
	this.j=j;
}
 public void firest() {
	try { 
		int k=second();
		System.out.println(k);
	}
	catch(Exception e) {
		System.out.println("not div by 0");
	}
	finally{} 
 }
 public int second() {
    return i/=j;
 }
}