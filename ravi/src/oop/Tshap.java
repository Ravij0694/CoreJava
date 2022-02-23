package oop;

public class Tshap {
public static void main(String []args) {
	
	
	Shap [] s= new Shap[3];
	
	
	s[0]= new Circle(3);
	s[1]=new Rec(2,6);
	s[2]= new Tri(5,7);
	
	
	double d = calArea(s);
	System.out.println("total area"+"\t\t\t\t"+d);
}
public static double calArea(Shap[] s) {
	double d = 0;
	for (int i=0;i<s.length;i++) {
		d += (s[i].area());
		System.out.println("area of  "+s[i]+"="+"\t"+s[i].area());
		
	}return d;
	
}
}
 abstract class Shap {
	private String colour = null;
	private int borderWith = 0;
	protected static final double PI = 3.14;

	public int getborderWith() {
		return borderWith;
	}

	public void setBorderWith(int i) {
		this.borderWith = i;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String s) {
		this.colour = s;
	}

	public abstract double area();
}
 class Circle extends Shap{

private int  radius=0;
    public Circle() {}
	public Circle(int radius) {
		this.radius=radius;
	}

		public double  area() {
	return PI*radius*radius;
	}
}
 class Rec extends Shap {
private int length =0;
private int width=0;

	public Rec() {}
	 public Rec(int length,int width) {
	this.length=length;
	this.width=width;
}

public double area() {
	return length*width;
} 
}
 class Tri extends Shap{

	private int base=0;
	private int hight=0;
	public Tri() {}
	public Tri(int base,int hight) {
		this.base=base;
		this.hight=hight ;
	}
	public double area() {
		return base*hight;
	}
}