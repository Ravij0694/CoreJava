package Colle;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Comtime {
	public static void main(String []args) {
		ArrayList a=new ArrayList();
		HashSet s= new HashSet();
		for(int i=0;i<10;i++) {
			int j= (int )(Math.random()*100);
			a.add(j);
			}
		
		 Iterator p =a.iterator();
		  
		  while (p.hasNext()) { Object o=p.next(); 
		  System.out.println(o); }
		 
		
		s.add(a);
		 Iterator i =s.iterator();
		  
		  while (i.hasNext()) {
			  Object o=i.next(); 
		  System.out.println(o); 
		  }
		 
		  
	
		
	}

}
