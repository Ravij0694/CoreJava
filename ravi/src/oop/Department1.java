package oop;

import java.util.ArrayList;
import java.util.Iterator;



public class Department1 {
	public static void main(String []args) {
		
		//useing interface marker interface are not allow
		
		Employ1 e1= new Employ1 ();
        e1.setName("ravi");
        e1.setLocadd("bhat");
        e1.setParadd("nee");
        System.out.println(e1.getName());
	    System.out.println(e1.getLocadd());
	    System.out.println(e1.getParadd());
	    
	    Employ1 e2= new Employ1 ();
        e2.setName("ram");
        e2.setLocadd("ayodhya");
        e2.setParadd("van");
        System.out.println(e2.getName());
	    System.out.println(e2.getLocadd());
	    System.out.println(e2.getParadd());
	    }
	}

 class Employ1 implements Addres1{
	
	


	 private String name =null;
		private String  locadd=null;
		private String paradd=null;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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

	}

 interface Addres1  {
		public String getName();
		public void setName(String s);
		public String getLocadd() ;
		public void setLocadd(String locadd);
		public String getParadd();
		public void setParadd(String paradd) ;
		
		
	}
