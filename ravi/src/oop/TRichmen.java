package oop;

public class TRichmen {
public static void main(String[] args) {
	Busnesmen b1=new Busnesmen();
    b1.donetion(4000);
    b1.party("birth day");
    Stoudent s1=new Stoudent();
    s1.donetion(5000);
    s1.party("passout");
}
}
 interface Richmen{
	public void donetion(int j);
	public void party(String s);
} 
class Busnesmen implements Richmen{
	public void donetion(int j) {
		System.out.println("give "+j+" donetion");
	}
	public void party(String s) {
		System.out.println("givs "+s+"party");
	}
}
class Stoudent implements Richmen{
	public void donetion(int j) {
		System.out.println("give "+j+" donetion");
	}
	public void party(String s) {
		System.out.println("givs "+s+"party");
	}
}