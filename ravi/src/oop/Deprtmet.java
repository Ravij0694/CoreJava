package oop;

public class Deprtmet  {
public static void main(String [] args) throws CloneNotSupportedException {
	
	//for cloning acces variabel
	
	Employ e= new Employ("ram");
	Employ e2=(Employ)e.clone();
	e2.name="shyam";
	e2.add.locadd="indore";
	e2.add.paradd="lon";
     
	
	  System.out.println("Name "+e.name) ;
	  System.out.println("Local Addres "+e.add.locadd) ;
	  System.out.println("Pramanent Addres "+e.add.paradd) ;
	  
	  System.out.println("Name "+e2.name) ;
	  System.out.println("local Addres "+e2.add.locadd) ;
	  System.out.println("param Addres "+e2.add.paradd) ;
	 
	//code aplly only if Employ Extend Addres
	
	  /*Employ e= new Employ();
     e.setName("ravi");
     e.setLocadd("ind");
     e.setParadd("indore");
		
     
     System.out.println("Name "+e.getName())	;
	System.out.println("Local Addres "+e.getParadd())	;
	System.out.println("Pramanent Addres "+e.getLocadd())	;
	
Employ e1= (Employ) e.clone();
e1.setName("ram");
e1.setLocadd("bharat");
e1.setParadd("london");


System.out.println("Name "+e1.getName())	;
System.out.println("Parmanent Addres "+e1.getParadd())	;
System.out.println("Local Addres "+e1.getLocadd())	;
*/
	}
}

class Employ  implements Cloneable {

public String name =null;
public Addres add=null;

      public Employ () {}
     
      public Employ(String n) {
       this.name=n;
	   add=new Addres("ind","uk");
      }
      public String getName() { return name; }
	  
      public void setName(String name) {
	   this.name = name;
	  }
	  public Object clone() throws CloneNotSupportedException{
		Employ e=(Employ) super.clone();
	    e.add=(Addres)add.clone();  
		return e;
		
	}
}

  class Addres implements Cloneable{
	 public String  locadd=null;
	 public String paradd=null;

	 public Addres() {}
	 public Addres(String s,String t) {
	 	this.locadd=s;
	 	this.paradd=t;
	 }
	 public String getLocadd() {
	 	return locadd;
	 }
	 public void setLocadd(String locadd) {
	 	this.locadd = locadd;
	 }
	 public String getParadd() {
	 	return paradd;
	 }
	 public void setParadd(String paradd) {
	 	this.paradd = paradd;
	 }
	 @Override
	 	protected Object clone() throws CloneNotSupportedException {
	 		// TODO Auto-generated method stub
	 		return super.clone();
	 		
	 	}
	 }

